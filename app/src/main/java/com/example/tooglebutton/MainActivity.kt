package com.example.tooglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDefaultToggleClick(view: View) {
        Toast.makeText(this, "DefaultToggle", Toast.LENGTH_SHORT).show()
    }

    fun onCustomToggleClick(view: View) {
        Toast.makeText(this, "CustomToggleClick", Toast.LENGTH_SHORT).show()
    }
}