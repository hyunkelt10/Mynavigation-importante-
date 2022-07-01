package com.example.mynavegation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mynavegation.databinding.FragmentInitBinding
import com.example.mynavegation.databinding.FragmentThirdBinding


class thirdFragment : Fragment() {
    private var _b: FragmentThirdBinding? = null
    private val b get () = _b!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _b = FragmentThirdBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btAtras.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
        }
        b.btHome.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_initFragment)
        }
    }
}