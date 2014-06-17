package controllers

import models._
import play.api.libs.json._
import play.api.mvc._

object EnqueteAnswerController extends Controller {

  implicit val questionAnswerReads = Json.reads[QuestionAnswer]

  def submit(id: String) = Action(BodyParsers.parse.json) { request =>
    request.body.validate[Seq[QuestionAnswer]].fold(
      errors => {
        BadRequest(JsError.toFlatJson(errors))
      },
      answers => {
        request.cookies.get(Application.UUID_NAME) match {
          case Some(Cookie(_, uuid, _, _, _, _, _)) if uuid.length == Application.UUID_LENGTH =>
            EnqueteAnswer(uuid, id, answers)
            Ok("Accepted")
          case _ =>
            BadRequest("No UUID cookie found")
        }
      }
    )
  }

}
