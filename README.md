# Groovy Missing Map Key Bug

This repository demonstrates a common, yet subtle, error in Groovy: silently handling missing keys in Maps.  Accessing a non-existent key in a Groovy map using the bracket notation ([key]) returns `null` without throwing an exception.  This can lead to hard-to-debug NullPointerExceptions later in the code.

The `bug.groovy` file shows the problematic code.  The `bugSolution.groovy` file provides solutions to mitigate this issue.

## Solutions

The `bugSolution.groovy` file demonstrates several ways to handle missing keys more robustly, including using the `containsKey()` method or the Elvis operator (`?:`).
