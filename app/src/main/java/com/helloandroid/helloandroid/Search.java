package com.helloandroid.helloandroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Search extends ActionBarActivity {
    public final static String EXTRA_SEARCH = "com.helloworld.helloword.SEARCH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Perform search function
     */
    public void performSearch(View view) {
        Intent intent = new Intent(this, SearchResult.class);
        EditText editText = (EditText) findViewById(R.id.search);
        String search = editText.getText().toString();
        intent.putExtra(EXTRA_SEARCH, search);
        startActivity(intent);
    }
}
