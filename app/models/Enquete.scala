package models

/**
 * An enquete.
 */
case class Enquete(id: Int,
                   title: String,
                   description: Option[String],
                   answerKey: String,
                   adminKey: String,
                   questions: Seq[Question])
