package com.example.bits;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewPage extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<String> dataSource;
    LinearLayoutManager linearLayoutManager;
    MyRvAdapter myRvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);
        rv = findViewById(R.id.viewPopular);

        // Setting the data source
        dataSource = new ArrayList<>();
        dataSource.add("Hello");
        dataSource.add("world");
        dataSource.add("to");
        dataSource.add("the");
        dataSource.add("code");
        dataSource.add("city");
        dataSource.add("******");

        linearLayoutManager = new LinearLayoutManager(getParent() , linearLayoutManager.HORIZONTAL ,false);
        myRvAdapter = new MyRvAdapter(dataSource);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(myRvAdapter);
    }

    class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.MyHolder>{
        ArrayList<String> data;
        public MyRvAdapter(ArrayList<String> data) {
            this.data = data;
        }

        @NonNull
        @Override
        public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//            return null;
//            View view = LayoutInflater.from(ActivityHorizontalRV.this).inflate(R.layout.items,parent,false);
//            return new MyHolder(view);
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
            return new MyHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyHolder holder, int position) {
            holder.tvTitle.setText(data.get(position));
        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        class MyHolder extends RecyclerView.ViewHolder{
            TextView tvTitle;

            public MyHolder(@NonNull View itemView) {
                super(itemView);
                tvTitle = itemView.findViewById(R.id.tvItem_1);
            }
        }
    }

}