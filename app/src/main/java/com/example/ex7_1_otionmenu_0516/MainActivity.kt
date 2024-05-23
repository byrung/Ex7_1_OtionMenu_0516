package com.example.ex7_1_otionmenu_0516

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var editDeqree : EditText
    lateinit var imgv : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linear = findViewById(R.id.linear)
        editDeqree = findViewById<EditText>(R.id.editDegree)
        imgv = findViewById<ImageView>(R.id.imgv)

    }
    // 옵션메뉴 등록
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)

        menuInflater.inflate(R.menu.optionmunu,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.itemRotate ->{
                imgv.rotation += editDeqree.text.toString().toFloat()
                return true
            }
            R.id.itemimg1 ->{
                imgv.setImageResource(R.drawable.img1)
                item.setChecked(true)
                return true
            }
            R.id.itemimg2 ->{
                imgv.setImageResource(R.drawable.img2)
                item.setChecked(true)
                return true
            }
            R.id.itemimg3 ->{
                imgv.setImageResource(R.drawable.img3)
                item.setChecked(true)
                return true
            }
        }

        return false
    }

    }