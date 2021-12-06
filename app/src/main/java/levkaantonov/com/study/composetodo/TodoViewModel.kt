package levkaantonov.com.study.composetodo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel : ViewModel() {

    private var _todoItems = MutableLiveData(listOf<TodoItem>())
    val todoItems: LiveData<List<TodoItem>> = _todoItems

    fun addItem(item: TodoItem) {

    }

    fun removeItem(item: TodoItem) {

    }
}