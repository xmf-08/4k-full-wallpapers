package com.example.a4kfullwallpapers
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a4kfullwallpapers.adapters.RvAdapter
import com.example.a4kfullwallpapers.databinding.ActivityMainBinding
import com.example.a4kfullwallpapers.fragments.OtherFragment
import com.example.a4kfullwallpapers.fragments.homeFragment
import com.example.a4kfullwallpapers.fragments.likeFragment
import com.example.a4kfullwallpapers.fragments.saveFragment
import com.example.a4kfullwallpapers.models.MyShablon

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val homeFraggment = homeFragment()
        val likeFraggment = likeFragment()
        val saveFraggment = saveFragment()
        val otherFragment = OtherFragment()
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> {
                    supportFragmentManager.beginTransaction()
                        .add(R.id.my_container, homeFraggment)
                        .addToBackStack(homeFraggment.toString())
                        .commit()
                }
                R.id.like ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.my_container, likeFraggment)
                        .addToBackStack(homeFraggment.toString())
                        .commit()
                }
                R.id.saveds ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.my_container, saveFraggment)
                        .addToBackStack(homeFraggment.toString())
                        .commit()
                }
                R.id.others ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.my_container, otherFragment)
                        .addToBackStack(homeFraggment.toString())
                        .commit()
                }
            }
            true
        }
   }
}
