package controllers

import play.api.mvc._

import scala.util.Random

object Application extends Controller {

  val UUID_NAME = "uuid"
  val UUID_LENGTH = 32
  val UUID_EXPIRE_SECONDS = 365 * 24 * 60 * 60

  def index = TODO

  def answer = Action { request =>
    request.cookies.get(UUID_NAME) match {
      case Some(Cookie(_, uuid, _, _, _, _, _)) if uuid.length == UUID_LENGTH =>
        Ok(views.html.answer())
      case _ =>
        Ok(views.html.answer()).withCookies(
          Cookie(
            UUID_NAME,
            Random.alphanumeric.take(UUID_LENGTH).mkString,
            Some(UUID_EXPIRE_SECONDS)))
    }
  }

}