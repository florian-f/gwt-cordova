# GWT Cordova

GWT Cordova is an experimental Wrapper for the Apache Cordova API, similarly to GWT Phonegap. The main difference is the use of JavaScript Interoperability instead of JSNI.

If you want to build this yourself, run `mvn clean install` to build and install the library locally and add the following dependency to your `pom.xml`:

    <dependency>
      <groupId>com.florianf.gwtcordova</groupId>
      <artifactId>gwtcordova</artifactId>
      <version>0.1</version>
      <scope>provided</scope>
    </dependency>

There is also a [Showcase App]() that demonstrates how to use GWT Cordova.
