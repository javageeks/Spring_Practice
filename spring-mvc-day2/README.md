@Controller annotation is used to indicate that it’s a web controller class.

@RequestMapping is used with classes and methods to redirect the client request to specific handler method. Notice that handler methods are returning String, this should be the name of view page to be used as the response.