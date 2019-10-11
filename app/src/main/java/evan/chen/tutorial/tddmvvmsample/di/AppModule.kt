package evan.chen.tutorial.mvvmretrofitsample

import evan.chen.tutorial.tddmvvmsample.ProductRepository
import evan.chen.tutorial.tddmvvmsample.ProductViewModel
import evan.chen.tutorial.tddmvvmsample.api.BaseInterceptor
import evan.chen.tutorial.tddmvvmsample.api.NetworkService
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel {
        val networkServiceApi = NetworkService(BaseInterceptor())
        val productRepository = ProductRepository.getInstance(networkServiceApi.serviceAPI)

        ProductViewModel(productRepository)
    }
}
