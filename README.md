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

How to deal with IBeX-Projects and Eclipse
------------------------------------------
### Configuring Eclipse
Just download the pre-built eclipse from [here](https://github.com/eMoflon/emoflon-ibex-eclipse-build/releases).
Alternatively, you can install the ibex plugins or download an eclipse VM.

### Creating a new IBeX project
1. Ensure your metamodels are known to eclipse:
   1. Create an Ecore modelling project for each metamodel
   2. copy your models in it
   3. (right-click on <modelname>.ecore -> EPackages registration -> Register EPackages into repository)
   4. Don't know if that is necessary...
5. Build metamodels' Java Code: Open the genmodel files, click right somewhere and "Generate model code"
2. Create new eMoflon TGG Project (empty)
   1. Copy the plugin.xml from a working project...
   2. Add dependencies to the previously generated model code..
   4. In the Schema.tgg, import models by workspace path, like this
   ```
    #import "platform:/resource/Families/model/families.ecore"
    #import "platform:/resource/Insurance/model/insurance.ecore"
    ```
   5. Define Rules, in the org.emoflon.ibex.tgg.rules package, by clicking the right symbol in the editor.
   6. 