package xyz.xechoz.blog;

import android.os.Bundle;

import xyz.xechoz.blog.components.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
