package com.vokasi.fan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.back
import kotlinx.android.synthetic.main.activity_main.simpan
import kotlinx.android.synthetic.main.activity_marquee.*
import org.json.JSONArray
import org.json.JSONObject

class marquee : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marquee)

        val context: marquee = this

        simpan.setOnClickListener {
            var isi_marquee = isi_marquee.text.toString()

            postkeserver(isi_marquee)

            val intent = getIntent()
            startActivity(Intent)
            finish()
        }

        back.setOnClickListener {

            val intent = Intent(context, MenuUtama::class.java)
            startActivity(intent)
            finish()
        }

    }

    fun postkeserver(data1:String, data2:String, data3:String, data4:String, data5:String, data6:String) {

        AndroidNetworking.post("http://192.168.0.6/jamsholat/update_marquee.php")
            .addBodyParameter("isi_marquee",data1)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray?) {
                }

                override fun onError(anError: ANError?) {
                }
            })
    }
}
