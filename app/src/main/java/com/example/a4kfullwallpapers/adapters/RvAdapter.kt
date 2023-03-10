package com.example.a4kfullwallpapers.adapters

import android.app.WallpaperManager
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.a4kfullwallpapers.databinding.ItemViewBinding
import com.example.a4kfullwallpapers.models.MyShablon
import java.io.IOException

class RvAdapter(private val list: ArrayList<MyShablon>)
: RecyclerView.Adapter<RvAdapter.Vh>(){

    inner class Vh(private val binding:ItemViewBinding):RecyclerView.ViewHolder(binding.root){
        fun onBind(myShablon: MyShablon, position: Int){
            binding.title.text = myShablon.title
            Glide.with(itemView).load(myShablon.image).into(binding.img)
//            when (position){
//                0->{
//                    binding.title.text = "Savanna"
//                    Glide.with(itemView).load(myShablon.image).into(binding.img)
//                }
//                1->{
//                    binding.title.text = "Cars"
//                    Glide.with(itemView).load(myShablon.image).into(binding.img)
//                }
//                2->{
//                    binding.title.text = "Bird"
//                    Glide.with(itemView).load(myShablon.image).into(binding.img)
//                }
//                3->{
//                    binding.title.text = "Fofanna"
//                    Glide.with(itemView).load(myShablon.image).into(binding.img)
//                }
//            }
            itemView.setOnClickListener{
                Glide.with(itemView).asBitmap().load(myShablon.image).into(object :SimpleTarget<Bitmap?>(){
                    override fun onResourceReady(
                        resource: Bitmap,
                        transition: Transition<in Bitmap?>?
                    ) {
                        try {
                            WallpaperManager.getInstance(itemView.context).setBitmap(resource)
                        }catch (e:IOException){
                            e.printStackTrace()
                        }
                    }
                })
                Toast.makeText(binding.root.context, "Background theme edited!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        val view = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Vh(view)
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],0)
    }

    override fun getItemCount(): Int = list.size

}