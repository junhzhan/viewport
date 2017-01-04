package cn.sports39.viewport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView browser = (WebView)findViewById(R.id.browser);
        browser.getSettings().setUseWideViewPort(true);
        browser.loadUrl("file:///android_asset/index.html");
    }
}
