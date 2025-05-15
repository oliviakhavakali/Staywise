package com.olivia.staywise.navigation


const val ROUT_HOME = "home"
const val ROUT_DASHBOARD = "dashboard"
const val ROUT_SEARCH = "search"
const val ROUT_BOOKING = "booking"
const val ROUT_ROOMDETAILS = "roomdetails"
const val ROUT_SPLASH = "splash"




const val ROUT_REGISTER = "Register"
const val ROUT_LOGIN = "Login"


const val ROUT_ADD_PRODUCT = "add_product"
const val ROUT_PRODUCT_LIST = "product_list"
const val ROUT_EDIT_PRODUCT = "edit_product/{productId}"

// ✅ Helper function for navigation
fun editProductRoute(productId: Int) = "edit_product/$productId"

