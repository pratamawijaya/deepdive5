package id.pratama.deepdiveweek5

import android.content.Intent
import android.graphics.Color
import android.media.Image
import android.os.Bundle
import android.text.Spannable
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var textViewTNC: TextView
    lateinit var btnLogin: Button
    lateinit var imgIcon: ImageView
    lateinit var inputFullName: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("debug", "oncreate jalan")

        textViewTNC = findViewById(R.id.labelTNC)
        btnLogin = findViewById(R.id.btnLogin)
        imgIcon = findViewById(R.id.icon)
        inputFullName = findViewById(R.id.inputFullname)

        imgIcon.setOnClickListener {

        }

        val target = "terms"
        val targetCondition = "condition"
        val fullTextTNC = getString(R.string.string_tnc)


        setColor(textViewTNC, fullTextTNC, target, Color.BLUE)
        setColor(textViewTNC, fullTextTNC, targetCondition, Color.RED)

        btnLogin.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))

        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("debug", "onstart jalan")
        // kirim data
    }

    override fun onResume() {
        super.onResume()
        Log.d("debug", "onresume jalan")
    }

    override fun onPause() {
        super.onPause()
        Log.d("debug", "onPause jalan")
    }

    override fun onStop() {
        super.onStop()
        Log.d("debug", "onStop jalan")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("debug", "onDestroy jalan")
    }


    private fun setColor(view: TextView, fulltext: String, subtext: String, color: Int) {
        view.setText(fulltext, TextView.BufferType.SPANNABLE)
        val str = view.text as Spannable
        val i = fulltext.indexOf(subtext)
        str.setSpan(
            ForegroundColorSpan(color), i, i + subtext.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }
}