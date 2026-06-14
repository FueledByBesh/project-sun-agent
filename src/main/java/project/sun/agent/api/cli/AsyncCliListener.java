package project.sun.agent.api.cli;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AsyncCliListener {

    @Async
    @EventListener(ApplicationReadyEvent.class)
    protected void listen(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("Echo: " + line);
        }
    }

}
