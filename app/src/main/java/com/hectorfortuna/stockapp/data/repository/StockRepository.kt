package com.hectorfortuna.stockapp.data.repository

import com.hectorfortuna.stockapp.data.model.CompanyListing
import com.hectorfortuna.stockapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}