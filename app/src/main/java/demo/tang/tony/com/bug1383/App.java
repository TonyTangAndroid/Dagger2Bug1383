package demo.tang.tony.com.bug1383;

import android.app.Application;

public class App extends Application {

    private AppComponent appComponent;

    public AppComponent appComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
    }
}
