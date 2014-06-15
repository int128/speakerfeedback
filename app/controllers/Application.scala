package controllers

import play.api.mvc._

object Application extends Controller {

  def index = TODO

  def answer = Action {
    Ok(views.html.answer())
  }

}