package com.bunyodjon.a4kfullwalpapers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        button_back.setOnClickListener{
            finish()
        }
        if (b=="Liked"){
            button_like.setBackgroundResource(R.drawable.ic_baseline_favorite_24)
        }
        var ab = 2
        button_like.setOnClickListener {
            if (ab%2==0) {
                button_like.setBackgroundResource(R.drawable.ic_baseline_favorite_24)
                ab++
            }else{
                button_like.setBackgroundResource(R.drawable.favourite)
                ab++




            }
        }


        image_1.setImageResource(a)



    }

}