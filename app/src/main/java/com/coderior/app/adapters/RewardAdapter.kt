package com.coderior.app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.coderior.app.R
import com.coderior.app.model.Course
import com.coderior.app.model.Reward

class RewardAdapter(private val data: List<Reward>): RecyclerView.Adapter<RewardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.reward_card, parent, false)
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

        private val rewardTitle: TextView = itemView.findViewById(R.id.rewardTitle)
        private val rewardSubTitle: TextView = itemView.findViewById(R.id.rewardSubTitle)
        private val rewardImage: ImageView = itemView.findViewById(R.id.rewardImage)
        private val rewardProgress: ProgressBar = itemView.findViewById(R.id.rewardProgress)
        private val rewardClaimBtn: Button = itemView.findViewById(R.id.claimBtn)

        fun bind(reward: Reward) {
            rewardTitle.text = reward.title
            rewardSubTitle.text = reward.subTitle
            rewardImage.setImageResource(reward.image)
            rewardProgress.setProgress(reward.progress)

            if (reward.progress == 100) {
                rewardSubTitle.visibility = View.GONE
                rewardProgress.visibility = View.GONE
            } else {
                rewardClaimBtn.visibility = View.GONE
            }
        }
    }
}