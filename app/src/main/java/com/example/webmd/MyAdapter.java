package com.example.webmd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Doctor> {

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Doctor> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.doctor_card, parent, false);
        }

        Doctor doctor = getItem(position);
        ImageView doctor_image = convertView.findViewById(R.id.doc_profile_pic);
        TextView doctor_name = convertView.findViewById(R.id.doc_name);
        TextView doctor_spec = convertView.findViewById(R.id.doc_spec);
        TextView doctor_address = convertView.findViewById(R.id.doc_address);
        Button doctor_phone = convertView.findViewById(R.id.doc_phone_number);

        doctor_image.setImageResource(doctor.getImage());
        doctor_name.setText(doctor.getName());
        doctor_spec.setText(doctor.getSpecial());
        doctor_address.setText(doctor.getAddress());
        doctor_phone.setText(doctor.getNumber());


        return convertView;
    }
}
