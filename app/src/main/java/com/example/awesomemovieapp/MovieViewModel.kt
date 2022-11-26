package com.example.awesomemovieapp

import android.provider.ContactsContract.Data
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.awesomemovieapp.placeholder.PlaceholderContent

class MovieViewModel: ViewModel() {
    val movieDetailsLiveData: LiveData<MovieDetails>
        get() = _movieDetailsLiveData
    private val _movieDetailsLiveData = MutableLiveData<MovieDetails>()

    val movieListLiveData: LiveData<MutableList<PlaceholderContent.PlaceholderItem>>
        get() = _movieListLiveData
    private val _movieListLiveData = MutableLiveData<MutableList<PlaceholderContent.PlaceholderItem>>()

    val navigationToDetailsLiveData
        get() = _navigationToDetailsLiveData
    private val _navigationToDetailsLiveData = MutableLiveData<Unit>()

    init{
        _movieListLiveData.postValue(PlaceholderContent.ITEMS)
    }

    fun onMovieSelected(position: Int){
        val movieDetails = MovieDetails("Nome do Filme", "Este é apenas um conteudo de texto maior", "10/10")
        _movieDetailsLiveData.postValue(movieDetails)
        _navigationToDetailsLiveData.postValue(Unit)
    }

    //Live Data
    val currentStateLiveData
        get() = _currentStateLiveData
    private val _currentStateLiveData = MutableLiveData<DataState>()

}