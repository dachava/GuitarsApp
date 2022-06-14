package com.example.guitars.ui.guitar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
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
        val root: View = binding.root

        //val textView: TextView = binding.textHome
        //guitarViewModel.text.observe(viewLifecycleOwner) {
           // textView.text = it
        //}
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}