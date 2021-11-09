CREATE TABLE Customers(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    passportNumber VARCHAR(255),
    mobileNumber VARCHAR(255),
    email VARCHAR(255),
);

CREATE TABLE Flights(
    id BIGSERIAL PRIMARY KEY,
    Customer_id int FOREIGN KEY REFERENCES Customers(id),
    timeOfFlight VARCHAR(255),
    flightNumber int,
    flightStatus VARCHAR(255),
    origin VARCHAR(255),
    destination VARCHAR(255),
    planeModelType VARCHAR(255),
    capacity int,
    count int,
    isFullyBooked Boolean,
);

CREATE TABLE FlightCustomers(
    id BIGSERIAL PRIMARY KEY,
    Customer_id int FOREIGN KEY REFERENCES Customers(id),
    Customer_name VARCHAR(255) FOREIGN KEY REFERENCES Customers(name),
    Customer_passportNumber VARCHAR(255) FOREIGN KEY REFERENCES Customers(passportNumber),
    ticketNumber int,
    timeOfFlight VARCHAR(255),
    Flight_flightNumber int FOREIGN KEY REFERENCES Flight(flightNumber),
    origin VARCHAR(255),
    destination VARCHAR(255)
);

CREATE TABLE Tickets(
    id BIGSERIAL PRIMARY KEY,
    Customer_id int FOREIGN KEY REFERENCES Customers(id),
    Customer_name VARCHAR(255) FOREIGN KEY REFERENCES Customers(name),
    Customer_passportNumber VARCHAR(255) FOREIGN KEY REFERENCES Customers(passportNumber),
    ticketNumber int,
    timeOfFlight VARCHAR(255),
    Flight_flightNumber int FOREIGN KEY REFERENCES Flight(flightNumber),
    origin VARCHAR(255),
    destination VARCHAR(255)
);


