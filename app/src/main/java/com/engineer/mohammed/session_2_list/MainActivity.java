package com.engineer.mohammed.session_2_list;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    public void onClick(View view){

    }

    ListView myList ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList = (ListView)findViewById(R.id.listView);
        ArrayList<String> myData = new ArrayList<String>();
        for (int i = 0 ; i<10 ; i++)
            myData.add("item"+(i+1));

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String> (getApplicationContext(),R.layout.row_view,R.id.textView,myData);
        myList.setAdapter(myAdapter);
    }



}
