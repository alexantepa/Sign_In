package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText parol1, login1;
    String parol = "parol", login = "Login";
    String first, second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parol1 = findViewById(R.id.parol);
        login1 = findViewById(R.id.login);
    }

    public void result(View v){
        first = parol1.getText().toString();
        second = login1.getText().toString();
        if (first.equals(parol) && second.equals(login)) Toast.makeText(this, "Вход выполнен", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "Логин или пароль неверный!", Toast.LENGTH_SHORT).show();
    }

}