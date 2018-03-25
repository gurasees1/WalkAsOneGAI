package walkingsquad.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
    }

    public void openLogInActivity (View view) {
        Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
        startActivity(intent);
    }

    public void openSignUpActivity (View view2) {
       Intent intent2 = new Intent(getApplicationContext(), Main3Activity.class);
       startActivity(intent2);
    }

}
