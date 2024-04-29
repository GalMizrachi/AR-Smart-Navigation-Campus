package com.example.locations.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.locations.R
import com.example.locations.databinding.RegisterFragmentBinding

class RegisterFragment : Fragment() {

    private lateinit var binding: RegisterFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = RegisterFragmentBinding.inflate(inflater, container, false)
        binding.buttonHomepage.setOnClickListener {
            findNavController().navigate(R.id.action_RegisterFragment_to_homePage)
        }

        binding.buttonregister.setOnClickListener {
            findNavController().navigate(R.id.action_RegisterFragment_to_Nav)
        }

        var email = binding.editTextEmailAddress.text
        var username = binding.editTextUserName.text
        var password = binding.editTextPassword.text

        return binding.root

    }
}