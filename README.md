Vitruvius TGG Integration Tests
==============================
Tests and, later, CaseStudies for testing and evaluating the Vitruvius TGG support.

Since this depends on eMoflon, we need at least a Java-21-SDK
## Install on windows
* Not use powershell. In IntelliJ: "Command Prompt"
* Change your shell's JAVA_HOME to a Java-23 JDK path:
    ```
    set JAVA_HOME="C:\Users\XPS-15\.jdks\openjdk-23.0.1"
    ```
* Install
    ```
    mvnw clean install
    ```

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

