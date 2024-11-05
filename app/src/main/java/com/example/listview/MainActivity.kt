package com.example.listview

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    var arrraymonan : ArrayList<monan> = ArrayList()
        val lisstvieww = findViewById<ListView>(R.id.lisstview)
    arrraymonan.add(monan("Banh my op la",R.drawable.banhmyopla))
        arrraymonan.add(monan("Cha gio",R.drawable.chagio))
        arrraymonan.add(monan("Com tron Han Quoc",R.drawable.comtronhq))
        arrraymonan.add(monan("Trung Chien",R.drawable.trungchien))
        arrraymonan.add(monan("Tao do",R.drawable.taodo))
        lisstvieww.adapter = CustomAdapter(this@MainActivity, arrraymonan)



    }
}