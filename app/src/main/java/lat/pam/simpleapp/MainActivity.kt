package lat.pam.simpleapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var aboutIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val instruments = listOf(
            Item(
                "Batagor",
                "Makanan khas sunda",
                "Batagor adalah singkatan dari bakso tahu goreng, makanan khas sunda yang terdiri dari tahu isi dan bakso yang digoreng, disajikan dengan kuah bumbu kacang yang gurih.",
                R.drawable.batagor,
                R.drawable.batagor
            ),
            Item(
                "Black Salad",
                "Salad sehat yang memiliki banyak manfaat",
                "Black salad adalah salad buah yang disiram dengan kuah black activated charcoal. Black activated charcoal memiliki banyak manfaat, di antaranya: Menyerap racun, Menyembuhkan masuk angin, Membersihkan saluran pencernaan.",
                R.drawable.black_salad,
                R.drawable.black_salad
            ),
            Item(
                "Cappuccino",
                "Minuman kopi klasik",
                "Cappuccino adalah minuman kopi Italia yang terdiri dari espresso, susu steamed, dan lapisan busa susu. Cocok dinikmati di pagi hari.",
                R.drawable.cappuchino,
                R.drawable.cappuchino
            ),
            Item(
                "Cheesecake",
                "Kue lembut dengan keju",
                "Cheesecake adalah kue berbasis keju yang memiliki tekstur lembut dan rasa manis. Disajikan dengan berbagai topping seperti stroberi atau cokelat.",
                R.drawable.cheesecake,
                R.drawable.cheesecake
            ),
            Item(
                "Cireng",
                "Camilan khas Sunda",
                "Cireng adalah singkatan dari aci goreng, camilan khas Sunda yang dibuat dari tepung tapioka. Cireng biasanya disajikan dengan saus pedas atau bumbu kacang.",
                R.drawable.cireng,
                R.drawable.cireng
            ),
            Item(
                "Donat",
                "Camilan manis berbentuk cincin",
                "Donat adalah kue yang digoreng berbentuk cincin atau bulat dengan isian. Biasanya ditaburi gula halus, cokelat, atau topping lainnya.",
                R.drawable.donut,
                R.drawable.donut
            ),
            Item(
                "Kopi Hitam",
                "Minuman kopi klasik Indonesia",
                "Kopi hitam adalah minuman kopi tanpa tambahan susu atau gula, memberikan rasa pahit alami yang kuat dan aroma khas.",
                R.drawable.kopi_hitam,
                R.drawable.kopi_hitam
            ),
            Item(
                "Mie Goreng",
                "Hidangan mi khas Indonesia",
                "Mie goreng adalah hidangan mi goreng dengan campuran bumbu khas Indonesia, dilengkapi dengan telur, sayuran, dan tambahan ayam atau udang.",
                R.drawable.mie_goreng,
                R.drawable.mie_goreng
            ),
            Item(
                "Nasi Goreng",
                "Hidangan khas Indonesia",
                "Nasi goreng adalah hidangan nasi yang digoreng dengan bumbu kecap manis, bawang, dan tambahan daging atau seafood.",
                R.drawable.nasigoreng,
                R.drawable.nasigoreng
            ),
            Item(
                "Sparkling Tea",
                "Minuman perpaduan teh dan soda",
                "Sparkling tea adalah teh yang dipadukan dengan karbonasi, memberikan sensasi segar dan rasa unik, cocok untuk dinikmati di siang hari.",
                R.drawable.sparkling_tea,
                R.drawable.sparkling_tea
            )
        )

        recyclerView.adapter = FoodAdapter(this, instruments)


        aboutIcon = findViewById(R.id.about_icon)
        aboutIcon.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
