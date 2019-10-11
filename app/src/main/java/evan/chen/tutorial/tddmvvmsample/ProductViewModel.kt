package evan.chen.tutorial.tddmvvmsample

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class ProductViewModel(private val productRepository: IProductRepository) :
    ViewModel() {

    var productId: MutableLiveData<String> = MutableLiveData()
    var productName: MutableLiveData<String> = MutableLiveData()
    var productDesc: MutableLiveData<String> = MutableLiveData()
    var productPrice: MutableLiveData<Int> = MutableLiveData()
    var productItems: MutableLiveData<String> = MutableLiveData()

    init {
        productItems.value = ""
    }

    fun getProduct(productId: String) {
        this.productId.value = productId

        productRepository.getProduct()
            .subscribeOn(SchedulerProvider.io())
            .observeOn(SchedulerProvider.mainThread())
            .subscribe({ data ->
                productName.value = data.name
                productDesc.value = data.desc
                productPrice.value = data.price
            },
                { throwable ->
                    println(throwable)
                })
    }

}

