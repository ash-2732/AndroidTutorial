package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.StyledPlayerView;

public class MainActivity extends AppCompatActivity {


    // for video
    ExoPlayer player;
    String videoUrl = "https://video.blender.org/download/videos/3d95fb3d-c866-42c8-9db1-fe82f48ccb95-804.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  ******************* MAIN CODE STARTS HERE *****************************

        StyledPlayerView playerView = findViewById(R.id.playerView);
        player = new ExoPlayer.Builder(MainActivity.this).build();
        playerView.setPlayer( player );
        MediaItem mediaItem = MediaItem.fromUri( videoUrl );
        player.setMediaItem( mediaItem );
        player.prepare();
        player.setPlayWhenReady(true);

    }
    protected void onStop(){
        super.onStop();
        player.setPlayWhenReady( true );
        player.release();
        player = null;
    }
}