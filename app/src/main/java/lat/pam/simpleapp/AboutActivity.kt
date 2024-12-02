package lat.pam.simpleapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val name: TextView = findViewById(R.id.name)
        val email: TextView = findViewById(R.id.email)
        val linkedin: TextView = findViewById(R.id.linkedin)

        name.text = "Sifa Mutiasya Hendayana Puteri"
        email.text = "sifamutiasya@gmail.com"


        linkedin.setOnClickListener {
            val url = "https://www.linkedin.com/in/sifa-mutiasya-hendayana-puteri-130128247?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }

}

