// CartManager.kt
package com.example.xhwa

object CartManager {
    val cartItems = mutableListOf<CartItem>()

    data class CartItem(val courseName: String, val courseFee: Int)
}
