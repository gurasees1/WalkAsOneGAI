package walkingsquad.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abhis on 25-03-2018.
 */

public class Main4Activity extends AppCompatActivity {

    private LinearLayout mContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        mContainerView=(LinearLayout) findViewById(R.id.line1);
        inflateEditRow();
    }

    private void inflateEditRow() {

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.add_history, null);
        //final TextView item=(TextView) rowView.findViewById(R.id.itemcount);

        //item.setText("Item");

        // Inflate at the end of all rows but before the "Add new" button
        mContainerView.addView(rowView, mContainerView.getChildCount() -1);
    }
    public void onAddNewClicked(View v) {
        // Inflate a new row and hide the button self.
        inflateEditRow();

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
