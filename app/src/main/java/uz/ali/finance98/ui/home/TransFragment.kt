package uz.ali.finance98.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.ali.finance98.R
import uz.ali.finance98.adapters.HomeAdapter
import uz.ali.finance98.models.Users
import java.util.ArrayList

class TransFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root=inflater.inflate(R.layout.fragment_trans, container, false)
        recyclerView=root.findViewById(R.id.recycler_trans)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var list = requireArguments().getSerializable("data") as ArrayList<Users>

        recyclerView.layoutManager = LinearLayoutManager(view?.context)

        recyclerView.adapter = HomeAdapter(list)
    }

}