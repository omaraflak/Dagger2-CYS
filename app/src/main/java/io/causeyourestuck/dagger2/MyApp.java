package io.causeyourestuck.dagger2;

import android.app.Application;

import io.causeyourestuck.dagger2.component.BasicComponent;
import io.causeyourestuck.dagger2.component.DaggerBasicComponent;
import io.causeyourestuck.dagger2.module.AppModule;

/**
 * Created by Omar on 18/02/2017.
 */

public class MyApp extends Application {
    private static MyApp app;
    private BasicComponent basicComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        basicComponent = DaggerBasicComponent.builder()
                .appModule(new AppModule(getApplicationContext()))
                .build();
    }

    public static MyApp app() {
        return app;
    }

    public BasicComponent basicComponent() {
        return basicComponent;
    }
}
