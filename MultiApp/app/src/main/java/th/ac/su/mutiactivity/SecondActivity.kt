package th.ac.su.mutiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("name")
        val gpa = intent.getDoubleExtra("gpa",-1.0)
        val id = intent.getIntExtra("id",-1)

        var tvDetail = findViewById<TextView>(R.id.tvDetail)

        tvDetail.setText(name+"\n"+id+"\n"+gpa)



        var btnShare = findViewById<Button>(R.id.btnShare)
        btnShare.setOnClickListener {

            val value = (name+"\n"+id+"\n"+gpa)

            var intent = Intent();
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,value)
            intent.type = "text/plan"

            startActivity(Intent.createChooser(intent,"share info"))
        }
    }
}
