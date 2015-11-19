package builder.applauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LauncherActivity extends AppCompatActivity implements View.OnClickListener
{
    Button launchButton1,launchButton2,launchButton3,launchButton4,launchButton5,launchButton6;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        launchButton1 = (Button) findViewById(R.id.but_app_1);
        launchButton2 = (Button) findViewById(R.id.but_app_2);
        launchButton3 = (Button) findViewById(R.id.but_app_3);
        launchButton4 = (Button) findViewById(R.id.but_app_4);
        launchButton5 = (Button) findViewById(R.id.but_app_5);
        launchButton6 = (Button) findViewById(R.id.but_app_6);
        launchButton1.setOnClickListener(this);
        launchButton2.setOnClickListener(this);
        launchButton3.setOnClickListener(this);
        launchButton4.setOnClickListener(this);
        launchButton5.setOnClickListener(this);
        launchButton6.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v)
    {
        String buttonText = "Unknown";
        switch (v.getId())
        {
            case R.id.but_app_1:
                buttonText = "Spotify Streamer";
                break;
            case R.id.but_app_2:
                buttonText = "Soccer";
                break;
            case R.id.but_app_3:
                buttonText = "Library";
                break;
            case R.id.but_app_4:
                buttonText = "Build it Bigger";
                break;
            case R.id.but_app_5:
                buttonText = "XYZ Reader";
                break;
            case R.id.but_app_6:
                buttonText = "Capstone: The Ultimate";
                break;
        }
        Toast.makeText(this, "This Button will Launch " + buttonText + " App", Toast.LENGTH_SHORT).show();
    }
}
