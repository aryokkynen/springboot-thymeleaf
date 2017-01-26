# springboot-thymeleaf

Viikko 2 - Tehtävä 1 Hello Thymeleaf
Luo Spring Boot sovellus, joka käsittelee GET-pyynnöt polkuun /hello kahdella parametrillä nimeltään nimi ja ika. 
Luote thymeleaf templaatti, joka näyttää tervetuloa-viestin, jos ikä on suurempi kuin 18.

Pyyntö: http://localhost:8080/hello?name=John&age=20 
Tulostaa: Welcome John! 
Pyyntö: http://localhost:8080/hello?name=Mark&age=12 
Tulostaa: You are too young! 

Tehtävä 2 - Listojen käsittely
Luo Spring Boot sovellus, joka käsittelee GET pyynnöt polkuun /hello2. Sovellus saa yhden parametrin requestissa (listan Student-olioita). Sovellus tulostaa tervetuloa viestin ja listan opiskelijoista
(Huomaa! Luo Student kontrollerissa ja lisää opiskelija listaan). 
Opiskelija-luokalla on kolme attribuuttia: firstName, lastName, email
Esimerkki: Pyyntö: http://localhost:8080/hello2 
Tulostaa: 

Welcome to Haaga-Helia!

Kate Cole

Dan Brown

Mike Mars 

Tehtävä 3 - Ystävälista 
Luo Spring Boot sovellus, joka käsittelee GET-pyynnöt polkuun /index. Luo Thymeleaf templaatti, joka sisältää lomakkeen joka kysyy ystävän nimeä.
Submit lisää kaverin listaan. Kaverit näytetään listana formin yläpuolella (käytä <th:each> tägiä). 
