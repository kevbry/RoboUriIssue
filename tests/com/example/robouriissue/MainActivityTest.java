package com.example.robouriissue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowDrawable;

import com.example.robouriissue.MainActivity;



@RunWith(RobolectricTestRunner.class)
public class MainActivityTest 
{
	MainActivity activity;
	
	@Before
	public void setUp()
	{
		this.activity = Robolectric.buildActivity(MainActivity.class).create().get();
	}
	
	@Test
	public void testThatWillThrowStub()
	{
		ShadowDrawable shadow = Robolectric.shadowOf(this.activity.imageView.getDrawable());
		assertThat(shadow.getCreatedFromResId(), equalTo(R.drawable.ic_launcher));
	}
}
