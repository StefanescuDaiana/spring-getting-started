package ro.sda.spring;

import lombok.*;
//@Data->is a shortcut for @ToString, @EqualAndHashCode @Getter si @Setter
@EqualsAndHashCode
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;
}
