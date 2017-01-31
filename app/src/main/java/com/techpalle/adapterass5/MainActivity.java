package com.techpalle.adapterass5;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    String[] arr={"google","facebook","youtube","skillgun","gmail"};
    ArrayAdapter<String>aa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        aa=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        setListAdapter(aa);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("position",position);
        startActivity(intent);
        Toast.makeText(MainActivity.this,"open website"+position,Toast.LENGTH_LONG).show();
        super.onListItemClick(l, v, position, id);
    }
}

