package ch.hslu.oop.mep26fs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import nl.jqno.equalsverifier.EqualsVerifier;

class HelloWorldTest {
    @Test
    void testHelloWorld(){
        int one = 1;
        assertThat(one).isEqualTo(1);
    }
}