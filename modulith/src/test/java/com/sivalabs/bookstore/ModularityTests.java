package com.sivalabs.bookstore;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModularityTests {
    static ApplicationModules modules = ApplicationModules.of(Application.class);


    @Test
    void verifiesModularStructure() {
        modules.verify();
    }

}