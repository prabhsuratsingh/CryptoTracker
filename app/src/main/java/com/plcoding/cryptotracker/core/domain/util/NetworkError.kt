package com.plcoding.cryptotracker.core.domain.util

enum class NetworkError : Error {
    REQUEST_TIMEOUT,
    TOO_MANY_REQUEST,
    SERVER_ERROR,
    SERIALIZATION,
    UNKNOWN,
    NO_INTERNET
}