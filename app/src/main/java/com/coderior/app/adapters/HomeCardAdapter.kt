package com.coderior.app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.coderior.app.R
import com.coderior.app.model.Course

class HomeCardAdapter(private val data: List<Course>) : RecyclerView.Adapter<HomeCardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.course_item_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cardItem = data[position]
        holder.bind(cardItem)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.title)
        private val imageView: ImageView = itemView.findViewById(R.id.image)
        private val progress: ProgressBar = itemView.findViewById(R.id.progress)

        fun bind(course: Course) {
            titleTextView.text = course.title
            imageView.setImageResource(course.image)
            progress.setProgress(course.progress)
        }
    }
}
