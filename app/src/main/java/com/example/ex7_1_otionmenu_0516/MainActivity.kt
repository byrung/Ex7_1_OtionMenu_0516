package com.example.ex7_1_otionmenu_0516

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linear = findViewById(R.id.linear)
        btn = findViewById(R.id.btn)

    }
    // 옵션메뉴 등록
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)

        menuInflater.inflate(R.menu.optionmunu,menu)

        return true
    }

    override fun onMenuOpened(featureId: Int, menu: Menu): Boolean {

        when(item.itemId){
            R.id.itemRed ->{
                linear.setBackgroundColor(Color.RED)
                return true
            }
            R.id.itemGreen ->{
                linear.setBackgroundColor(Color.GREEN)
                return true
            }
            R.id.itemBlue ->{
                linear.setBackgroundColor(Color.BLUE)
                return true
            }
            R.id.btnRotate ->{
                btn.rotation = 60f
                return true
            }
            R.id.btnZoonin ->{
                btn.scaleX = 2f
                return true
            }
        }

        return false
    }
}