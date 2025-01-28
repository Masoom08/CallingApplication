package st.masoom.callingapplication.LocalCache

import kotlinx.coroutines.flow.Flow
import st.masoom.callingapplication.Model.ContactItem

class ContactRepository(private val dao: Dao) {

    val Contacts: Flow<List<ContactItem>> = dao.getAllUsers()

    suspend fun addItem(contactItem: ContactItem) = dao.insert(contactItem)
    suspend fun deleteSelectedTask(id: Int)= dao.deleteSelectedTask(id)
}