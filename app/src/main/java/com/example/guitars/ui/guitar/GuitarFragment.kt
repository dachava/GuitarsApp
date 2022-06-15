package com.example.guitars.ui.guitar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.guitars.R
import com.example.guitars.databinding.FragmentGuitarBinding
import com.example.guitars.viewmodel.GuitarViewModel

class GuitarFragment : Fragment() {

    private var _binding: FragmentGuitarBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val guitarViewModel =
            ViewModelProvider(this).get(GuitarViewModel::class.java)

        _binding = FragmentGuitarBinding.inflate(inflater, container, false)
        binding.fbAgregar.setOnClickListener{
            findNavController().navigate(R.id.action_nav_guitar_to_addGuitarFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}