package com.example.recyclerview_charelmeysyanti_07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.sugawara,
                "Sugawara",
                "superhero laki laki dan berbaju berwarna oren"
            ),
            Superhero(
                R.drawable.kageyama,
                "Kageyama",
                "superhero laki laki dan berbaju kuning putih"
            ),
            Superhero(
                R.drawable.hinata,
                "Hinata",
                "superhero laki laki berbaju hitam putih"
            ),
            Superhero(
                R.drawable.tanaka,
                "Tanaka",
                "superhero laki laki berbaju oren dan hitam"
            ),
            Superhero(
                R.drawable.noshinoya,
                "Noshinoya",
                "superhero laki laki berbaju putih"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList) {
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}

