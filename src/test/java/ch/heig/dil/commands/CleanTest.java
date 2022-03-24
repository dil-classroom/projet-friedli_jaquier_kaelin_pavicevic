package ch.heig.dil.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import ch.heig.dil.Boomshot;
import org.junit.jupiter.api.Test;
import picocli.CommandLine;

class CleanTest {

    @Test
    void result() {
        int exitCode = new CommandLine(new Boomshot()).execute("clean");
        assertEquals(exitCode, 0);
    }

    @Test
    void exception() {
        assertThrows(Exception.class, () -> {
            throw new Exception();
        });
    }

    @Test
    void output() throws Exception {
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            System.setOut(new PrintStream(output));
            new CommandLine(new Boomshot()).execute("clean");
            assertTrue((output.toString().contains("Clean command")));
        }
    }

}