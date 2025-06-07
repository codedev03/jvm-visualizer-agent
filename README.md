# JVM Internals Visualizer (Java Agent)

This project demonstrates how to use `java.lang.instrument` to create a JVM agent that logs every class loaded during JVM startup.

## 🚀 How to Build

```bash
javac -d build/ agent/MethodLoggerAgent.java
jar cfm method-logger-agent.jar MANIFEST.MF -C build/ .
javac HelloApp.java
java -javaagent:method-logger-agent.jar HelloApp

📦 Features
Attaches at JVM startup

Logs all loaded classes (excluding core JVM ones)

Demonstrates use of premain() and ClassFileTransformer

