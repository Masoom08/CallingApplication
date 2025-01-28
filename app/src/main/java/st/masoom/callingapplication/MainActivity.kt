package st.masoom.callingapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import st.masoom.callingapplication.Navigation.NavigationGraph
import st.masoom.callingapplication.View.BaseLayout
import st.masoom.callingapplication.View.ContactListApp
import st.masoom.callingapplication.ViewModel.ContactViewModel
import st.masoom.callingapplication.ViewModel.ContactViewModelFactory
import st.masoom.callingapplication.ui.theme.CallingApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CallingApplicationTheme {
                val navController = rememberNavController()
/*
                BaseLayout(navController = navController){
                    val viewModel = ViewModelProvider(
                        this,
                        ContactViewModelFactory(applicationContext)
                    ).get(ContactViewModel::class.java)
                    ContactListApp(viewModel,navController = navController,)
                }

 */

                val viewModel = ViewModelProvider(
                    this,
                    ContactViewModelFactory(applicationContext)
                ).get(ContactViewModel::class.java)
                //ContactListApp(viewModel,navController = navController,)
                val contacts = viewModel.contacts.collectAsState(initial = emptyList())
                NavigationGraph(navController = navController, contacts = contacts.value)


            }
        }
    }
}