package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void edit(View view){
            Intent intent=new Intent(this, neext.class);
            startActivity(intent);
            EditText editText=(EditText) findViewById(R.id.edit);
            String firstname=editText.getText().toString();
            intent.putExtra("firstname",firstname);

    }

}