// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saksham/Desktop/play-scala-rest-api-example/conf/routes
// @DATE:Wed May 29 13:03:30 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:2
  class Reverseindex(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.index.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:7
    def getid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.index.getid",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/get/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:6
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.index.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/count"})
        }
      """
    )
  
    // @LINE:4
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.index.test",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "task/insert"})
        }
      """
    )
  
    // @LINE:2
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.index.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/list"})
        }
      """
    )
  
    // @LINE:5
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.index.update",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "task/update"})
        }
      """
    )
  
  }


}
