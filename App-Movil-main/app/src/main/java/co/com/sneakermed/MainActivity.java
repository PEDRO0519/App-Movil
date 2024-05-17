package co.com.sneakermed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnregistrarse;
    Button btninicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btninicio = findViewById(R.id.btniniciar);
        btnregistrarse = findViewById(R.id.btnregistrarse);

        btnregistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irRegistro();
            }
        });

    }
    public void irRegistro(){
        Intent intent = new Intent(this,registro.class);
        startActivity(intent);
    }

}