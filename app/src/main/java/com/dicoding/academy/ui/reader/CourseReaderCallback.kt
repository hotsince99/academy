package com.dicoding.academy.ui.reader

interface CourseReaderCallback {
    // CourseReaderCallback nantinya akan digunakan untuk pindah dari halaman satu ke halaman lain.
    fun moveTo(position: Int, moduleId: String)
}