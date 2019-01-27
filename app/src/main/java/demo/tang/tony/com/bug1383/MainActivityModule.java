package demo.tang.tony.com.bug1383;

import dagger.Binds;
import dagger.Module;

@Module
abstract class MainActivityModule {
    @Binds
    abstract MainPresenter.UI ui(MainActivity activity);
}