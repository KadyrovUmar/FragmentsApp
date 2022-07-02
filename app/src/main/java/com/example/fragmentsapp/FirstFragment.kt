package com.example.fragmentsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.fragment.app.FragmentTransaction
import com.example.fragmentsapp.databinding.ActivityMainBinding.inflate
import com.example.fragmentsapp.databinding.FragmentFirstBinding
import com.example.fragmentsapp.databinding.FragmentFirstBinding.inflate
import com.example.fragmentsapp.databinding.FragmentSecondBinding.inflate

class FirstFragment : Fragment() {
    private val binding: FragmentFirstBinding by lazy {
        FragmentFirstBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val porson = Person("Umar",17)
        binding.button.setOnClickListener {
replace()
        }
    }
    fun replace(){
        requireActivity().supportFragmentManager.beginTransaction()
//            .replace(R.id.fragment_container, SecondFragment.newInctance())
//            .addToBackStack(null)
//            .commit()
    }

}