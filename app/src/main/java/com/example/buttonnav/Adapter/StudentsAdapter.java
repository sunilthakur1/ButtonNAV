package com.example.buttonnav.Adapter;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.buttonnav.R;
import com.example.buttonnav.models.Sutdents;
import com.example.buttonnav.ui.student.StudentsFragment;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.MyHolder> {
Context context;
List<Sutdents> studList;

public StudentsAdapter (Context context, List<Sutdents> studList){
    this.context = context;
    this.studList = studList;
}

    @NonNull
    @Override
    public StudentsAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.student_view,parent, false);
        MyHolder holder = new MyHolder(view);

    return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsAdapter.MyHolder holder,final int position) {
     final Sutdents stud = studList.get(position);

     holder.proimage.setImageResource(stud.getImg());
     holder.name.setText(stud.getName());
        holder.age.setText(stud.getAge());
        holder.address.setText(stud.getAddress());
        holder.gender.setText(stud.getGender());

        holder.delimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studList.remove(stud);

                notifyItemRemoved(position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return studList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        ImageView proimage, delimg;
        TextView name, age, gender, address;



        public MyHolder(@NonNull View itemView) {
            super(itemView);
            proimage = itemView.findViewById(R.id.proimg);
            name = itemView.findViewById(R.id.nameview);
            age = itemView.findViewById(R.id.ageview);
            gender = itemView.findViewById(R.id.genderview);
            delimg = itemView.findViewById(R.id.delete);
            address = itemView.findViewById((R.id.addressview));

        }
    }
}
