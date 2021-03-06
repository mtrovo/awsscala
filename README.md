# awsscala

helpers to deal with Java -> scala translations and paradigms


## Using this library

For sbt builds, add the following to your build.sbt:

    resolvers += "bintray.99taxis OS releases" at "http://dl.bintray.com/content/99taxis/maven"
    libraryDependencies += "com.taxis99" %% "awsscala" % "X.Y.Z",

For Maven builds, add the library and:

    <repositories>
      <repository>
        <id>BinTray 99Taxis OS releases</id>
        <url>http://dl.bintray.com/content/99taxis/maven</url>
      </repository>
    </repositories>

The version comes from the corresponding Git tag.

## Instructions for Development

The easiest way to publish your library to a public repository is with [BinTray](https://bintray.com/).
To publish your library to BinTray follow these steps:

* [Create a BinTray account](https://bintray.com/)
* In BinTray get your API Key from [your profile page](https://bintray.com/profile/edit)
* From the command line login to BinTray: `activator bintray::changeCredentials`
* Change the version via Git:  `git tag vX.Y.Z`
* Publish your library: `activator +bintray::publish`
                Note: The `+` publishes the cross-versioned (e.g. Scala 2.10 & 2.11) builds.
                
                
To enable others to use your library you can either have them add a new resolver / repository to their build or you can [add your library to Maven Central via jCenter](http://blog.bintray.com/2014/02/11/bintray-as-pain-free-gateway-to-maven-central/).

For the former option do:

For your sbt users have them add the following to their build.sbt:

    resolvers += "YOUR_BINTRAY_USERNAME" at "http://dl.bintray.com/content/YOUR_BINTRAY_USERNAME/maven"</code></pre>

For Maven users have them add:

    <repositories>
      <repository>
        <id>YOUR_BINTRAY_USERNAME</id>
        <url>http://dl.bintray.com/content/YOUR_BINTRAY_USERNAME/maven</url>
      </repository>
    </repositories>

