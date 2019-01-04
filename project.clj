(defproject juji/chord "0.8.2"
  :description "A library to bridge the gap between CLJ/CLJS, web-sockets and core.async"
  :url "https://github.com/james-henderson/chord.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/core.async "0.4.490"]
                 [http-kit "2.3.0"]
                 [org.clojure/tools.reader "1.3.2"]

                 [cheshire "5.8.1"]

                 [com.cognitect/transit-clj "0.8.313"]
                 [com.cognitect/transit-cljs "0.8.256"]

                 [org.clojure/data.fressian "0.2.1"]
                 [net.unit8/fressian-cljs "0.2.0"]])
