package com.example.nico.nicoalmansya_1202152181_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> mTitleList = new LinkedList<>(); //Membuat list title berupa string
    private final LinkedList<String> mSubTitleList = new LinkedList<>(); //Membuat list subtitle berupa string
    private final LinkedList<Integer> mBackgroundList = new LinkedList<>(); //Membuat list background berupa integer
    private int mCount = 0;
    private RecyclerView mRecyclerView;
    private ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data();//isi data pada RecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview); //Membuat adapter dan menampilkan data
        mAdapter = new ListAdapter(this, mTitleList, mSubTitleList, mBackgroundList);  // Menhubungkan adapter dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount)); //Menentukan layout pada recyclerview
    }

    private void Data(){ //berisi data pada LinkedList
        String brands[] = {"Ades","Amidis", "Aqua", "Cleo", "Club", "Equil", "Evian", "Le Minerale", "Nestle", "Pristine", "Vit"}; //Isi dari tittle

        for (String brand: brands) { //isi dari subtitle
            mTitleList.addLast(brand);
            mSubTitleList.addLast("Ini adalah air minum merk "+brand);
        }

        mBackgroundList.addLast(R.drawable.ades);      //isi gambar background
        mBackgroundList.addLast(R.drawable.amidis);
        mBackgroundList.addLast(R.drawable.aqua);
        mBackgroundList.addLast(R.drawable.cleo);
        mBackgroundList.addLast(R.drawable.club);
        mBackgroundList.addLast(R.drawable.equil);
        mBackgroundList.addLast(R.drawable.evian);
        mBackgroundList.addLast(R.drawable.leminerale);
        mBackgroundList.addLast(R.drawable.nestle);
        mBackgroundList.addLast(R.drawable.pristine);
        mBackgroundList.addLast(R.drawable.vit);
    }
}
