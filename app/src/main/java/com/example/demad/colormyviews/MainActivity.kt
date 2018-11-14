package com.example.demad.colormyviews

import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {
        val clickableViews: List<View> =
            listOf(
                box_one_text,
                box_text_two,
                box_text_three,
                box_text_four,
                box_text_five,
                constraint,
                red_button,
                yellow_button,
                green_button
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_text_two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_text_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_text_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_text_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
//            R.id.red_button -> box_text_three.setBackgroundResource(R.color.my_red)
//            R.id.red_button -> view.setBackgroundResource(R.color.my_red)
            R.id.red_button -> constraint.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_text_four.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_text_five.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
