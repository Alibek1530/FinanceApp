package uz.ali.finance98.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.ali.finance98.R
import uz.ali.finance98.models.Users

class HomeAdapter(var list: List<Users>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val model = list.get(position)
            holder.bind(model)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return MyViewHolder(v)
    }

    class MyViewHolder(var v: View) : RecyclerView.ViewHolder(v) {

        var Name = v.findViewById<TextView>(R.id.item_name)
        var Trans = v.findViewById<TextView>(R.id.item_trans)
        var Sum = v.findViewById<TextView>(R.id.item_sum)


        fun bind(model: Users) {
            Name.text=model.name
            Trans.text=model.trans
            Sum.text=model.sum
        }

    }
}