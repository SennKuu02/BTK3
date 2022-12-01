package com.vothanhhai.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvThi;
    ArrayList<Thi> thiList;
    ThiAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        thiList = new ArrayList<>();

        thiList.add(new Thi("Ngô Xuân Diệu"," là nhà thơ, nhà báo, nhà văn viết truyện ngắn và nhà phê bình văn học người Việt Nam.",R.drawable.xuandieu));
        thiList.add(new Thi("Huy Cận", "Ông từng là Viện sĩ Viện Hàn lâm Thơ Thế giới và Chủ tịch Ủy ban Liên hiệp các Hiệp hội Văn học Việt Nam giai đoạn 1984-1995.",R.drawable.huycan));
        thiList.add(new Thi("Hemingway", "Ernest Miller Hemingway là một tiểu thuyết gia người Mỹ, nhà văn viết truyện ngắn và là một nhà báo. ",R.drawable.hemingway));
        thiList.add(new Thi("Tố Hữu", "Tố Hữu, tên thật là Nguyễn Kim Thành quê gốc ở làng Phù Lai, nay thuộc xã Quảng Thọ, huyện Quảng Điền, tỉnh Thừa Thiên Huế, là một nhà thơ tiêu biểu của thơ cách mạng Việt Nam",R.drawable.tohuu));
        thiList.add(new Thi("Mạc Ngôn", "Mạc Ngôn là một nhà văn người Trung Quốc xuất thân từ nông dân. Ông đã từng được thế giới biết đến với tác phẩm Cao lương đỏ đã được đạo diễn nổi tiếng Trương Nghệ Mưu chuyển thể thành phim.",R.drawable.macngon));
        thiList.add(new Thi("Shakespeace", "William Shakespeare là một nhà văn và nhà viết kịch Anh, được coi là nhà văn vĩ đại nhất của Anh và là nhà viết kịch đi trước thời đại.",R.drawable.shakespeace));


        adapter = new ThiAdapter(this, thiList);
        lvThi.setAdapter(adapter);


        lvThi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                Thi thi = thiList.get(position);

                Bundle bundle = new Bundle();

                bundle.putString("tenThi", thi.getTenThi());

                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });
    }

    private void AnhXa(){
        lvThi = findViewById(R.id.listViewtacgia);
    }

}