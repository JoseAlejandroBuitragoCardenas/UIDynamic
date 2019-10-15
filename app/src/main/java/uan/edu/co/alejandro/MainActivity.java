package uan.edu.co.alejandro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton boton1 = (ImageButton) findViewById(R.id.imageButton);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion = Toast.makeText(MainActivity.this,"Poseidon", Toast.LENGTH_SHORT);
                notificacion.show();

                MenuSlide2Activity.opcion=1;

                Intent pulsar = new Intent(getApplicationContext(),MenuSlide2Activity.class);
                startActivity(pulsar);
            }
        });

        ImageButton boton2 = (ImageButton) findViewById(R.id.imageButton8);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion = Toast.makeText(MainActivity.this,"Zeus", Toast.LENGTH_SHORT);
                notificacion.show();

                MenuSlide2Activity.opcion=2;

                Intent pulsar = new Intent(getApplicationContext(),MenuSlide2Activity.class);
                startActivity(pulsar);
            }
        });

        ImageButton boton3 = (ImageButton) findViewById(R.id.imageButton9);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion = Toast.makeText(MainActivity.this,"Hades", Toast.LENGTH_SHORT);
                notificacion.show();

                MenuSlide2Activity.opcion=3;

                Intent pulsar = new Intent(getApplicationContext(),MenuSlide2Activity.class);
                startActivity(pulsar);
            }
        });

        ImageButton boton4 = (ImageButton) findViewById(R.id.imageButton10);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion = Toast.makeText(MainActivity.this,"Ares", Toast.LENGTH_SHORT);
                notificacion.show();

                MenuSlide2Activity.opcion=4;

                Intent pulsar = new Intent(getApplicationContext(),MenuSlide2Activity.class);
                startActivity(pulsar);
            }
        });

        ImageButton boton5 = (ImageButton) findViewById(R.id.imageButton11);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion = Toast.makeText(MainActivity.this,"Hefesto", Toast.LENGTH_SHORT);
                notificacion.show();

                MenuSlide2Activity.opcion=5;

                Intent pulsar = new Intent(getApplicationContext(),MenuSlide2Activity.class);
                startActivity(pulsar);
            }
        });

        ImageButton boton6 = (ImageButton) findViewById(R.id.imageButton12);
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion = Toast.makeText(MainActivity.this,"Afrodita", Toast.LENGTH_SHORT);
                notificacion.show();

                MenuSlide2Activity.opcion=6;

                Intent pulsar = new Intent(getApplicationContext(),MenuSlide2Activity.class);
                startActivity(pulsar);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
