package xyz.xechoz.blog.main;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.orhanobut.logger.Logger;

import butterknife.ButterKnife;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */
public class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setData(BaseAdapterModel<T> data, int position) {
        Logger.d(data);
    }
}
