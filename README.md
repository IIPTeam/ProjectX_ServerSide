# ProjectX_ServerSide
***TEMP Deployment solution**** </br>
####Steps####
- build application/service using springboot, once complete & well-tested(at least complete unit testing), goes to PROJECT_ROOT_PATH/target/{project name}-{version}.jar, e.g. springboot-helloworld-cxf-1.0.0-SNAPSHOT.jar 
- using Winscp connect to remote cloud server, please contact Jamie to get cloud server login information(information risk limition).
- upload the jar you get in first step to folder ~/apps.</br>
- run shell command: java -jar xxxx.jar, then the project will start successfully within mins/seconds.
  </br>
  </br>
PS:
  in current solution, you may encounter the JVM port is already in use issue, please try use a new port, by the way, the available ports are [8080 ~ 9000]
