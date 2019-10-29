package com.example.quizjani;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FamilyAdapter adapter;
    private ArrayList<family>familyArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = findViewById(R.id.recycleview);
        adapter = new FamilyAdapter(familyArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        familyArrayList = new ArrayList<>();
        //mahasiswaArrayList.add(new Mahasiswa(getDrawable(R.drawable.ten),));

        familyArrayList.add(new family(getDrawable(R.drawable.bapakaku),"Ronald Agustin Pahala Purba", "Ayah", "Menikah"));
        familyArrayList.add(new family(getDrawable(R.drawable.mamakaku),"Umi Asiyah", "Ibu", "Menikah"));
        familyArrayList.add(new family(getDrawable(R.drawable.kakakaku),"Vanny Omaretta Purba", "Kakak", "Menikah"));
        familyArrayList.add(new family(getDrawable(R.drawable.abangaku),"Pramaju Heru Wijaya Purba", "Abang", "Lajang"));
        familyArrayList.add(new family(getDrawable(R.drawable.diriku),"Janico Desmile Purba", "Diri Sensiri", "Lajang"));
    }
}
