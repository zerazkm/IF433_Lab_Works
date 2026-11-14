package oop_133907_SebastianReinhart.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)