package exam_sql.a16bce128;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String names[];
    int pics[];
    static Context context;
    public MyAdapter(String names[],int pics[]){
        this.names = names;
        this.pics = pics;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        String title = names[position];
        holder.mTextView.setText(title);
        int pic = pics[position];
        holder.mImageView.setImageResource(pic);
        System.out.println("AAAAAAAA12");
        holder.button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(position==1){
                    System.out.println("AAAAAAAA123");
                    Intent i = new Intent(context,Main2Activity.class);
                    context.startActivity(i);
                }else if(position==2){
                    System.out.println("AAAAAAAA123");
                    Intent i = new Intent(context,Main3Activity.class);
                    context.startActivity(i);
                }else if(position==3){
                    System.out.println("AAAAAAAA123");
                    Intent i = new Intent(context,Main4Activity.class);
                    context.startActivity(i);
                }
                if(position==0){
                    Intent i = new Intent(context,MainActivity.class);
                    context.startActivity(i);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ImageView mImageView;
        public Button button;
        public MyViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            mImageView = (ImageView)itemView.findViewById(R.id.image1);
            mTextView = (TextView) itemView.findViewById(R.id.text1);
            button = (Button)itemView.findViewById(R.id.button3);

        }
    }
}
