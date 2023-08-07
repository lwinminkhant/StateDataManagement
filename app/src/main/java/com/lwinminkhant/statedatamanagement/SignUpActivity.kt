package com.lwinminkhant.statedatamanagement

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import com.lwinminkhant.statedatamanagement.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    /*private fun isValidForm(): Boolean {
        return FormValidator.getInstance()
            .addField(firstNameEt, NonEmptyRule(R.string.error_empty_first_name))
            .addField(lastNameEt, NonEmptyRule(R.string.error_empty_last_name))
            .addField(
                emailEtLyt,
                NonEmptyRule("Please enter Email"),
                EmailRule(R.string.error_invalid_email)
            )
            .addField(
                passwordEtLyt,
                NonEmptyRule("Please enter Password"),
                PasswordRule("Please provide strong Password")
            )
            .addField(
                confirmPasswordEtLyt,
                NonEmptyRule("Please enter Password"),
                EqualRule(
                    confirmPasswordEt.text.toString(),
                    "Password and Confirm password must match"
                )
            )
            .addField(
                phoneNumberEt,
                NonEmptyRule("Please enter Phone Number"),
                LengthRule(10, "Please enter valid Phone Number")
            )
            .addField(
                termsOfUseCB,
                CheckedRule("Accept terms of use")
            )
            .setErrorListener {
                // Require only for CheckBox with Toast or Custom View Only
                for (error in it) {
                    if (error.view is CheckBox) {
                        (error.view as CheckBox).error = null
                        Toast.makeText(applicationContext, error.error, Toast.LENGTH_SHORT).show()
                    }
                    Log.e("Error", error.toString())
                }
            }
            .validate()
    }*/
}