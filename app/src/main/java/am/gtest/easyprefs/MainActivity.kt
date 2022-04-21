package am.gtest.easyprefs

import am.gtest.easy_prefs.di.PrefsModule
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    @Named(PrefsModule.PREF_FILE_CURRENT_USER)
    lateinit var myPrefsCurrentUser: SharedPreferences

    @Inject
    @Named(PrefsModule.PREF_FILE_ANY_USER)
    lateinit var myPrefsAnyUser: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}