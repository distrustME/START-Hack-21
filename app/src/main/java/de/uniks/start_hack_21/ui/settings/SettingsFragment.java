package de.uniks.start_hack_21.ui.settings;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import de.uniks.start_hack_21.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}