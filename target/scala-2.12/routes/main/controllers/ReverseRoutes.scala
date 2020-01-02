// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saksham/Desktop/play-scala-rest-api-example/conf/routes
// @DATE:Wed May 29 13:03:30 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:2
  class Reverseindex(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def delete(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "task/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:7
    def getid(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "task/get/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:6
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "task/count")
    }
  
    // @LINE:4
    def test(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "task/insert")
    }
  
    // @LINE:2
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "task/list")
    }
  
    // @LINE:5
    def update(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "task/update")
    }
  
  }


}
