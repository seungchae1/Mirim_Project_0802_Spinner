package kr.hs.emirim.s2125.mirim_project_0802_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    int[] posterId={R.drawable.dr, R.drawable.exo, R.drawable.kn, R.drawable.pp, R.drawable.w,
            R.drawable.error, R.drawable.hunt, R.drawable.mini, R.drawable.topgun, R.drawable.summer};
    String[] items = {"극장판 도라에몽-진구의 우주소전쟁 리틀스타워즈 2021","비욘드 라이브 더 무비 : 엑소의 사다리 타고 세계여행3",
            "명탐정 코난-할로윈의 신부","뽀로로 극장판 드래곤캐슬 대모험","외계+인 1부","시맨틱 에러-더 무비","헌트","미니언즈2","탑건-매버릭", "썸머 필름을 타고!"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ImageView imgv = findViewById(R.id.imgv);
                imgv.setImageResource(posterId[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}