package uz.ali.finance98.ui.cards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import github.chenupt.multiplemodel.viewpager.ModelPagerAdapter
import github.chenupt.multiplemodel.viewpager.PagerModelManager
import uz.ali.finance98.R
import uz.ali.finance98.adapters.CardsMoneyAdapter
import uz.ali.finance98.adapters.MyCardAdapter
import uz.ali.finance98.repository.DBdata

class CardsFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewPager: ViewPager
    private lateinit var tab: TabLayout
    private lateinit var data: DBdata

    private lateinit var card: ViewPager
    private lateinit var process: ProgressBar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.fragment_cards, container, false)
        recyclerView = root.findViewById(R.id.cards_recycler)
        viewPager = root.findViewById(R.id.cards_view_pager)
        tab = root.findViewById(R.id.cards_tab_layout)

        card = root.findViewById(R.id.Pager_UzCard)
        process=root.findViewById(R.id.progress_card)

        data = DBdata()
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView.layoutManager =
            LinearLayoutManager(view?.context, LinearLayoutManager.HORIZONTAL, false)

        recyclerView.adapter = CardsMoneyAdapter(data.getNames())

        setViewPager()
        setCard()
        setChangeProgres()
    }


    fun setViewPager() {
        val manager = PagerModelManager()
        manager.addCommonFragment(CardsTransFragment::class.java, data.getList(), data.getTitle())
        val adapter = ModelPagerAdapter(fragmentManager, manager)
        viewPager.adapter = adapter
        tab.setupWithViewPager(viewPager)

    }

    fun setCard(){
        card.clipToPadding=false
        card.adapter=
            MyCardAdapter(this, data.getImage())
       card.setPadding(0,0,150,0)
        card.pageMargin=10
    }

    fun setChangeProgres(){
        process.max=100
        process.progress=67
    }



}