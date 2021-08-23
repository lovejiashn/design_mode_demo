package com.jiashn.designmode.adaptermode.service;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  18:55
 */
public interface MediaPlayer {

    /**
     * 播放功能
     * @param audioType 音频格式
     * @param fileName 文件名称
     */
    void play(String audioType,String fileName);
}
