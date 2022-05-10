package de.borisskert.immutables;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class FoobarValueTest {

    @Test
    void shouldCreateInstanceByBuilder() throws Exception {
        ImmutableFoobarValue foobar = ImmutableFoobarValue.builder()
                .foo(2)
                .bar("Bar")
                .addBuz(1, 3, 4)
                .build();

        assertThat(foobar.foo()).isEqualTo(2);
        assertThat(foobar.bar()).isEqualTo("Bar");

        ArrayList<Object> expectedBuz = new ArrayList<>();
        expectedBuz.add(1);
        expectedBuz.add(3);
        expectedBuz.add(4);

        assertThat(foobar.buz()).isEqualTo(expectedBuz);
    }
}
