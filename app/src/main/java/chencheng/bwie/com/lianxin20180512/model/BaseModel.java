package chencheng.bwie.com.lianxin20180512.model;

import chencheng.bwie.com.lianxin20180512.bean.UsersBean;
import chencheng.bwie.com.lianxin20180512.net.NetListenter;
import chencheng.bwie.com.lianxin20180512.net.RetrofitUtils;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class BaseModel implements IBaseModel {
    @Override
    public void getBase( final NetListenter<UsersBean> netListenter) {


        Flowable flowable= RetrofitUtils.getServerApi().user("android","101");
        flowable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<UsersBean>() {

                    @Override
                    public void accept(UsersBean baseBean) throws Exception {
                       netListenter.onSccess(baseBean);
                    }

                });
    }
}
