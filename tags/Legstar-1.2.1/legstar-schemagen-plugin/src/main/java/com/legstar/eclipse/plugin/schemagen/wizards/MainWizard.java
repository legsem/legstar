/*******************************************************************************
 * Copyright (c) 2008 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.eclipse.plugin.schemagen.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.legstar.eclipse.plugin.common.wizards.AbstractWizard;
import com.legstar.eclipse.plugin.schemagen.Activator;
import com.legstar.eclipse.plugin.schemagen.Messages;

/**
 * The main wizard orchestrates the various wizard pages.
 */
public class MainWizard extends AbstractWizard implements INewWizard {
    
    /** The workbench selection upon entry in wizard. */
	private IStructuredSelection mInitialSelection;
	
	/** The first page of the wizard, common to all targets. */
    private MainWizardPage mMainWizardPage;
    
    /** The generation from a COBOL fragment page. */
    private CobolToXsdWizardPage mCobolToXsdWizardPage;

    /** The generation from a Xsd or Wsdl page. */
    private XsdToXsdWizardPage mXsdToXsdWizardPage;

    /** The generation from a set of Java classes page. */
    private JavaToXsdWizardPage mJavaToXsdWizardPage;
    
    /**
     * No arg constructor.
     */
    public MainWizard() {
        super();
        setNeedsProgressMonitor(true);
    }

	/** {@inheritDoc} */
    @Override
    public boolean performFinish() {
        try {
            IRunnableWithProgress op = null;
            switch(mMainWizardPage.getSelectedSource()) {
            case 0:
                op = new CobolToXsdWizardRunnable(
                        mMainWizardPage, mCobolToXsdWizardPage);
                break;
            case 1:
                op = new XsdToXsdWizardRunnable(
                        mMainWizardPage, mXsdToXsdWizardPage);
                break;
            case 2:
                op = new JavaToXsdWizardRunnable(
                        mMainWizardPage, mJavaToXsdWizardPage);
                break;
            default:
                return false;
            }
            /* Fork background process and make it cancellable */
            getContainer().run(true, true, op);
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            errorDialog(getShell(),
            		Messages.generation_error_dialog_title,
            		Activator.PLUGIN_ID,
                    Messages.generation_dialog_failure_short_msg,
                    NLS.bind(Messages.generation_dialog_failure_long_msg,
                    		mMainWizardPage.getTargetFileText().getText(),
                    		e.getTargetException().getMessage()));
            logCoreException(e.getTargetException(), Activator.PLUGIN_ID);
            return false;
        }
        return true;
    }
    
    /**
     * We will accept the selection in the workbench to see if
     * we can initialize from it.
     * {@inheritDoc}
     * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
     */
    public void init(
    		final IWorkbench workbench, final IStructuredSelection selection) {
        mInitialSelection = selection;
    }
    
    /**
     * Adding pages to the wizard.
     * @see org.eclipse.jface.wizard.Wizard#addPages()
     */
    public void addPages() {
        mMainWizardPage = new MainWizardPage(mInitialSelection);
        addPage(mMainWizardPage);
        mCobolToXsdWizardPage = new CobolToXsdWizardPage(mInitialSelection);
        addPage(mCobolToXsdWizardPage);
        mXsdToXsdWizardPage = new XsdToXsdWizardPage(mInitialSelection);
        addPage(mXsdToXsdWizardPage);
        mJavaToXsdWizardPage = new JavaToXsdWizardPage(mInitialSelection);
        addPage(mJavaToXsdWizardPage);
    }
    
    /**
     * @return the Cobol To Xsd Wizard Page
     */
    public final IWizardPage getCobolToXsdWizardPage() {
        return mCobolToXsdWizardPage;
    }

    /**
     * @return the Xsd To Xsd Wizard Page
     */
    public final IWizardPage getXsdToXsdWizardPage() {
        return mXsdToXsdWizardPage;
    }
    
    /**
     * @return the Java To Xsd Wizard Page
     */
    public final IWizardPage getJavaToXsdWizardPage() {
        return mJavaToXsdWizardPage;
    }
    
}
