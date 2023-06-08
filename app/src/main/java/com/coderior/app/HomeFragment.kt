package com.coderior.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.coderior.app.adapters.HomeCardAdapter
import com.coderior.app.model.Course

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cardAdapter: HomeCardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val courseItems = listOf<Course>(
            Course("Web Development", R.drawable.course_web, 0),
            Course("Mobile App Development", R.drawable.course_mobile, 80),
            Course("Programming Language", R.drawable.course_programming, 100),
            Course("Algorithm & Data Structure", R.drawable.course_ai, 50)
        )

        recyclerView = view.findViewById(R.id.courseListrecyclerView)
        cardAdapter = HomeCardAdapter(courseItems)

        // Set up the RecyclerView with a GridLayoutManager
        val spanCount = 2 // Number of columns in the grid
        recyclerView.layoutManager = GridLayoutManager(requireContext(), spanCount)
        recyclerView.adapter = cardAdapter

        return view
    }

}