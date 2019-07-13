1. For each environment there is separate properties (application-<env>.properties). These files should be present in
the respective servers. All the common properties can go to application.properties. application.properties overrides all
the other properties. In case of urgent prod deployment, as a hack, things can be added in application.properties instead
of asking the sysads to change to add in the prod machine.