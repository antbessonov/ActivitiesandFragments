package com.example.activitiesandfragments.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.activitiesandfragments.databinding.FragmentCBinding

class CFragment : Fragment() {

    companion object {

        const val NAME = "CFragment"

        fun newInstance(): CFragment = CFragment()
    }

    private var _binding: FragmentCBinding? = null
    private val binding: FragmentCBinding
        get() = _binding ?: throw RuntimeException("FragmentABinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentCBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.launchAFragmentBtn.setOnClickListener { launchAFragment() }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun launchAFragment() {
        requireActivity().supportFragmentManager.popBackStack(AFragment.NAME, 0)
    }
}