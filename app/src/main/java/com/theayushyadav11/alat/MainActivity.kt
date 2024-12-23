package com.theayushyadav11.alat

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        var btn=findViewById<MaterialButton>(R.id.btn_login)
//        btn.setOnClickListener{
//            Toast.makeText(this, "Login btn is clicked" , Toast.LENGTH_SHORT).show()
//
//            var btn=findViewById<MaterialButton>(R.id.btn_login)
//            btn.setOnClickListener{
//                Toast.makeText(this, "Login btn is clicked" , Toast.LENGTH_SHORT).show()
//            var intent= Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//
//            }

}
}