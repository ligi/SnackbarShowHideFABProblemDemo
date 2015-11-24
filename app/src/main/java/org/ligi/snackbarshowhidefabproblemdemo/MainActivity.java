package org.ligi.snackbarshowhidefabproblemdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        findViewById(R.id.show_fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fab.show();
                findViewById(R.id.show_fab).setVisibility(View.GONE);
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                fab.hide();
                findViewById(R.id.show_fab).setVisibility(View.VISIBLE);
            }
        });
    }

}
