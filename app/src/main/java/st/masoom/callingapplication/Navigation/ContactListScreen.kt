package st.masoom.callingapplication.Navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import st.masoom.callingapplication.Model.ContactItem
import st.masoom.callingapplication.View.ContactListItem


@Composable
fun ContactListScreen(
    contacts: List<ContactItem>,
    onCardClick: (ContactItem) -> Unit
) {
    Column {
        contacts.forEach { contact ->
            ContactListItem(
                contact = contact,
                onEditClick = { /* Handle edit */ },
                onDeleteClick = { /* Handle delete */ },
                onCallClick = { /* Handle call */ },
                onCardClick = { onCardClick(contact) }
            )
        }
    }
}