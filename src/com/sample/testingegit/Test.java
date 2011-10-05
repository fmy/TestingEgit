package com.sample.testingegit;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class Test  extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = new Button(this);
        button.setText("OK");
        setContentView(button);
		int i = 1;
	}
}
