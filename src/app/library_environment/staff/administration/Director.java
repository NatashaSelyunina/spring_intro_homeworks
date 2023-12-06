package app.library_environment.staff.administration;

import app.library_environment.staff.employees.Librarian;
import app.library_environment.staff.employees.SecurityGuard;
import app.library_environment.staff.employees.ServiceManager;

public class Director {
    private Librarian librarian;
    private SecurityGuard securityGuard;
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