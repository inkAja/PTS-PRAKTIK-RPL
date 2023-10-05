package com.example.pts_muhamaddaudghifari

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AlertDialog.Builder
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val etEmail:EditText = findViewById(R.id.etEmail)
        val etPassword:EditText = findViewById(R.id.etPassword)
        val btnLogin:Button =findViewById(R.id.btnLogin)

        val email1 = "siswa"
        val pass1 = "123"
        val email2 = "siswa2"
        val pass2 = "1234"

        btnLogin.setOnClickListener{
            if(etEmail.text.toString()==email1 && etPassword.text.toString()==pass1 ){
                val intent=Intent(this, DashboardActivity::class.java)
                startActivity(intent)
                finish()
            } else if (etEmail.text.toString()==email2 && etPassword.text.toString()==pass2){
                val intent=Intent(this, DashboardActivity::class.java)
                startActivity(intent)
                finish()
            }else if(etEmail.text.toString().isEmpty() && etPassword.text.toString().isEmpty()){
                Toast.makeText(this, "Username or Password wajib di isi",Toast.LENGTH_SHORT).show()
            } else{
                val builder = Builder(this)
                builder.setMessage("Email atau password salah")
                builder.setTitle("Alert!!")
                builder.setPositiveButton("Ok"){
                        dialog,which->
                }
                val AlertDialog = builder.create()
                AlertDialog.show()
            }
        }
    }
}