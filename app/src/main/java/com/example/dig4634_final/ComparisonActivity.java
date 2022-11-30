package com.example.dig4634_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.parceler.Parcels;

public class ComparisonActivity extends AppCompatActivity {
    State stateOne;
    State stateTwo;
    String salary = "";

    TextView stateOneName, stateTwoName;
    TextView stateOneStateTax, stateTwoStateTax;
    TextView stateOneIncomeTax, stateTwoIncomeTax;
    TextView stateOneTakeHomePay, stateTwoTakeHomePay;
    TextView stateOneCOLIndex, stateTwoCOLIndex;
    TextView stateOneHousingIndex, stateTwoHousingIndex;
    TextView stateOneGroceriesIndex, stateTwoGroceriesIndex;
    TextView stateOneUtilitiesIndex, stateTwoUtilitiesIndex;
    TextView stateOneTransportationIndex, stateTwoTransportationIndex;
    TextView stateOneHealthIndex, stateTwoHealthIndex;
    TextView stateOneMiscellaneousIndex, stateTwoMiscellaneousIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison);

        // Components
        stateOneName = findViewById(R.id.stateOneNameTextView);
        stateTwoName = findViewById(R.id.stateTwoNameTextView);
        stateOneStateTax = findViewById(R.id.stateOneStateTaxTextView);
        stateTwoStateTax = findViewById(R.id.stateTwoStateTaxTextView);
        stateOneIncomeTax = findViewById(R.id.stateOneIncomeTaxTextView);
        stateTwoIncomeTax = findViewById(R.id.stateTwoIncomeTaxTextView);
        stateOneTakeHomePay = findViewById(R.id.stateOneTakeHomePayTextView);
        stateTwoTakeHomePay = findViewById(R.id.stateTwoTakeHomePayTextView);
        stateOneCOLIndex = findViewById(R.id.stateOneCostOfLivingTextView);
        stateTwoCOLIndex = findViewById(R.id.stateTwoCostOfLivingTextView);
        stateOneHousingIndex = findViewById(R.id.stateOneHousingIndexTextView);
        stateTwoHousingIndex = findViewById(R.id.stateTwoHousingIndexTextView);
        stateOneGroceriesIndex = findViewById(R.id.stateOneGroceriesIndexTextView);
        stateTwoGroceriesIndex = findViewById(R.id.stateTwoGroceriesIndexTextView);
        stateOneUtilitiesIndex = findViewById(R.id.stateOneUtilitiesIndexTextView);
        stateTwoUtilitiesIndex = findViewById(R.id.stateTwoUtilitiesIndexTextView);
        stateOneTransportationIndex = findViewById(R.id.stateOneTransportationIndexTextView);
        stateTwoTransportationIndex = findViewById(R.id.stateTwoTransportationIndexTextView);
        stateOneHealthIndex = findViewById(R.id.stateOneHealthIndexTextView);
        stateTwoHealthIndex = findViewById(R.id.stateTwoHealthIndexTextView);
        stateOneMiscellaneousIndex = findViewById(R.id.stateOneMiscellaneousIndexTextView);
        stateTwoMiscellaneousIndex = findViewById(R.id.stateTwoMiscellaneousIndexTextView);

        // Passed in states
        stateOne = (State) Parcels.unwrap(getIntent().getParcelableExtra("stateOne"));
        stateTwo = (State) Parcels.unwrap(getIntent().getParcelableExtra("stateTwo"));
        salary = getIntent().getStringExtra("salary");

        // Debugging
//        Log.d("name", "onCreate: " + stateOne.name);
//        Log.d("name", "onCreate: " + stateTwo.name);
//        Log.d("name", "onCreate: $" + salary);

        showData();
    }

    public void showData() {
        // Name
        stateOneName.setText(stateOne.name);
        stateTwoName.setText(stateTwo.name);

        // State Tax
        String string = String.valueOf(stateOne.stateTax) + "%";
        stateOneStateTax.setText(string);
        string = String.valueOf(stateTwo.stateTax) + "%";
        stateTwoStateTax.setText(string);

        // Income Tax
        string = String.valueOf(stateOne.incomeTax) + "%";
        stateOneIncomeTax.setText(string);
        string = String.valueOf(stateTwo.incomeTax) + "%";
        stateTwoIncomeTax.setText(string);

        // Take Home Pay
        Double stateTaxDeduction = (Double.parseDouble(salary)) * (stateOne.stateTax / 100);
        Double incomeTaxDeduction = (Double.parseDouble(salary)) * (stateOne.incomeTax / 100);
        Double takeHomePay = Double.parseDouble(salary) - stateTaxDeduction - incomeTaxDeduction;
        string = "$" + String.valueOf(takeHomePay);
        stateOneTakeHomePay.setText(string);

        stateTaxDeduction = (Double.parseDouble(salary)) * (stateTwo.stateTax / 100);
        incomeTaxDeduction = (Double.parseDouble(salary)) * (stateTwo.incomeTax / 100);
        takeHomePay = Double.parseDouble(salary) - stateTaxDeduction - incomeTaxDeduction;
        string = "$" + String.valueOf(takeHomePay);
        stateTwoTakeHomePay.setText(string);

        // Cost of Living Index
        string = String.valueOf(stateOne.costOfLivingIndex);
        stateOneCOLIndex.setText(string);
        string = String.valueOf(stateTwo.costOfLivingIndex);
        stateTwoCOLIndex.setText(string);

        // Housing index
        string = String.valueOf(stateOne.housingIndex);
        stateOneHousingIndex.setText(string);
        string = String.valueOf(stateTwo.housingIndex);
        stateTwoHousingIndex.setText(string);

        // Groceries index
        string = String.valueOf(stateOne.groceriesIndex);
        stateOneGroceriesIndex.setText(string);
        string = String.valueOf(stateTwo.groceriesIndex);
        stateTwoGroceriesIndex.setText(string);

        // Utilities index
        string = String.valueOf(stateOne.utilitiesIndex);
        stateOneUtilitiesIndex.setText(string);
        string = String.valueOf(stateTwo.utilitiesIndex);
        stateTwoUtilitiesIndex.setText(string);

        // Transportation index
        string = String.valueOf(stateOne.transportationIndex);
        stateOneTransportationIndex.setText(string);
        string = String.valueOf(stateTwo.transportationIndex);
        stateTwoTransportationIndex.setText(string);

        // Health index
        string = String.valueOf(stateOne.healthIndex);
        stateOneHealthIndex.setText(string);
        string = String.valueOf(stateTwo.healthIndex);
        stateTwoHealthIndex.setText(string);

        // Miscellaneous index
        string = String.valueOf(stateOne.miscellaneousIndex);
        stateOneMiscellaneousIndex.setText(string);
        string = String.valueOf(stateTwo.miscellaneousIndex);
        stateTwoMiscellaneousIndex.setText(string);
    }
}