package com.example.talipapapp.data

import com.example.talipapapp.models.Product

object ProductRepository {

    private val productMap = ProductDataSource.products.associateBy { it.id }

    // ✅ ADD THIS
    val products: List<Product>
        get() = ProductDataSource.products

    fun getProductById(id: Int?): Product? {
        return productMap[id]
    }
}