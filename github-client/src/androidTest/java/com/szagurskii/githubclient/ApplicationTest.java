package com.szagurskii.githubclient;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class ApplicationTest {
  @Rule public final ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

  @Before public void setUp() throws Exception {
  }

  @Test public void shouldDisplayToolbarTitle() {
    onView(withId(R.id.textview_helloworld)).check(matches(withText(R.string.hello_world)));
  }
}
