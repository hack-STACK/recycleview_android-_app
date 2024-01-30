package com.example.recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import android.os.Handler
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {
    private lateinit var rvHeroes: RecyclerView;
    private var list:ArrayList<Hero> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            rvHeroes = findViewById(R.id.rv_hero)
            rvHeroes.setHasFixedSize(true)

            list.addAll(HeroesData.listData)
            showrecycle()
    }
    private fun showrecycle(){
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter =  ListHeroAdapter(list)
        rvHeroes.adapter = listHeroAdapter
    }
}
