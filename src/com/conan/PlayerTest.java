package com.conan;

import java.util.ArrayList;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.setName("conan");
        player.setAge(12);
        player.setHobbies(null);
        System.out.println(player);
    }
}