```groovy
def myMethod(Map params) {
  // ... some code ...
  if (params.containsKey("key")) {
    def value = params["key"]
    // ... use value ...
  } else {
    // Handle missing key
  }
}

//Example of calling the method
Map params = ["key": 10]
myMethod(params)
```