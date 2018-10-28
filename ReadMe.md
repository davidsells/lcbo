# LCBO 

## Usage
There are two users with price preference profiles:

1) David
2) Grant


## Development Environment
The application was composed using Springboot using Maven2 as a build tool.

### War file Generation

_mvn package_

This command will generate a war file in the target directory.

Running from the Command-Line

_$ mvn spring-boot:run_


## General Design
### Services

There are two services:

#### _LCBOServiceImpl_

This services purpose is to interact with the LCBO's Rest API.

#### _UserProfileSearchService_
This service is to deal with the User needs: profile and transformation of data formats.  Additionally it caches data to reduce the calls out to the LCBO's Rest server.

### WineRequest
This utility class is maintained in the session and governs the selection of wines.

When this class is constructed it is populated with the wines that meet the criteria of the user.

It will then be used to determine the next wines to be selected whilst removing producers on successful finding a wine.


### WelcomeController
It is the controller in the application.  It constructs the WineRequest and insures that the WineRequest's selection is available in the desired LCBO location.


### SpringBootWebApplication 
This class is responsible for launcing the application.

### The Model directory
This directory tree contains the supporting models for the application.

## Docker Deployment

A simple _Dockerfile_ was added for docker deployment into a tomcat environment.  To use this deployment follow these steps (this assumes that Docker has be installed locally).

1) _mvn package_ to create the the war file.
2) Build the docker image with the following command:
> docker build -t davidsells/lcbo .
3) Run the docker image with:
> docker run -p 8080:8080 davidsells/lcbo

The application will be running at the following URL:
> http://localhost:8080/lcbo
