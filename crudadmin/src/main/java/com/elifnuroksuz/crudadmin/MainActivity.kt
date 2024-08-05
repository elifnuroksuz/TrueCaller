package com.elifnuroksuz.crudadmin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.elifnuroksuz.crudadmin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainUpload.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@MainActivity, UploadActivity::class.java)
            startActivity(intent)
            finish()
        })

        binding.mainUpdate.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@MainActivity, UpdateActivity::class.java)
            startActivity(intent)
        })

        binding.mainDelete.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@MainActivity, DeleteActivity::class.java)
            startActivity(intent)
        })

    }
}