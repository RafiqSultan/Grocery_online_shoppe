package com.online.online_grocery_shoppe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar); setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.contactus:
                setContentView(R.layout.activity_contact);
                return true;
            case R.id.home_bar:
                setContentView(R.layout.activity_home);
                return true;

            case R.id.logout:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    //Bottom Bar
    public void goToHome(MenuItem item) {
        Intent intent =new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }

    public void showMyOrder(MenuItem item) {
        Intent intent =new Intent(getApplicationContext(),OrderActivity.class);
        startActivity(intent);
    }

    public void showMyCart(MenuItem item) {
        Intent intent =new Intent(getApplicationContext(),CartActivity.class);
        startActivity(intent);
    }

    public void showGroups(MenuItem item) {
        Intent intent =new Intent(getApplicationContext(),ContactActivity.class);
        startActivity(intent);
    }

    public void goToPayment(View view) {
        Intent intent =new Intent(getApplicationContext(),PaymentActivity.class);
        startActivity(intent);
    }
}