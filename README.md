﻿# MakersharksTask

This Spring Boot application provides a RESTful API for searching manufacturers based on their location, nature of business, and manufacturing processes.

Prerequisites
1.
Java 21+
Maven or Gradle
using spring intializer (JPA,H2,Web,Lombok)

2.
Clone the Repository:
git clone https://github.com/Ankushrwt348/MakersharksTask.git

3.
run the MakerSharksApplication class

4.
for inserting data in h2 database
http://localhost:8081/h2-console  in browser
Username-Ankushrwt
Password- password

6.
insert data in h2 database
INSERT INTO SUPPLIER_ENTITY (id, company_name, website, location, nature_of_business, manufacturing_processes) VALUES
(1, 'Small Tech Ltd.', 'http://smalltech.com', 'India', 'small_scale', '3d_printing'),
(2, 'Large Moulders Inc.', 'http://largemoulders.com', 'India', 'large_scale', 'moulding'),
(3, 'Medium Castings', 'http://mediumcastings.com', 'India', 'medium_scale', 'casting'),
(4, 'Coating Experts', 'http://coatingexperts.com', 'USA', 'small_scale', 'coating');


test the endpoints with in postman
Endpoint: http://localhost:8081/api/supplier/query
Method: POST
Request Body:
JSON
{
  "location": "India",
  "natureOfBusiness": "small_scale",
  "manufacturingProcesses": "3d_printing"
}
