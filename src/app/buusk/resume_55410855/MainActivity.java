package app.buusk.resume_55410855;

//import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener  {
	private Button btn1,btn2;
	private TextView tv1, tv2, tv3, tv4;
	private String show1,show2,show3,show4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
       // btn1.setOnClickListener(new OnClickListener() {
        ViewMatching();
    }
			public void ViewMatching() {
				// TODO Auto-generated method stub
				btn1 = (Button) findViewById(R.id.btn_edit);
				btn2 = (Button) findViewById(R.id.btnimg);
				btn1.setOnClickListener(this);
				btn2.setOnClickListener(this);
				
				tv1 = (TextView) findViewById(R.id.tvw);
				tv2 = (TextView) findViewById(R.id.tva);
				tv3 = (TextView) findViewById(R.id.tve);
				tv4 = (TextView) findViewById(R.id.tvo);
				
				show1 = getIntent().getStringExtra("tv1");
				show2 = getIntent().getStringExtra("tv2");
				show3 = getIntent().getStringExtra("tv3");
				show4 = getIntent().getStringExtra("tv4");
				
				tv1.setText(show1);
				tv2.setText(show2);
				tv3.setText(show3);
				tv4.setText(show4);
				 
			}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_edit:
		
		// TODO Auto-generated method stub
			Intent i = new Intent(getApplication(),edit_profile.class);
			startActivity(i);
		case R.id.btnimg:
			Intent j = new Intent(getApplication(),imageActivity.class);
		 	startActivity(j);
		 	 break;

		default:
		break;
		}
		}
		}
	

