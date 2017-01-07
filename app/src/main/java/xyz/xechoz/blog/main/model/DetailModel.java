package xyz.xechoz.blog.main.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

public class DetailModel {
    public @NonNull String id;
    public @Nullable String title;
    public @NonNull String markdown;
    public @Nullable List<String> tags;
}
