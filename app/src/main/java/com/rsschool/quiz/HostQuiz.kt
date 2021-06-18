package com.rsschool.quiz

interface HostQuiz {
    fun leafFragment(forward: Boolean)
    fun update()
    fun sendResult()
    fun closeApp()
    fun getResult(): String
    fun userAnswer(position: Int, answerID: Int)
}