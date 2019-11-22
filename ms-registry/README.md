##*Registry microservice*

####Why you need it
> When you have multiple processes working together they need to find each other.

It’s the naming server, or called service registry. It’s duty to give names to each microservice.

Why?
1. No need to hardcode the IP addresses of microservices
2. What if services use dynamic IP addresses when autoscaling

Every service register itself with Eureka and pings it to notify that it's alive.

If Eureka did not receive any notification from a service, this is unregistered from Eureka automatically.

####How to implement it

- SpringBoot version :: `2.1.5`
- Spring Cloud version :: `Greenwich.SR1`

####How to use it

To run the project without intellij start it from command line:
```bash
mvn spring-boot:run
```
Navigate to:

```
http://localhost:8761
```
If for any reason the `8761` is already blocked you can change it in [application.yml](src/main/resources/application.yml) at `server.port`  

---

Reference:

- [Spring Service Registry][service_registry]


[service_registry]: https://spring.io/blog/2015/07/14/microservices-with-spring#service-registration