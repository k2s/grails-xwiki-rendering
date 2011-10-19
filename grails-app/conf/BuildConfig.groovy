grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenLocal()
        //mavenCentral()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
        compile("org.xwiki.commons:xwiki-commons-component-default:3.2",
                "org.xwiki.rendering:xwiki-rendering-syntax-xwiki2:3.2",
                "org.xwiki.rendering:xwiki-rendering-syntax-xhtml:3.2",
                "org.xwiki.rendering:xwiki-rendering-transformation-macro:3.2"){
            excludes "xml-apis", "xercesImpl", "slf4j-api"
        }
        runtime("org.xwiki.rendering:xwiki-rendering-macro-comment:3.2") {
            export = false
        }
    }

    plugins {
        build( ":release:latest.integration" ) {
            export = false
        }
        test( ":spock:0.5-groovy-1.7" ) {
            export = false
        }
    }
}
