package com.example.mynavegation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mynavegation.databinding.FragmentInitBinding
import com.example.mynavegation.databinding.FragmentSecondBinding


class secondFragment : Fragment() {
    private var _b: FragmentSecondBinding? = null
    private val b get () = _b!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentSecondBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btnBack.setOnClickListener{
            findNavController().navigate(R.id.firstFragment)
        }
        b.btnNext.setOnClickListener{
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }

    }
}