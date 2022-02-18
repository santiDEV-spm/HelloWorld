package com.santidev.helloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: " + getString(R.string.greetings));
        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();

        textView = (TextView) findViewById(R.id.textView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void topClick(View view){
        Toast.makeText(this, "He pulsado el boton de arriba", Toast.LENGTH_SHORT).show();
        textView.setText("He pulsado el boton de arriba");
    }

    public void bottomClick(View v){
        Toast.makeText(this, "He pulsado el boton de abajo", Toast.LENGTH_SHORT).show();
        textView.setText("He pulsado el boton de abajo");
    }

}