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
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

//import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
//import java.util.Vector;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {

    public ArrayList<SpinnerModel> CustomListViewValuesArr = new ArrayList<SpinnerModel>();
    public ArrayList<String> infoStrings = new ArrayList<String>();
    final public int rows = 9;
    final public int columns = 11;
    CustomAdapter adapter;
    MainActivity activity = null;
    public EditText textWindow = null;
    public EditText editTextU = null;
    public EditText editTextI = null;
    public ArrayList<Spinner> spinnerArray = new ArrayList<Spinner>();
    public int[][] matrix = new int[rows][columns];
    public int pressedID = -1;
    public boolean initflag = false;
    public ArrayList<linkedRows> linkedElementsRows = new ArrayList<linkedRows>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

        nullMatrix();
        initflag = true;

//        EditText EditText_I = (EditText)findViewById(R.id.editText);
//        EditText EditText_U = (EditText)findViewById(R.id.editText2);
//        EditText_I.setKeyListener(null);
//        EditText_U.setKeyListener(null);

        textWindow = (EditText)findViewById(R.id.editText3);
        textWindow.setKeyListener(null);
        editTextI = (EditText)findViewById(R.id.editText);
        editTextU = (EditText)findViewById(R.id.editText2);
        editTextI.setKeyListener(null);
        editTextU.setKeyListener(null);

        activity  = this;
        initInfoStrings();
        setListData();
        Resources res = getResources();
        adapter = new CustomAdapter(activity, R.layout.spinner_rows, CustomListViewValuesArr, res);

        Button start_button = (Button)findViewById(R.id.button);
        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                create_links();
                for(int i = 0; i < linkedElementsRows.size(); ++ i)
                {
                    if(linkedElementsRows.get(i).getStatus() == 1) {
                        textWindow.append("> [" + i
                                + "], R: " + linkedElementsRows.get(i).getR()
                                + ", U:" + linkedElementsRows.get(i).getU() + "\n> index["
                                + linkedElementsRows.get(i).getIndex()[0] + " "
                                + linkedElementsRows.get(i).getIndex()[1] + " "
                                + linkedElementsRows.get(i).getIndex()[2] + " "
                                + linkedElementsRows.get(i).getIndex()[3] + "]"
                                + "\n");
                    }
                    else
                        if(linkedElementsRows.get(i).getStatus() == 2) {
                            textWindow.append("> error in " + i + "row.\n");
                        }
                }
                textWindow.append("> Перевірка : " + check_matrix_elements() + "\n");
                createElectricSchema();
            }
        });

        Button stop_button = (Button)findViewById(R.id.button2);
        stop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWindow.setText("");
                editTextI.setText("Струм : 0.0 А");
                editTextU.setText("Напруга : 0.0 В");
//                textWindow.append("msg : Не вірно зібрана схема.\n");
            }
        });

        for (int i = 0; i < (rows * columns); ++ i)
        {
            Spinner  mSpinner = (Spinner)findViewById(2131361793 + i);
            mSpinner.setTag(i);
            mSpinner.setAdapter(adapter);
            mSpinner.setOnTouchListener(spinnerOnTouch);

            mSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View v, int position, long id) {

                    int i = getMatrixIndex_I();
                    int j = getMatrixIndex_J();

                    int index = (int)parentView.getItemIdAtPosition(position);
                    String str = "> set : " + infoStrings.get(index)
                            + " (I : " + i + ", J : " + j
                            + ", ID : " + pressedID + ")\n";

                    textWindow.append(str);

                    if(i >= 0 && j >= 0)
                        matrix[i][j] = index;
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
                pressedID = Integer.parseInt(v.getTag().toString());
            }
            return false;
        }
    };

    private void create_links() {
        linkedElementsRows.clear();

        for (int i = 0; i < rows; ++ i) {
            for (int j = 0; j < columns; ++ j) {
                if(matrix[i][j] >= 6) {
                    linkedRows newRow = new linkedRows();
                    for(; j < columns && matrix[i][j] >= 6; ++ j) {
                        if(newRow.getStatus() == 0) {
                            newRow.setStatus(1);
                            newRow.setIndex(i, j, 0, 0);
                        }

                        newRow.setEndIndex(i, j);

                        switch (matrix[i][j]) {
                            case 6 : { newRow.appendR(0); break; }
                            case 7 : { newRow.appendR(1); break; }
                            case 8 : { newRow.appendR(2); break; }
                            case 9 : { newRow.appendR(5); break; }
                            case 10 : { newRow.appendR(8); break; }
                            case 11 : { newRow.appendR(0.006); break; }
                            case 12 : { newRow.appendU(3); break; }
                        }
                    }
                    linkedElementsRows.add(newRow);
                }

            }
        }
    }

    private boolean getElemaent(linkedRows currentRow, int j, int indexB, int indexE, int offset) {
        for(int c = currentRow.getIndex()[indexB]; c <= linkedElementsRows.get(j).getIndex()[indexB]; ++ c)
        {
            textWindow.append("> [i: " + c + ", j: " + (currentRow.getIndex()[indexE]) + offset + "] " + infoStrings.get(matrix[c][(currentRow.getIndex()[indexE]) + offset]) + "\n");

            if(matrix[c][(currentRow.getIndex()[indexE]) + offset] < 6 && matrix[c][(currentRow.getIndex()[indexE]) + offset] > 0)
                continue;
            else
            {
                return false;
            }
        }
        return true;
    }

    private void createElectricSchema() {
        double totalU = 0;
        double totalR = 0;
        boolean result = true;
        if(linkedElementsRows.size() > 1 && check_matrix_elements()) {
            for(int i = 0; i < linkedElementsRows.size(); ++ i) {
                linkedRows currentRow = linkedElementsRows.get(i);
                totalR += currentRow.getR();
                totalU += currentRow.getU();
                for(int j = i + 1; j < linkedElementsRows.size(); ++ j) {
                    if((currentRow.getIndex()[1] == linkedElementsRows.get(j).getIndex()[1]) &&
                            (currentRow.getIndex()[3] == linkedElementsRows.get(j).getIndex()[3]))
                    {
//                        textWindow.append("> left : " + getElemaent(currentRow, j, 0, 1, -1) + "\n");
//                        textWindow.append("> right : " + getElemaent(currentRow, j, 2, 3, 1) + "\n");
                        if(!getElemaent(currentRow, j, 0, 1, -1) || !getElemaent(currentRow, j, 2, 3, 1))
                            result = false;
                    }
                }
            }
        }
        if(!result || totalR == 0)
            textWindow.append("> Не вірно зібрана схема.\n");
        else {
            DecimalFormat dm = new DecimalFormat("#.####");
            totalR *= 1000;
            textWindow.append("> U : " + totalU + " В\n> R : " + totalR + " Ом\n");
            editTextI.setText("Струм : " + dm.format(totalU / totalR) + " A");
            editTextU.setText("Напруга : " + totalU + " В");
        }

    }

    private boolean check_matrix_elements() {

        if(linkedElementsRows.size() == 1) {
            return false;
        }

        for(int i = 0; i < linkedElementsRows.size(); ++ i) {
            linkedRows currentRow = linkedElementsRows.get(i);
            for(int j = i + 1; j < linkedElementsRows.size(); ++ j) {
                if((currentRow.getIndex()[1] != linkedElementsRows.get(j).getIndex()[1]) ||
                        (currentRow.getIndex()[3] != linkedElementsRows.get(j).getIndex()[3]))
                    return false;
            }

        }
        return true;
    }

    public void initInfoStrings()
    {
        infoStrings.add("Видалити");
        for(int i = 0; i < 6; ++ i)
            infoStrings.add("Провідник");
        infoStrings.add("Резистор(1кОм)");
        infoStrings.add("Резистор(2кОм)");
        infoStrings.add("Резистор(5кОм)");
        infoStrings.add("Резистор(8кОм)");
        infoStrings.add("Лампочка(6В 1А)");
        infoStrings.add("Батарея(3В 3А)");
    }

    public void setListData()
    {
        for (int i = 0; i <= 12; ++i) {

            final SpinnerModel sched = new SpinnerModel();

            sched.setItemDescription(infoStrings.get(i));
            sched.setImage("im" + i);

            CustomListViewValuesArr.add(sched);
        }
    }

    public void nullMatrix() {
        for(Integer i = 0; i < rows; ++ i)
            for(Integer j = 0; j < columns; ++ j)
                matrix[i][j] = -1;
    }

    public int getMatrixIndex_I() {
        return (pressedID / columns);
    }

    public int getMatrixIndex_J() {
        return (pressedID % columns);
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