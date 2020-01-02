package controllers
import java.security.Timestamp

import akka.http.javadsl.model.ContentTypes
import javax.inject.{Inject, Singleton}
import play.api.db
import play.api.db._
import play.api.db.Database
import play.api.libs.json
import play.api.libs.json.{JsResult, JsSuccess, JsValue, Json, Reads}
import play.api.mvc._
import org.json4s

import akka.stream.scaladsl.{ FileIO, Source }






case class data(id: Int, description: String,mytimestamp: String)
@Singleton
class index @Inject()(db: Database,controller: ControllerComponents) (implicit assetsFinder: AssetsFinder)extends AbstractController(controller) {

  def list = Action {

    var a:List[data]=Nil
    val conn = db.getConnection()
    try {
      val stmt = conn.createStatement

      val rs = stmt.executeQuery("SELECT * from data;")
      while (rs.next()) {
        var id= rs.getString("id").toInt
        var desc= rs.getString("description").toString
        var time=rs.getString("mytimestamp").toString
        var op =List(data(id,desc,time))
        a=a:::op
      }

    } finally {
      conn.close()
    }
    println(a+"\n\n\n\n\n\n\n\n\n\n\n")

   // val piedPierJSON = write(a)
    var k=Json.toJson(
      a.map { t =>
        Map("id" -> t.id.toString, "description" -> t.description,"timestamp"->t.mytimestamp)
      }
    )
    Ok(k)


    //Ok("sa")


  }

  def delete(id: Int) = Action {
    val conn = db.getConnection()
    var count = 0
    try {
      val stmt = conn.createStatement
      val check = stmt.executeQuery("select description from data where id = " + id + " ")

      while (check.next()) {
        count = count + 1
      }
      println(count + "\n\n\n\n\n\n\n\n\n")
      if (count > 0) {

        val rs = stmt.executeUpdate(" DELETE FROM `data` WHERE `id` = " + id + " ")
      }

    } finally {
      conn.close()
    }

    if (count > 0) {
      Ok("success: Deleted task with the id " + id)
    }
    else {
      Ok("Id not found")
    }

  }

  def test = Action { request =>
    var id: Int = (request.body.asJson.get("id").toString()).toInt
    var desc: String = request.body.asJson.get("description").toString()

    println("iuiuiuiquwiquwiquwqiwuiquwqiwu\n\n\n\n\n\n\n\n\n")
    var count = 0

    val conn = db.getConnection()

    try {
      val stmt = conn.createStatement
      val check = stmt.executeQuery("select description from data where id = " + id + " ")

      while (check.next()) {
        count = count + 1
      }
      if (count == 0) {
        val rs = stmt.executeUpdate("insert into `data` (id,description) values (" + id + "," + desc + ")")
      }


    } finally {
      conn.close()
    }
    if (count == 0) {

      Ok("Inserted id " + id + " with description " + desc)
    }
    else {
      Ok("Data already existed")
    }

  }

  def update = Action {
    request =>
      var id: Int = (request.body.asJson.get("id").toString()).toInt
      var desc: String = request.body.asJson.get("description").toString()
      val conn = db.getConnection()
      var count = 0
      try {
        val stmt = conn.createStatement
        val check = stmt.executeQuery("select description from data where id = " + id + " ")

        while (check.next()) {
          count = count + 1
        }
        if (count > 0) {
          val rs = stmt.executeUpdate("update `data` set description = " + desc + " WHERE id=" + id + " ")
        }


      } finally {
        conn.close()
      }
      if (count > 0) {
        Ok("updated id " + id + " with description " + desc)
      }
      else {
        Ok("Id do not exist")
      }

  }

  def count = Action {
    val conn = db.getConnection()
    var count = 0
    try {
      val stmt = conn.createStatement
      val check = stmt.executeQuery("select * from data")

      while (check.next()) {
        count = count + 1
      }

    }finally {
      conn.close()
    }
    Ok("Total Tasks: "+count)


  }
  def getid(id:Int)=Action{
    var a:List[data]=Nil
    var count = 0

    val conn = db.getConnection()
    try {
      val stmt = conn.createStatement
      val check = stmt.executeQuery("select description from data where id = " + id + " ")
      while (check.next()) {
        count = count + 1
      }
      if(count>0) {
        val rs = stmt.executeQuery("SELECT * from data where id=" + id + ";")
        while (rs.next()) {
          var id = rs.getString("id").toInt
          var desc = rs.getString("description").toString
          var time=rs.getString("mytimestamp").toString
          var op = List(data(id, desc,time))
          a = a ::: op
        }
      }

    } finally {
      conn.close()
    }
    if(count>0) {
      var k = Json.toJson(
        a.map { t =>
          Map("id" -> t.id.toString, "description" -> t.description,"timestamp"->t.mytimestamp.toString)
        }
      )
      Ok(k)
    }
    else {
      Ok("ID not found")
    }

  }
}

