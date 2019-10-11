package evan.chen.tutorial.tddmvvmsample.api

import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface ServiceApi {
    @GET(ApiConfig.productUrl)
    fun getProduct(): Single<Response<ProductResponse>>

}
