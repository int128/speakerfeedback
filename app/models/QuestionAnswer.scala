package models

/**
 * An answer to the question.
 */
case class QuestionAnswer(questionId: String,
                          answer: Option[String])
