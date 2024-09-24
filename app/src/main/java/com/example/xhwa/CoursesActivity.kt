package com.example.xhwa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CoursesActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses) // Ensure this matches your layout file

        // Reference to the "View More" buttons for Six-Month Courses
        val firstAidViewMoreButton = findViewById<Button>(R.id.firstAidViewMoreButton)
        val firstAidAddToCartButton = findViewById<Button>(R.id.atCart1) // Add to cart button

        val lifeSkillsViewMoreButton = findViewById<Button>(R.id.LfsButton)
        val lifeSkillsAddToCartButton = findViewById<Button>(R.id.ad2) // Add to cart button

        val landscapingViewMoreButton = findViewById<Button>(R.id.lsButton)
        val landscapingAddToCartButton = findViewById<Button>(R.id.ad3) // Add to cart button

        val sewingViewMoreButton = findViewById<Button>(R.id.swButton)
        val sewingAddToCartButton = findViewById<Button>(R.id.ad4) // Add to cart button

        // Reference to the "View More" buttons for Six-Week Courses
        val childMindingViewMoreButton = findViewById<Button>(R.id.cmButton)
        val childMindingAddToCartButton = findViewById<Button>(R.id.ad5) // Add to cart button

        val cookingViewMoreButton = findViewById<Button>(R.id.coButton)
        val cookingAddToCartButton = findViewById<Button>(R.id.ad6) // Add to cart button

        val gardenMaintenanceViewMoreButton = findViewById<Button>(R.id.gmButton)
        val gardenMaintenanceAddToCartButton = findViewById<Button>(R.id.ad7) // Add to cart button

        // Six-Month Courses OnClickListeners
        firstAidViewMoreButton.setOnClickListener {
            startActivity(Intent(this, FirstAidActivity::class.java)) // Navigate to First Aid activity
        }
        firstAidAddToCartButton.setOnClickListener {
            CartManager.cartItems.add(CartManager.CartItem("First Aid", 1500))
            Toast.makeText(this, "First Aid course added to cart!", Toast.LENGTH_SHORT).show()
        }

        lifeSkillsViewMoreButton.setOnClickListener {
            startActivity(Intent(this, LifeSkillsActivity::class.java)) // Navigate to Life Skills activity
        }
        lifeSkillsAddToCartButton.setOnClickListener {
            CartManager.cartItems.add(CartManager.CartItem("Life Skills", 1500))
            Toast.makeText(this, "Life Skills course added to cart!", Toast.LENGTH_SHORT).show()
        }

        landscapingViewMoreButton.setOnClickListener {
            startActivity(Intent(this, LandscapingActivity::class.java)) // Navigate to Landscaping activity
        }
        landscapingAddToCartButton.setOnClickListener {
            CartManager.cartItems.add(CartManager.CartItem("Landscaping", 1500))
            Toast.makeText(this, "Landscaping course added to cart!", Toast.LENGTH_SHORT).show()
        }

        sewingViewMoreButton.setOnClickListener {
            startActivity(Intent(this, SewingActivity::class.java)) // Navigate to Sewing activity
        }
        sewingAddToCartButton.setOnClickListener {
            CartManager.cartItems.add(CartManager.CartItem("Sewing", 1500))
            Toast.makeText(this, "Sewing course added to cart!", Toast.LENGTH_SHORT).show()
        }

        // Six-Week Courses OnClickListeners
        childMindingViewMoreButton.setOnClickListener {
            startActivity(Intent(this, ChildMindingActivity::class.java)) // Navigate to Child Minding activity
        }
        childMindingAddToCartButton.setOnClickListener {
            CartManager.cartItems.add(CartManager.CartItem("Child Minding", 750))
            Toast.makeText(this, "Child Minding course added to cart!", Toast.LENGTH_SHORT).show()
        }

        cookingViewMoreButton.setOnClickListener {
            startActivity(Intent(this, CookingActivity::class.java)) // Navigate to Cooking activity
        }
        cookingAddToCartButton.setOnClickListener {
            CartManager.cartItems.add(CartManager.CartItem("Cooking", 750))
            Toast.makeText(this, "Cooking course added to cart!", Toast.LENGTH_SHORT).show()
        }

        gardenMaintenanceViewMoreButton.setOnClickListener {
            startActivity(Intent(this, GardenMaintenanceActivity::class.java)) // Navigate to Garden Maintenance activity
        }
        gardenMaintenanceAddToCartButton.setOnClickListener {
            CartManager.cartItems.add(CartManager.CartItem("Garden Maintenance", 750))
            Toast.makeText(this, "Garden Maintenance course added to cart!", Toast.LENGTH_SHORT).show()
        }

        // Checkout button, to navigate to the checkout screen
        val checkoutButton = findViewById<Button>(R.id.checkoutButton)
        checkoutButton.setOnClickListener {
            startActivity(Intent(this, CheckoutActivity::class.java)) // Navigate to Checkout activity
        }
    }
}



