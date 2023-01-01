package peoplecounter.amit.peoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.button)
        val _textView = findViewById<TextView>(R.id.text_view)
        var counter = 0

        btnClick.setOnClickListener{
            counter+=1
            _textView.text = "Text $counter"
            Toast.makeText(this,"Haha, Pressed $counter time",Toast.LENGTH_SHORT).show()
        }

    }
}