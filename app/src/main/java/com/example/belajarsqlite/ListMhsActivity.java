package com.example.belajarsqlite;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ListMhsActivity extends AppCompatActivity {
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    MhsAdapter mhsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmhs);

        //ListView lvNama = (ListView) findViewById(R.id.lvNama);
        // Zalfa Destian Ramadhani
        // G.211.20.0076
        // Kelas A2
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        ArrayList<MhsModel> mhsList = getIntent().getExtras().getParcelableArrayList("mhsList");

// Zalfa Destian Ramadhani
// G.211.20.0076
// Kelas A2

        mhsAdapter = new MhsAdapter(mhsList, new MhsAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick (ArrayList<MhsModel> mhsList, int position) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(ListMhsActivity.this);
                dialog.setTitle("Pilihan");
                dialog.setItems(new CharSequence[]{"Hapus", "Edit"}, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int item) {

                        DbHelper db = new DbHelper(getApplicationContext());
                        MhsModel mm = mhsList.get(position);
                        // Zalfa Destian Ramadhani
                        // G.211.20.0076
                        // Kelas A2
                        switch (item){
                            case 0:

                                boolean stts = db.hapus(mm.getId());
                                if(stts){
                                    mhsAdapter.removeItem(position);
                                    Toast.makeText(getApplicationContext(), "Data Berhasil Dihapus", Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 1:
                                Intent intent_main = new Intent(ListMhsActivity.this, MainActivity.class);
                                intent_main.putExtra("mhsData", mm);

                                startActivity(intent_main);
                                break;
                        }
                    }
                });
                dialog.create().show();
            }
        });
// Zalfa Destian Ramadhani
// G.211.20.0076
// Kelas A2
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ListMhsActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mhsAdapter);

        FloatingActionButton fabTambah = findViewById(R.id.fabTambah);
        fabTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListMhsActivity.this, MainActivity.class));
            }
        });
// Zalfa Destian Ramadhani
// G.211.20.0076
// Kelas A2

        //if(mhsList.isEmpty()) {
        //    mhsList.add("Data Masih Kosong");
        //}
        //ArrayAdapter<String> ad_nama = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mhsList);
        //
        //lvNama.setAdapter(ad_nama);

// Zalfa Destian Ramadhani
// G.211.20.0076
// Kelas A2
    }
}
