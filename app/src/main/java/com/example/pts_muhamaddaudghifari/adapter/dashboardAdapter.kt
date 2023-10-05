package com.example.pts_muhamaddaudghifari.adapter

import android.content.Intent
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.pts_muhamaddaudghifari.ProductActivity
import com.example.pts_muhamaddaudghifari.R
import com.example.pts_muhamaddaudghifari.model.dashboard

class dashboardAdapter(val data:ArrayList<dashboard>):RecyclerView.Adapter<dashboardAdapter.dashboardViewholder>() {
    class dashboardViewholder(view: View):RecyclerView.ViewHolder(view) {
        val ivPic:ImageView = view.findViewById(R.id.pic)
        val tvItemName:TextView = view.findViewById(R.id.itemName)
        val tvStock:TextView = view.findViewById(R.id.stockItem)
        val tvshare:TextView = view.findViewById(R.id.tvshare)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dashboardViewholder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_dashboard,parent,false)
        return dashboardViewholder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: dashboardViewholder, position: Int) {
        val item = data.get(position)
        holder.ivPic.setImageResource(item.image)
        holder.tvItemName.text = item.Isi
        holder.itemView.setOnClickListener{
        val intent=Intent(holder.itemView.context, ProductActivity::class.java)
        holder.itemView.context.startActivity(intent)
    }
    }


}