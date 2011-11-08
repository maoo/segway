Welcome to the Segway Project Page!
--

Segway is a simple, small, semi-static, portfolio-like website that I've used as a playground to experiment
new programming languages and PaaS that I wanted to try since a while.

The website http://segway.herokuapp.com is hosted Heroku - http://heroku.com, which provides a very easy way to
host Clojure applications, especially if you're used working with git.

I've used Clojure for this simple test because I wanted to see how long it would have taken to do a simple website;
assuming that 4 days ago I was barely able to read *any* Clojure syntax, I'd say that the experiment was very successful.

The main idea behind Segway is very easy and straigh-forward: I want to download a complete HTML design -
I've used http://www.os-templates.com - and unzip it in my project's folder. On top of this layout, I want to execute
some transformations to the HTML structure.

Enlive provided me the exact right tool for this job. You can easily assign HTML transformations to CSS Selectors.

The next challenge (where I'm still working) is to completely separate the data from the injection logic and eventually
persist data somewhere (probably a KV store in the cloud)


Run it locally
--

export SEGWAY_ENV=dev && lein run -m segway.run