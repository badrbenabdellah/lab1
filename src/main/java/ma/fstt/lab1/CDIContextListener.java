package ma.fstt.lab1;

import jakarta.enterprise.inject.spi.CDI;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import ma.fstt.lab1.service.ClientRepository;
import ma.fstt.services.PersonneService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;


@WebListener
public class CDIContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ClientRepository cleintrepos = CDI.current().select(ClientRepository.class).get();

        System.out.println("client" + cleintrepos);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed");
    }
}

