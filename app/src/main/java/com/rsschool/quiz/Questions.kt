package com.rsschool.quiz

import java.io.Serializable

class Question(var question: String,var answers: List<String>) : Serializable

const val questions1 = "What is the largest country in the world by area?"
val answers1 = listOf(
    "Canada",
    "Russia",
    "USA",
    "China",
    "Brazil"
)

const val questions2 = "What is the largest country in the world in terms of population?"
val answers2 = listOf(
    "Canada",
    "USA",
    "India",
    "China",
    "Brazil"
)


const val questions3 = "What is the largest volcano in the world?"
val answers3 = listOf(
    "Mauna loa",
    "Elbrus",
    "Mauna Kea",
    "Kilimanjaro",
    "Tamu massif"
)


const val questions4 = "What is the largest lake by area?"
val answers4 = listOf(
    "Caspian Sea",
    "Superior",
    "Michigan",
    "Huron",
    "Victoria"
)


const val questions5 = "What is the largest sea by area?"
val answers5 = listOf(
    "Fiji Sea",
    "Arabian Sea",
    "Sargasso Sea ",
    "Philippine sea",
    "Coral sea"
)

val questions = listOf(
    Question(questions1, answers1),
    Question(questions2, answers2),
    Question(questions3, answers3),
    Question(questions4, answers4),
    Question(questions5, answers5)
)

val statusBarColors = listOf(
    R.color.deep_orange_100_dark,
    R.color.yellow_100_dark,
    R.color.light_green_100_dark,
    R.color.cyan_100_dark,
    R.color.deep_purple_100_dark
)

val rightAnswers = listOf(
    1,
    3,
    4,
    0,
    2
)

