package Practice;

import java.util.Arrays;

class TestAbc {
    String num;

    public TestAbc(String num) {
        this.num = num;
    }
}

public class TestingLoop {
    public static void main(String[] args) {
        TestAbc testAbc = new TestAbc("1");
        TestAbc[] numbers = {testAbc, new TestAbc("2"), new TestAbc("3"), new TestAbc("3")};
        System.out.println(Arrays.toString(numbers));
        for (final TestAbc n : numbers) {
            System.out.println(n);
        }
        final TestAbc n = new TestAbc("1");
        System.out.println(Arrays.toString(numbers));

        {
//            final TestAbc n = new TestAbc("1");
        }
        {
//            final TestAbc n = new TestAbc("1");
        }

    }
}
