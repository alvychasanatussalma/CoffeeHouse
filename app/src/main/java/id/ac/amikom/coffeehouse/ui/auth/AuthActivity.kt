package id.ac.amikom.coffeehouse.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import id.ac.amikom.coffeehouse.R
import id.ac.amikom.coffeehouse.data.model.AuthUser
import id.ac.amikom.coffeehouse.databinding.ActivityAuthBinding
import id.ac.amikom.coffeehouse.ui.home.MainActivity
import kotlinx.coroutines.MainScope

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }
    fun onSuccess(user: AuthUser?){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
