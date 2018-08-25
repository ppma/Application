package com.ppma.application;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    static {
        System.loadLibrary("MhashCode");
    }

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        tv = (TextView) findViewById(R.id.sample_text);
        Button button = findViewById(R.id.bottom);
        tv.setText(getRandomString(5));
    }

    public void OnClick(View view) {
        tv.setText(String.valueOf(getHashcode("123", "321")));
    }

    public void OnClick2(View view) {
        tv.setText(getRandomString(5));
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native int getHashcode(String str, String str2);

    public native String getRandomString(int i);
}
