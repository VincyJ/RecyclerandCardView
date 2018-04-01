package example.com.recyclerandcardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private CustomAdapter mAdapter;
    private List<ListModel> mList;
    private ListModel listModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();
        mList.add(new ListModel("Microsoft", "Satya Nadella", R.drawable.microsoft));
        mList.add(new ListModel("Google", "Sundar Pichai", R.drawable.google));
        mList.add(new ListModel("Yahoo", "Marissa Mayer", R.drawable.yahoo));
        mList.add(new ListModel("Intel", "Brian Krzanich", R.drawable.intel));
        mList.add(new ListModel("Apple", "Tim Cook", R.drawable.apple));
        mList.add(new ListModel("Hp", "Meg Whitman", R.drawable.hp));
        mList.add(new ListModel("Sony", "Kazuo Hirai", R.drawable.sony));

        mAdapter = new CustomAdapter(MainActivity.this, mList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
