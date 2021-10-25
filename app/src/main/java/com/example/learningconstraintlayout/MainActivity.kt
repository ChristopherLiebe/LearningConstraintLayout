package com.example.learningconstraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var main_Banner : ImageView
    lateinit var main_Poster : ImageView
    lateinit var main_Title : TextView
    lateinit var main_Bookmark : ImageView
    lateinit var main_Date : TextView
    lateinit var main_Rent : Button
    lateinit var main_Buy : Button
    lateinit var main_Divider_Stats : View
    lateinit var main_Rating_Background : ImageView
    lateinit var main_Rating_Text : TextView
    lateinit var main_Rating_Caption : TextView
    lateinit var main_Tomato_Background : ImageView
    lateinit var main_Tomato_Icon : ImageView
    lateinit var main_Tomato_Caption : TextView
    lateinit var main_Family_Background : ImageView
    lateinit var main_Family_Icon : ImageView
    lateinit var main_Family_Caption : TextView
    lateinit var main_Similar_Background : ImageView
    lateinit var main_Similar_Icon : ImageView
    lateinit var main_Similar_Caption : TextView
    lateinit var main_Divider_Description : View
    lateinit var main_Description : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wireWidgets()
    }

    private fun wireWidgets() {
        main_Banner = findViewById(R.id.main_Banner)
        main_Poster = findViewById(R.id.main_Poster)
        main_Title = findViewById(R.id.main_Title)
        main_Bookmark = findViewById(R.id.main_Bookmark)
        main_Date = findViewById(R.id.main_Date)
        main_Rent = findViewById(R.id.main_Rent)
        main_Buy = findViewById(R.id.main_Buy)
        main_Divider_Stats = findViewById(R.id.main_Divider_Stats)
        main_Rating_Background = findViewById(R.id.main_Rating_Background)
        main_Rating_Text = findViewById(R.id.main_Rating_Text)
        main_Rating_Caption = findViewById(R.id.main_Rating_Caption)
        main_Tomato_Background = findViewById(R.id.main_Tomato_Background)
        main_Tomato_Icon = findViewById(R.id.main_Tomato_Icon)
        main_Tomato_Caption = findViewById(R.id.main_Tomato_Caption)
        main_Family_Background = findViewById(R.id.main_Family_Background)
        main_Family_Icon = findViewById(R.id.main_Family_Icon)
        main_Family_Caption = findViewById(R.id.main_Family_Caption)
        main_Similar_Background = findViewById(R.id.main_Similar_Background)
        main_Similar_Icon = findViewById(R.id.main_Similar_Icon)
        main_Similar_Caption = findViewById(R.id.main_Similar_Caption)
        main_Divider_Description = findViewById(R.id.main_Divider_Description)
        main_Description = findViewById(R.id.main_Description)

    }
}