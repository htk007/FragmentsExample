package com.hasan.fragmentsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MyFirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MyFirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_my_first, container, false)
        var btGoToSecondFragment =view.findViewById<Button>(R.id.btGoSecond)
        btGoToSecondFragment.setOnClickListener {
            goSecond()
        }
        return view
    }

    private fun goSecond(){
        var secondFragment = MySecondFragment()
        var fragmentManager  = parentFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        //if we want to when press back button go back first fragment we could use add instead of replace
        fragmentTransaction.replace(R.id.mainLayout,secondFragment,"second")
        fragmentTransaction.commit()
    }


}