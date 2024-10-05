package com.example.toast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText fn , ln;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        fn=findViewById(R.id.fn);
        ln=findViewById(R.id.ln);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f = fn.getText().toString();
                String l = ln.getText().toString();

                if (f.equals("Ayush") && l.equals("Tiwari")){
                    Toast.makeText(MainActivity.this,"Entered Correct Name !'VALIDATED'!", Toast.LENGTH_LONG).show();
                }
                else if (f.equals("") || l.equals("")){
                    Toast.makeText(MainActivity.this,"!!Leaved Empty!!Fill it then Validate", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"!!Enter Valid or Correct Name!!", Toast.LENGTH_LONG).show();
                }
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}