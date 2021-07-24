package com.study.strategy.factory;

import com.study.strategy.NormalPayCalculationStrategy;
import com.study.strategy.PayCalculationStrategy;
import com.study.strategy.PlatinumVipCalculationStrategy;
import com.study.strategy.VipPayCalculationStrategy;

import java.util.HashMap;
import java.util.Map;

public class CalculationFactory {

    private static Map<String, PayCalculationStrategy> map = new HashMap<String, PayCalculationStrategy>();

    static {
        map.put("vip", new VipPayCalculationStrategy());
        map.put("normal", new NormalPayCalculationStrategy());
        map.put("platinum", new PlatinumVipCalculationStrategy());
    }

    public PayCalculationStrategy getPayCalculation(String type) {
        return map.get(type);
    }

}
