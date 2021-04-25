package uz.ali.finance98.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import uz.ali.finance98.R
import uz.ali.finance98.ui.cards.CardsFragment


class MyCardAdapter(var cardsFragment: CardsFragment, var list: List<Int>) : PagerAdapter() {

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return list.size
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        var imageView: ImageView

        val v =
            LayoutInflater.from(cardsFragment.context).inflate(R.layout.item_card, container, false)

        imageView = v.findViewById(R.id.item_uzcard)
        imageView.setImageResource(list.get(position))

        container.addView(v)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}