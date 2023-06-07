package com.coderior.app

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.coderior.app.adapters.GlobalRankingAdapter
import com.coderior.app.adapters.HomeCardAdapter


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LeaderboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LeaderboardFragment : Fragment(), View.OnClickListener {

    lateinit var select1: TextView
    lateinit var select2: TextView
    lateinit var tab1: TextView
    lateinit var tab2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_leaderboard, container, false)

        childFragmentManager.beginTransaction().replace(R.id.leaderboardContainer, LeaderboardRankingFragment()).commit()

        tab1 = view.findViewById(R.id.tab1)
        tab2 = view.findViewById(R.id.tab2)
        tab1.setOnClickListener(this)
        tab2.setOnClickListener(this)
        select1 = view.findViewById(R.id.select1)
        select2 = view.findViewById(R.id.select2)

        return view
    }

    @SuppressLint("ResourceAsColor")
    override fun onClick(view: View) {
        if (view.id == R.id.tab1) {
            select1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.active))
            select2.setBackgroundColor(Color.WHITE)

            tab1.setTextColor(Color.WHITE)
            tab2.setTextColor(ContextCompat.getColor(requireContext(), R.color.subTitle))

            childFragmentManager.beginTransaction().replace(R.id.leaderboardContainer, LeaderboardRankingFragment()).commit()
        } else if (view.id == R.id.tab2) {
            select1.setBackgroundColor(Color.WHITE)
            select2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.active))

            tab1.setTextColor(ContextCompat.getColor(requireContext(), R.color.subTitle))
            tab2.setTextColor(Color.WHITE)

            childFragmentManager.beginTransaction().replace(R.id.leaderboardContainer, LeaderboardRewardFragment()).commit()
        }
    }
}