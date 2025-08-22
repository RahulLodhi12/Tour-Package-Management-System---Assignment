Tour Package Management System – API Documentation

Base URL
http://localhost:8080/api

1. Welcome Message

Endpoint:

GET /

Description: Returns a welcome message.

Response:

"welcome to tour package management system"

2. Get All Tour Packages

Endpoint:

GET /tours

Description: Fetch all available tour packages.

Response (200 OK):

[
  {
    "id": 1,
    "image": "https://images.unsplash.com/photo-1598275277521-1885382d523a",
    "discountInPercentage": "17%",
    "title": "Himalayan Trek Adventure",
    "description": "14-day trek through the Himalayas",
    "duration": "14Days/13Nights",
    "actualPrice": "$1200",
    "discountedPrice": "$1000"
  }
]

3. Add a Tour Package

Endpoint:

POST /tours

Description: Add a new tour package.

Request Parameters (form-data or query):

image (string) → Image URL

discountInPercentage (string) → e.g. "20%"

title (string) → Tour name

description (string) → Tour details

duration (string) → e.g. "5Days/4Nights"

actualPrice (string) → e.g. "$1200"

discountedPrice (string) → e.g. "$1000"

Example Request (POSTMAN form-data):

POST /api/tours
image=https://example.com/tour.jpg
discountInPercentage=20%
title=Goa Beach Escape
description=Relax at Goa beaches with water sports
duration=5Days/4Nights
actualPrice=$500
discountedPrice=$400


Response:

201 Created (No body returned)

4. Get Tour Package By ID

Endpoint:

GET /tours/{id}

Description: Fetch details of a specific tour package by its ID.

Path Parameter:

id (Long) → Tour package ID

Response (200 OK):

{
  "id": 2,
  "image": "https://images.unsplash.com/photo-1507525428034-b723cf961d3e",
  "discountInPercentage": "20%",
  "title": "Goa Beach Escape",
  "description": "5-day beach holiday in Goa with water sports",
  "duration": "5Days/4Nights",
  "actualPrice": "$500",
  "discountedPrice": "$400"
}


Response (404 Not Found):

{}

5. Search Tour Package By Location

Endpoint:

GET /tours/search?location={location}

Description: Search for tour packages based on location.

Query Parameter:

location (string) → e.g. "Goa"

Response (200 OK):

[
  {
    "id": 3,
    "image": "https://images.unsplash.com/photo-1512453979798-5ea266f8880c",
    "discountInPercentage": "25%",
    "title": "Rajasthan Desert Safari",
    "description": "Camel safari and cultural tour in Jaisalmer",
    "duration": "7Days/6Nights",
    "actualPrice": "$800",
    "discountedPrice": "$600"
  }
]

Summary of Endpoints:
Method	Endpoint	Description
GET	/	Welcome message
GET	/tours	Get all tour packages
POST	/tours	Add a new tour package
GET	/tours/{id}	Get a tour package by ID
GET	/tours/search	Search tour packages by location

Postman collection:
1. Get All Tour Details:
  ![image alt](https://github.com/RahulLodhi12/Tour-Package-Management-System---Assignment/blob/main/get%20all%20tour%20details.png?raw=true)

2. Add a Tour Detail:
  ![image alt](https://github.com/RahulLodhi12/Tour-Package-Management-System---Assignment/blob/main/add%20a%20tour.png?raw=true)

3. Search Tour Details By Location:
  ![image alt](https://github.com/RahulLodhi12/Tour-Package-Management-System---Assignment/blob/main/search%20a%20tour%20by%20location.png?raw=true)
  
   
