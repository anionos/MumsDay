package com.example.user.mumsday;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

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
            checkCorrectAnswer();

            RadioButton handbag = findViewById(R.id.optionA);
            boolean hanbagChecked = handbag.isChecked();

            RadioButton earing = findViewById(R.id.optionB);
            boolean earingChecked = earing.isChecked();

            RadioButton sandals = findViewById(R.id.optionC);
            boolean sandalsChecked = sandals.isChecked();

            RadioButton wristwatch = findViewById(R.id.optionD);
            boolean wristwatchChecked = wristwatch.isChecked();

            //this method is called when the next button is called
            Intent intent = new Intent(this, FinalActivity.class);
            startActivity(intent);
            finish();
        } else {
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
    public void checkCorrectAnswer() {

        RadioGroup optionsRadioGroup = (RadioGroup) findViewById(R.id.radiogroup);

        switch (optionsRadioGroup.getCheckedRadioButtonId()) {

        }
    }
}
