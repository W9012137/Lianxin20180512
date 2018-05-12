package chencheng.bwie.com.lianxin20180512.presenter;

import chencheng.bwie.com.lianxin20180512.bean.UsersBean;
import chencheng.bwie.com.lianxin20180512.model.BaseModel;
import chencheng.bwie.com.lianxin20180512.model.IBaseModel;
import chencheng.bwie.com.lianxin20180512.net.NetListenter;
import chencheng.bwie.com.lianxin20180512.view.IMainView;

public class BasePresenter {
    private IMainView iMainView;
    private IBaseModel iBaseModel;

    public BasePresenter(IMainView iMainView) {
        this.iMainView = iMainView;
        iBaseModel=new BaseModel();
    }
    public void  ShowBase(){
      iBaseModel.getBase(new NetListenter<UsersBean>() {
          @Override
          public void onSccess(UsersBean usersBean) {
              iMainView.Show(usersBean);
          }

          @Override
          public void onFailuer(Exception e) {

          }
      });
       }

}
