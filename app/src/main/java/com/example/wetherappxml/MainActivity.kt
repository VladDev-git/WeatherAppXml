package com.example.wetherappxml

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wetherappxml.Fragments.MainFragment

//const val API_KEY = "59164c9607654385ad1150429240407"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.placeHolder)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance())
            .commit()
    }
}

//    private fun getResult(name: String){
//        val url = "https://api.weatherapi.com/v1/current.json" +
//                "?key=$API_KEY&q=$name&aqi=no"
//        val queue = Volley.newRequestQueue(this)
//        val stringRequest = StringRequest(Request.Method.GET,
//            url,
//            {
//                response->
//                val obj = JSONObject(response)
//                val temp = obj.getJSONObject("current")
//                val tempC = temp.getString("temp_c")
//                Log.d("MyLog", "Response: ${temp.getString("temp_c")}")
//
//                binding.tvTemp.text = tempC
//            },
//            {
//                Log.d("MyLog", "Volley Error: $it")
//            }
//            )
//        queue.add(stringRequest)
//    }
//}




