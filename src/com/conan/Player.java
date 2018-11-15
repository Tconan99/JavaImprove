package com.conan;

import java.util.List;
import lombok.Data;

@Data
public class Player {
    private String name;
    private int age;
    private List<String> hobbies;
}