# GWT Cordova

GWT Cordova is an experimental Wrapper for the Apache Cordova API, similar to GWT Phonegap. The main difference is the use of JavaScript Interoperability instead of JSNI.

Run `mvn clean install` to build and install the library locally and add the following dependency to your `pom.xml`:

    <dependency>
      <groupId>com.florianf.gwtcordova</groupId>
      <artifactId>gwtcordova</artifactId>
      <version>0.1</version>
      <scope>provided</scope>
    </dependency>

There is also a [Showcase App](https://github.com/florian-f/gwt-cordova-showcase) that demonstrates how to use GWT Cordova.
