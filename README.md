Sube al Metro API v1 (Java Project)
===================================

Servidor Jelastic: [http://env-4792205.jelastic.websolute.net.br/estaciones/](http://env-4792205.jelastic.websolute.net.br/estaciones/)

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

Servidor - Jetty 7.6.14

[configuracion del servidor](http://willyaguirre.me/?p=584)

Base de datos MySQL

* subealmetro.sql (respaldo)
