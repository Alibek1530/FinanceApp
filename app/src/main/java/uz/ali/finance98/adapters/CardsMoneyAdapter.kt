package uz.ali.finance98.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.ali.finance98.R
import uz.ali.finance98.models.Users

class CardsMoneyAdapter(var list: List<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val name = list.get(position)
            holder.bind(name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_cards, parent, false)
        return MyViewHolder(v)
    }

    class MyViewHolder(var v: View) : RecyclerView.ViewHolder(v) {

        var Name = v.findViewById<TextView>(R.id.item_cards_name)


        fun bind(name: String) {
            Name.text=name
        }

    }
}