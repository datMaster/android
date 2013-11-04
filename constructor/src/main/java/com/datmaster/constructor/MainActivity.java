package com.datmaster.constructor;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends Activity {

    int arr_images[] = {
            R.drawable.horizontal_line,
            R.drawable.left_down,
            R.drawable.left_up,
            R.drawable.right_down,
            R.drawable.right_up,
            R.drawable.set,
            R.drawable.vertical_line
    };

    String elemets[] = {"Провідник", "Вгору(лівий)", "Вниз(лівий)", "Вгору(правий)", "Вниз(правий)", "Видалити"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

        final Spinner mSpinner = (Spinner)findViewById(R.id.spinner);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_rows, R.id.spinner, elemets);
//        mSpinner.setAdapter(adapter);

        MyCustomAdapter mAdapter = new MyCustomAdapter(MainActivity.this, R.layout.spinner_rows, elemets);
        mSpinner.setAdapter(mAdapter);

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

    /**
     * A placeholder fragment containing a simple view.
     */
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

    public class MyCustomAdapter extends ArrayAdapter<String> {

        public MyCustomAdapter(Context context, int textViewResourceId,
                               String[] objects) {
            super(context, textViewResourceId, objects);
            // TODO Auto-generated constructor stub
        }

        @Override
        public View getDropDownView(int position, View convertView,
                                    ViewGroup parent) {
            // TODO Auto-generated method stub
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView,
                                  ViewGroup parent) {
            // TODO Auto-generated method stub
            // return super.getView(position, convertView, parent);

            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.spinner_rows, parent, false);
            TextView label = (TextView) row.findViewById(R.id.spinner);             //spinner 0..n ?
            label.setText(elemets[position]);

            ImageView icon = (ImageView) row.findViewById(R.id.icon);
//{"Провідник", "Вгору(лівий)", "Вниз(лівий)", "Вгору(правий)", "Вниз(правий)", "Видалити"};
            switch (position)
            {
                case 0 : icon.setImageResource(R.drawable.horizontal_line); break;
                case 1 : icon.setImageResource(R.drawable.left_up); break;
                case 2 : icon.setImageResource(R.drawable.left_down); break;
                case 3 : icon.setImageResource(R.drawable.right_up); break;
                case 4 : icon.setImageResource(R.drawable.right_down); break;
                case 5 : icon.setImageResource(R.drawable.set); break;
            }

            return row;
        }
    }
}
