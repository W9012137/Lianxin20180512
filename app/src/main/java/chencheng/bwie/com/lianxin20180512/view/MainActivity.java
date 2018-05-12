package chencheng.bwie.com.lianxin20180512.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import chencheng.bwie.com.lianxin20180512.MyAdapater;
import chencheng.bwie.com.lianxin20180512.R;
import chencheng.bwie.com.lianxin20180512.bean.UsersBean;
import chencheng.bwie.com.lianxin20180512.presenter.BasePresenter;

public class MainActivity extends AppCompatActivity implements IMainView {

    private RecyclerView mRv;
   BasePresenter presenter;
   MyAdapater adapater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        presenter=new BasePresenter(this);
        presenter.ShowBase();
        mRv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void Show(UsersBean baseBean) {
        final List<UsersBean.DataBean> data = baseBean.getData();

        adapater=new MyAdapater(this,data);
        mRv.setAdapter(adapater);
    }

    private void initView() {
        mRv = (RecyclerView) findViewById(R.id.rv);
    }
}
