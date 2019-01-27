package demo.tang.tony.com.bug1383;

import android.app.Application;

import dagger.BindsInstance;

@AppScope
@dagger.Component(modules = {
        SharedPreferenceModule.class})
public interface AppComponent {

    void inject(App app);

    MainActivitySubComponent.Builder mainActivitySubComponentBuilder();

    @dagger.Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
