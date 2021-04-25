package uz.ali.finance98.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import github.chenupt.multiplemodel.viewpager.ModelPagerAdapter
import github.chenupt.multiplemodel.viewpager.PagerModelManager
import uz.ali.finance98.R
import uz.ali.finance98.models.Users
import uz.ali.finance98.repository.DBdata

class HomeFragment : Fragment() {
    private lateinit var viewPager: ViewPager
    private lateinit var tab: TabLayout
    private lateinit var data:DBdata

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.fragment_home, container, false)
        viewPager = root.findViewById(R.id.view_pager)
        tab = root.findViewById(R.id.tab_layout)
        data=DBdata()
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setViewPager()
    }

    fun setViewPager() {
        val manager = PagerModelManager()
        manager.addCommonFragment(TransFragment::class.java, data.getList(), data.getTitle())
        val adapter = ModelPagerAdapter(fragmentManager, manager)
        viewPager.adapter = adapter
        tab.setupWithViewPager(viewPager)
    }
}