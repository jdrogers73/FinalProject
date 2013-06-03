package edu.rogers.thekillersbattleborntour;

import james.rogers.youtube.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
	}
	
	public void onClick(View view)
	{
		startActivity(new Intent("android.intent.action.VideosActivity"));
	}
}
