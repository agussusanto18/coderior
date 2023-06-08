package com.coderior.app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.coderior.app.adapters.GlobalRankingAdapter
import com.coderior.app.adapters.RewardAdapter
import com.coderior.app.model.Course
import com.coderior.app.model.Reward

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LeaderboardRewardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LeaderboardRewardFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var rewardAdapter: RewardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_leaderboard_reward, container, false)

        val rewardItems = listOf<Reward>(
            Reward("Sprinter Man", "Reach your first 12-day strike", R.drawable.reward1, 20),
            Reward("Bubble Books", "Reach your first 12-day strike", R.drawable.reward2, 100),
            Reward("Rank Booster", "Rank 1st in a literature quiz", R.drawable.reward3, 30),
            Reward("Infinite wizard", "Complete a no mistake quiz", R.drawable.reward4, 40),
        )

        recyclerView = view.findViewById(R.id.rewardsListrecyclerView)
        rewardAdapter = RewardAdapter(rewardItems)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = rewardAdapter

        return view
    }
}