Changes for wildfly
-------------------
    Apart from pom adjustement changed the following:

1. Changed shirkwrap test archive to WarArchive, from my experience so far JarArchive(s) dont'work properly.
2. Fixed HelloUserBeanTest @Deployment method.