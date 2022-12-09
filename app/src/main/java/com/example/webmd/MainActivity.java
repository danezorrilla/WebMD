package com.example.webmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Doctor> doctors = new ArrayList<>();
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doctors.add(new Doctor(
                R.drawable.img,
                "Dr. Evil",
                "World Destruction",
                0,
                "666 Evil St, Washington, DC",
                "1-800-666-EVIL"));

        doctors.add(new Doctor(
                R.drawable.img_1,
                "Dr. Victor Frankenstein",
                "Surgeon",
                0,
                "13 Ave, Darmstadt, Germany",
                "1-800-666-6666"));

        listView = findViewById(R.id.listview);
        adapter = new MyAdapter(this, R.layout.doctor_card, doctors);
        listView.setAdapter(adapter);

    }
}