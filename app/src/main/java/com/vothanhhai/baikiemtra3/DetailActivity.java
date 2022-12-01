package com.vothanhhai.baikiemtra3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    TextView txtTenThi;
    private static final ArrayList<ViDu> viDuArrayList = new ArrayList<>();
    Button btnQuayLai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail_item);

        ListView listView = findViewById(R.id.listViewtacpham);

        List<String> list = new ArrayList<>();

        list.add("RomeovsJuliet");
        list.add("Tràng giang");
        list.add("Tập thơ từ ái");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    startActivity(new Intent(DetailActivity.this,RomeovsJuliet.class));
                }else if (i==1){
                    startActivity(new Intent(DetailActivity.this,Tranggiang.class));
                }else if (i==2){
                    startActivity(new Intent(DetailActivity.this,Tapthotuai.class));
                }
            }
        });

        AnhXa();

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        if(bundle == null)
            return;

        txtTenThi.setText(bundle.getString("tenThi"));

        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });
    }

    private void AnhXa(){
        txtTenThi = findViewById(R.id.textViewTentacgia_detail);
        btnQuayLai = findViewById(R.id.buttonQuayLai);
    }
}