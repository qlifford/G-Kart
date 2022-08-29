package com.example.gkart.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
<<<<<<< HEAD
import androidx.appcompat.app.ActionBar
=======
>>>>>>> origin/main
import com.example.gkart.MainActivity
import com.example.gkart.R
import com.example.gkart.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {
<<<<<<< HEAD

    private lateinit var actionBar: ActionBar
    private lateinit var binding: ActivityPaymentBinding

=======
    private lateinit var binding: ActivityPaymentBinding
>>>>>>> origin/main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

<<<<<<< HEAD
        actionBar = supportActionBar!!
        actionBar.title = "Payments"

=======
>>>>>>> origin/main
        binding.btnCancel.setOnClickListener {
            Toast.makeText(this, "Payment Canceled", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        binding.btnPay.setOnClickListener {
            Toast.makeText(this, "Thank you for shopping with us", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}