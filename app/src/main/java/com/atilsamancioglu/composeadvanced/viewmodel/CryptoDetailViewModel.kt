package com.atilsamancioglu.composeadvanced.viewmodel

import androidx.lifecycle.ViewModel
import com.atilsamancioglu.composeadvanced.model.Crypto
import com.atilsamancioglu.composeadvanced.repository.CryptoRepository
import com.atilsamancioglu.composeadvanced.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
) : ViewModel() {

    suspend fun getCrypto(id: String): Resource<Crypto> {
        return repository.getCrypto(id)
    }
}