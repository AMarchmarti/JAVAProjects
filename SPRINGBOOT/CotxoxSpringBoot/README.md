# CotxoxSpringBoot
L'activitat consisteix en **connectar una de les aplicacions Java desenvolupades al primer quadrimestre del curs a una base de dades H2**. 

Es tracta de afegir la capa de accés a dades a una aplicació que només compta amb capa de lògica o negoci. Per això, es realitzaran les modificacions oportunes al codi de les classes i  l'estructura del projecte per a mantenir el compliment dels **principis SOLID** al afegir una nova capa a la arquitectura de l'aplicació. Els principis `SOLID` són:

 - Responsabilitat única.
 - Open Closed.
 - Principi de substitució de Liksov. 
 - Inversió de dependències.
 - Segregació d'interfícies.

S'han de complir les especificacions donades als cassos test que guien el desenvolupament mitjançant `TDD` o Test Drive Development, que es troben al fitxer `CotxoxApplicationsTest.java`

Es tractaran a les sessions del mòdul els següents continguts:

 - Introducció a JPA 
 - Arquitectura de l'accés a dades en aplicacions Spring 
 - JPA Mapping 
 - Llenguatge de consultes JPQL 
 - Spring Data 

Els objectius específics a assolir amb aquesta activitat, pel que fa al manteniment de la persistència dels objectes i a l'accés i manteniment de bases de dades, són:

 - Configurar les fonts de connexions per distints tipus de bases de dades. 
 - Gestió de les transaccions i els seus efectes en el rendiment. 
 - Conèixer l'arquitectura i  API bàsica i configurar el JPA. 
 - Utilitzar els repositoris de Spring Data.