package metadevs.newHomeWork;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void aboutPerson() {

    }

    @Test
    void checkDifference() {
        int salary = 13;
        int age = 5;
        boolean statment = salary >= age; ;
        assertThat(statment).isEqualTo(true);
    }
}