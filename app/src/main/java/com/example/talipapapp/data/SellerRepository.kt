package com.example.talipapapp.data

import com.example.talipapapp.models.Seller

object SellerRepository {

    private val sellers = SellerDataSource.sellers

    fun getAllSellers(): List<Seller> = sellers

    fun getSellerById(id: Int): Seller? {
        return sellers.find { it.id == id }
    }

    fun getYearsOnPlatform(sellerId: Int): Int {
        return getSellerById(sellerId)?.yearsOnPlatform ?: 0
    }

    fun getOrdersCompleted(sellerId: Int): Int {
        return getSellerById(sellerId)?.ordersCompleted ?: 0
    }
}