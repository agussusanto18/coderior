package com.coderior.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.coderior.app.adapters.GlobalRankingAdapter

class LeaderboardRankingFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var globalRankingAdapter: GlobalRankingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_leaderboard_ranking, container, false)

        recyclerView = view.findViewById(R.id.globalRankingListrecyclerView)
        globalRankingAdapter = GlobalRankingAdapter()
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = globalRankingAdapter

        return view
    }

}