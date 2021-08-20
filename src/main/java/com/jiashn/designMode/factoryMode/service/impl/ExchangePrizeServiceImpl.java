package com.jiashn.designMode.factoryMode.service.impl;

import com.jiashn.designMode.factoryMode.service.ExchangePrizeService;
import com.jiashn.designMode.factoryMode.utils.ExchangePrizeFactory;
import com.jiashn.designMode.factoryMode.utils.PrizeEnum;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-20  14:27
 */
@Service
public class ExchangePrizeServiceImpl implements ExchangePrizeService {
    @Override
    public void exchangePrize(String type) {
        PrizeEnum prizeEnum = PrizeEnum.match(type);
        if (Objects.nonNull(prizeEnum)){
            ExchangePrizeFactory prizeFactory = prizeEnum.getPrizeFactory();
            prizeFactory.exchangePrize("10001","20001","30001",new HashMap<>(0));
        }
    }
}
