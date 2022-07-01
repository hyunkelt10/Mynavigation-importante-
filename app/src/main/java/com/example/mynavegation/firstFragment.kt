package com.example.mynavegation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mynavegation.databinding.FragmentFirstBinding
import com.example.mynavegation.databinding.FragmentInitBinding


class firstFragment : Fragment() {
    private var _b: FragmentFirstBinding? = null
    private val b get () = _b!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentFirstBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        b.btnAtras.setOnClickListener{
            findNavController().navigate(R.id.action_firstFragment_to_initFragment)

        }
        b.tvString.setText(arguments?.getString("contador"))

        b.tvtContador.setText(arguments?.getString("contador2"))
//
    }
}