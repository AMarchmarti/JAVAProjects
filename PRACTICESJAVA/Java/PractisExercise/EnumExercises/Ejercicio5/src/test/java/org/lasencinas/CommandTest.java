package org.lasencinas;

public class CommandTest {
    public static void main(String... args) {
        // Execute all commands in the command list
        for (Command cmd : CommandList.values()) {
            cmd.execute();
        }
    }
}
/**
 * Running...
 * Jumping...
 */