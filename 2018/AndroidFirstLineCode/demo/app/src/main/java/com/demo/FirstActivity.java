package com.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private static final String TAG = "FirstActivity";

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode) {
            case 1: {
                if (requestCode == RESULT_OK) {
                    String returnData = data.getStringExtra("data_return");
                    Log.d(TAG, "onActivityResult: " + returnData);
                }
                break;
            }
            default:
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate: " + this.toString());

        setContentView(R.layout.first_layout);

        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(Intent.ACTION_VIEW);
////                intent.setData(Uri.parse("http://www.baidu.com"));
//                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);

//                String data = "Hello SecondActivity";
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                intent.putExtra("extra_data", data);
//                startActivity(intent);

//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivityForResult(intent, 1);

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });


//        Button button1_1 = findViewById(R.id.button_1_1);
//        button1_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //显式Intent
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        Button button1_2 = findViewById(R.id.button_1_2);
//        button1_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //隐式Intent
//                //首先现在AndroidManifest.xml中加入
//                //<intent-filter>
//                //  <action android:name="com.ACTION_START" />
//                //  <category android:name="android.intent.category.DEFAULT" />
//                //</intent-filter>
//
//                Intent intent = new Intent("com.ACTION_START");
//                intent.addCategory("com.MY_CATEGORY");
//                startActivity(intent);
//            }
//        });
//
//        Button button1_3 = findViewById(R.id.button_1_3);
//        button1_3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("www.baidu.com"));
//                startActivity(intent);
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    //添加菜单按钮
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item: {
                Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.remove_item: {
                Toast.makeText(this, "Remove", Toast.LENGTH_SHORT).show();
                break;
            }
            default:
        }
        return true;
    }

}
