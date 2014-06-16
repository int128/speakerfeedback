package controllers

import models._
import play.api.libs.json._
import play.api.mvc._

object EnqueteController extends Controller {

  implicit val questionWrites = Json.writes[Question]

  implicit val enqueteWrites = Json.writes[Enquete]

  implicit val questionAnswerReads = Json.reads[QuestionAnswer]

  def findById(id: String) = Action {
    Ok(Json.toJson(
      Enquete(id, "title1", "desc1", Seq(
        Question("question1", "question-desc1"),
        Question("question2", "question-desc2")
      ))))
  }

  def answerTo(id: String) = Action(BodyParsers.parse.json) { request =>
    request.body.validate[Seq[QuestionAnswer]].fold(
      errors => {
        BadRequest(JsError.toFlatJson(errors))
      },
      answers => {
        Ok(Json.obj("message" -> "accept"))
      }
    )
  }

}
