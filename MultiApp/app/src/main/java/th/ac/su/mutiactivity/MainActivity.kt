package th.ac.su.mutiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnNext = findViewById<Button>(R.id.btnCalculate)
        var edtName = findViewById<EditText>(R.id.edtName)
        var edtId = findViewById<EditText>(R.id.edtId)
        var edtGpa = findViewById<EditText>(R.id.edtGpa)

        btnNext.setOnClickListener {
            var intent = Intent(this@MainActivity,SecondActivity::class.java)
            intent.putExtra("name",edtName.text.toString())
            intent.putExtra("gpa",edtGpa.text.toString().toDouble())
            intent.putExtra("id",edtId.text.toString().toInt())
            startActivity(intent)
            /// TODO
        }
    }
}
