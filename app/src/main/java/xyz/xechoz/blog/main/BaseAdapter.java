package xyz.xechoz.blog.main;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */
public class BaseAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private List<BaseAdapterModel> list;

    public BaseAdapter() {
        super();
    }

    public BaseAdapter(List<BaseAdapterModel> list) {
        this.list = list;
    }

    public void setDataSource(List<BaseAdapterModel> list) {
        this.list = list;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(list.get(position), position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
