package ca.georgiancollege.comp1011.kajicars;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        //use threads

        //create a runnable that navigates to the Main Activity

        Runnable task = () ->{

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        };

        //schedule this runnable to execute after 3 seconds
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(task, 2, TimeUnit.SECONDS);
    }

    @Override
    protected void onResume() {
        super.onResume();
        startActivity(new Intent(this, MainActivity.class));
    }
}
