package x86;

import java.io.IOException;

public class Main {
    private static void runall() {
        MemoryTest.run();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Running ALL TEST");
        CodeTest.run();
        MemoryTest.run();
        RegisterLexerTest.run();
        RegisterTest.run();
    }
}
