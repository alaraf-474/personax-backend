# PersonaX – Personality Insight Engine 

PersonaX is a backend system built with Spring Boot that generates personality insights and attire recommendations based on user behavior, lifestyle, and income. It's designed to be a modular and extendable system for future integration with ML pipelines, personalization engines, or fashion-related platforms.

---

## Features

- Personality classification based on user behavior and preferences
- Attire suggestions tailored to generated personas
- Modular service structure for scaling and feature extension
- PostgreSQL-based data persistence
- REST-ready architecture for integration with frontend and third-party systems

---

## Tech Stack

- Java 17
- Spring Boot 3
- PostgreSQL
- Hibernate / JPA
- Maven

---

## Project Structure

```

PersonaX/
├── backend/
│   └── personax/
│       ├── controller/        # REST endpoints (in progress)
│       ├── model/             # JPA entities
│       ├── repository/        # Data access layer
│       ├── service/           # Core logic and persona engine
│       └── config/            # Application configuration
├── .env                       # Environment variables (if used)
└── README.md

````

---

## Setup Guide

### Prerequisites

- Java 17+
- Maven
- PostgreSQL running locally

### Steps

```bash
# Clone the repository
git clone https://github.com/alaraf-474/personax-backend.git
cd personax-backend

# Create the database
psql -U postgres
CREATE DATABASE personax_db;

# Configure application-dev.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/personax_db
spring.datasource.username=postgres
spring.datasource.password=your_password

# Navigate and run
cd backend/personax
mvn spring-boot:run
````

---

## Core Logic

### Persona Mapping

Maps user attributes to persona types such as:

* **Innovator**
* **Explorer**
* **Thinker**

### Attire Recommendation

Suggests clothing styles based on mapped personas using a basic rule-based system (machine learning integration planned).

---

## Roadmap

* [x] PostgreSQL integration
* [x] Core logic for personas and attire
* [ ] REST endpoints for user interaction
* [ ] Docker support
* [ ] React + Tailwind frontend
* [ ] ML persona classifier (next phase)

---

## Contributing

The project is still in early development. If you want to contribute, feel free to fork the repo or open a pull request with improvements, fixes, or new features.

---

## License

MIT License

---

## Author

Developed by [Al Araf](https://github.com/alaraf-474)


