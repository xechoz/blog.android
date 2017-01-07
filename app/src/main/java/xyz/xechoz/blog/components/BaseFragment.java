package xyz.xechoz.blog.components;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

public class BaseFragment extends Fragment implements IBaseComponent {
    private View containerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        containerView = inflater.inflate(getLayoutId(), container, attachToRoot());

        ButterKnife.bind(this, containerView);

        onInitView(savedInstanceState, containerView);
        onInitListener();

        containerView.post(new Runnable() {
            @Override
            public void run() {
                onAsyncFetchData();
            }
        });

        return containerView;
    }

    protected boolean attachToRoot() {
        return true;
    }

    @Override
    public @LayoutRes int getLayoutId() {
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

    protected <T extends View> T findView(@IdRes int id) {
        return (T) containerView.findViewById(id);
    }
}
