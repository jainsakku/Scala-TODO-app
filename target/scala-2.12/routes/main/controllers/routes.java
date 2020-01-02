// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saksham/Desktop/play-scala-rest-api-example/conf/routes
// @DATE:Wed May 29 13:03:30 IST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Reverseindex index = new controllers.Reverseindex(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.Reverseindex index = new controllers.javascript.Reverseindex(RoutesPrefix.byNamePrefix());
  }

}
