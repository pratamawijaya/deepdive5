package id.pratama.deepdiveweek5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ProfileActivity : AppCompatActivity() {

    lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btnBack = findViewById(R.id.btnBack)


        btnBack.setOnClickListener {
            onBackPressed()
        }

        Log.d("debug", "oncreate profile")
    }

    override fun onStart() {
        super.onStart()
        Log.d("debug", "onstart profile")
    }

    override fun onResume() {
        super.onResume()
        Log.d("debug", "onResume profile")
    }

    override fun onStop() {
        super.onStop()
        Log.d("debug", "onStop profile")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("debug", "onDestroy profile")
    }

}