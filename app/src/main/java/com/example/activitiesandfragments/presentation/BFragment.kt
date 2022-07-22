package com.example.activitiesandfragments.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.activitiesandfragments.R
import com.example.activitiesandfragments.databinding.FragmentBBinding

class BFragment : Fragment() {

    companion object {

        const val NAME = "BFragment"

        fun newInstance(): BFragment = BFragment()
    }

    private var _binding: FragmentBBinding? = null
    private val binding: FragmentBBinding
        get() = _binding ?: throw RuntimeException("FragmentABinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.launchCFragmentBtn.setOnClickListener { launchCFragment() }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun launchCFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, CFragment.newInstance())
            .addToBackStack(CFragment.NAME)
            .commit()
    }
}