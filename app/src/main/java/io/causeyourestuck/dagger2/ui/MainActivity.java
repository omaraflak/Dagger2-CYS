package io.causeyourestuck.dagger2.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.causeyourestuck.dagger2.MyApp;
import io.causeyourestuck.dagger2.R;
import io.causeyourestuck.dagger2.model.ObjectManager;

public class MainActivity extends Activity {
    @BindView(R.id.image) ImageView imageView;
    @Inject ObjectManager objectManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApp.app().basicComponent().inject(this);
        ButterKnife.bind(this);

        String link = objectManager.get("link", String.class);
        if(link==null){
            link = "http://s2.quickmeme.com/img/a6/a69d84379a04cc6f56a58c1c9b8d0826ddd24c9e52644ac7a068705a7be1a6bb.jpg";
            objectManager.save("link", link);
        }

        Glide.with(this).load(link).into(imageView);
    }
}
