package q01_setUtils;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;


@DisplayName("Q1 SetUtils Test")
public class SetUtilsTest {

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class Level1 {
        private Set<String> set1;
        private Set<String> set2;
        private Set<String> res;

        @BeforeAll
        public void init() {
            set1 = new HashSet<>();
            set2 = new HashSet<>();
        }

        @Test
        public void test1() {
            res = SetUtils.union(set1, set2);
            assertNotNull(res);
            assertEquals(0, res.size());
        }

        @Test
        public void test2() {
            res = SetUtils.intersect(set1, set2);
            assertNotNull(res);
            assertEquals(0, res.size());
        }

        @Test
        public void test3() {
            res = SetUtils.subtract(set1, set2);
            assertNotNull(res);
            assertEquals(0, res.size());
        }

    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class Level2 {
        private Set<String> set1;
        private Set<String> set2;
        private Set<String> res;

        @BeforeAll
        public void init() {
            set1 = new HashSet<>();
            set2 = new HashSet<>();

            set1.add("1");
            set1.add("2");

            set2.add("1");
            set2.add("3");
        }

        @Test
        public void test1() {
            res = SetUtils.union(set1, set2);
            assertNotNull(res);
            assertEquals("[1, 2, 3]", SetUtils.describe(res));
        }

        @Test
        public void test2() {
            res = SetUtils.intersect(set1, set2);
            assertNotNull(res);
            assertEquals("[1]", SetUtils.describe(res));

        }

        @Test
        public void test3() {
            res = SetUtils.subtract(set1, set2);
            assertNotNull(res);
            assertEquals("[2]", SetUtils.describe(res));
        }
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class Level3 {
        private Set<String> set1;
        private Set<String> set2;
        private Set<String> res;

        @BeforeAll
        public void init() {
            set1 = new HashSet<>();
            set2 = new HashSet<>();

            set1.add("5");
            set1.add("6");
            set1.add("7");

            set2.add("1");
            set2.add("3");
        }

        @Test
        public void test1() {
            res = SetUtils.union(set1, set2);
            assertNotNull(res);
            assertEquals("[1, 3, 5, 6, 7]", SetUtils.describe(res));
        }

        @Test
        public void test2() {
            res = SetUtils.intersect(set1, set2);
            assertNotNull(res);
            assertEquals(0, res.size());

        }

        @Test
        public void test3() {
            res = SetUtils.subtract(set1, set2);
            assertNotNull(res);
            assertEquals("[5, 6, 7]", SetUtils.describe(res));
        }
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class Level4 {
        private Set<String> set1;
        private Set<String> set2;
        private Set<String> res;

        @BeforeAll
        public void init() {
            set1 = new HashSet<>();
            set2 = new HashSet<>();

            set1.add("1");
            set1.add("2");
            set1.add("6");

            set2.add("1");
            set2.add("3");
            set2.add("6");

        }

        @Test
        public void test1() {
            res = SetUtils.union(set1, set2);
            assertNotNull(res);
            assertEquals("[1, 2, 3, 6]", SetUtils.describe(res));
        }

        @Test
        public void test2() {
            res = SetUtils.intersect(set1, set2);
            assertNotNull(res);
            assertEquals("[1, 6]", SetUtils.describe(res));

        }

        @Test
        public void test3() {
            res = SetUtils.subtract(set1, set2);
            assertNotNull(res);
            assertEquals("[2]", SetUtils.describe(res));
        }
    }
}
