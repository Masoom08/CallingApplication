package st.masoom.callingapplication.Navigation


import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import st.masoom.callingapplication.Model.ContactItem
import st.masoom.callingapplication.View.BaseLayout
import st.masoom.callingapplication.View.ContactListApp
import st.masoom.callingapplication.ViewModel.ContactViewModel

@Composable
fun NavigationGraph(navController: NavHostController, contacts: List<ContactItem>) {

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            BaseLayout(navController = navController) {
                ContactListScreen(
                    contacts = contacts,
                    onCardClick = { contact ->
                        navController.navigate("contactDetails/${contact.name}/${contact.phoneNumber}")
                    }
                )
            }
        }
        composable("contactDetails/{name}/{phoneNumber}") { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name") ?: "Unknown"
            val phoneNumber = backStackEntry.arguments?.getString("phoneNumber") ?: "Unknown"

            BaseLayout(
                title = "Contact Details",
                navController = navController
            ) {
                ContactDetailsPage(
                    name = name,
                    phoneNumber = phoneNumber
                )
            }
        }
    }
}

