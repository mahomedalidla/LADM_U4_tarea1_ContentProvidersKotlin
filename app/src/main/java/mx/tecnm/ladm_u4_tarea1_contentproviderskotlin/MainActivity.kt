package mx.tecnm.ladm_u4_tarea1_contentproviderskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnllamada.setOnClickListener {
            var call = Intent(this,MainActivity2::class.java)
            startActivity(call)
        }

        btnemail.setOnClickListener {
            var ema = Intent(this,MainActivity3::class.java)
            startActivity(ema)
        }
    }
}