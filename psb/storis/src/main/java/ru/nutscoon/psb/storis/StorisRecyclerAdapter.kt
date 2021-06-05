package ru.nutscoon.psb.storis

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class StorisRecyclerAdapter(private val names: List<StorisData>) :
    RecyclerView.Adapter<StorisRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var storisTitle: TextView? = null
        var storisImg: ImageView? = null

        init {
            storisTitle = itemView.findViewById(R.id.storis_title)
            storisImg = itemView.findViewById(R.id.storis_img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.storis_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.storisTitle?.text = names[position].title
        holder.storisImg?.setImageResource(names[position].img)
    }

    override fun getItemCount() = names.size
}