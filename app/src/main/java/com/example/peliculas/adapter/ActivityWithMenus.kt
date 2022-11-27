package com.example.peliculas.adapter

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.peliculas.MainActivity
import com.example.peliculas.R
import com.example.peliculas.activities.Editarpelicula
import com.example.peliculas.activities.info

open class ActivityWithMenus: AppCompatActivity() {
    companion object{
        var actividadActual=0;
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menus_principal,menu)
        if (menu != null) {
            for (i in 0 until menu.size()) {
                if (i == actividadActual) menu.getItem(i).isEnabled = false
                else menu.getItem(i).isEnabled = true
            }
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.peliculas -> {
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 0
                startActivity(intent)
                true
            }
            R.id.anadir_peli -> {
                val intent = Intent(this, Editarpelicula::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 1
                startActivity(intent)
                true
            }

            R.id.app -> {
                val intent = Intent(this, info::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                actividadActual = 2
                startActivity(intent)
                true
            }

            R.id.salir -> {
                CuadroDialogo().show(supportFragmentManager, "Salir")

                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}