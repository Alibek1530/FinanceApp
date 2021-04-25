package uz.ali.finance98.ui.earnings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.ali.finance98.R
import uz.ali.finance98.adapters.EarningsAdapter
import uz.ali.finance98.adapters.HomeAdapter
import uz.ali.finance98.repository.DBdata

class EarningsFragment : Fragment() {
    private lateinit var spinner: Spinner
    private lateinit var dBdata: DBdata
    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.fragment_earnings, container, false)
        spinner = root.findViewById(R.id.spinner)
        recyclerView=root.findViewById(R.id.recycler_earning)

        dBdata = DBdata()
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       setSpinner(view)
        setRecyclerEarning()
    }

    fun setSpinner(view: View) {
        val adapter: ArrayAdapter<String> =
            ArrayAdapter<String>(view.context, android.R.layout.simple_spinner_item, dBdata.getStinnerList())
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(view.context,"${p2}",Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun setRecyclerEarning(){
        recyclerView.layoutManager = LinearLayoutManager(view?.context)

        recyclerView.adapter = EarningsAdapter(dBdata.getDateName())
    }


}