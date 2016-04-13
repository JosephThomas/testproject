package tests;

import android.test.ActivityInstrumentationTestCase2;
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

    public void test_first()
    {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById( R.id.tv1 );
        String tester = textView.getText().toString();

        assertEquals("Hello World !", tester);
    }


}
