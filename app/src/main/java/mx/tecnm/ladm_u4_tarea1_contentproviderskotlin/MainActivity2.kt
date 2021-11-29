package mx.tecnm.ladm_u4_tarea1_contentproviderskotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    val telefono = "3113001707"
    val permisoCall1 = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnllamar.setOnClickListener {
            if (ActivityCompat.checkSelfPermission(this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED ){

                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE),permisoCall1)

            }else{
                starCall()
            }
        }
    }

    @SuppressLint("MissingPermission")
    private fun starCall() {
        val llamadaIntent = Intent(Intent.ACTION_CALL)
        llamadaIntent.data = Uri.parse("tel:"+telefono)
        startActivity(llamadaIntent)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        //super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == permisoCall1)starCall()
    }
}