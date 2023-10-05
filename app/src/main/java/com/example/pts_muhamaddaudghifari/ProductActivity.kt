package com.example.pts_muhamaddaudghifari

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var ibShare:ImageButton? =null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        ibShare = findViewById(R.id.ibShare)
        val ivMark:ImageButton = findViewById(R.id.ivMark)
        val btnbuy:Button = findViewById(R.id.btnBuy)

        btnbuy.setOnClickListener{
            val intent= Intent(this, CartActivity::class.java)
            startActivity(intent)
        }
        ivMark.setOnClickListener {
            ivMark.setImageResource(R.drawable.ic_bookmark2)
        }
        ibShare!!.setOnClickListener {
            val pesan= "kamu dapat membeli ini"
            val phoneIntent = Intent(Intent.ACTION_SEND, Uri.parse("tel: $pesan"))
            startActivity(phoneIntent)
        }
    }
}