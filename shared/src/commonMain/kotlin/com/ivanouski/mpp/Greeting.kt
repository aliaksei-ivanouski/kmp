package com.ivanouski.mpp

import com.ivanouski.mpp.file.FileReader

class Greeting {
    fun greeting(
        context: Any? = null
    ): String {
        return FileReader().read(context)
    }
}