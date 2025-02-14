package st.masoom.callingapplication.Navigation

sealed class Screen(val route: String) {
    object ContactList : Screen("contact_list")
    object ContactDetail : Screen("contact_detail/{contactName}/{contactNumber}") {
        fun createRoute(name: String, number: String) = "contact_detail/$name/$number"
    }
}
