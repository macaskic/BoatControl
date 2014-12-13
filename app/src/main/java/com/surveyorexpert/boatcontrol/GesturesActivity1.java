package com.surveyorexpert.boatcontrol;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;




import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.surveyorexpert.boatcontrol.BoatController.SimpleView;


public class GesturesActivity1 extends Activity {

    private TextView tvLoc;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.advert);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.boatmj);
        //    View view = new SandboxView(this, bitmap);
        View view = new SimpleView(this, bitmap);

        //   tvLoc = (TextView)findViewById(R.id.tvLocation);
        //   tvLoc.setText("Hello");
        //   setContentView(R.layout.main);

        setContentView(view);
    }
}