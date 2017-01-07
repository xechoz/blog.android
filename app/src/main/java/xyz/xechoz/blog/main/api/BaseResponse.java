package xyz.xechoz.blog.main.api;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

public class BaseResponse<T> {
    public int code;
    public String msg;
    public T data;

    public BaseResponse() {
        super();
    }

    public BaseResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
