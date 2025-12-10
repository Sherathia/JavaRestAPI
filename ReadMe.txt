MVC Architecture 
Spring MVC framework already part of spring boot

The DispatcherServlet is the front controller in the Spring MVC framework.
It acts as the entry point for all web requests in your application.

Whenever a request comes in:

Browser → DispatcherServlet → Controller → Service → Repository → View (HTML/JSON)

DispatcherServlet performs several key tasks:

1. Receives HTTP requests

All incoming requests go through DispatcherServlet first.

2. Finds the appropriate Controller

It uses HandlerMapping to decide which controller method should handle the request.

3. Calls the controller method

It invokes the controller logic by passing request data.

4. Calls the service & business layer

Controller uses services, repositories, etc.

5. Selects the View

Using ViewResolver, it decides which UI template (JSP, Thymeleaf, JSON) to return.

6. Returns the response to client

The final rendered result is sent back to the browser.

*** Why DispatcherServlet is Important?

Central request handler
Applies MVC pattern cleanly
Manages the entire flow end-to-end
Makes Spring MVC extensible and structured