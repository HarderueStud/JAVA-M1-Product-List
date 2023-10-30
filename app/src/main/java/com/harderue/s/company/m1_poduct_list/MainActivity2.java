package com.harderue.s.company.m1_poduct_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.githubBtn2).setOnClickListener(view -> {
            Log.i("test", "onCreate: Test click");
            String url = "https://github.com/HarderueStud/JAVA-M1-Product-List";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });


        Intent intent = getIntent();
        if (intent != null) {
            Product product = intent.getParcelableExtra("product");

            if (product != null) {
                TextView productName = findViewById(R.id.productNameText);
                TextView productDescription = findViewById(R.id.productDescriptionText);
                ImageView productImage = findViewById(R.id.productIcon);

                productName.setText(product.getName());
                productDescription.setText(product.getDescription());
                productImage.setImageResource(product.getImageResource());
            }
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}