package com.harderue.s.company.m1_poduct_list;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Product> productList = new ArrayList<>(); //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.githubBtn2).setOnClickListener(view -> {
            Log.i("test", "onCreate: Test click");
            String url = "https://github.com/HarderueStud/JAVA-M1-Product-List";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        productList.add(new Product(1, "Apple", "Description du produit 1 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod augue pellentesque neque semper, vel interdum magna convallis. Duis fringilla lacus ac mi tristique, ut porta risus pharetra.", R.drawable.apple));
        productList.add(new Product(2, "Carrot", "Description du produit 2 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod augue pellentesque neque semper, vel interdum magna convallis. Duis fringilla lacus ac mi tristique, ut porta risus pharetra.", R.drawable.carrot));
        productList.add(new Product(2, "Watermelon", "Description du produit 3 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod augue pellentesque neque semper, vel interdum magna convallis. Duis fringilla lacus ac mi tristique, ut porta risus pharetra.", R.drawable.watermelon));
        productList.add(new Product(2, "Eggplant", "Description du produit 4 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod augue pellentesque neque semper, vel interdum magna convallis. Duis fringilla lacus ac mi tristique, ut porta risus pharetra.", R.drawable.eggplant));

        /* */
        productList.add(new Product(1, "Apple", "Description du produit 5 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod augue pellentesque neque semper, vel interdum magna convallis. Duis fringilla lacus ac mi tristique, ut porta risus pharetra.", R.drawable.apple));
        productList.add(new Product(2, "Carrot", "Description du produit 6 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod augue pellentesque neque semper, vel interdum magna convallis. Duis fringilla lacus ac mi tristique, ut porta risus pharetra.", R.drawable.carrot));
        productList.add(new Product(2, "Watermelon", "Description du produit 7 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod augue pellentesque neque semper, vel interdum magna convallis. Duis fringilla lacus ac mi tristique, ut porta risus pharetra.", R.drawable.watermelon));
        productList.add(new Product(2, "Eggplant", "Description du produit 8 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod augue pellentesque neque semper, vel interdum magna convallis. Duis fringilla lacus ac mi tristique, ut porta risus pharetra.", R.drawable.eggplant));

        RecyclerView recyclerView = findViewById(R.id.productRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ProductAdapter adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);
    }
}