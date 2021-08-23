package com.jiashn.designmode.adaptermode.service;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  17:13
 */
public interface AdapterModeService {
    /**
     * 适配器测试
     */
    void adapterMode();

    /**
     * 适配播放器
     * @param type 文件类型
     * @param fileName 文件名称
     */
    void playerAdapterModeTest(String type,String fileName);
}
