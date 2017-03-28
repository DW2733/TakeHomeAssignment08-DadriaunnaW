package com.example.dadriaunna01.takehomeassignment08_dadriaunnaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference makeupbag = database.getReference("makeupbag");
    private DatabaseReference makeuptype = database.getReference("makeuptype");


    private EditText makeupType;
    private EditText color;
    private EditText size;
    private CheckBox designer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeupType = (EditText) findViewById(R.id.makeup_type);
        color = (EditText) findViewById(R.id.color);
        size = (EditText) findViewById(R.id.size);
        designer = (CheckBox) findViewById(R.id.designer);
    }


    public void setMakeup(View view) {

        String myMakeupBag = makeupType.getText().toString();
        makeupbag.setValue(new String(myMakeupBag));
    }

    public void addMakeUpBag(View view) {
        String newColor = color.getText().toString();
        String newSize = size.getText().toString();
        int sizeType = Integer.parseInt(newSize);
        boolean quality;
        quality = designer.isChecked();

        makeuptype.push().setValue(new Makeup(newColor, sizeType, quality));
    }
}
