package exam_sql.a16bce128;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class listItems extends AppCompatActivity {

    int images[] = {R.drawable.nm,R.drawable.rg,R.drawable.ak,R.drawable.dt};
    String names[] = {"Mr Naredra Modi","Mr Rahul Gandhi","Mr Arvind Kejriwal","Mr Donald Trump"};
    RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);
        System.out.println("11111");
        list = findViewById(R.id.my_recycler_view);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new MyAdapter(names,images));
    }

}

