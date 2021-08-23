package com.jiashn.designmode.adaptermode.utils;

import com.jiashn.designmode.adaptermode.service.AdvancedMediaPlayer;
import com.jiashn.designmode.adaptermode.service.MediaPlayer;
import com.jiashn.designmode.adaptermode.service.impl.Mp4Player;
import com.jiashn.designmode.adaptermode.service.impl.VlcPlayer;

import java.util.Objects;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  19:09
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer mediaPlayer;
    public MediaAdapter(String audioType){
        if (Objects.equals("vlc",audioType)){
            mediaPlayer = new VlcPlayer();
        } else {
            mediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (Objects.equals("vlc",audioType)){
            mediaPlayer.playVlc(fileName);
        } else {
            mediaPlayer.playMp4(fileName);
        }
    }
}
