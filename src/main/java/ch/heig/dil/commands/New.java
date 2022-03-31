package ch.heig.dil.commands;

import java.io.IOException;
import java.util.concurrent.Callable;
import picocli.CommandLine;

@CommandLine.Command(name = "new", description = "Init a new static website.")
public class New implements Callable<Integer> {

    @Override
    public Integer call() throws IOException {
        System.out.println("New command");
        return 0;
    }
}
