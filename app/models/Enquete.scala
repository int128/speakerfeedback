package models

/**
 * An enquete.
 */
case class Enquete(id: String,
                   title: String,
                   description: String,
                   questions: Seq[Question])
