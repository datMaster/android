package com.datmaster.constructor;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

//import java.lang.reflect.Field;
import java.util.ArrayList;
//import java.util.Vector;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {

    public ArrayList<SpinnerModel> CustomListViewValuesArr = new ArrayList<SpinnerModel>();
    public ArrayList<String> infoStrings = new ArrayList<String>();
//    TextView output = null;
    CustomAdapter adapter;
    MainActivity activity = null;
    public EditText textWindow = null;
    public ArrayList<Spinner> spinnerArray = new ArrayList<Spinner>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

        EditText EditText_I = (EditText)findViewById(R.id.editText);
        EditText EditText_U = (EditText)findViewById(R.id.editText2);
        EditText_I.setKeyListener(null);
        EditText_U.setKeyListener(null);

        textWindow = (EditText)findViewById(R.id.editText3);
        textWindow.setKeyListener(null);

        activity  = this;
        initInfoStrings();
        setListData();
        Resources res = getResources();
        adapter = new CustomAdapter(activity, R.layout.spinner_rows, CustomListViewValuesArr, res);

        for (int i = 0; i <= 98; ++ i)
        {

            Spinner  mSpinner = (Spinner)findViewById(2131361793 + i);
            mSpinner.setTag(i);
            mSpinner.setAdapter(adapter);
            mSpinner.setOnTouchListener(spinnerOnTouch);

            mSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View v, int position, long id) {
                    // your code here
//                int id = ((Spinner) v.findViewById(R.id.spinner)).getId();

                    String str = "set : " + id + "\n";
                    textWindow.append(str);

//                String Company = ((TextView) v.findViewById(R.id.company)).getText().toString();
//                String CompanyUrl = ((TextView) v.findViewById(R.id.sub)).getText().toString();

//                String OutputMsg = "Selected Company : ";//+Company+"\n"+CompanyUrl;
//                output.setText(OutputMsg);

//                Toast.makeText(
//                        getApplicationContext(), OutputMsg, Toast.LENGTH_LONG).show();

                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                    // your code here
                }

            });
            spinnerArray.add(mSpinner);
        }

    }

    private View.OnTouchListener spinnerOnTouch = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_UP) {
                textWindow.append(v.getTag().toString() + "\n");
            }
            return false;
        }
    };

    public void initInfoStrings()
    {
        infoStrings.add("Видалити");
        infoStrings.add("Провідник");
        infoStrings.add("Провідник");
        infoStrings.add("Провідник");
        infoStrings.add("Провідник");
        infoStrings.add("Провідник");
        infoStrings.add("Провідник");
        infoStrings.add("Провідник");
        infoStrings.add("Провідник");
        infoStrings.add("Провідник");
        infoStrings.add("Провідник");
        infoStrings.add("Провідник");
        infoStrings.add("Резистор(2кОм)");
        infoStrings.add("Резистор(1кОм)");
        infoStrings.add("Резистор(5кОм)");
        infoStrings.add("Резистор(8кОм)");
        infoStrings.add("Лампочка(6В 1А)");
        infoStrings.add("Батарея(3В 3А)");
    }

    public void setListData()
    {
        for (int i = 0; i <= 17; ++i) {

            final SpinnerModel sched = new SpinnerModel();

            sched.setItemDescription(infoStrings.get(i));//"Елемент ");// + i);
            sched.setImage("im" + i);
            sched.setId(i);

            CustomListViewValuesArr.add(sched);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}