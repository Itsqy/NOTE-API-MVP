package com.rival.wisataapp.presenter

import com.rival.wisataapp.MainActivity
import com.rival.wisataapp.api.ApiConfig
import com.rival.wisataapp.base.BasePresenter
import com.rival.wisataapp.model.ResponseWisata
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(var mainView: MainActivity) : BasePresenter<MainConstruct.view>,
    MainConstruct.Presenter {
    override fun getAllWisata() {
        ApiConfig.service.getWisata().enqueue(object : Callback<ResponseWisata> {
            override fun onResponse(
                call: Call<ResponseWisata>,
                response: Response<ResponseWisata>
            ) {
                if (response.isSuccessful || response.code() == 200) {
                    val msg = response.body()?.message
                    val sukses = response.body()?.message

                    if (sukses != null) {
                        val dataWisata = response?.body()?.data
                        mainView?.showDataWisata(dataWisata)
                    } else {
                        mainView?.showMessage(msg.toString())
                    }
                }
            }



            override fun onFailure(call: Call<ResponseWisata>, t: Throwable) {
                mainView?.showError(t.message.toString())
            }

        })
    }
    fun insertWisata(
        kategoriId: String,
        namaWisata: String,
        harga: String,
        deskripsi: String,
        kota: String,
        provinsi: String,
        alamat: String,
        waktuBuka: String,
        latitue: String,
        longLatitude: String,
        image: String,
    ) {
        ApiConfig.service.InsertDataFood(
            kategoriId,
            namaWisata,
            harga,
            deskripsi,
            kota,
            provinsi,
            alamat,
            waktuBuka,
            latitue,
            longLatitude,
            image
        ).enqueue(object : Callback<ResponseWisata> {
            override fun onResponse(
                call: Call<ResponseWisata>,
                response: Response<ResponseWisata>
            ) {
                if (response.isSuccessful || response.code() == 200) {
                    val msg = response.body()?.message
                    val sukses = response.body()?.status

                    if (sukses != null) {
                        mainView?.onSuccessInsert()
                        mainView?.showMessage(msg.toString())
                    } else {
                        mainView?.showMessage(msg.toString())
                    }

                }
            }

            override fun onFailure(call: Call<ResponseWisata>, t: Throwable) {
                mainView?.showError(t.message.toString())
            }

        })

    }

    override fun onAttach(view: MainActivity) {
        mainView = view
    }

    override fun onDetach() {
        mainView
    }

}