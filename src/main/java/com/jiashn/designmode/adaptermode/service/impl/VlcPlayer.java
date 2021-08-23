package com.jiashn.designmode.adaptermode.service.impl;

import com.jiashn.designmode.adaptermode.service.AdvancedMediaPlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  19:00
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    private static final Logger logger = LoggerFactory.getLogger(VlcPlayer.class);

    @Override
    public void playVlc(String fileName){
        logger.info("Vlc Player : {}",fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
