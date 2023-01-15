import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelCountTest {

    @Test
    void countVowels() {
        VowelCount vc = new VowelCount();
        String sisend = "jaagup";
        int expectedVowels = 3;
        int actualVowels = vc.countVowels();
        assertEquals(expectedVowels, actualVowels);


    }
}