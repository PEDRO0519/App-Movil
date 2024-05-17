package co.com.sneakermed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class registro extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference().child("Usuarios");


    EditText inputnombre;

    EditText inputapellido;
    EditText inputcorreo;
    EditText inputconfirmarcorreo;
    EditText inputcontraseña;
    EditText inputconfirmarcontra;
    EditText inputgenero;
    EditText inputnacimiento;
     Button btnregistro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        inputnombre = findViewById(R.id.input_nombre);
        inputapellido = findViewById(R.id.input_apellido);
        inputcorreo = findViewById(R.id.input_correo);
        inputconfirmarcorreo = findViewById(R.id.input_confirmar_correo);
          inputcontraseña = findViewById(R.id.input_contraseña);
        inputconfirmarcontra = findViewById(R.id.input_confirmar_contra);
        inputgenero = findViewById(R.id.input_genero);
        inputnacimiento = findViewById(R.id.input_nacimiento);
    btnregistro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            registrarUsuario();
        }
    });


    }
public void registrarUsuario(){
        String nombre  = inputnombre.getText().toString();
        DatabaseReference nuevoUsuario = reference.child(String.valueOf(nombre));
        String Usuarionombre = inputnombre.getText().toString();
        String apellido = inputapellido.getText().toString();
        nuevoUsuario.child("apellido").setValue(apellido);
        String correo = inputcorreo.getText().toString();
        nuevoUsuario.child("correo").setValue(correo);
        String confirmCoreo = inputconfirmarcorreo.getText().toString();
        nuevoUsuario.child("confirmar-correo").setValue(confirmCoreo);
        String contraseña = inputcontraseña.getText().toString();
        nuevoUsuario.child("contraseña").setValue(contraseña);
        String confirmContra = inputconfirmarcontra.getText().toString();
        nuevoUsuario.child("confirmar-contraseña").setValue(confirmContra);
        String genero = inputgenero.getText().toString();
        nuevoUsuario.child("genero").setValue(genero);

        double fechaNac = 0;
        nuevoUsuario.child("fecha nacimiento").setValue(fechaNac);
    Toast.makeText(getApplicationContext(), "el usuario a sido creado exitosamente ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        }
}