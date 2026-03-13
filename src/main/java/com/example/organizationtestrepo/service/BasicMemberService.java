package com.example.organizationtestrepo.service;

public class BasicMemberService {

  public String getGreeting(String name) {
    if (name == null) {
      throw new IllegalArgumentException("name must not be null");
    }
    return "Hello, " + name + "!";
  }
  error
}