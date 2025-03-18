Vitruvius TGG Integration Tests
==============================
Tests and, later, CaseStudies for testing and evaluating the Vitruvius TGG support.

Since this depends on eMoflon, we need at least a Java-21-SDK
## Install on windows
* Not use powershell. In IntelliJ: "Command Prompt" 
  OBACHT!In IntelliJ, that has to be re-opened each time the IDE is restarted (otherwise, it changes to powershell...)
* Change your shell's JAVA_HOME to a Java-23 JDK path:
    ```
    set JAVA_HOME="C:\Users\XPS-15\.jdks\openjdk-23.0.1"
    ```
* Install
    ```
    mvnw clean install
    ```
* Debug with IntelliJ
  1. Set a breakpoint
  2. Make sure to debug the forked surefire process, not the maven process. 
     This sets the standard debug jvm options (Port 5005)
    ```
    mvnw clean install -Dmaven.surefire.debug
    ```
  3. It will wait for the debugger. 
  4. Optionally attatch a profiler now.
  4. IntelliJ: CTRL+ALT+F5, choose not the maven wrapper process but the surefire one.

Model
-----
This folder contains the model in the ecore format. When you do not use eclipse, please provide a genmodel of your ecore model so that code can be generated. 

Consistency
-----------
This folder contains the consistency specifications, like reactions.

ViewType
--------
This folder contains the definition of the view types. These are necessary to create views of the vsum. 

Vsum
----
This folder contains the VSUM

