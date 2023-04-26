package com.example.bits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewPage extends AppCompatActivity {

    TextView showUser;
    ImageView imgClick;
    CardView c1 ,c2 ,c3 ,c4 ,c5;

//    RecyclerView rv_1 ;
//    ArrayList<String> dataSource;
//    LinearLayoutManager linearLayoutManager;
//    MyRvAdapter myRvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        /*--- Show Card One From Section New  ---*/
        c1 = findViewById(R.id.Card_new_1);
        c1.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPage.this, details_1.class);
            startActivity(intent);
        });
        /*--- Show Card Two From Section New  ---*/
        c2 = findViewById(R.id.Card_new_2);
        c2.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPage.this, details_2.class);
            startActivity(intent);
        });
        /*--- Show Card Three From Section New  ---*/
        c3 = findViewById(R.id.Card_new_3);
        c3.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPage.this, details_3.class);
            startActivity(intent);
        });
        /*--- Show Card Four From Section New  ---*/
        c4 = findViewById(R.id.Card_new_4);
        c4.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPage.this, details_4.class);
            startActivity(intent);
        });
        /*--- Show Card Five From Section New  ---*/
        c5 = findViewById(R.id.Card_new_5);
        c5.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPage.this, details_5.class);
            startActivity(intent);
        });

        /*--- Code Show UserName inside Text View ---*/
        showUser = findViewById(R.id.tvUser);
        Bundle bundle = getIntent().getExtras();
        String user = bundle.getString("");
        showUser.setText(user);

        /*--- Method Click on image profile  ---*/
        imgClick = findViewById(R.id.imageViewProfile);
        imgClick.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPage.this,controlPanel.class);
            intent.putExtra("",user);
            startActivity(intent);
        });

        // Setting the data source
//        dataSource = new ArrayList<>();
//        dataSource.add("Hello");
//        dataSource.add("world");
//        dataSource.add("to");
//        dataSource.add("the");
//        dataSource.add("code");
//        dataSource.add("city");
//        dataSource.add("web");
//
//
//        linearLayoutManager = new LinearLayoutManager(getParent() , linearLayoutManager.HORIZONTAL ,false);
//        myRvAdapter = new MyRvAdapter(dataSource);
//        rv_1.setLayoutManager(linearLayoutManager);
//        rv_1.setAdapter(myRvAdapter);
    }


//    class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.MyHolder>{
//        ArrayList<String> data;
//        public MyRvAdapter(ArrayList<String> data) {
//            this.data = data;
//        }
//
//        @NonNull
//        @Override
//        public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
//            return new MyHolder(view);
//        }
//
//        @Override
//        public void onBindViewHolder(@NonNull MyHolder holder, int position) {
//            holder.tvTitle.setText(data.get(position));
//
//        }
//
//        @Override
//        public int getItemCount() {
//            return data.size();
//        }
//
//        class MyHolder extends RecyclerView.ViewHolder{
//            TextView tvTitle;
//
//            public MyHolder(@NonNull View itemView) {
//                super(itemView);
//                tvTitle = itemView.findViewById(R.id.tvItem_1);
//            }
//        }
//    }

}
