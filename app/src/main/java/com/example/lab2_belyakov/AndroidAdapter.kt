package com.example.lab2_belyakov

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2_belyakov.data.Android

class AndroidAdapter(private val listener: (position: Android) -> Unit,
                     Context: Context, private val android: List<Android>
): RecyclerView.Adapter<AndroidAdapter.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(Context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.item_android, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
        holder.itemView.setOnClickListener {
            listener.invoke(getItem(position))
        }
    }

    override fun getItemCount(): Int = android.size

    private fun getItem(position: Int) : Android = android[position]

    class ViewHolder(itemView: View
    ): RecyclerView.ViewHolder(itemView){
        private val image: ImageView = itemView.findViewById(R.id.image)
        private val title: TextView = itemView.findViewById(R.id.title)

//        init {
//            itemView.setOnClickListener(this)
//        }

//        override fun onClick(v: View?) {
//            listener.invoke(adapterPosition)
//        }

        fun bind(version: Android){
            image.setImageResource(version.ImageAndroid)
            title.text = version.title
        }
    }
    
}