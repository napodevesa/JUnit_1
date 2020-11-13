package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {
   @Test

   public void weak_when_has_less_than_8_letters(){
       assertEquals(PasswordUtil.SecurityLevel.WEAK,
               PasswordUtil.assessPassword ("1234567")) ;
   }


}