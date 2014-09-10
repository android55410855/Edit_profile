package app.buusk.resume_55410855;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class edit_profile extends Activity implements OnClickListener {
	private Button btnsubmit;
	private EditText pt1, pt2, pt3, pt4;
	private String tv1, tv2, tv3, tv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.edit_sirilak);
		super.onCreate(savedInstanceState);
		ViewMatching();

	}

	private void ViewMatching() {
		// TODO Auto-generated method stub
		btnsubmit = (Button) findViewById(R.id.save_btn);
		btnsubmit.setOnClickListener(this);
		pt1 = (EditText) findViewById(R.id.pt1);
		pt2 = (EditText) findViewById(R.id.pt2);
		pt3 = (EditText) findViewById(R.id.pt3);
		pt4 = (EditText) findViewById(R.id.pt4);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.save_btn:
			tv1 = (pt1.getText().toString());
			tv2 = (pt2.getText().toString());
			tv3 = (pt3.getText().toString());
			tv4 = (pt4.getText().toString());
			Intent R = new Intent(getApplicationContext(), MainActivity.class);
			R.putExtra("tv1", tv1);
			R.putExtra("tv2", tv2);
			R.putExtra("tv3", tv3);
			R.putExtra("tv4", tv4);
			startActivity(R);
			break;
		default:
			break;
		}
	}

}
