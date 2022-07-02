//package com.example.fragmentsapp
//
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import com.example.fragmentsapp.databinding.FragmentFirstBinding
//import com.example.fragmentsapp.databinding.FragmentSecondBinding
//
//class SecondFragment : Fragment() {
//
//    private val person: Person? = null
//    private val binding: FragmentSecondBinding by lazy {
//        FragmentSecondBinding.inflate(layoutInflater)
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        binding.button2.setOnClickListener {
//            replace()
//        }
//        fun parseArguments(){
//            requireActivity().getPaceLable<Person>(NEW_PERSON)?.let{pers->
//                person = pers
//            }
//        }
//    }
//
//    fun replace() {
//        requireActivity().supportFragmentManager.beginTransaction()
//            .replace(R.id.second_fragment_container, FirstFragment())
//            .commit()
//    }
//
//    companion object {
//        const val NEW_PERSON = "new_person"
//        fun newInctance(person: Person): SecondFragment {
//            return SecondFragment().apply {
//                arguments = Bundle().apply {
//                    putParcelable(NEW_PERSON, person)
//                }
//            }
//        }
//    }
//}
//