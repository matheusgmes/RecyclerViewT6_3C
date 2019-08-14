package com.example.nave.recyclerview3c_t6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var viewAdapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista = mutableListOf<Android>()
        var avatar = (R.drawable.avatar_android)
        var avatar1 = (R.drawable.avatar_android1)
        var avatar2 = (R.drawable.avatar_android2)
        var avatar3 = (R.drawable.avatar_android3)
        var avatar4 = (R.drawable.avatar_android4)
        var avatar5 = (R.drawable.avatar_android5)

        lista.add(Android("Cupcake", "Version: 1.5", "Api Level:3", avatar))
        lista.add(Android("Donut", "Version: 1.6", "Api Level: 4", avatar1))
        lista.add(Android("Eclair", "Version: 2.0", "Api Level: 5 - 7", avatar2))
        lista.add(Android("Froyo", "Version: 2.2 - 2.2.3", "Api Level: 8", avatar3))
        lista.add(Android("Gingerbread", "Version: 2.3 - 2.3.7", "Api Level:9 - 10", avatar4))
        lista.add(Android("Honeycomb", "Version: 3.0 - 3.2.6", "Api Level: 9 - 10", avatar5))

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(lista)

        rvLista.adapter = viewAdapter
        rvLista.layoutManager = viewManager

    }

}
