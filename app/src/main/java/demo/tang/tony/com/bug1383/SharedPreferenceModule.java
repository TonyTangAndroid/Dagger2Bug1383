package demo.tang.tony.com.bug1383;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import dagger.Module;
import dagger.Provides;

@Module
abstract class SharedPreferenceModule {
    @AppScope
    @Provides
    static SharedPreferences sharedPreferences(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}