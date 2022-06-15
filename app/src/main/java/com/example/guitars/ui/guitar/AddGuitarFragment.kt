package com.example.guitars.ui.guitar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.guitars.databinding.FragmentAddGuitarBinding
import com.example.guitars.databinding.FragmentGuitarBinding


class AddGuitarFragment : Fragment() {
    private var _binding: FragmentAddGuitarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddGuitarBinding.inflate(inflater, container, false)

        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AddGuitarFragment.
         */
        // TODO: Rename and change types and number of parameters
       // @JvmStatic
        //fun newInstance(param1: String, param2: String) =
            //AddGuitarFragment().apply {
//                  //  putString(ARG_PARAM2, param2)
                }
            }

