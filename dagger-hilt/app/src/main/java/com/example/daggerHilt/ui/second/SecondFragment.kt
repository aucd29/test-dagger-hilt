package com.example.daggerHilt.ui.second

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.daggerHilt.R
import com.example.daggerHilt.databinding.FragmentSecondBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
@AndroidEntryPoint
class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private val viewmodel: SecondViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)!!
        binding = DataBindingUtil.bind(view)!!

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.vm = viewmodel

        viewmodel.eventComposition.event.observe(viewLifecycleOwner, Observer {
            when (it) {
                2 -> findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
            }
        })
        viewmodel.stateData.observe(viewLifecycleOwner, Observer {
            Log.w("[BK]", "save state : $it")
        })
    }
}