:

```markdown
# Loan Project

This project is designed to manage loan applications and processing. The application is containerized using Docker and can be easily set up using Docker Compose.

## Prerequisites

- Docker
- Docker Compose

## Getting Started

Follow the steps below to get the project up and running:

### Clone the Repository


git clone git@github.com:halidi-hamidu/loan.git
cd loan


### Running the Application

Use Docker Compose to build and start the containers:

docker compose -f docker-compose.dev.yaml up --force-recreate

This command will build the Docker images (if not already built) and start the containers defined in the `docker-compose.dev.yaml` file.

### Accessing the Application

Once the containers are up and running, you can access the application in your web browser. The default login credentials are:

- **Username:** halidi@gmail.com
- **Password:** halidi109#14
