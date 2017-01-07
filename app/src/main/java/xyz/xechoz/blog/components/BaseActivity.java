package xyz.xechoz.blog.components;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

public abstract class BaseActivity extends AppCompatActivity implements IBaseComponent {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int id = getLayoutId();

        if (id >0 ) {
            setContentView(id);
        } else {
            setContentView(getLayoutView());
        }

        ButterKnife.bind(this);
    }

    protected View getLayoutView() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return 0;
    }

    @Override
    public void onInitView(Bundle savedInstanceState, View container) {

    }

    @Override
    public void onInitListener() {

    }

    @Override
    public void onAsyncFetchData() {

    }
}
