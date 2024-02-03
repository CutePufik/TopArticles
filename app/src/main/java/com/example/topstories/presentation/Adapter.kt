package com.example.topstories.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.topstories.R
import com.example.topstories.domain.models.Article
import com.squareup.picasso.Picasso

class Adapter : RecyclerView.Adapter<Adapter.holder>() {

    var list = emptyList<Article>()


    override fun onBindViewHolder(holder: holder, position: Int) {
        val currentItem = list[position]

        holder.titleText.text = currentItem.title
        holder.abstractText.text = currentItem.abstract
        holder.captionText.text = "On picture: " + currentItem.multimedia[0].caption
        val imageUrl = currentItem.multimedia[0].url
        Picasso.get().load(imageUrl).into(holder.imageUrl)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.article_item,parent,false)
        return holder(view)
    }


    override fun getItemCount(): Int {
        return list.size
    }

    class holder(view : View): RecyclerView.ViewHolder(view){
        val titleText = view.findViewById<TextView>(R.id.titleTextView)
        val abstractText = view.findViewById<TextView>(R.id.abstractTextView)
        val captionText = view.findViewById<TextView>(R.id.captionTextView)
        val imageUrl = view.findViewById<ImageView>(R.id.articleImageView)
    }

    fun setNews(lst : List<Article>){
        list = lst
        notifyDataSetChanged()
    }


}