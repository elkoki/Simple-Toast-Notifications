package com.elkoki.toastsimplenotificatios;

import static java.lang.Integer.parseInt;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText edtxtno1;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edtxtno1=findViewById(R.id.edtxtno1);
        num= (int) (Math.random()*100000);
        Toast.makeText(this, ""+num,Toast.LENGTH_SHORT).show();

    }
    public void check(View view) {
        if(edtxtno1.getText().toString().isEmpty()){
            Toast.makeText(this, "Ingrese un numero",Toast.LENGTH_SHORT).show();
            return;
        }
        int value;
        value= parseInt(edtxtno1.getText().toString());
        if(value==num){
            Toast.makeText(this, "Numero correcto",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Incorrecto",Toast.LENGTH_SHORT).show();
        }

    }
}