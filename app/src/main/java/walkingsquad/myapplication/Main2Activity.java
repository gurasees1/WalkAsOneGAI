package walkingsquad.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
