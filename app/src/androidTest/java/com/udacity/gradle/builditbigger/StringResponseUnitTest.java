package com.udacity.gradle.builditbigger;


import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by ygarcia on 8/8/2017.
 */
@RunWith(AndroidJUnit4.class)
public class StringResponseUnitTest {

    private String stringResponse;

    @Before
    public void setUpCounter() {
        TestAsyncTask async = new TestAsyncTask();
        async.execute();
        try {
            stringResponse = async.get(30, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInitialCount() {
        Assert.assertFalse(stringResponse.isEmpty());
    }
}
