package com.example.user.mumsday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.support.design.widget.Snackbar;
import android.widget.TextView;
import android.widget.Toast;

import org.parceler.Parcels;

import java.util.List;

public class GiftItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gift_item);
    }

    //this method is called when the next button is called
    public void next(View view) {

        if (isAnyOptionChoosen()) {
            //an option is choosen continue

//            RadioButton handbag = findViewById(R.id.optionA);
//            boolean hanbagChecked = handbag.isChecked();
//
//
//            RadioButton earing = findViewById(R.id.optionB);
//            boolean earingChecked = earing.isChecked();
//
//            RadioButton sandals = findViewById(R.id.optionC);
//            boolean sandalsChecked = sandals.isChecked();
//
//            RadioButton wristwatch = findViewById(R.id.optionD);
//            boolean wristwatchChecked = wristwatch.isChecked();
//
            String itemName = "";
            int itemImage = 1;
            //todo: 1 check which item the user selected
            RadioGroup radioGroup = findViewById(R.id.radiogroup); //get the radiogroup that containes the radio buttons
            int checkedRadioGroupId = radioGroup.getCheckedRadioButtonId(); //get the id of the radio button that was checked
            if(checkedRadioGroupId == R.id.optionA){
                //user choosed handbag
                itemName = "Handbag";
                itemImage = R.drawable.pinky;

            } else if(checkedRadioGroupId == R.id.optionB){
                //user chossed earring
                itemName = "Earing";
                itemImage = R.drawable.pinky;

            }else if(checkedRadioGroupId == R.id.optionC){
                //user chosed sandals
                itemName = "Sandals";
                itemImage = R.drawable.pinky;

            }else if(checkedRadioGroupId == R.id.optionD){
                //user chosed sandals
                itemName = "wristWatch";
                itemImage = R.drawable.pinky;
            }
            //todo: 2 create a variable called name to hold the item name  the user selected
            //todo: 3.create a variable called image to hold the item image the user selected
            //todo: 4. crate and intent and pass the image and name variable to the final activity


            Intent i = new Intent(GiftItemActivity.this, FinalActivity.class);
            i.putExtra("EXTRA_KEY_1", itemName);
            i.putExtra("EXTRA_KEY_2", itemImage);
//            i.putExtra("gift name", sandals.getText().toString());
            startActivity(i);

        }
        else {
            // no option is choosen
            showSnackbar(view, "You have to select an option", "OK");
        }
    }
    /**
     * metthod that checks to see if any option is choosen
     *
     * @return
     */
    public boolean isAnyOptionChoosen() {
        RadioGroup optionsRadioGroup = (RadioGroup) findViewById(R.id.radiogroup);

        // Log.e("TAG", "id" + optionsRadioGroup.getCheckedRadioButtonId());
        if (optionsRadioGroup.getCheckedRadioButtonId() == -1) {

            return false;
        } else {
            return true;
        }
    }

    public void showSnackbar(View view, String message, String actionString) {

        Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                .setAction(actionString, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }).show();
    }

}
