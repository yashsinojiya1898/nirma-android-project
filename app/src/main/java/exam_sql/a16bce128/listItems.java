package exam_sql.a16bce128;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);
        customListView customadaptor = new customListView();
        lv = (ListView)findViewById(R.id.listView);
        lv.setAdapter(customadaptor);

    }
    class customListView extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom_list,null);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView = (TextView)view.findViewById(R.id.textView);
            imageView.setImageResource(images[i]);
            textView.setText(names[i]);
            return view;
        }
    }
}

