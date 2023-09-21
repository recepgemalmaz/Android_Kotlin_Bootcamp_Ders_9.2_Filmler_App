package com.recepgemalmaz.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.recepgemalmaz.filmlerapp.R
import com.recepgemalmaz.filmlerapp.databinding.FragmentAnasayfaBinding


class DetayFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        return binding.root
    }


}