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


    fun getProduct(productId: String) {
    }

}

