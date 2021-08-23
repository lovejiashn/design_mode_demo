package com.jiashn.designmode.adaptermode.service;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  18:58
 */
public interface AdvancedMediaPlayer {

    /**
     * 播放Vlc格式文件
     * @param fileName 文件名称
     */
    void playVlc(String fileName);

    /**
     * 播放MP4格式文件
     * @param fileName 文件名称
     */
    void playMp4(String fileName);
}
