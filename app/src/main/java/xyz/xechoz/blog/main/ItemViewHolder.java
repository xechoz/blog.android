package xyz.xechoz.blog.main;

import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import xyz.xechoz.blog.R;
import xyz.xechoz.blog.main.model.ItemModel;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

class ItemViewHolder extends BaseViewHolder<ItemModel> {
    @BindView(R.id.tags_layout)
    private LinearLayoutCompat tagsLayout;

    @BindView(R.id.content)
    private TextView contentText;

    public ItemViewHolder(ViewGroup parent) {
        super(View.inflate(parent.getContext(), R.layout.item_main_list, parent));
    }

    @Override
    public void setData(BaseAdapterModel<ItemModel> data, int position) {
        super.setData(data, position);

        ItemModel model = data.data;

        tagsLayout.removeAllViews();

        for (String item: model.tags) {
            TextView tagView = new TextView(tagsLayout.getContext(), null);
            tagView.setText(item);
            tagsLayout.addView(tagView);
        }

        contentText.setText(model.content);
    }
}
