package models

/**
 * An answer to the enquete.
 */
case class EnqueteAnswer(userUniqueId: String,
                         enqueteId: String,
                         questions: Seq[QuestionAnswer])
