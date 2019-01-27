package demo.tang.tony.com.bug1383;

import dagger.BindsInstance;
import dagger.Subcomponent;

@Subcomponent(modules = MainActivityModule.class)
interface MainActivitySubComponent {

    void inject(MainActivity mainActivity);

    @dagger.Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder activity(MainActivity activity);

        MainActivitySubComponent build();
    }


}