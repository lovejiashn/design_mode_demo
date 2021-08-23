package com.jiashn.designmode.adaptermode.service.impl;

import com.jiashn.designmode.adaptermode.entity.CreateAccount;
import com.jiashn.designmode.adaptermode.service.AdapterModeService;
import com.jiashn.designmode.adaptermode.utils.MQAdapter;
import com.jiashn.designmode.adaptermode.utils.MediaAdapter;
import com.jiashn.designmode.adaptermode.utils.RebateInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  17:14
 */
@Service
public class AdapterModeServiceImpl implements AdapterModeService {

    private static final Logger logger = LoggerFactory.getLogger(AdapterModeServiceImpl.class);

    @Override
    public void adapterMode() {
        try{
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = s.parse("2020-06-01 23:20:16");
            CreateAccount account = new CreateAccount();
            account.setAccountNum("10001")
                    .setAccountDate(parse)
                    .setAddress("广州黄村")
                    .setDesc("测试11110");
            logger.info("----创建用户MQ:{}",account);
            Map<String, String> linkMap = new HashMap<>();
            linkMap.put("userId","accountNum");
            linkMap.put("bizId","accountNum");
            linkMap.put("bizTime","accountDate");
            linkMap.put("desc","desc");
            RebateInfo adapter = MQAdapter.adapter(account.toString(), linkMap);
            logger.info("----适配器转换后:{}",adapter);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("程序报错:{}",e.getMessage());
        }

    }

    @Override
    public void playerAdapterModeTest(String type, String fileName) {
        if (Objects.equals(type,"mp3")){
            logger.info("mp3 Player:{}",fileName);
        } else if (Objects.equals(type,"vlc") || Objects.equals(type,"mp4")){
            MediaAdapter mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type,fileName);
        } else {
            logger.info("不支持该文件格式:{}",type);
        }
    }
}
