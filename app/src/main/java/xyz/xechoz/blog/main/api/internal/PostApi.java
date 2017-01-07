package xyz.xechoz.blog.main.api.internal;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import xyz.xechoz.blog.main.api.IApi;
import xyz.xechoz.blog.main.model.ItemModel;

/**
 * Created by xechoz.zheng on 1/2/17.
 * Email: zheng1733@gmail.com
 * 功能:
 * 文档:
 */

public interface PostApi extends IApi {
    @GET("/posts")
    ObservableApi<List<ItemModel>> list(int index, int size);

    @GET("/posts/{id}")
    ObservableApi<String> detail(@Path("id") String id);

    @POST("/posts/{id}")
    ObservableApi<String> update(@Path("id") String id);


}
