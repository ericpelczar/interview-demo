# Demo

Kudos! If you're reading this you're in the right place.

Build using `mvn clean install`

Run application from IDE or from the command line:
  `mvn spring-boot:run`

Access the webapp on port `8080`. The Swagger UI is mapped to the root path.

## Instructions

1. Check out the code locally using whatever coding stack you like
2. Implement the "greet user" endpoint defined in the API spec
1. The user will be stubbed
2. Use the existing User/UserService/UserRepository classes
   1. Add methods, etc. to those classes as needed
3. The greeting should take the time of day into account
   1. Morning = anything between 12AM and 12PM
   2. Afternoon = anything between 12PM and 6PM
   3. Evening = anything between 6PM and 12AM
3. Create unit tests for the service layer and an endpoint test for the controller
1. Test files are already shelled out
4. Use whatever tools you find handy, refer to the internet (we find no shame in that at all!)

