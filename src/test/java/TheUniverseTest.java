import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TheUniverseTest {

    @Test
    public void theAnswer() {
        assertThat(new TheUniverse().theAnswer(), is(42));
    }

    @Test
    public void newMethod() {
        new TheUniverse().newMethod();
    }
}
