package com.github.aakira.hilt.ui.main

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.github.aakira.hilt.data.SampleRepository

@HiltViewModel  //https://github.com/google/dagger/issues/2287
class MainViewModel @Inject constructor(
    private val repository: SampleRepository,
    private val savedState: SavedStateHandle
) : ViewModel() {

    fun getRepositoryHash(): String = repository.toString()
}
