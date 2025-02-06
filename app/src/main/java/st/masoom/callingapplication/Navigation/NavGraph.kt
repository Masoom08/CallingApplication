package st.masoom.callingapplication.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import st.masoom.callingapplication.View.ContactListApp
import st.masoom.callingapplication.View.ContactDetailScreen
import st.masoom.callingapplication.ViewModel.ContactViewModel

@Composable
fun NavigationGraph(navController: NavHostController, viewModel: ContactViewModel) {
    NavHost(navController = navController, startDestination = Screen.ContactList.route) {
        composable(Screen.ContactList.route) {
            ContactListApp(viewModel, navController)
        }
        composable( route = "contact_detail/{contactName}/{contactNumber}"
        ) { backStackEntry ->
            val name = backStackEntry.arguments?.getString("contactName") ?: "Unknown"
            val number = backStackEntry.arguments?.getString("contactNumber") ?: "N/A"

            ContactDetailScreen(name, number, navController)
        }
    }
}
