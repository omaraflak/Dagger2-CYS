package io.causeyourestuck.dagger2.component;

import javax.inject.Singleton;

import dagger.Component;
import io.causeyourestuck.dagger2.module.AppModule;
import io.causeyourestuck.dagger2.ui.MainActivity;

/**
 * Created by Omar on 18/02/2017.
 */
@Singleton
@Component (modules = {AppModule.class})
public interface BasicComponent {
    void inject(MainActivity activity);
}
