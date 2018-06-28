package com.example.android.libgdxgame;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.igalata.bubblepicker.BubblePickerListener;
import com.igalata.bubblepicker.model.PickerItem;
import com.igalata.bubblepicker.rendering.BubblePicker;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BubblePicker bubblePicker;
    String[] name={
            "5",
            "10",
            "15"
    };
    int[] images = {
            R.drawable.red,
            R.drawable.blue,
            R.drawable.black

    };
    int[] colors={
            Color.parseColor("#FF0000"),
            Color.parseColor("#0000FF"),
            Color.parseColor("#000000")


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bubblePicker = findViewById(R.id.bubble);
        ArrayList<PickerItem> listItems = new ArrayList<>();
        for(int i = 0; i<name.length;i++)
        {
            PickerItem item = new PickerItem(name[i], colors[i], Color.WHITE,getDrawable(images[i]));
            listItems.add(item);
        }
        bubblePicker.setItems(listItems);
        bubblePicker.setListener(new BubblePickerListener() {
            @Override
            public void onBubbleSelected(PickerItem pickerItem) {
                Toast.makeText(getApplicationContext(),""+pickerItem.getTitle()+"+", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onBubbleDeselected(PickerItem pickerItem) {
                Toast.makeText(getApplicationContext(), ""+pickerItem.getTitle()+"+", Toast.LENGTH_SHORT).show();

            }
        });
    }


}
