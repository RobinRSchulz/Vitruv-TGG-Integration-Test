Vitruvius TGG Integration Tests
==============================
Tests and evaluation cases for testing and evaluating the Vitruvius TGG support.<br/>
Since this depends on eMoflon, we need at least a Java-21-SDK

## Evaluation Results
`Java2UML_plan_and_results.ods` (Table `GQM Plan`) shows the GQM plan and where to find the evaluation data.
This is also described in the following:
The evaluation results referred-to in the thesis can be found under `EvaluationDocumentationAndResults`:
* Goal 1: The subfolder `testRunData/Java2UmlEvaluationGoal1` contains the raw data from the maven builds (if the test succeeded), including 
  * the model files: `$TEST_NAME/java_instance.model` and `$TEST_NAME/uml_instance.model`.
  * vitruvius files: `$TEST_NAME/vsum`
  * ibex files:  `$TEST_NAME/ibexFiles/corr.xmi` and `$TEST_NAME/ibexFiles/protocol.xmi`.
  The values derived from the raw data can be found in `Java2UML_plan_and_results.ods` in the table `G1 Results`
* Goal 2: The results can be found in `Java2UML_plan_and_results.ods` in the table `G2 Results`.
* Goal 3: The subfolder `testRunData/Hospital2AdministrationGoal3` contains the medians of each test size run in 
  `medianTimeMeasurementsAccumulation.txt`. The single measurements for can be found in the subfolders
  * `test_$K` for Vitruv-TGG measurements with change sequence size K.
  * `test_$K_hipe` for HiPE measurements with change sequence size K.
  
  Each single test was run 20 times.

## Reproduce/ replicate Evaluation Results
(Windows:Not use powershell. In IntelliJ: "Command Prompt")<br/>
For all builds, use openjdk-21 (or higher, but this is untested).
1. Preparation: Build Dependency projects
   1. Clone and build Vitruv-Change **from this repo**: 
      https://gitlab.kit.edu/kit/kastel/sdq/stud/abschlussarbeiten/masterarbeiten/robinschulzg/vitruv-change:
      ###### Windows
      ```
      mvnw clean install
      ```
      ###### Linux
      ```
      ./mvnw clean install
      ```
   2. Clone and build Vitruv-TGG from this repo:
      https://gitlab.kit.edu/kit/kastel/sdq/stud/abschlussarbeiten/masterarbeiten/robinschulzg/vitruv-tgg.
      
      It might be that the properties `emoflon.ibex.version` and `hipe.version` in `pom.xml` need to be adjusted,
      because the updatesite doesn't remember old releases when a new one is released...
      ###### Windows
      ```
      mvnw clean install
      ```
      ###### Linux
      ```
      ./mvnw clean install
      ```
2. Build this project without tests:
   ###### Windows
     ```
     mvnw clean -DskipTests
     ```
   ###### Linux
     ```
     ../mvnw clean install -DskipTests
     ```
3. Reproduce/ replicate the evaluation results for 
   * Goal 1 (Build will be green although test failures are present, to be able to generate the surefire report site (evaluationReport.html))
     ###### Windows
     ```
     cd vsum
     ..\mvnw clean test -Dtest=Java2UmlEvaluationGoal1Test -Dmaven.test.failure.ignore=true
     ```
     ###### Linux
     ```
     cd vsum
     ../mvnw clean test -Dtest=Java2UmlEvaluationGoal1Test -Dmaven.test.failure.ignore=true
     ```
     The Build should yield 31 tests, 3 failures, 1 Errors and 0 Skipped tests.<br/>
     Find the results under `vsum/target/Java2UmlEvaluationGoal1`. <br/>
     There, `tggRulesInfo.txt` contains the information on corrupt and intact tgg rules (referring to the proxy issue).
   * Goal 3 (build takes ~ 8 hours (on my machine), comment-out/ disable 2048 and 4096 for quicker builds...)
     ###### Windows
     ```
     cd vsum
     ..\mvnw clean test -Dtest=Hospital2AdministrationGoal3Test
     ```
     ###### Linux
     ```
     cd vsum
     ../mvnw clean test -Dtest=Hospital2AdministrationGoal3Test
     ```
     Find the results under `vsum/target/Hospital2AdministrationGoal3`.
     There, `medianTimeMeasurementsAccumulation.txt` contains the median over all runs of all test sizes of HiPE and Vitruv-TGG.

## Debug with IntelliJ
  1. Set a breakpoint
  2. Make sure to debug the forked surefire process, not the maven process. 
     This sets the standard debug jvm options (Port 5005)
    ```
    cd vsum
    ..\mvnw clean install -Dmaven.surefire.debug
    ```
  3. It will wait for the debugger. 
  4. Optionally attatch a profiler now.
  4. IntelliJ: CTRL+ALT+F5, choose not the maven wrapper process but the surefire one.

## Push to Gitlab
```
    git push gitlabAbgabe master
```

# How to deal with IBeX-Projects and Eclipse

### Configuring Eclipse
Just download the pre-built eclipse from [here](https://github.com/eMoflon/emoflon-ibex-eclipse-build/releases).
Alternatively, you can install the ibex plugins or download an eclipse VM.

### Make eclipse know your metamodels
* via the p2 eclipse update mechanism:
    * Find an updatesite of your metamodels and use the known eclipse mechanisms to register them
    * For some updatesites, that are http-only, this must be allowed first:
      Preferences > Install/Update > Trust > Authorities Tab > Scroll down to Protocol Rules > Set the protocol rule for http from Redirect (Default) to Allow.
* If there is no updatesite:
    * build your model project in the ibex eclipse instance, in the genmodel editor -> right click -> ...
    * (right-click on <modelname>.ecore -> EPackages registration -> Register EPackages into repository)

### Creating a new IBeX project
1. Ensure your metamodels are known to eclipse:
   1. Create an Ecore modelling project for each metamodel
   2. copy your models in it
   3. (right-click on <modelname>.ecore -> EPackages registration -> Register EPackages into repository)
   4. Don't know if that is necessary...
2. Build metamodels' Java Code: Open the genmodel files, click right somewhere and "Generate model code"
3. Create new eMoflon TGG Project (empty)
   1. Copy the plugin.xml from a working project...
   2. Add dependencies to the previously generated model code..
   4. In the Schema.tgg, import models by workspace path, like this
   ```
    #import "platform:/resource/Families/model/families.ecore"
    #import "platform:/resource/Insurance/model/insurance.ecore"
    ```
   5. Define Rules, in the org.emoflon.ibex.tgg.rules package, by clicking the right symbol in the editor.
      * **Never** explicitly define create-edges that are eOpposites of other create-edges, eMoflon cannot handle that.
      * Abstract rules can be used, but concrete rules extending them have to only consist of concrete EClasses.
        * that applies to both context and create nodes!
        * For context nodes, this is no hard necessity however,
          but rather future work for Vitruv-TGG to support that! 
      * NACs do not seem to work, but that is not sufficiently tested
      * attribute conditions work, self-defining them also works.
   6. Self-define attribute conditions, by 
      1. defining them in the Schema.tgg (and already using them in rules)
      2. running the build process described in the following
      3. Finding that Classes named `UserDefined_${NAME_OF_YOUR_ATTRIBUTE_CONDITION}` have been created in the package
      ````
      org.emoflon.ibex.tgg.operational.csp.constraints.custom.${IBEX_PROJECT_NAME}
      ````
      4. Filling those classes with your implementation of your attribute conditions. 
         See example projects like Java2Uml on how to do that.
   7. If anything does not work, compare your project files to ones that are already working. 
      Especially the ones concerned with dependencies: 
      `build.properties`, `plugin.properties`, `plugin.xml`, `META-INF/MANIFEST.MF`
   8. If `src-gen` is red, that means the other pattern matchers won't work, but Vitruv-TGG still will...

### Building an ibex project
Building an ibex project is tiresome, buggy and time-consuming.
What has worked on a former project seems to not work anymore on the next.
Here are some things that bring one further to get an ibex project to work.
Building steps, that should produce a build state that is usable for Vitruv-TGG:
1. Clean Project (sometimes not necessary)
2. Delete the files in the `model` folder. Not always necessary...
3. Refresh Project
4. Mark your project and click the black hammer in the icon bar, titled "Build selected projects fully"
5. Project-dependent: Fix red files in the `gen` folder. eMoflon's SmartEMF is buggy, and metamodels that use the *originalName* annotation to some packages, like UML does,
   overreach SmartEMF's capabilities. So if this occurs in a package, exemplarily named `uml`, some files have to be repaired now:
   ````html
    <eAnnotations source="http://www.eclipse.org/uml2/2.0.0/UML">
      <details key="originalName" value="UML"/>
    </eAnnotations>
   ````
   It is encouraged to write a script or at least prepare regexes for this purpose...
   It is even more encouraged to fix SmartEMF...
6. Refresh Project
7. Mark your project and click the green hammer in the icon bar, titled "Build selected projects incrementally"

It is unpredictable, whether the eclipse project can be built or not and the steps to solve folders 
and/ or files not being there or not being cleaed or overwritten are always different.
The following can help:
* Repeating the described build steps multiple times, possibly leaving out the clean step.
* restarting eclipse
* wiping the "Problems" tab (?)
* deleting the model or the src-gen or the gen folder

If the following conditions apply, your project most likely has been built successfully:
  * the file sync/hipe/engine/ibex-patterns.xmi exists.

### Modelgen
For modelgen to work, HiPEEngine.java must be compileable. In the Java2Uml case, this is achieved by
1. add the following imports (the explicit ones MUST be because of ambiguity):
   import org.eclipse.uml2.uml.*;
   import org.eclipse.uml2.uml.Class;
   import org.eclipse.uml2.uml.Package;

2. Replace "uml." with "" (CASE SENSITIVE!)
3. Refresh project
4. "Perform incremental build" (green hammer)