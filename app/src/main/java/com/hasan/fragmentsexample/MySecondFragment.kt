package com.hasan.fragmentsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class MySecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_my_second, container, false)
        var btGoToFirstFragment =view.findViewById<Button>(R.id.btGoFirst)
        btGoToFirstFragment.setOnClickListener {
            goFirst()
        }
        return view
    }

    private fun goFirst(){
        var firstFragment = MyFirstFragment()
        var fragmentManager  = parentFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        //if we want to when press back button go back first fragment we could use add instead of replace
        fragmentTransaction.replace(R.id.mainLayout,firstFragment,"first")
        fragmentTransaction.commit()
    }
}