package com.example.pasgenap_robertlyonistanto_10rpl2_27;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Adapter;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListClubAdapter adapter;
    private RecyclerView rvClub;
    private ArrayList<Club> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvClub = findViewById(R.id.rv_club);
        rvClub.setHasFixedSize(true);

        adapter = new ListClubAdapter(list);

        list.addAll(ClubData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvClub.setLayoutManager(new LinearLayoutManager(this));
        ListClubAdapter listClubAdapter = new ListClubAdapter(list);
        rvClub.setAdapter(listClubAdapter);

        listClubAdapter.setOnItemClickCallback(new ListClubAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Club club) {
                Intent moveIntent = new Intent(MainActivity.this, DetailClubActivity.class);
                moveIntent.putExtra(DetailClubActivity.ITEM_EXTRA, club);
                startActivity(moveIntent);
            }
        });
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 01:
                Snackbar.make(findViewById(R.id.rootId), "Item Deleted", Snackbar.LENGTH_SHORT).show();
                adapter.removeItem(item.getGroupId());
                return true;

            case 02:
                Snackbar.make(findViewById(R.id.rootId), "Favorited", Snackbar.LENGTH_SHORT).show();
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }
}