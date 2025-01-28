package st.masoom.callingapplication.ViewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import st.masoom.callingapplication.LocalCache.MyApplication

class ContactViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ContactViewModel(MyApplication.provideItemRepository(context)) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}