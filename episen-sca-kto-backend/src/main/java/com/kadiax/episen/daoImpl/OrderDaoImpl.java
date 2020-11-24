package com.kadiax.episen.daoImpl;

import com.kadiax.episen.dao.OrderDao;
import com.kadiax.episen.model.Order;
import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@Repository
public class  OrderDaoImpl extends OrderDao {
    private static Logger logger = Logger.getLogger(OrderDaoImpl.class);

    @Override
    public Order saveWithLogger(Order order) {
        Order o = null;
        try {
            logger.info(order.getNom());
            o = order;
            return o;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return o;
    }

}
