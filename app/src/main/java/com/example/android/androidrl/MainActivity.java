package com.example.android.androidrl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rl;
    Button shang;
    Button xia;
    Button zuo;
    Button you;
    ImageView currButton;
    ImageView start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl = (RelativeLayout) this.findViewById(R.id.rl);
        shang = (Button) this.findViewById(R.id.Shang);
        xia = (Button) this.findViewById(R.id.Xia);
        zuo = (Button) this.findViewById(R.id.Zuo);
        you = (Button) this.findViewById(R.id.You);
        start = (ImageView) this.findViewById(R.id.Start);
        currButton = start;
        shang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText temp = new EditText(MainActivity.this);
                temp.setText("图片说明");
                RelativeLayout.LayoutParams lpl = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 95);
                lpl.addRule(RelativeLayout.ABOVE, currButton.getId());
                lpl.addRule(RelativeLayout.CENTER_HORIZONTAL, currButton.getId());
                rl.addView(temp, lpl);
            }
        });
        xia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText temp = new EditText(MainActivity.this);
                temp.setText("图片说明");
                RelativeLayout.LayoutParams lpl = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 95);
                lpl.addRule(RelativeLayout.BELOW, currButton.getId());
                lpl.addRule(RelativeLayout.CENTER_HORIZONTAL, currButton.getId());
                rl.addView(temp, lpl);
            }
        });

        zuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText temp = new EditText(MainActivity.this);
                temp.setText("图片说明");
                RelativeLayout.LayoutParams lpl = new RelativeLayout.LayoutParams(95, ViewGroup.LayoutParams.WRAP_CONTENT);
                lpl.addRule(RelativeLayout.LEFT_OF, currButton.getId());
                lpl.addRule(RelativeLayout.CENTER_VERTICAL, currButton.getId());
                rl.addView(temp, lpl);
            }
        });

        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText temp = new EditText(MainActivity.this);
                temp.setText("图片说明");
                RelativeLayout.LayoutParams lpl = new RelativeLayout.LayoutParams(95, ViewGroup.LayoutParams.WRAP_CONTENT);
                lpl.addRule(RelativeLayout.RIGHT_OF, currButton.getId());
                lpl.addRule(RelativeLayout.CENTER_VERTICAL, currButton.getId());
                rl.addView(temp, lpl);
            }
        });
    }

}
