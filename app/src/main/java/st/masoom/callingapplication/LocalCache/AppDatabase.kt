package st.masoom.callingapplication.LocalCache

import androidx.room.Database
import androidx.room.RoomDatabase
import st.masoom.callingapplication.Model.ContactItem

@Database(entities = [ContactItem::class], version = 1 , exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): Dao
}