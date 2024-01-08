package com.example.wekidifood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.wekidifood.Adapters.AllTenatADapter;
import com.example.wekidifood.Adapters.ExclusiveAdapter;
import com.example.wekidifood.Adapters.OffersAdapters;
import com.example.wekidifood.models.AllTenantModel;
import com.example.wekidifood.models.ExclusiveModel;
import com.example.wekidifood.models.OffersModel;

import java.util.ArrayList;
import java.util.List;

public class ShoppingActivity extends AppCompatActivity {

    RecyclerView recyclerViewOffers;
    List<OffersModel> offersModels;
    OffersAdapters offersAdapters;

    RecyclerView recyclerViewExclusive;
    List<ExclusiveModel> exclusiveModels;
    ExclusiveAdapter exclusiveAdapter;

    RecyclerView recyclerViewAllTenant;
    List<AllTenantModel> allTenantModels;
    AllTenatADapter allTenatADapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        getOffers();
        getAllExclusive();

        getAllTenatsData();
    }

    private void getAllExclusive() {
        recyclerViewExclusive = findViewById(R.id.rec_shop);
        recyclerViewExclusive.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewExclusive.setHasFixedSize(true);

        exclusiveModels = new ArrayList<>();
        exclusiveModels.add(new ExclusiveModel(R.drawable.food1));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food2));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food3));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food4));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food1));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food2));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food3));
        exclusiveModels.add(new ExclusiveModel(R.drawable.food4));

        exclusiveAdapter = new ExclusiveAdapter(exclusiveModels);
        recyclerViewExclusive.setAdapter(exclusiveAdapter);
    }


    private void getAllTenatsData() {
        recyclerViewAllTenant = findViewById(R.id.rec_shop);
        recyclerViewAllTenant.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewAllTenant.setHasFixedSize(true);

        allTenantModels = new ArrayList<>();
        allTenantModels.add(new AllTenantModel(R.drawable.food4));
        allTenantModels.add(new AllTenantModel(R.drawable.food3));
        allTenantModels.add(new AllTenantModel(R.drawable.food2));
        allTenantModels.add(new AllTenantModel(R.drawable.food1));
        allTenantModels.add(new AllTenantModel(R.drawable.food4));
        allTenantModels.add(new AllTenantModel(R.drawable.food3));
        allTenantModels.add(new AllTenantModel(R.drawable.food2));
        allTenantModels.add(new AllTenantModel(R.drawable.food1));

        allTenatADapter = new AllTenatADapter(allTenantModels);
        recyclerViewAllTenant.setAdapter(allTenatADapter);
    }

    private void getOffers() {

        recyclerViewOffers = findViewById(R.id.recyc_offer);
        recyclerViewOffers.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewOffers.setHasFixedSize(true);

        offersModels = new ArrayList<>();
        offersModels.add(new OffersModel(R.drawable.img15));
        offersModels.add(new OffersModel(R.drawable.img16));
        offersModels.add(new OffersModel(R.drawable.img19));
        offersModels.add(new OffersModel(R.drawable.img18));
        offersAdapters = new OffersAdapters(offersModels);
        recyclerViewOffers.setAdapter(offersAdapters);



    }
}