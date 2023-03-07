package edu.eci.arsw.blueprints.beans;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.persistence.BlueprintsPersistence;
import edu.eci.arsw.blueprints.persistence.impl.InMemoryBlueprintPersistence;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public BlueprintsPersistence getBpp() throws BlueprintPersistenceException {
        BlueprintsPersistence bpp = new InMemoryBlueprintPersistence();

        bpp.saveBlueprint(new Blueprint("julian","plano 1"));
        bpp.saveBlueprint(new Blueprint("julian","plano 2"));
        bpp.saveBlueprint(new Blueprint("camilo","plano 3"));
        return bpp;
    }


    @Bean
    public BlueprintsServices getBps(){
        return  new BlueprintsServices();
    }

}
