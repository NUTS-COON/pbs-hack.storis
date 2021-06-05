package ru.nutscoon.psbstoris

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.nutscoon.psb.storis.StorisView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val storisView = findViewById<StorisView>(R.id.storis_view)
        storisView.init()
    }
}