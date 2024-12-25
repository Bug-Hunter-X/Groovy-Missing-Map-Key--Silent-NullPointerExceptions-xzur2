```groovy
def myMethod(Map params) {
  // ... some code ...
  if (params.containsKey("key")) {
    def value = params["key"]
    // ... use value ...
  } else {
    // Handle missing key explicitly
    println("Key 'key' not found in params.")
    return // or throw an exception, or use a default value
  }
}

//Alternative solution using the elvis operator
def myMethod2(Map params) {
  def value = params.get("key") ?: 0 // or any default value
  // ... use value ...
}

//Example usage
Map params = ["key": 10]
myMethod(params)
myMethod2(params)
Map params2 = [:]
myMethod(params2)
myMethod2(params2)
```