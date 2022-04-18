package com.ivanouski.mpp.file

expect class FileReader() {
    fun read(
        context: Any? = null
    ): String
}