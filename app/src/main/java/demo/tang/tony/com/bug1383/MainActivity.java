package demo.tang.tony.com.bug1383;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MainPresenter.UI {

    @Inject
    MainPresenter presenter;

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        inject();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.create();
    }

    private void inject() {
        ((App) getApplication()).appComponent()
                .mainActivitySubComponentBuilder().activity(this)
                .build().inject(this);
    }

    @Override
    public void now(long currentTimeMillis) {
        Toast.makeText(MainActivity.this, "currentTimeMillis :"
                + currentTimeMillis, Toast.LENGTH_SHORT).show();
        sharedPreferences.edit().putLong("ts", currentTimeMillis).apply();
    }


}
