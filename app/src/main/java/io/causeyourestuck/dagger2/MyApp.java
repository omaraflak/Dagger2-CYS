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
    private AppModule appModule;
    private BasicComponent basicComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        appModule = new AppModule(this);
        basicComponent = DaggerBasicComponent.builder()
                .appModule(appModule)
                .build();
    }

    public static MyApp app() {
        return app;
    }

    public AppModule appModule() {
        return appModule;
    }

    public BasicComponent basicComponent() {
        return basicComponent;
    }
}
