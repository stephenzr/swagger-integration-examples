swagger-integration-examples
============================

Examples of using Swagger with Spring MVC, client libraries, validations, routing rules and other entirely good stuff.

Why should I care?
Good question.  Primarly if you are trying to integrate Swagger (v1.2) with a SpringMVC API project, as that's the example I have in here. Looking at the recordshop example you can see how to annotate an api, how to include the project references, swagger springmvc configuration, etc.  
Then, take a look at the client project.  That library was generated via Swagger Code Generation for Java (https://github.com/wordnik/swagger-codegen).  The only thing added were the tests to show them in action.  

Usage
Part of this effort is for people used to running with Tomcat, but it doesn't matter.  Start up the recorshop app on localhost:8083 and run the client tests which are pointed to :8083.  From here you'll get a feel for why an API spec is helpful.

PLUS!
The example shows a swagger client that is generated via spec.  As this is (IMHO) the true power of a API spec I wanted to provide a working example.

And finally, for those of us using SpringMVC who've had the problem of a ResponseEntity<some_class> generating in our spec - this example shows how to easily (and properly) avoid that.

If you have questions of issues please use the Github issues and I'll get back to you.

