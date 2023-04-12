#Spring learn
Based on the https://skillmea.sk/online-kurzy/online-kurz-spring-framework course.<br>
Used tools and technologies:<br>

Packages:<br><br>
•	foreignrestapi:
-	com.fasterxml.jackson
-	https://www.jsonschema2pojo.org
-	org.springframework.http (ResponseEntity, Converters, JsonMapping)
-	org.springframework.web.client.RestTemplate<br>

•	myrestfullappi:
-	 spring web
-	 MVC
-	 spring-boot-starter-data-jpa
-	 JpaRepository
-	 org.mapstruct mapping
-	 hateoas.EntityModell
-	 org.springframework.hateoas.server.mvc.WebMvcLinkBuilder
-	 RepresentationModelAssembler<br>
 
•	testingprofiles: 
-	 profiles, primary, applicatation.properties<br>

•	zothers:
-	 Configuratiom, external package 




SOLID - principles 
principy objektoveho orientovaneho programovania

S - Single responsibility principle
    - jedna trieda zodpoveda za jednu vec
O - Open close principle
    - ak nieco menis... nemas znicit cely kod
    -vyuzivanie interfacov aby sa aplikacia lahko rozsirovala
L - Liskov Substitution principle
    vhodne navrhutie dedenie a prislusne zaradenie metod k nim...
    aby nevzniklo nieco ako vozidlo => startujMotor bicyge(tiez vozidlo) startujMotor
I - Interface Segragation Principle
    radsej viac mensich rozhranici ako jedno velke 
D - Dependency Inversion Principle
    modulacia ... aby bola siroka skalovatelnost
    
