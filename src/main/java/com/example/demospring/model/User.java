package com.example.demospring.model;
// Simple User class using Builder Pattern
public class User {
    private final String firstName;
    private final String lastName;
    private final int age;

    // Private constructor (only Builder can create User)
    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    // Static nested Builder class
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this; // return builder for chaining
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    // Getters (no setters because User is immutable)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
}
