package de.neuefische.ffm232controllertraining;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController {

    @GetMapping
    public String sayHello() {
        return "Hello";
    }
    @GetMapping("/moinpath/{name}/{lastName}")
    public String sayMoin(@PathVariable String name, @PathVariable String lastName) {
        return "Moin " + name + " " + lastName;
    }

    List<Message> messages = new ArrayList<>();

    @GetMapping("/messages")
    public List<Message> getAllMessages() {
        return messages;
    }


    @PostMapping("/messages")
    public void postNewMessage(@RequestBody Message newMessage) {
        messages.add(newMessage);
    }

    @DeleteMapping("/messages/{id}")
    public void deleteMessage(@PathVariable String id) {
        for (Message message : messages) {
            if (message.getId().equals(id)) {
                messages.remove(message);
            } else System.out.println("No such message found");
        }
    }

}
