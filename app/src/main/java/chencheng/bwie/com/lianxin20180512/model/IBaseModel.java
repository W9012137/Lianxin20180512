package chencheng.bwie.com.lianxin20180512.model;

import chencheng.bwie.com.lianxin20180512.bean.UsersBean;
import chencheng.bwie.com.lianxin20180512.net.NetListenter;

public interface IBaseModel {
    void getBase( NetListenter<UsersBean> netListenter);
}
