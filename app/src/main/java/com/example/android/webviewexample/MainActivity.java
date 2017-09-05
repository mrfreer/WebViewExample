package com.example.android.webviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static Button button_sbm;
    private static EditText url_text;
    private static WebView browser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openURL();
    }

    public void openURL(){
        button_sbm = (Button) findViewById(R.id.button);
        url_text = (EditText) findViewById(R.id.editText);
        browser = (WebView) findViewById(R.id.webView);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //write our code here!
                        String url = url_text.getText().toString();
                        browser.getSettings().setLoadsImagesAutomatically(true);
                        browser.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                        browser.loadUrl(url);

                    }
                }
        );
    }
}
