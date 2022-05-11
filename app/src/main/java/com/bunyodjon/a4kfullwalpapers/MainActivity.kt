package com.bunyodjon.a4kfullwalpapers
import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.app_bar_main.view.*
import kotlinx.android.synthetic.main.app_bar_main.view.menu_image
import kotlinx.android.synthetic.main.nav_header_main.*
import kotlinx.android.synthetic.main.nav_header_main.view.*
var a=1
var b = ""
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        app_bar_main.menu_image.setOnClickListener {
            drawer_layout.openDrawer(Gravity.LEFT)
        }
        tx1.setOnClickListener {
            tx1.setTextColor(Color.GREEN)
            tx2.setTextColor(Color.WHITE)
            tx3.setTextColor(Color.WHITE)
            tx4.setTextColor(Color.WHITE)
        }
        tx2.setOnClickListener {
            tx1.setTextColor(Color.WHITE)
            tx2.setTextColor(Color.GREEN)
            tx3.setTextColor(Color.WHITE)
            tx4.setTextColor(Color.WHITE)
        }
        tx3.setOnClickListener {
            tx1.setTextColor(Color.WHITE)
            tx2.setTextColor(Color.WHITE)
            tx3.setTextColor(Color.GREEN)
            tx4.setTextColor(Color.WHITE)
        }
        tx4.setOnClickListener {
            tx1.setTextColor(Color.WHITE)
            tx2.setTextColor(Color.WHITE)
            tx3.setTextColor(Color.WHITE)
            tx4.setTextColor(Color.GREEN)
        }
        nav_view.setNavigationItemSelectedListener {
            when (it.itemId){
                R.id.nav_home -> tv_name.text ="Home"
                R.id.nav_gallery -> tv_name.text ="Popular"
                R.id.nav_like -> tv_name.text ="Liked"
                R.id.nav_history -> tv_name.text ="History"
                R.id.nav_slideshow -> tv_name.text ="Random"
                R.id.nav_home -> tv_name.text ="Home"
            }
            drawer_layout.closeDrawers()
            true
        }
        fon1.setOnClickListener {
            inteted()
            a = R.drawable.fon1
        }
        fon2.setOnClickListener {
            inteted()
            a = R.drawable.fon2
        }
        fon3.setOnClickListener {
            inteted()
            a = R.drawable.fon3
        }
        fon4.setOnClickListener {
            inteted()
            a = R.drawable.fon4
        }
        fon5.setOnClickListener {
            inteted()
            a = R.drawable.fon5
        }
        fon6.setOnClickListener {
            inteted()
            a = R.drawable.fon6
        }
        fon7.setOnClickListener {
            inteted()
            a = R.drawable.fon7
        }
        fon8.setOnClickListener {
            inteted()
            a = R.drawable.fon8
        }
        fon9.setOnClickListener {
            inteted()
            a = R.drawable.fon9
        }
        fon10.setOnClickListener {
            inteted()
            a = R.drawable.fon10
        }
        fon11.setOnClickListener {
            inteted()
            a = R.drawable.fon11
        }
        fon13.setOnClickListener {
            inteted()
            a = R.drawable.fon13
        }
        fon14.setOnClickListener {
            inteted()
            a = R.drawable.fon14
        }
        fon15.setOnClickListener {
            inteted()
            a = R.drawable.fon15
        }
        fon16.setOnClickListener {
            inteted()
            a = R.drawable.fon16
        }

        fon17.setOnClickListener {
            inteted()
            a = R.drawable.fon17
        }

        fon12.setOnClickListener {
            inteted()
            a = R.drawable.fon12
        }
        fon18.setOnClickListener {
            inteted()
            a = R.drawable.fon18
        }

        fon19.setOnClickListener {
            inteted()
            a = R.drawable.fon19
        }

        fon20.setOnClickListener {
            inteted()
            a = R.drawable.fon20
        }

        fon21.setOnClickListener {
            inteted()
            a = R.drawable.fon4
        }
        btn1.setOnClickListener {
            Toast.makeText(this, "Home Button", Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener {
            Toast.makeText(this, "Popular Button", Toast.LENGTH_SHORT).show()
        }
        btn3.setOnClickListener {
            Toast.makeText(this, "Refresh Button", Toast.LENGTH_SHORT).show()
        }
        btn4.setOnClickListener {
            Toast.makeText(this, "Like Button", Toast.LENGTH_SHORT).show()





        }
    }

        fun inteted() {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            b= tv_name.text.toString()

            val navigationView:NavigationView = findViewById(R.id.nav_view)
            navigationView.setItemIconTintList(null)
        }
    }