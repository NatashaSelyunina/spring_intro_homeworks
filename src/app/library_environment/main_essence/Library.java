package app.library_environment.main_essence;

import app.library_environment.separate_entities.Reader;
import app.library_environment.staff.Librarion;
import app.library_environment.staff.SecurityGuard;
import app.library_environment.staff.ServiceManager;

import java.util.List;

public class Library {
    private Librarion librarion;
    private SecurityGuard securityGuard;
    private ServiceManager serviceManager;
    private Reader reader;

    public void manageLibrary() {
        librarion.read();
        securityGuard.work();
        serviceManager.work();
        reader.giveBook();
    }

    public Librarion getLibrarion() {
        return librarion;
    }

    public void setLibrarion(Librarion librarion) {
        this.librarion = librarion;
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

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}