package com.e.newsapi

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val imageView = itemView.findViewById<ImageView>(R.id.image_row)
    val descriptionText = itemView.findViewById<TextView>(R.id.content_row)
    val publishText = itemView.findViewById<TextView>(R.id.publish_row)
    val row = itemView.findViewById<View>(R.id.row)
}