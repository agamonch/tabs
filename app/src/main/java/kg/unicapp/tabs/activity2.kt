package kg.unicapp.tabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2)
        setupView2()
    }
    private fun setupView2() {
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)

        button3.setOnClickListener {
            val intent3 = Intent (this, MainActivity::class.java)
            startActivity(intent3)

        }
        button4.setOnClickListener {
            val intent4 = Intent (this, Activity3::class.java)
            startActivity(intent4)

        }

    }
}