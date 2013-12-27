Sube al Metro API v1 (Java Project)
===================================

Servidor(*por revisar): [http://jetty.willyaguirre.me/secure/login](http://jetty.willyaguirre.me/secure/login)

Esta usando play framework 1.2.5.3 - Java
para ejecutar el proyecto:

* play deps --sync
* play run

Para desarrollar con Eclipse IDE:

* play eclipsify

Ejecutar en diferente puerto:

* play run --http.port=8080

[Despliegue](http://www.playframework.com/documentation/1.2.5/deployment#appservers)

* play war SubeAlMetroApi -o SubeAlMetroApi.war --zip
