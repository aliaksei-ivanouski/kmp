package com.ivanouski.mpp.file

import android.content.Context
import com.ivanouski.mpp.MR

actual class FileReader actual constructor() {

    actual fun read(
        context: Any?
    ): String {
        return MR.files.test.readText(context = context as Context)
    }
}