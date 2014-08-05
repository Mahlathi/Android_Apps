package com.example.hub_project1;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    Button btnLog;
    Button btnCancel;
    EditText ussr;
    EditText pssw;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnLog = (Button) findViewById(R.id.btnlogin);
        btnCancel = (Button) findViewById(R.id.btncancel);
        ussr = (EditText) findViewById(R.id.myuser);
        pssw = (EditText) findViewById(R.id.mypass);

        btnLog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if( ussr.getText().toString().equals("Akhona") && pssw.getText().toString().equals("123456"))
                {
                    Intent gohome = new Intent("com.example.hub_project1.HOME");
                    startActivity(gohome);
                }
                else
                {
                    String msg = (String) getText(R.string.message);

                    Toast.makeText( getApplicationContext(), msg, Toast.LENGTH_SHORT ).show();
                }
            }
        });

        btnCancel.setOnClickListener( new View.OnClickListener()
        {
            public void onClick( View v )
            {
                ussr.setText("");
                pssw.setText("");
            }
        });


    }

    protected void onPause()
    {
        super.onPause();
        finish();
    }
}
