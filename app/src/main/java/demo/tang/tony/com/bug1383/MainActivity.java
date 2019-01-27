package demo.tang.tony.com.bug1383;

import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainPresenter.UI {

    @Inject
    MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.create();
    }

    @Override
    public void now(long currentTimeMillis) {
        Toast.makeText(MainActivity.this, "currentTimeMillis :"
                + currentTimeMillis, Toast.LENGTH_SHORT).show();
    }
}
