package com.example.organizationtestrepo;

import com.example.organizationtestrepo.service.BasicMemberService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicMemberServiceTest {

  @Test
  void test1() {
    BasicMemberService service = new BasicMemberService();
    String result = service.getGreeting("Rabbit");
    assertTrue(result.contains("Rabbit"));
  }

  @Test
  void test2() {
    BasicMemberService service = new BasicMemberService();
    assertThrows(Exception.class, () -> {
      service.getGreeting(null);
    });
  }

  @Test
  void test3() {
    BasicMemberService service = new BasicMemberService();
    String result = service.getGreeting("Rabbit");
    System.out.println(result);
    assertEquals("Hello, Rabbit!", result);
  }

  @Test
  void test4() {
    BasicMemberService service = new BasicMemberService();
    String result = service.getGreeting("  Rabbit  ");
    assertNotNull(result);
  }
}