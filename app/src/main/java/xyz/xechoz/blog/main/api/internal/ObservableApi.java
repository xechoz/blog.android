package xyz.xechoz.blog.main.api.internal;

import io.reactivex.Observable;
import io.reactivex.Observer;
import xyz.xechoz.blog.main.api.BaseResponse;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

public class ObservableApi<T> extends Observable<BaseResponse<T>>{
    @Override
    protected void subscribeActual(Observer<? super BaseResponse<T>> observer) {
    }
}
