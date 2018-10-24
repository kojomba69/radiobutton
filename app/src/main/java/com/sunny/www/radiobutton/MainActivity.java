package com.sunny.www.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickWidget(View view){
        int id = view.getId();
        String text = ((RadioButton)view).getText().toString();
        switch (id){
            case R.id.radiobutton01:
                text = text+"-"+((RadioButton)view).isChecked(); break;
            case R.id.radiobutton02:
                text = text+"-"+((RadioButton)view).isChecked(); break;
                default:
                    text ="Noting!";

        }
        Toast.makeText(view.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
