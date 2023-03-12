package com.tugbaalbas.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String username;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        username = "";
    }

    //onClicke yazdığımız isimle her zaman aynı olmak zorundadır.
    public void changeActivity(View view){
        //kullanıcıdan veriyi alalım:
        username = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        intent.putExtra("userInput",username); //activity2e gönderdik

        startActivity(intent);



    }
}