package com.example.buttonnav.ui.student;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.buttonnav.R;
import com.example.buttonnav.models.Sutdents;

import java.util.ArrayList;
import java.util.List;

public class StudentsFragment extends Fragment {

    public static List<Sutdents> studentList = new ArrayList<>();
    EditText namet, aget, addresst;
    RadioGroup gendergrp;
    String name, age, address, gender;
    int img;
    Button addbtn;

    public StudentsFragment(){
    }

    View root;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_students, container, false);
        namet = root.findViewById(R.id.fullname);
        aget = root.findViewById(R.id.age);
        gendergrp = root.findViewById(R.id.gender);
        addresst = root.findViewById(R.id.address);
        addbtn = root.findViewById(R.id.addbtn);

        gendergrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.male){
                    gender = "Male";
                    img = R.drawable.male;
                }

                if (i == R.id.female){
                    gender = "Female";
                    img = R.drawable.female;
                }
                if (i == R.id.others){
                    gender = "Others";
                    img = R.drawable.male;
                }
            }
        });
           addbtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   addStudents();
               }
           });
               return root;

    }
    public void addStudents(){
        name = namet.getText().toString();
        age = aget.getText().toString();
        address = addresst.getText().toString();

        if(Validate()){
            studentList.add(new Sutdents(name,age,gender, address,img));
            Toast.makeText(root.getContext(), "Added Student", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean Validate() {
        if (TextUtils.isEmpty(name)) {
            namet.requestFocus();
            namet.setError("Name is empty");
            return false;
        }

        if(TextUtils.isEmpty(age)){
            namet.requestFocus();
            namet.setError("age is empty");
            return false;
    }
        if(TextUtils.isEmpty(address)) {
            namet.requestFocus();
            namet.setError("Address is empty");
            return false;
        }
        if(TextUtils.isEmpty(gender)){
            Toast.makeText(root.getContext(), "Select Gender", Toast.LENGTH_SHORT).show();
            return false;
    }
        return true;
}}


