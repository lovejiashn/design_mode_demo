package com.jiashn.designmode.adaptermode.service.impl;

import com.jiashn.designmode.adaptermode.service.AdvancedMediaPlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  19:03
 */
public class Mp4Player implements AdvancedMediaPlayer {
    private static final Logger logger = LoggerFactory.getLogger(Mp4Player.class);

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName){
        logger.info("Mp4 Player:{}",fileName);
    }
}
