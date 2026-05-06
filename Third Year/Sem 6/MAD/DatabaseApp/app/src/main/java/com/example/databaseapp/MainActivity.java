package com.example.databaseapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    Button b1, b2, b3;
    TextView t1;

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

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        t1 = findViewById(R.id.textView3);

        // Create or open the database
        try {
            db = openOrCreateDatabase("StudentDB", MODE_PRIVATE, null);
            db.execSQL("CREATE TABLE IF NOT EXISTS Temp (id INTEGER, name TEXT, div TEXT)");
        } catch (SQLException e) {
            Toast.makeText(this, "Database Error: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }

        // INSERT button
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText eid   = findViewById(R.id.editText1);
                EditText ename = findViewById(R.id.editText2);
                EditText ediv = findViewById(R.id.editText3);

                String rollNo = eid.getText().toString().trim();
                String name   = ename.getText().toString().trim();
                String div = ediv.getText().toString().trim();

                if (rollNo.isEmpty() || name.isEmpty() || div.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Please fill in both fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                ContentValues values = new ContentValues();
                values.put("id",   rollNo);
                values.put("name", name);
                values.put("div" , div);

                long result = db.insert("Temp", null, values);
                if (result != -1) {
                    Toast.makeText(MainActivity.this,
                            "Record Successfully Inserted", Toast.LENGTH_SHORT).show();
                    eid.setText("");
                    ediv.setText("");
                    ename.setText("");
                } else {
                    Toast.makeText(MainActivity.this,
                            "Insert Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // DISPLAY button
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c = db.rawQuery("SELECT * FROM Temp", null);

                if (c.getCount() == 0) {
                    t1.setText("No records found.");
                    c.close();
                    return;
                }

                StringBuilder sb = new StringBuilder();
                sb.append("ID\t|\tName\t|\tDiv\n");
                sb.append("--------------------\n");

                while (c.moveToNext()) {
                    sb.append(c.getString(0))
                            .append("\t|\t")
                            .append(c.getString(1))
                            .append("\t|\t")
                            .append(c.getString(2))
                            .append("\n");

                }

                t1.setText(sb.toString());
                c.close();
            }
        });

        // CLEAR ALL button
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int deletedRows = db.delete("Temp", null, null);

                if (deletedRows > 0) {
                    Toast.makeText(MainActivity.this,
                            "All records deleted", Toast.LENGTH_SHORT).show();
                    t1.setText(""); // clear display
                } else {
                    Toast.makeText(MainActivity.this,
                            "No records to delete", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (db != null && db.isOpen()) {
            db.close();
        }
    }
}