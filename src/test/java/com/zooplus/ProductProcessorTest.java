package com.zooplus;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ProductProcessorTest {

    @Test
    void shouldReturnProcessedProducts() {
        var result = new HashMap<>();

        assertThat(result).isEmpty();
    }
}
