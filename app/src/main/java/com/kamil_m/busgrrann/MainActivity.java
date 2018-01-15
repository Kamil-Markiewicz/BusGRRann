package com.kamil_m.busgrrann;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadLayout();
    }

    private void loadLayout(){
        //Date entry
        TextView textDate = (TextView)findViewById(R.id.text);
        textDate.setText("Choose date:");

        EditText editDate = (EditText)findViewById(R.id.edit);

        //Origin entry
        TextView textOrigin = (TextView)findViewById(R.id.text2);
        textOrigin.setText("Enter Origin:");

        EditText editOrigin = (EditText)findViewById(R.id.edit2);

        //Destination entry
        TextView textDest = (TextView)findViewById(R.id.text3);
        textDest.setText("Enter Destination:");

        EditText editDest = (EditText)findViewById(R.id.edit3);

        //Transport entry
        TextView textTransport = (TextView)findViewById(R.id.text4);
        textTransport.setText("Enter Transport:");

        EditText editTransport = (EditText)findViewById(R.id.edit4);
    }
}
