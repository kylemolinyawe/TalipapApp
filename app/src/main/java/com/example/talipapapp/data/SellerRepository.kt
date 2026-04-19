package com.example.talipapapp.data

import com.example.talipapapp.models.Seller

object SellerRepository {

    // source of truth
    private val sellers = SellerDataSource.sellers

    // 🔹 get all sellers (optional but useful)
    fun getAllSellers(): List<Seller> = sellers

    // 🔹 get single seller by id
    fun getSellerById(id: Int): Seller? {
        return sellers.find { it.id == id }
    }
}