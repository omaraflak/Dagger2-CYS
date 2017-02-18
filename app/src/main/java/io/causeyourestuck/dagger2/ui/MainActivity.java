package io.causeyourestuck.dagger2.ui;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import io.causeyourestuck.dagger2.MyApp;
import io.causeyourestuck.dagger2.R;
import io.causeyourestuck.dagger2.model.ObjectManager;

public class MainActivity extends Activity {

    @Inject ObjectManager objectManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApp.app().basicComponent().inject(this);
    }
}
