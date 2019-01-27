package demo.tang.tony.com.bug1383;

import javax.inject.Inject;

class MainPresenter {

    private final UI ui;

    @Inject
    MainPresenter(UI ui) {
        this.ui = ui;
    }

    void create() {
        ui.now(System.currentTimeMillis());
    }

    interface UI {
        void now(long currentTimeMillis);
    }
}
