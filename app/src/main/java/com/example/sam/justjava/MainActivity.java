package com.example.sam.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TextView Quantity;
    private TextView price;
    private Button Order;
    private Button increase;
    private Button decrease;

    int quantity=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Order=findViewById(R.id.btn_order);
        Quantity=findViewById(R.id.tv_quantity);
        price=findViewById(R.id.tv_price);
        increase=findViewById(R.id.btn_increase);
        decrease=findViewById(R.id.btn_decrease);


    }
    public void increment(View view){

        quantity=quantity+1;
        display(quantity);
    }
    public void decrement(View view){

        quantity=quantity-1;
        display(quantity);
    }
    public void SubmitOrder(View view){
        int price=quantity*5;

       String priceMessage="Weekend special: Espresso"+"\n\nCash $"+price;
       priceMessage=priceMessage+"\n\nThank you for buying coffee today!";
       displayMessage(priceMessage);
    }

    public void display(int number){

     Quantity.setText(""+number);
    }

    public void displayPrice(int number){
        price.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.tv_price);
        priceTextView.setText(message);
    }

}

