package kg.unicapp.tabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        setupView3()
    }
    private fun setupView3() {
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        button5.setOnClickListener {
            val intent5 = Intent (this, MainActivity::class.java)
            startActivity(intent5)

        }
        button6.setOnClickListener {
            val intent6 = Intent (this, activity2::class.java)
            startActivity(intent6)

        }

    }
}