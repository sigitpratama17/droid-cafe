package com.example.fanzy.droidcafe;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class donuts {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void donuts() {
        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.donut), withContentDescription("Donuts are glazed and sprinkled with candy."), isDisplayed()));
        appCompatImageView.perform(click());

        ViewInteraction appCompatRadioButton = onView(
                allOf(withId(R.id.nextday), withText("Next day ground delivery"), isDisplayed()));
        appCompatRadioButton.perform(click());

        pressBack();

    }

}
