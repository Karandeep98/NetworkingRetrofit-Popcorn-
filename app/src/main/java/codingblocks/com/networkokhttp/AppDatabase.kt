package codingblocks.com.networkokhttp

import androidx.room.Database
import androidx.room.RoomDatabase

    @Database(entities = arrayOf(Todo::class),version = 5)
    abstract class AppDatabase : RoomDatabase() {
        abstract fun tododao(): TodoDao
    }

        @Database(entities = arrayOf(Todo::class),version = 1)
        abstract class AppDatabase2 : RoomDatabase(){
            abstract fun tododao():TodoDao



    }

