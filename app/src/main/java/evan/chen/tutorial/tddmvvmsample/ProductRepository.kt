package evan.chen.tutorial.tddmvvmsample

import evan.chen.tutorial.tddmvvmsample.api.ProductResponse
import evan.chen.tutorial.tddmvvmsample.api.ServiceApi
import io.reactivex.Single

interface IProductRepository {
    fun getProduct(): Single<ProductResponse>
}

class ProductRepository(private val serviceApi: ServiceApi) : IProductRepository {
    override fun getProduct(): Single<ProductResponse> {
        TODO("not implemented")
    }

    companion object {

        private var INSTANCE: ProductRepository? = null

        @JvmStatic fun getInstance(serviceApi: ServiceApi) =
            INSTANCE ?: synchronized(ProductRepository::class.java) {
                INSTANCE ?: ProductRepository(serviceApi)
                    .also { INSTANCE = it }
            }

        @JvmStatic fun destroyInstance() {
            INSTANCE = null
        }
    }
}
