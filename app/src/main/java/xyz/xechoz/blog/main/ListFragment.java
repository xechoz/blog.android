package xyz.xechoz.blog.main;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import xyz.xechoz.blog.R;
import xyz.xechoz.blog.components.BaseFragment;
import xyz.xechoz.blog.main.api.BaseResponse;
import xyz.xechoz.blog.main.api.RestApi;
import xyz.xechoz.blog.main.api.internal.ObserverResult;
import xyz.xechoz.blog.main.api.internal.PostApi;
import xyz.xechoz.blog.main.config.Config;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

public class ListFragment extends BaseFragment {
    @BindView(R.id.main_list)
    private RecyclerView recyclerView;
    private List<BaseAdapterModel> models;
    private BaseAdapter listAdapter;
    private int index = 0;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main_list;
    }

    @Override
    public void onInitView(Bundle savedInstanceState, View container) {
        super.onInitView(savedInstanceState, container);

        models = new ArrayList<>();
        listAdapter = new BaseAdapter(models);
        recyclerView.setAdapter(listAdapter);
    }

    @Override
    public void onAsyncFetchData() {
        super.onAsyncFetchData();

        RestApi.create(PostApi.class).list(index, Config.SIZE)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ObserverResult() {
                    @Override
                    public void onSuccess(BaseResponse data) {
                        super.onSuccess(data);
                    }

                    @Override
                    public void onFail(BaseResponse error) {
                        super.onFail(error);
                    }
                });
    }

}
