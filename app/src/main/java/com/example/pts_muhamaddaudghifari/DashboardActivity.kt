package com.example.pts_muhamaddaudghifari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.pts_muhamaddaudghifari.adapter.dashboardAdapter
import com.example.pts_muhamaddaudghifari.model.dashboard

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val notif:ImageButton = findViewById(R.id.notif)
        val cvnotif:CardView = findViewById(R.id.cvNotif)
        val rvDashboard:RecyclerView = findViewById(R.id.rvPopularProduct)
        val isi= arrayListOf<dashboard>(
            dashboard(R.drawable.pic1,"MacBook Pro 13 M2 chip"),
            dashboard(R.drawable.pic2,"Ps 5 Digital"),
            dashboard(R.drawable.pic3,"Iphone")
        )
        val adapter = dashboardAdapter(isi)
        val linearHorizontal = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        rvDashboard.adapter = adapter
        rvDashboard.layoutManager = linearHorizontal
        notif.setOnClickListener {
            if (cvnotif.visibility==View.GONE){
                cvnotif.visibility = View.VISIBLE
            } else{
                cvnotif.visibility = View.GONE
            }
        }
    }
}