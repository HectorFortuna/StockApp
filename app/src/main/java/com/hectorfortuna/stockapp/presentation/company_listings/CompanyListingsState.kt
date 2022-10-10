package com.hectorfortuna.stockapp.presentation.company_listings

import com.hectorfortuna.stockapp.data.model.CompanyListing

data class CompanyListingsState(
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)
