package com.example.a4kfullwallpapers.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a4kfullwallpapers.R
import com.example.a4kfullwallpapers.adapters.RvAdapter
import com.example.a4kfullwallpapers.databinding.FragmentHomeBinding
import com.example.a4kfullwallpapers.databinding.FragmentOtherBinding
import com.example.a4kfullwallpapers.models.MyShablon

class OtherFragment : Fragment() {
    private val binding by lazy { FragmentOtherBinding.inflate(layoutInflater) }
    private var myShablon = ArrayList<MyShablon>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myShablon.add(
            MyShablon(
                "Savanna",
                "https://img.freepik.com/free-photo/beautiful-shot-tree-savanna-plains-with-blue-sky_181624-21992.jpg?size=626&ext=jpg&ga=GA1.2.446606450.1664455129"
            )
        )
        myShablon.add(
            MyShablon(
                "Jaguar",
                "https://img.freepik.com/free-photo/beautiful-cheetahs-among-plants-middle-desert_181624-6329.jpg?size=626&ext=jpg&ga=GA1.2.446606450.1664455129"
            )
        )
        myShablon.add(
            MyShablon(
                "BlackStyles",
                "https://img.freepik.com/free-vector/dark-hexagonal-background-with-gradient-color_79603-1409.jpg?size=626&ext=jpg&ga=GA1.2.446606450.1664455129"
            )
        )
        myShablon.add(
            MyShablon(
                "Lines",
                "https://img.freepik.com/free-vector/abstract-technology-particle-background_52683-25766.jpg?size=626&ext=jpg&ga=GA1.2.446606450.1664455129"
            )
        )
        myShablon.add(
            MyShablon(
                "Stars",
                "https://img.freepik.com/free-vector/silver-stars-pattern-design_23-2150012539.jpg?size=338&ext=jpg&ga=GA1.2.446606450.1664455129"
            )
        )
        myShablon.add(
            MyShablon(
                "Bird",
                "https://img.freepik.com/premium-photo/bea-eater-branch_131985-716.jpg?size=626&ext=jpg&ga=GA1.2.446606450.1664455129"
            )
        )
        myShablon.add(
            MyShablon(
                "Elephant",
                "https://img.freepik.com/premium-photo/african-bush-elephant-grassland-etosha-national-park-namibia_441668-574.jpg?size=626&ext=jpg&ga=GA1.2.446606450.1664455129"
            )
        )

        val adapter = RvAdapter(myShablon)
        binding.rv.layoutManager = LinearLayoutManager(context)
        binding.rv.adapter = adapter
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            OtherFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}