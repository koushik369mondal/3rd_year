import android.database.Cursor
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.classactiviy.R

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var dbHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        dbHelper = DatabaseHelper(this)

        val db = dbHelper.readableDatabase
        val cursor: Cursor = db.rawQuery(
            "SELECT id AS _id, name, category FROM restaurants",
            null
        )

        val adapter = SimpleCursorAdapter(
            this,
            android.R.layout.simple_list_item_2,
            cursor,
            arrayOf("name", "category"),
            intArrayOf(android.R.id.text1, android.R.id.text2),
            0
        )

        listView.adapter = adapter
    }
}
