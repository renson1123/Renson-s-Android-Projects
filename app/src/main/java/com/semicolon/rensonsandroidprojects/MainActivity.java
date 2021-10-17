 package com.semicolon.rensonsandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started App", "Our very first project, the default 'Hello World app!'", R.drawable.getting_started),
                new Project("Renson Quote", "Making a simple change to the layout, with my own personal motivational quote for Software Developers", R.drawable.quote),
                new Project("BMI Calculator", "A real life working BMI calculator teaching me Variables, Methods and Conditional Logic", R.drawable.calculator),
                new Project("Inches Converter", "A basic converter to convert inches to meters (my own personal calculator app made on my own)", R.drawable.tape),
                new Project("The Developers Pub", "A menu app for a fictional restaurant, learning about Activities, Classes & Objects, Arrays, Intents and ListViews", R.drawable.developers_pub),
                new Project("My Bucket List", "My personal bucket list containing all the things i want to do and where to go, learning about RecyclerViews, EntryAdapter and ViewHolder", R.drawable.bucket_list),
                new Project("Registration Form App", "Making a simple Registration Form App, learning about Spinners, TextInputLayout, TextInputEditText and Resources values", R.drawable.registration)

        };

        ProjectAdapter adapter = new ProjectAdapter(projects);

        list.setAdapter(adapter);

    }
}