/*******************************************************************************
 * Copyright (c) 2009 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.codegen.models;

import java.io.File;

/**
 * A model usable for XML Schema generation.
 * Groups all the data needed to generate an annotated XML schema from
 * a source. This is primarily intended to support velocity
 * template generation of ad-hoc ant scripts.
 * Also provides a convenience method to help with velocity generation.
 * 
 */
public abstract class SourceToXsdCobolModel extends AbstractAntBuildModel {

    /** The target schema namespace. */
    private String mNamespace = "";

    /** The target directory where annotated XSD will be created. */
    private File mTargetDir;

    /** The target annotated XSD file name. */
    private String mTargetXsdFileName;

    /**
     * @return the The target schema namespace
     */
    public String getNamespace() {
        return mNamespace;
    }

    /**
     * @param namespace the The target schema namespace to set
     */
    public void setNamespace(final String namespace) {
        if (namespace != null) {
            /*
             * Keep namespacelowercase so we can derive package names
             * from it if necessary.
             */
            mNamespace = namespace.toLowerCase();
        } else {
            mNamespace = null;
        }
    }

    /**
     * @return the The target directory
     */
    public File getTargetDir() {
        return mTargetDir;
    }

    /**
     * @param targetDir the The target directory to set
     */
    public void setTargetDir(final File targetDir) {
        mTargetDir = targetDir;
    }

    /**
     * @return the The target annotated XSD file name
     */
    public String getTargetXsdFileName() {
        return mTargetXsdFileName;
    }

    /**
     * @param targetXsdFileName the The target annotated XSD file name to set
     */
    public void setTargetXsdFileName(final String targetXsdFileName) {
        mTargetXsdFileName = targetXsdFileName;
    }

}
