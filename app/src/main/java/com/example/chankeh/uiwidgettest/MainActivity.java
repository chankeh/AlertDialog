package com.example.chankeh.uiwidgettest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private ImageView img;
    private ProgressBar progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.btn_1);
        editText = (EditText)findViewById(R.id.edit_text);
        img = (ImageView)findViewById(R.id.img_view);
        progress = (ProgressBar)findViewById(R.id.pro_bar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  switch(view.getId()){
                      case R.id.btn_1:
                          AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                          dialog.setTitle("This is a Dialog!");
                          dialog.setMessage("Something important!");
                          dialog.setCancelable(false);
                          dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                              @Override
                              public void onClick(DialogInterface dialogInterface, int i) {

                              }
                          });
                          dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                              @Override
                              public void onClick(DialogInterface dialogInterface, int i) {

                              }
                          });
                          dialog.show();
                          break;
                      default:
                          break;
                  }
            }
        });
    }
}
