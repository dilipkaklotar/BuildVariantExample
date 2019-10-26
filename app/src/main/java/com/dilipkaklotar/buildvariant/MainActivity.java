package com.dilipkaklotar.buildvariant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textType = (TextView)findViewById(R.id.text_type);

        if(Constants.branch == Constants.Branch.MASTER)
        {
            textType.setText(getResources().getString(R.string.master_branch));
        }
        else if(Constants.branch == Constants.Branch.DEVELOPER){
            textType.setText(getResources().getString(R.string.developer_branch));
        }
    }
}
