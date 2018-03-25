package walkingsquad.myapplication;

/**
 * Created by harsh on 25-03-2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ProgressBar;
import android.os.Handler;


public class walking_squad_progress extends AppCompatActivity {
    // Get the widgets reference from XML layout
    private int progressStatus = 0;
    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.walking_sqaud);

        //final RelativeLayout rl = (RelativeLayout) findViewById(R.id.relativeLayout);
        final ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar4);
        if (progressStatus < 100) {
            progressStatus = 40;
            pb.setProgress(progressStatus);
        }
    }

    public void history(View v) {
        Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
        startActivity(intent);

    }

    public void home(View v) {
        Intent intent = new Intent(getApplicationContext(), walking_squad_progress.class);
        startActivity(intent);

    }

    public void about(View v) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(intent);

    }
}

