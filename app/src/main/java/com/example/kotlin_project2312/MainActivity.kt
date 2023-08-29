package com.example.kotlin_project2312

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)


    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_search -> {
                // 검색 기능 실행
                return true
            }
            R.id.action_settings -> {
                // 설정 화면으로 이동 등의 동작 실행
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}