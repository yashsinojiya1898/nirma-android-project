package exam_sql.a16bce128;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String names[];
    int pics[];
    public MyAdapter(String names[],int pics[]){
        System.out.println("Contructor");
        this.names = names;
        this.pics = pics;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        System.out.println("hellohello");
        System.out.println(333333);
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String title = names[position];
        holder.mTextView.setText(title);
        int pic = pics[position];
        holder.mImageView.setImageResource(pic);
        System.out.println("HAHAHAHAHA");
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ImageView mImageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            System.out.println(44444);
            mImageView = (ImageView)itemView.findViewById(R.id.image1);
            mTextView = (TextView) itemView.findViewById(R.id.text1);

        }
    }
}
