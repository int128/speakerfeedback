package models

/**
 * An answer to the enquete.
 */
case class EnqueteAnswer(id: Int,
                         enqueteId: Int,
                         answers: Seq[QuestionAnswer])
