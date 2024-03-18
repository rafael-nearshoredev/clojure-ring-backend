## Clojure Ring Backend
This project is a simple Clojure ring backend, designed to handle HTTP requests and serve as the foundation for web applications. It uses a Jetty server and draws inspiration from the Luminus framework. If you’re new to Clojure web development, this README will guide you through the basics.

## Getting Started
### Prerequisites
Make sure you have the following installed:

Clojure
Leiningen

### Dependencies
Add the necessary dependencies to your project. In your project.clj or deps.edn, include:

:dependencies [[org.clojure/clojure "1.10.0"]
               [ring/ring-core "1.7.1"]
               [ring/ring-jetty-adapter "1.7.1"]]

 
### Docker Setup
To run the project using Docker, execute the following command:
```
docker compose up --build
```

This command will create two containers: one for your Clojure backend and another for a simple Postgres database.

### Contributing

Feel free to contribute to this project by opening issues, submitting pull requests, or improving the documentation.

### Acknowledgments

This project draws inspiration from the [luminuss framework](https://luminusweb.com)