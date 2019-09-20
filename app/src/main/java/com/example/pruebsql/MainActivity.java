package com.example.pruebsql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUser,etPass;
    Button b1;
    String codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = (EditText)findViewById(R.id.editText);
        etPass = (EditText)findViewById(R.id.editText2);
        codigo = "COD";
        b1 = (Button)findViewById(R.id.button);
        final DeveloperuBD developeruBD = new DeveloperuBD(getApplicationContext());

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                developeruBD.agregarCursos(codigo,etUser.getText().toString(),etPass.getText().toString());
                Toast.makeText(getApplicationContext(),"Bien insertado !",Toast.LENGTH_LONG).show();
            }
        });
    }


}
