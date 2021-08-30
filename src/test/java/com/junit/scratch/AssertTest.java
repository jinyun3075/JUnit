package com.junit.scratch;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTest {

    @Test
    public void 어서트(){
        assertTrue(true);
    }
    @Test
    public void 어서트2(){
        int com1 =10 ;
        int com2 =20 ;
        assertTrue(com1>com2);
    }
    @Test
    public void 어서트뎃(){
        String str ="안녕하세요";
        assertThat(str,equalTo("안녕하세요?"));
    }
    @Test
    public void 배열or컬렉션(){
        assertThat(new String[] {"a","b","c"},not(equalTo(new String[] {"a","b"})));
    }

}
