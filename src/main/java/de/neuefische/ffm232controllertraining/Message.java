package de.neuefische.ffm232controllertraining;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String name;
    private String message;
    private String id;
}
