package com.example.mynavegation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.mynavegation.databinding.FragmentFirstBinding
import com.example.mynavegation.databinding.FragmentInitBinding


class initFragment : Fragment() {

    private var _b: FragmentInitBinding? = null
    private val b get () = _b!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentInitBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root

    }
//control + o para crear la funcion
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var con = 0
        b.btnFragment1.setOnClickListener {

            val bundle2 = bundleOf("contador2" to con.toString())
            view.findNavController().navigate(R.id.action_initFragment_to_firstFragment2, bundle2)
        }





        // AQUI LO HACEMOS CON SAFE ARGS
        b.btnFragment2.setOnClickListener{
            val action = initFragmentDirections
                .actionInitFragmentToSecondFragment2()

            view.findNavController().navigate(action)
        }
//        b.btnFragment1.setOnClickListener{
//            findNavController().navigate (R.id.thirdFragment)
//        }
//        b.btnFragment2.setOnClickListener{
//            findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
//        }

//        b.button.setOnClickListener{
//            val cont = 7
//            val bundle = bundleOf("contador" to cont.toString())
//            view.findNavController().navigate(R.id.action_initFragment_to_firstFragment2, bundle)
//        }


        b.tvContadorInit.setOnClickListener{
            con++
            b.tvContadorInit.setText(con.toString())

        }






    }
}