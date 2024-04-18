package kr.ac.kopo.framelayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var imgv1: ImageView
    lateinit var imgv2: ImageView
    lateinit var imgv3: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)
        btn3 = findViewById<Button>(R.id.btn3)

        imgv1 = findViewById<ImageView>(R.id.imgv1)
        imgv2 = findViewById<ImageView>(R.id.imgv2)
        imgv3 = findViewById<ImageView>(R.id.imgv3)

        imgv2.visibility = View.INVISIBLE
        imgv3.visibility = View.INVISIBLE

        btn1.setOnClickListener(btnListener)
        btn2.setOnClickListener(btnListener)
        btn3.setOnClickListener(btnListener)
    }

    val btnListener = OnClickListener {
            imgv1.visibility = View.INVISIBLE
            imgv2.visibility = View.INVISIBLE
            imgv3.visibility = View.INVISIBLE

        when(it.id) {
            R.id.btn1 -> imgv1.visibility = View.VISIBLE
            R.id.btn2 -> imgv2.visibility = View.VISIBLE
            R.id.btn3 -> imgv3.visibility = View.VISIBLE
        }
    }
}