package app.library_environment.staff.administration;

import app.library_environment.staff.employees.Librarian;
import app.library_environment.staff.employees.SecurityGuard;
import app.library_environment.staff.employees.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;

public class Director {
    @Autowired
    private Librarian librarian;
    @Autowired
    private SecurityGuard securityGuard;
    @Autowired
    private ServiceManager serviceManager;

    public void manage() {
        librarian.read();
        securityGuard.work();
        serviceManager.work();
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public SecurityGuard getSecurityGuard() {
        return securityGuard;
    }

    public void setSecurityGuard(SecurityGuard securityGuard) {
        this.securityGuard = securityGuard;
    }

    public ServiceManager getServiceManager() {
        return serviceManager;
    }

    public void setServiceManager(ServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }
}