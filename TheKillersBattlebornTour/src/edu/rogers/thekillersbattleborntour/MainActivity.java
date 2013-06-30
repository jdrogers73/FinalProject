package edu.rogers.thekillersbattleborntour;

import james.rogers.youtube.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
	private Button mConcertsButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
		mConcertsButton = (Button) findViewById(R.id.concertLocations);
		mConcertsButton.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				startActivity(new Intent("android.intent.action.ConcertsActivity"));
			}
		});
	}
	
	public void onClick(View view)
	{
		startActivity(new Intent("android.intent.action.VideosActivity"));
	}
}
