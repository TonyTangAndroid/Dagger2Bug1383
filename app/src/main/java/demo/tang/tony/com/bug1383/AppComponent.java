package demo.tang.tony.com.bug1383;

import android.app.Application;

import dagger.BindsInstance;
import dagger.android.support.AndroidSupportInjectionModule;

@AppScope
@dagger.Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityInjector.class})
public interface AppComponent {

    void inject(App app);

    @dagger.Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
