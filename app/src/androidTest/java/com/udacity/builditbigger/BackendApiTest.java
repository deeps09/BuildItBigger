package com.udacity.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.util.Pair;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;



/**
 * Created by Deepesh_Gupta1 on 12/04/2016.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class BackendApiTest {
    private static final String TAG = BackendApiTest.class.getSimpleName();
    private EndpointsAsyncTask endpointsAsyncTask;

    @Before
    public void setUpAsyncTask() {
        endpointsAsyncTask = new EndpointsAsyncTask();
    }

    @Test
    public void testApi() {
        String joke = null;
        endpointsAsyncTask.execute(new Pair<Context, String>(InstrumentationRegistry.getInstrumentation().getTargetContext(), "test"));
        try {
            joke = endpointsAsyncTask.get(60, TimeUnit.SECONDS);
            Log.d(TAG, "testApi: " + joke);
        } catch (InterruptedException | ExecutionException|TimeoutException e) {
            Log.d(TAG, "testApi: ", e);
        }
        Log.d(TAG, "testApi: "+ joke);
        Assert.assertNotNull(joke);
    }
}
