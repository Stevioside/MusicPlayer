package com.example.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置url
        new AndroidDownload(this, "111111")
                .setListener(new AndroidDownload.AndroidDownloadManagerListener() {
                    @Override
                    public void onPrepare() {
                    }

                    @Override
                    public void onSuccess(String path) {
                    }

                    @Override
                    public void onFailed(Throwable throwable) {
                    }
                })
                .download();    }
}
