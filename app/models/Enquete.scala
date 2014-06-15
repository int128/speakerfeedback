package models

/**
 * An enquete.
 */
case class Enquete(id: String,
                   title: String,
                   description: Option[String],
                   questions: Seq[Question])
