package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.Interfaces.IEmailContent;

@Setter
@Getter
@AllArgsConstructor
public class EmailContent implements IEmailContent {
    public String content;

    @Override
    public String toString() {
        return content;
    }
}
