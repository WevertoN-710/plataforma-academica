package br.edu.ifpa.plataforma;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModulithTest {

    @Test
    void modulosRespeitamAsFronteiras() {
        ApplicationModules.of(PlataformaApplication.class).verify();
    }
}