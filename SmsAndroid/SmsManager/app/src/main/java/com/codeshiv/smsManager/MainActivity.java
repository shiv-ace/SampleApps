package com.codeshiv.smsManager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    public TextView textView;
    private static MainActivity mainActivity = null;
    private SmsManager smsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        mainActivity = this;

        smsManager = SmsManager.getSmsManager();
        smsManager.initializeComponents(mainActivity,textView);
    }

    public static MainActivity getMainActivity() {
        return mainActivity;
    }
}
