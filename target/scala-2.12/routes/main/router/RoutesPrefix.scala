// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saksham/Desktop/play-scala-rest-api-example/conf/routes
// @DATE:Wed May 29 13:03:30 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
