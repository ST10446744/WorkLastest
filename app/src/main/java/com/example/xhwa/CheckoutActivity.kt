package com.example.xhwa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.check_out_activity)

        val cartItemsContainer = findViewById<LinearLayout>(R.id.cartItemsContainer)
        val cartTotal = findViewById<TextView>(R.id.cartTotal)
        val clearCartButton = findViewById<Button>(R.id.clearCartButton)
        val goBackButton = findViewById<Button>(R.id.goBackButton)
        val submitContactButton = findViewById<Button>(R.id.submitContactButton)

        val inputName = findViewById<EditText>(R.id.inputName)
        val inputSurname = findViewById<EditText>(R.id.inputSurname)
        val inputEmail = findViewById<EditText>(R.id.inputEmail)

        // Display cart items and calculate total from CartManager
        displayCartItems(CartManager.cartItems, cartItemsContainer, cartTotal)

        // Clear Cart button
        clearCartButton.setOnClickListener {
            CartManager.cartItems.clear() // Clear the cart in CartManager
            displayCartItems(emptyList(), cartItemsContainer, cartTotal)
        }

        // Go Back button
        goBackButton.setOnClickListener {
            // Navigate back to courses
            startActivity(Intent(this, CoursesActivity::class.java))
        }

        // Submit contact form
        submitContactButton.setOnClickListener {
            val name = inputName.text.toString()
            val surname = inputSurname.text.toString()
            val email = inputEmail.text.toString()
            // Handle form submission logic here
        }
    }

    private fun displayCartItems(cartItems: List<CartManager.CartItem>, container: LinearLayout, totalTextView: TextView) {
        container.removeAllViews()

        var total = 0.0
        for (item in cartItems) {
            val itemTextView = TextView(this)
            itemTextView.text = "${item.courseName} - R${item.courseFee}"
            itemTextView.textSize = 18f
            container.addView(itemTextView)
            total += item.courseFee
        }

        // Apply discount based on number of courses
        total = applyDiscount(total, cartItems.size)

        // Add VAT
        total += total * 0.15

        totalTextView.text = "Total: R${String.format("%.2f", total)}"
    }

    private fun applyDiscount(total: Double, itemCount: Int): Double {
        return when (itemCount) {
            2 -> total * 0.95 // 5% discount
            3 -> total * 0.90 // 10% discount
            else -> if (itemCount > 3) total * 0.85 else total // 15% discount
        }
    }
}



