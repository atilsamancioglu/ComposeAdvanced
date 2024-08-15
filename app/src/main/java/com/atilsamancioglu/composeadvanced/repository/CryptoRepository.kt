package com.atilsamancioglu.composeadvanced.repository

import com.atilsamancioglu.composeadvanced.model.Crypto
import com.atilsamancioglu.composeadvanced.model.CryptoList
import com.atilsamancioglu.composeadvanced.service.CryptoAPI
import com.atilsamancioglu.composeadvanced.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class CryptoRepository@Inject private constructor(
    private val api: CryptoAPI
) {

    suspend fun getCryptoList(): Resource<CryptoList> {
        val response = try {
            api.getCryptoList()
        } catch(e: Exception) {
            return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto(id: String): Resource<Crypto> {
        val response = try {
            api.getCrypto()
        } catch(e: Exception) {
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }
}