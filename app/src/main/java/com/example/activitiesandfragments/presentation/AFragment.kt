package com.example.activitiesandfragments.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.activitiesandfragments.R
import com.example.activitiesandfragments.databinding.FragmentABinding

class AFragment : Fragment() {

    companion object {

        const val NAME = "AFragment"

        fun newInstance(): AFragment = AFragment()
    }

    private var _binding: FragmentABinding? = null
    private val binding: FragmentABinding
        get() = _binding ?: throw RuntimeException("FragmentABinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.launchBFragmentBtn.setOnClickListener { launchBFragment() }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun launchBFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, BFragment.newInstance())
            .addToBackStack(BFragment.NAME)
            .commit()
    }
}