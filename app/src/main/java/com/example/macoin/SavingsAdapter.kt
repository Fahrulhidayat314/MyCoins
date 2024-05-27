package com.example.macoin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class SavingsAdapter(private val savingsList: List<Savings>) : RecyclerView.Adapter<SavingsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.savings_name)
        val amount: TextView = view.findViewById(R.id.savings_amount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_savings, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val savings = savingsList[position]
        holder.name.text = savings.name
        holder.amount.text = savings.amount.toString()
    }

    override fun getItemCount() = savingsList.size
}