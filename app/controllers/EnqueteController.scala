package controllers

import models._
import play.api.libs.json._
import play.api.mvc._

object EnqueteController extends Controller {

  implicit val questionWrites = Json.writes[Question]

  implicit val enqueteWrites = Json.writes[Enquete]

  def findById(id: String) = Action {
    Ok(Json.toJson(Enquete(id, "title1", Some("desc1"), Seq())))
  }

}
