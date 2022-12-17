package com.rival.wisataapp.model

import com.google.gson.annotations.SerializedName

data class ResponseWisata(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)