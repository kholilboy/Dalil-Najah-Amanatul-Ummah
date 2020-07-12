package com.kholil.android.dalilnajah;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

//          Button btn_menu_satu = find

            Button btn_menu_empat = findViewById(R.id.btn_kotak_4);
            btn_menu_empat.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.btn_quiz_tulisan:
//                Intent moveIntent1 = new Intent(MainActivity.this, KuisActivity.class);
//                startActivity(moveIntent1);
//                break;
//
//            case R.id.btn_quiz_gambar:
//                Intent moveIntent3 = new Intent(MainActivity.this, quiz_gambar.class);
//                startActivity(moveIntent3);
//                break;
//
//            case R.id.btn_about:
//                Intent moveIntent2 = new Intent(MainActivity.this, TentangActivity.class);
//                startActivity(moveIntent2);
//                break;

            case R.id.btn_kotak_4:
                moveTaskToBack(true);
                finish();
                System.exit(0);
                break;
        }
    }
}
