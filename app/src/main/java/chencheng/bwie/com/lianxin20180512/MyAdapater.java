package chencheng.bwie.com.lianxin20180512;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import chencheng.bwie.com.lianxin20180512.bean.UsersBean;

public class MyAdapater extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
   private Context context;
   private List<UsersBean.DataBean> list;

    public MyAdapater(Context context, List<UsersBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.rv_item,null);

        return new MyViewhoder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
          MyViewhoder viewhoder= (MyViewhoder) holder;
          viewhoder.sim.setImageURI(list.get(position).getImgUrls()+"");
          viewhoder.title.setText(list.get(position).getContent());
          viewhoder.time.setText(list.get(position).getCreateTime());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewhoder extends RecyclerView.ViewHolder {
        SimpleDraweeView sim;
        TextView title;
        TextView name;
        TextView time;
        public MyViewhoder(View itemView) {
            super(itemView);
            sim=itemView.findViewById(R.id.sim);
            title=itemView.findViewById(R.id.title);
            name=itemView.findViewById(R.id.name);
            time=itemView.findViewById(R.id.time);
        }
    }
}
