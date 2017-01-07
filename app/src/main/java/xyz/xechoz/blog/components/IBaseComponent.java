package xyz.xechoz.blog.components;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.view.View;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

interface IBaseComponent {
    @LayoutRes
    int getLayoutId();

    void onInitView(Bundle savedInstanceState, View container);

    void onInitListener();

    void onAsyncFetchData();
}
