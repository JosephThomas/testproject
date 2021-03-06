package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.joseph.testproject3.MainActivity;

import com.example.joseph.testproject3.R;

/**
 * Created by Joseph on 4/12/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test()
    {
        super(MainActivity.class);
    }

    public void test_first() {
        final EditText firstNumber;
        final EditText secondNumber;
        //final TextView addResult;
        final Button[] btnAdd = new Button[1];

        double num1, num2, sum;
        mainActivity = getActivity();

        //TextView textView = (TextView) mainActivity.findViewById( R.id.tv1 );
        //String tester = textView.getText().toString();

        //assertEquals("Hello World!", tester);

        firstNumber = (EditText) mainActivity.findViewById(R.id.firstone);
        secondNumber = (EditText) mainActivity.findViewById(R.id.editText);
        mainActivity.runOnUiThread(new Runnable() {
            public void run() {
                firstNumber.setText("15");
                secondNumber.setText("16");
                btnAdd[0] = (Button) mainActivity.findViewById(R.id.button);

                btnAdd[0].performClick();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                assertEquals(31, Double.parseDouble(((TextView) mainActivity.findViewById(R.id.textView4)).getText().toString()));
            }
        });
    }

}
