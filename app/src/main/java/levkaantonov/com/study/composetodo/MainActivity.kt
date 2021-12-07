package levkaantonov.com.study.composetodo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import levkaantonov.com.study.composetodo.ui.theme.ComposetodoTheme

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<TodoViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposetodoTheme {
                Surface(color = MaterialTheme.colors.background) {
                    TodoActivityScreen(todoViewModel = viewModel)
                }
            }
        }
    }

    @Composable
    private fun TodoActivityScreen(todoViewModel: TodoViewModel) {
        TodoScreen(
            items = todoViewModel.todoItems,
            currentlyEditing = todoViewModel.currentEditItem,
            onAddItem = todoViewModel::addItem,
            onRemoveItem = todoViewModel::removeItem,
            onStartEdit = todoViewModel::onEditItemSelected,
            onEditItemChange = todoViewModel::onEditItemChange,
            onEditDone = todoViewModel::onEditDone
        )
    }
}
