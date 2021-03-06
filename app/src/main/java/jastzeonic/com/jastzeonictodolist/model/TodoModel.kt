package jastzeonic.com.jastzeonictodolist.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import androidx.annotation.NonNull

@Entity(tableName = TodoModel.TABLE_NAME)
class TodoModel {

    companion object {
        const val TABLE_NAME = "todo_model"
        const val ID_NAME = "id"
        const val TODO_CONTENT_NAME = "todoContent"
        const val TODO_DESCRIPTION_NAME = "todoDescription"
        const val IS_FINISHED_NAME = "isFinished"
        const val TIMESTAMP_NAME = "timestamp"
    }

    @ColumnInfo(name = ID_NAME)
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

    @ColumnInfo(name = TODO_CONTENT_NAME)
    var todoContent = ""

    @ColumnInfo(name = TODO_DESCRIPTION_NAME)
    var todoDescription = ""

    @ColumnInfo(name = IS_FINISHED_NAME)
    var isFinished = false


    @NonNull
    @ColumnInfo(name = TIMESTAMP_NAME, typeAffinity = ColumnInfo.TEXT)
    var timestamp = ""

    @Ignore
    var ignoreText = ""

    var imageUrl = ""

}