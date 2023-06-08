package com.coderior.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var container: FrameLayout
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        container = findViewById(R.id.container)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        supportFragmentManager.beginTransaction().replace(R.id.container, HomeFragment()).commit()

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, HomeFragment())
                        .commit()
                    return@setOnItemSelectedListener true
                }
                R.id.action_search -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, LeaderboardFragment())
                        .commit()
                    return@setOnItemSelectedListener true
                }
                R.id.action_profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, ControlsFragment())
                        .commit()
                    return@setOnItemSelectedListener true
                }
                else -> return@setOnItemSelectedListener false
            }
        }
    }
}