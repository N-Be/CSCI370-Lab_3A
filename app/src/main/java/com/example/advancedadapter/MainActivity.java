package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Kevin","O'Leary","Business");
        studentList.add(student1);

        Student student2 = new Student("Barbara","Corcoran","Political Science");
        studentList.add(student2);

        Student student3 = new Student("Mark","Cuban","Sports Management");
        studentList.add(student3);

        Student student4 = new Student("Lori","Greiner","Fashion");
        studentList.add(student4);

        Student student5 = new Student("Daymond","John","Business");
        studentList.add(student5);

        ListView listView = findViewById(R.id.student);
        StudentAdapter adapter = new StudentAdapter(this,studentList);

        listView.setAdapter(adapter);



    }




}
