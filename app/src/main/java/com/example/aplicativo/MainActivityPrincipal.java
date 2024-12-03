package com.example.aplicativo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivityPrincipal extends AppCompatActivity {

    /*private ListView musicListView;
    private EditText searchEditText;
    private Button searchButton;
    private List<String> musicList;
    private ArrayAdapter<String> musicAdapter;
    private MediaPlayer mediaPlayer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Inicializando os componentes
        musicListView = findViewById(R.id.musicListView);
        searchEditText = findViewById(R.id.searchEditText);
        searchButton = findViewById(R.id.searchButton);

        // Lista de músicas simulada (em um aplicativo real, você pegaria de uma base de dados ou da memória interna)
        musicList = new ArrayList<>();
        musicList.add("Música 1");
        musicList.add("Música 2");
        musicList.add("Música 3");

        // Configurando o Adapter
        musicAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, musicList);
        musicListView.setAdapter(musicAdapter);

        // Ação de pesquisar música
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchQuery = searchEditText.getText().toString().toLowerCase();
                if (searchQuery.isEmpty()) {
                    musicAdapter.getFilter().filter(null);
                } else {
                    musicAdapter.getFilter().filter(searchQuery);
                }
            }
        });

        // Ação de tocar música
        musicListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedSong = musicList.get(position);
                playMusic(selectedSong);
            }
        });

        // Ação de excluir música
        musicListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String songToRemove = musicList.get(position);
                musicList.remove(position);
                musicAdapter.notifyDataSetChanged();
                Toast.makeText(MainActivityPrincipal.this, songToRemove + " excluída.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    // Função para tocar a música
    private void playMusic(String songName) {
        // Para fins de exemplo, vou tocar uma música local de raw com o nome igual ao da música
        int resId = getResources().getIdentifier(songName.toLowerCase().replace(" ", "_"), "raw", getPackageName());
        if (resId != 0) {
            if (mediaPlayer != null) {
                mediaPlayer.release(); // Libera o MediaPlayer anterior
            }
            mediaPlayer = MediaPlayer.create(this, resId);
            mediaPlayer.start();
        } else {
            Toast.makeText(this, "Música não encontrada.", Toast.LENGTH_SHORT).show();
        }
    }

    // Função para compartilhar a música
    private void shareMusic(String songName) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Confira essa música: " + songName);
        startActivity(Intent.createChooser(shareIntent, "Compartilhar música"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }*/
}

