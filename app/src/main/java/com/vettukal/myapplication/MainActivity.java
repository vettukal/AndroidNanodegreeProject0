package com.vettukal.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

    public void launchSpotify(View view){

        Toast.makeText(this,"Launching Spotify", Toast.LENGTH_LONG).show();
    }

    public void launchScore(View view){
        Toast.makeText(this,"Launching Scores", Toast.LENGTH_LONG).show();
    }

    public void launchLibrary(View view){
        Toast.makeText(this,"Launching Library", Toast.LENGTH_LONG).show();
    }

    public void launchBuildBigger(View view){
        Toast.makeText(this,"Launching Build it bigger", Toast.LENGTH_LONG).show();
    }

    public void launchXyz(View view){
        Toast.makeText(this,"Launching xyz", Toast.LENGTH_LONG).show();
    }

    public void launchCapstone(View view){
        Toast.makeText(this,"Launching Capstone", Toast.LENGTH_LONG).show();
    }
}
