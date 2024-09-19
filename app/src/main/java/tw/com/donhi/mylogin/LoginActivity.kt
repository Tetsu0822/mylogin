package tw.com.donhi.mylogin

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import tw.com.donhi.mylogin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var pwd: String
    private lateinit var uid: String
    private lateinit var binding: ActivityLoginBinding
    val TAG = LoginActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityLoginBinding.inflate(layoutInflater)
        uid = binding.edUid.text.toString()
        pwd = binding.edPwd.text.toString()
    }
    fun login(view: View) {
        val user = uid
        val pass = pwd
        Log.d(TAG, "login: user: $user , Pwd: $pass")

    }
}