# Codename One CORS Proxy

This project includes proxy servlets that can be used in conjunction with a Codename One Javascript application to provide CORS (cross-origin requests) support.

## Getting Started

1. Either [download the .war distribution](https://github.com/shannah/cors-proxy/releases) or build from source.
2. Deploy the .war on your server. 
3. [Configure your Codename One application](#configuring-your-codename-one-application) to point to your proxy servlet.

### Building from Source

~~~~
$ git clone https://github.com/shannah/cors-proxy.git
$ cd cors-proxy
$ mvn package
~~~~

Deploy the resulting .war file (located in the `target` directory) on your server.

### Testing the Proxy

Once you have deployed the .war file on your server, the servlet will be available `http://example.com/yourwebapp/cn1-cors-proxy`.  The proxy takes a single GET parameter (`_target`) which specifies the URL that you wish to access.  E.g. `http://example.com/yourwebapp/cn1-cors-proxy?_target=http://www.codenameone.com`.

### Configuring Your Codename One Application

There are two ways to "tell" your Codename One application about your proxy servlet.

1. In your Java source :
  
  ~~~~
  Display.getInstance().setProperty("javascript.proxy.url", "http://example.com/yourwebapp/cn1-cors-proxy?_target=");
  ~~~~
2. In your index.html file.
  
  ~~~~
  <script>
    window.cn1CORSProxyURL='http://example.com/yourwebapp/cn1-cors-proxy?_target=';
  </script>
  ~~~~

# Advanced

1. [Deploying on AppEngine](https://github.com/shannah/cors-proxy/wiki/Deploying-on-App-Engine)
2. [Embedding Servlet into Existing Project](https://github.com/shannah/cors-proxy/wiki/Embedding-Servlet-into-Existing-Project)


