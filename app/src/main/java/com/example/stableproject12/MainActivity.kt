package com.example.stableproject12

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.stableproject12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val db = Room.databaseBuilder(
          applicationContext,
            AppDatabase::class.java, "database-name")
            .allowMainThreadQueries().build()

        binding.submitbtn.setOnClickListener {

            var name = binding.name.text.toString().trim()

            var user = User(name = name)

            db.userDao().insertAll(user)

        }
    }
}