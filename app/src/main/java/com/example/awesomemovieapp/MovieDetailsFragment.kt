package com.example.awesomemovieapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.navGraphViewModels
import com.example.awesomemovieapp.databinding.FragmentMovieDetailsBinding


/**
 * A simple [Fragment] subclass.
 * Use the [MovieDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class MovieDetailsFragment : Fragment() {
    private val viewModel by navGraphViewModels<MovieViewModel>(R.id.movie_graph) { defaultViewModelProviderFactory }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentMovieDetailsBinding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_movie_details,
                container,
                false
            )

        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        return binding.root
    }
}