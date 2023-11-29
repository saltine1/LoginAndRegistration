package com.example.loginandregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginandregistration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        val EXTRA_USERNAME = "username"
        val EXTRA_PASSWORD = "password"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.textView4.setOnClickListener {
            val registrationIntent = Intent(this, RegistrationActivity::class.java)
            registrationIntent.putExtra(EXTRA_USERNAME, binding.editTextTextEmailAddress.text.toString())
            registrationIntent.putExtra(EXTRA_PASSWORD, binding.editTextTextPassword2.text.toString())
            startActivity(registrationIntent)
        }
    }
}