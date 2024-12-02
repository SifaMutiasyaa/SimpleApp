package lat.pam.simpleapp

// DetailActivity.kt
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import lat.pam.simpleapp.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("title")
        val description = intent.getStringExtra("description")
        val imageUrl = intent.getIntExtra("imageUrl", 0)

        val detailImage: ImageView = findViewById(R.id.detail_image)
        val detailTitle: TextView = findViewById(R.id.detail_title)
        val detailDescription: TextView = findViewById(R.id.detail_description)

        detailImage.setImageResource(imageUrl)
        detailTitle.text = title
        detailDescription.text = description

        // Implement share functionality
        val shareButton: ImageView = findViewById(R.id.action_share)
        shareButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "$title - $description")
            }
            startActivity(Intent.createChooser(shareIntent, getString(R.string.share_prompt)))
        }
    }
}

