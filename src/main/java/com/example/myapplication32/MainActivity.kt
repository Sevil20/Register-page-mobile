package com.example.myapplication32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication32.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.registerButton.setOnClickListener {
            val name = binding.editTextName.text
            val email = binding.editTextEmailAddress.text
            val password = binding.editTextTextPassword.text
            val repeatPassword = binding.editTextTextPassword2.text

            if (name.isNullOrEmpty() || email.isNullOrEmpty() || password.isNullOrEmpty() || repeatPassword.isNullOrEmpty()) {
                Toast.makeText(applicationContext, "Fields cannot be empty!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            } else if (!(email.contains("@")) || password != repeatPassword || password.length <= 3) {
                Toast.makeText(applicationContext, "Something went wrong!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            } else {
                Toast.makeText(applicationContext, "Registered successfully", Toast.LENGTH_LONG).show()
            }
        }

    }
}
