// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saksham/Desktop/play-scala-rest-api-example/conf/routes
// @DATE:Wed May 29 13:03:30 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  v1_post_PostRouter_0: v1.post.PostRouter,
  // @LINE:2
  index_0: controllers.index,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    v1_post_PostRouter_0: v1.post.PostRouter,
    // @LINE:2
    index_0: controllers.index
  ) = this(errorHandler, v1_post_PostRouter_0, index_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, v1_post_PostRouter_0, index_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    prefixed_v1_post_PostRouter_0_0.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task/list""", """controllers.index.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task/delete/""" + "$" + """id<[^/]+>""", """controllers.index.delete(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task/insert""", """controllers.index.test()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task/update""", """controllers.index.update()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task/count""", """controllers.index.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task/get/""" + "$" + """id<[^/]+>""", """controllers.index.getid(id:Int)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] val prefixed_v1_post_PostRouter_0_0 = Include(v1_post_PostRouter_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v1/posts"))

  // @LINE:2
  private[this] lazy val controllers_index_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task/list")))
  )
  private[this] lazy val controllers_index_list1_invoker = createInvoker(
    index_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.index",
      "list",
      Nil,
      "GET",
      this.prefix + """task/list""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_index_delete2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_index_delete2_invoker = createInvoker(
    index_0.delete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.index",
      "delete",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """task/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_index_test3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task/insert")))
  )
  private[this] lazy val controllers_index_test3_invoker = createInvoker(
    index_0.test(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.index",
      "test",
      Nil,
      "POST",
      this.prefix + """task/insert""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_index_update4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task/update")))
  )
  private[this] lazy val controllers_index_update4_invoker = createInvoker(
    index_0.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.index",
      "update",
      Nil,
      "PUT",
      this.prefix + """task/update""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_index_count5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task/count")))
  )
  private[this] lazy val controllers_index_count5_invoker = createInvoker(
    index_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.index",
      "count",
      Nil,
      "GET",
      this.prefix + """task/count""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_index_getid6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task/get/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_index_getid6_invoker = createInvoker(
    index_0.getid(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.index",
      "getid",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """task/get/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case prefixed_v1_post_PostRouter_0_0(handler) => handler
  
    // @LINE:2
    case controllers_index_list1_route(params@_) =>
      call { 
        controllers_index_list1_invoker.call(index_0.list)
      }
  
    // @LINE:3
    case controllers_index_delete2_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_index_delete2_invoker.call(index_0.delete(id))
      }
  
    // @LINE:4
    case controllers_index_test3_route(params@_) =>
      call { 
        controllers_index_test3_invoker.call(index_0.test())
      }
  
    // @LINE:5
    case controllers_index_update4_route(params@_) =>
      call { 
        controllers_index_update4_invoker.call(index_0.update())
      }
  
    // @LINE:6
    case controllers_index_count5_route(params@_) =>
      call { 
        controllers_index_count5_invoker.call(index_0.count)
      }
  
    // @LINE:7
    case controllers_index_getid6_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_index_getid6_invoker.call(index_0.getid(id))
      }
  }
}
