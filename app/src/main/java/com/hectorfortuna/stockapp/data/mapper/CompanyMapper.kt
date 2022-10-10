package com.hectorfortuna.stockapp.data.mapper

import com.hectorfortuna.stockapp.data.local.CompanyListingEntity
import com.hectorfortuna.stockapp.data.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing{
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity{
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}
