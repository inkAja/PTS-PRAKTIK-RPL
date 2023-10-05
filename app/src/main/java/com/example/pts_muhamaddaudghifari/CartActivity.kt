package com.example.pts_muhamaddaudghifari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        val btnplus:ImageButton = findViewById(R.id.plusBtn)
        val btnminus:ImageButton = findViewById(R.id.minusBtn)
        val tvCount:TextView = findViewById(R.id.numberItemTxt)
        val tvHarga:TextView = findViewById(R.id.hargaBarang)
        val tvSubtotal:TextView = findViewById(R.id.tvSubtotal)
        val tvDelivery:TextView = findViewById(R.id.tvDelivery)
        val tvTotal:TextView =findViewById(R.id.tvTotal)
        var harga = 2500000
        var delivery = 1000000
        var angka = tvTotal.text.toString().toInt()
        tvHarga.text = harga.toString()
        btnminus.setOnClickListener {
            angka-=1
            tvCount.text = angka.toString()
            tvSubtotal.text = (harga*angka).toString()
            tvDelivery.text = delivery.toString()
            tvTotal.text = (harga*angka+delivery).toString()
        }
        btnplus.setOnClickListener {
            angka +=1
            tvCount.text = angka.toString()
            tvSubtotal.text = (harga*angka).toString()
            tvDelivery.text = delivery.toString()
            tvTotal.text = (harga*angka+delivery).toString()
        }
    }
}




