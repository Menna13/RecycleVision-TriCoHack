package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RecycleInput extends AppCompatActivity {
    EditText etNum;
    Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_input);
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        etNum = findViewById(R.id.etNum);
        btnEnter = findViewById(R.id.btnEnter);
/*      etPop = findViewById(R.id.etPop);
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.relativelayout);
        View vi = inflater.inflate(R.layout.popup_window, null); //log.xml is your file.
        TextView tv = (TextView)vi.findViewById(R.id.etPop);
        tv.setText("hELLLLOO");*/

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            displayInfo();
//            onButtonShowPopupWindowClick(view);
            }
        });

    }

    private void displayInfo() {
        String num = etNum.getText().toString();
        Intent i = new Intent(this, RecycleInfo.class);
        i.putExtra("number", num);
        startActivity(i);
    }




/*

   public void onButtonShowPopupWindowClick(View view) {

        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.popup_window, null);


        // create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
        // show the popup window
        // which view you pass in doesn't matter, it is only used for the window tolken
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        // dismiss the popup window when touched
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    */
}

