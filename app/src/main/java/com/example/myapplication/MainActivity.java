package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.StyledPlayerView;

public class MainActivity extends AppCompatActivity {


    // for video
    ExoPlayer player;
    String videoUrl = "https://video.blender.org/download/videos/3d95fb3d-c866-42c8-9db1-fe82f48ccb95-804.mp4";

    private EditText takeLink;
    private Button startVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  ******************* MAIN CODE STARTS HERE *****************************

        takeLink = findViewById(R.id.takeLink);
        startVideo = findViewById(R.id.startVideo);

        startVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = takeLink.getText().toString();
                Intent intent = new Intent(MainActivity.this , VideoPlayerActivity.class);
                intent.putExtra("keylink" , link);
                startActivity( intent );
            }
        });


    }

}