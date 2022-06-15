package com.example.guitars.ui.guitar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.guitars.R
import com.example.guitars.databinding.FragmentAddGuitarBinding
import com.example.guitars.databinding.FragmentGuitarBinding
import com.example.guitars.model.Guitar
import com.example.guitars.viewmodel.GuitarViewModel


class AddGuitarFragment : Fragment() {
    private var _binding: FragmentAddGuitarBinding? = null
    private val binding get() = _binding!!
    private lateinit var guitarViewModel: GuitarViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddGuitarBinding.inflate(layoutInflater, container, false)
        guitarViewModel = ViewModelProvider(this).get(GuitarViewModel::class.java)
        binding.btAgregar.setOnClickListener{ insertaGuitar()}

        return binding.root
    }

    private fun insertaGuitar(){
        val marca = binding.etMarca.text.toString()
        val modelo = binding.etModelo.text.toString()
        val precio = binding.etPrecio.text.toString()
        val correo = binding.etCorreo.text.toString()
        val telefono = binding.etTelefono.text.toString()

        if(validos(marca, modelo, precio, correo, telefono)){
            val guitar = Guitar(0, marca, modelo, precio, correo, telefono, "", "")
            guitarViewModel.addGuitar(guitar)
            Toast.makeText(requireContext(), getString(R.string.msgGuitarAgregado),Toast.LENGTH_LONG).show()
        } else{
            Toast.makeText(requireContext(), getString(R.string.msgFaltanDatos),Toast.LENGTH_LONG).show()
        }

    }

    private fun validos(marca: String, modelo: String, precio: String, correo:String, telefono:String): Boolean{
        return !(marca.isEmpty()|| modelo.isEmpty()|| precio.isEmpty()|| correo.isEmpty()|| telefono.isEmpty())
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

