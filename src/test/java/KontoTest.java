import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    private Konto konto;

    @BeforeEach
    void setUp() {
        konto = new Konto("Katja", 350.00);

    }

    @Test
    @DisplayName("Überprüfung Höhe Kontostand")
    void debit() {
        boolean expected = false;
        Assertions.assertTrue(konto.debit());
    }
}