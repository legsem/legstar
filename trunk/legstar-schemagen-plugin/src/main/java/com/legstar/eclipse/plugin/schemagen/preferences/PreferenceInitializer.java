package com.legstar.eclipse.plugin.schemagen.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.legstar.eclipse.plugin.schemagen.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

    /**
     * {@inheritDoc}
     * @see org.eclipse.core.runtime.preferences.
     * AbstractPreferenceInitializer#initializeDefaultPreferences()
     */
    public void initializeDefaultPreferences() {
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();

        store.setDefault(PreferenceConstants.XSD_NAMESPACE_PREFIX,
            "http://test.legstar");
        store.setDefault(PreferenceConstants.JAXB_PACKAGE_NAME_PREFIX,
            "com.legstar.test.coxb");
    }

    /**
     * Schema generator is a sub product of LegStar. If the full product is
     * installed then the location should be that of the full product.
     * Otherwise, the LEGSTAR_HOME environment variable might point to the
     * location.
     * @return the default location
     */
    public String getDefaultProductLocation() {
        String value = System.getenv("LEGSTAR_HOME");
        if (value == null) {
            return "";
        }
        return value;
    }

}