package com.example.listview

import android.content.Context
import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter constructor(var context : Context, var mang_monan : ArrayList<monan>) : BaseAdapter() {
    class ViewHolder(row: View){
        var textviewtenmonan : TextView
        var imageviewmonan : ImageView
        init{
            textviewtenmonan =row.findViewById(R.id.name_food) as TextView
            imageviewmonan = row.findViewById(R.id.image_food) as ImageView
        }
    }

    override fun getCount(): Int {
        return mang_monan.size
    }

    override fun getItem(position: Int): Any {
        return mang_monan.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertview: View?, p2: ViewGroup?): View {
        var view : View?
        var viewholderr : ViewHolder
        if(convertview == null){
            var layoutinflatter : LayoutInflater = LayoutInflater.from(context)
            view = layoutinflatter.inflate(R.layout.dong_monan,null)
            viewholderr = ViewHolder(view)
            view.tag = viewholderr

        }else{
            view = convertview
            viewholderr = convertview.tag as ViewHolder
        }
        var monann : monan = getItem(position) as monan
        viewholderr.textviewtenmonan.text = monann.ten
        viewholderr.imageviewmonan.setImageResource(monann.hinhanh)
        return view as View
    }
}