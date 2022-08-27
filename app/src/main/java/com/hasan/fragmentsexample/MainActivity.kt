package com.hasan.fragmentsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    private lateinit var mainLayout:ConstraintLayout
    private lateinit var firstFragment: MyFirstFragment
    private lateinit var secondFragment: MySecondFragment
    private lateinit var fragmentManager: FragmentManager
    private lateinit var fragmentTransaction: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        initFragments()
    }

    private fun initViews(){
        mainLayout = findViewById(R.id.mainLayout)
    }

    private fun initFragments(){
        firstFragment = MyFirstFragment()
        secondFragment = MySecondFragment()

        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager.beginTransaction()
        //due to this code line , we added first fragment inside to activity main
        fragmentTransaction.add(R.id.mainLayout,firstFragment,"first")
        fragmentTransaction.commit()

    }
}