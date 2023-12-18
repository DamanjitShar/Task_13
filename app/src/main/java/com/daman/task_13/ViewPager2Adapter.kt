package com.daman.task_13

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TutorialPagerAdapter(private val context: Context) :
    RecyclerView.Adapter<TutorialPagerAdapter.TutorialViewHolder>() {

    private val layouts = listOf(
        R.layout.tutorial_screen_1,
        R.layout.tutorial_screen_2,
        R.layout.tutorial_screen_3
    )

    inner class TutorialViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutorialViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return TutorialViewHolder(view)
    }

    override fun onBindViewHolder(holder: TutorialViewHolder, position: Int) {}

    override fun getItemCount(): Int = layouts.size

    override fun getItemViewType(position: Int): Int = layouts[position]
}
