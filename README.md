# Race Condition in Simple Counter

This repository demonstrates a simple race condition bug in Java and its solution.  The `BuggyCounter.java` file contains code with a race condition, which can lead to inaccurate results when multiple threads access and modify a shared variable.  The `FixedCounter.java` file provides a solution using synchronization to prevent this race condition.