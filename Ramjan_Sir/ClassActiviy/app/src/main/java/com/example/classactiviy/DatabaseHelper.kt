import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, "restaurant.db", null, 2) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(
            "CREATE TABLE restaurants(" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "name TEXT, category TEXT);"
        )

        db.execSQL("INSERT INTO restaurants(name, category) VALUES('Spice Garden', 'Indian');")
        db.execSQL("INSERT INTO restaurants(name, category) VALUES('Burger King', 'Fast Food');")
        db.execSQL("INSERT INTO restaurants(name, category) VALUES('Sushi House', 'Japanese');")
        db.execSQL("INSERT INTO restaurants(name, category) VALUES('Green Bowl', 'Vegan');")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS restaurants")
        onCreate(db)
    }
}
