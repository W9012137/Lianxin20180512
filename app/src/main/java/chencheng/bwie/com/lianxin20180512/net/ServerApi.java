package chencheng.bwie.com.lianxin20180512.net;

import chencheng.bwie.com.lianxin20180512.bean.UsersBean;
import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dell on 2018/5/9.
 */

public interface ServerApi {
//   @POST
////   Flowable<BaseBean> baseBean(@Url String url, @QueryMap Map<String, String> map);
    @GET("quarter/getJokes")
    Flowable<UsersBean> user(@Query("source")String source,@Query("appVersion")String appVersion);
}
