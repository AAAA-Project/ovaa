package oversecured.ovaa.activities;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import oversecured.ovaa.utils.LoginUtils;


public class DeeplinkActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String key = "readIntent";
        if(true){
            System.out.println("1111");
        }
        if (intent != null && intent.getParcelableExtra(key) != null) {
            startActivity((Intent) intent.getParcelableExtra(key));
        }
        finish();
    }
}
