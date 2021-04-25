package uz.ali.finance98.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.ali.finance98.R
import uz.ali.finance98.models.DataEarningModel
import uz.ali.finance98.models.Users

class EarningsAdapter(var list: List<DataEarningModel>) :
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
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_earnings, parent, false)
        return MyViewHolder(v)
    }

    class MyViewHolder(var v: View) : RecyclerView.ViewHolder(v) {

       private var Name = v.findViewById<TextView>(R.id.item_name_earning)
       private var Date = v.findViewById<TextView>(R.id.item_earning)


        fun bind(model: DataEarningModel) {
            Name.text=model.name
            Date.text=model.date
        }

    }
}