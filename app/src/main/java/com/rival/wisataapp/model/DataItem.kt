package com.rival.wisataapp.model

import com.google.gson.annotations.SerializedName

data class DataItem(

	@field:SerializedName("provinsi")
	val provinsi: String? = null,

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("kota")
	val kota: String? = null,

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("nama_wisata")
	val namaWisata: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("alamat")
	val alamat: String? = null,

	@field:SerializedName("kategori_id")
	val kategoriId: Int? = null,

	@field:SerializedName("harga")
	val harga: Int? = null,

	@field:SerializedName("waktu_buka")
	val waktuBuka: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("deskripsi")
	val deskripsi: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null
)