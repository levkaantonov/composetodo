package levkaantonov.com.study.composetodo

import androidx.compose.runtime.Composable

@Composable
fun TodoScreen(
    items: List<TodoItem>,
    onAddItem: (TodoItem) -> Unit,
    onRemoveItem: (TodoItem) -> Unit
) {
}