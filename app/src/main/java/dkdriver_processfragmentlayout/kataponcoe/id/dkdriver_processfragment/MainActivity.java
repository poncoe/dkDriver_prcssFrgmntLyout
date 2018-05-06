package dkdriver_processfragmentlayout.kataponcoe.id.dkdriver_processfragment;

import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    /**
     * Called when the activity is first created.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_toolbar);

        TabHost tabHost = getTabHost();

        // Tab untuk Home
        TabHost.TabSpec part1spec = tabHost.newTabSpec("Proses 1");
        part1spec.setIndicator("Proses 1");
        Intent Part1Intent = new Intent(this, ProsesActivity.class);
        part1spec.setContent(Part1Intent);

        // Tab untuk Proses
        TabHost.TabSpec part2spec = tabHost.newTabSpec("Proses 2");
        part2spec.setIndicator("Proses 2");
        Intent Part2Intent = new Intent(this, ProsesActivity.class);
        part2spec.setContent(Part2Intent);

        // Tab untuk Done
        TabHost.TabSpec part3spec = tabHost.newTabSpec("Proses 3");
        part3spec.setIndicator("Proses 3");
        Intent Part3Intent = new Intent(this, ProsesActivity.class);
        part3spec.setContent(Part3Intent);

        // Tab untuk Log
        TabHost.TabSpec part4spec = tabHost.newTabSpec("Proses 4");
        part4spec.setIndicator("Proses 4");
        Intent Part4Intent = new Intent(this, ProsesActivity.class);
        part4spec.setContent(Part4Intent);

        tabHost.addTab(part1spec); // buat nambahin Home
        tabHost.addTab(part2spec); // buat nambahin Proses
        tabHost.addTab(part3spec); // buat nambahin Done
        tabHost.addTab(part4spec); // buat nambahin Log
    }

    public void onBackPressed() {
        finish();//Pergi ke method exit
    }
}