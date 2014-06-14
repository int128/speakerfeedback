package models

/**
 * An answer to the question.
 */
case class QuestionAnswer(id: Int,
                          questionId: Int,
                          answer: String)
