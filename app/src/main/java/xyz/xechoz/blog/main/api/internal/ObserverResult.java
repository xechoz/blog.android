package xyz.xechoz.blog.main.api.internal;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import xyz.xechoz.blog.main.api.BaseResponse;
import xyz.xechoz.blog.main.config.Constants;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

public class ObserverResult implements Observer<BaseResponse>, IRestCallback<BaseResponse> {
    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(BaseResponse baseResponse) {
        if (baseResponse == null) {
            onFail(new BaseResponse<String>(Constants.CODE_ERROR, "RESPONSE EMPTY", null));
        } else if (baseResponse.code != Constants.CODE_OK) {
            onFail(baseResponse);
        } else {
            onSuccess(baseResponse);
        }
    }

    @Override
    public void onError(Throwable e) {
        onFail(new BaseResponse<String>(Constants.CODE_EXCEPTION, e.getMessage(), null));
    }

    @Override
    public void onComplete() {
    }

    @Override
    public void onSuccess(BaseResponse data) {

    }

    @Override
    public void onFail(BaseResponse error) {

    }
}
