package xyz.xechoz.blog.main.api.internal;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

interface IRestCallback<T> {
    void onSuccess(T data);
    void onFail(T error);
}
