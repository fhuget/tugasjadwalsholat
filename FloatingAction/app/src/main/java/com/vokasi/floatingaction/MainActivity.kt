package com.vokasi.floatingaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    internal lateinit var fab : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener{
            val sb = Snackbar.make(findViewById(R.id.layout), "Maaf anda tidak dapat mengakses akun ini", Snackbar.LENGTH_LONG)
                .setAction("Coba Lagi") {}
            sb.show()
        }
    }
}
