package uz.ali.finance98

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

   private lateinit var navController: NavController
   private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.frag_oyna)

        bottomNavigationView=findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener OnNavigationItemSelectedListener@{
            when(it.itemId){
                R.id.home->{
                    navController.popBackStack()
                    navController.navigate(R.id.homeFragment)

                 return@OnNavigationItemSelectedListener true
                }
                R.id.Cards -> {
                    navController.popBackStack()
                    navController.navigate(R.id.cardsFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.Earnings->{
                    navController.popBackStack()
                    navController.navigate(R.id.earningsFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.Profile->{
                    Toast.makeText(this,"Profile",Toast.LENGTH_SHORT).show()
                    return@OnNavigationItemSelectedListener true
                }
                else -> {
                    return@OnNavigationItemSelectedListener false
                }

            }


        }
    }
}