package mx.tecnm.ladm_u4_tarea1_contentproviderskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btnenviar.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)

            intent.type = "text/html"

            intent.putExtra(Intent.EXTRA_EMAIL, arrayListOf<String>("brmalopezag@ittepic.edu.mx"))
            intent.putExtra(Intent.EXTRA_CC, arrayListOf<String>("CC@gmail.com"))
            intent.putExtra(Intent.EXTRA_BCC, arrayListOf<String>("BCC@email.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT, "Prueba")
            intent.putExtra(Intent.EXTRA_TEXT,"Hola, espero estes bien, me gusta mucho el limon")
            startActivity(intent)
        }
    }
}