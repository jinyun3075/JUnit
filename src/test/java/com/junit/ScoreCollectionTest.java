package com.junit;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ScoreCollectionTest {

    @Test
    public void 산술평균값_구하기(){
        // 준비
        ScoreCollection collection = new ScoreCollection();
        collection.add(()->5);
        collection.add(()->7);

        //실행
        int actualResult = collection.arithmeticMean();

        //단언
        assertThat(actualResult, equalTo(4));
    }
}
