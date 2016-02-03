# hello-web

Welcome to the Hello Web project.  This project is for getting started with web development in Clojure.  It uses [Ring], [Compojure], and [Hiccup].  The rest is up to you.

## Prerequisites

You will need [Leiningen][1] 1.7.0 or above installed.

[1]: https://github.com/technomancy/leiningen


## Directory Structure

The following files under, `src/hello_web/` are important:

* `handler.clj`: This file wires the web application together.
* `routes/`: Routes map URL's received by the web application to functions that should be invoked to serve the request.  Put your routes in this folder.  See `routes/home.clj` for an example.
* `views/`: HTML templates written in Hiccup live in this folder.  See `views/layout.clj` as an example.
 
* The tests are in the `test/` folder.

* Static resources (HTML, CSS, and JavaScript) go under, `resources/public/`.


## Running

To start a web server for the application, run:

    lein ring server

This command should open a browser for you.  If it doesn't, the web server should be listening at, http://localhost:3000/

To run the tests for the project, run:

    lein test


## License

Copyright © 2016 8th Light. Released under the MIT license.


[Ring]: https://github.com/ring-clojure/ring
[Compojure]: https://github.com/weavejester/compojure
[Hiccup]: https://github.com/weavejester/hiccup

