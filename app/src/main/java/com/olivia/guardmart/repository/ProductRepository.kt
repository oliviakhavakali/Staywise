package com.olivia.guardmart.repository
import android.content.Context
import com.olivia.guardmart.data.ProductDatabase
import com.olivia.guardmart.model.Product

class ProductRepository(context: Context) {
    private val productDao = ProductDatabase.getDatabase(context).productDao()

    suspend fun insertProduct(product: Product) {
        productDao.insertProduct(product)
    }

    fun getAllProducts() = productDao.getAllProducts()

    suspend fun deleteProduct(product: Product) = productDao.deleteProduct(product)
}