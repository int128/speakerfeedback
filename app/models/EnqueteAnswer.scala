package models

/**
 * An answer to the enquete.
 */
case class EnqueteAnswer(enqueteId: String,
                         questions: Seq[QuestionAnswer])
