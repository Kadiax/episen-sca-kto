package com.kadiax.episen.daoImpl;

import com.kadiax.episen.dao.OrderDao;
import com.kadiax.episen.model.Order;
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
    private static BufferedWriter writer;
    static {
        FileWriter fw = null;
        try {
            fw = new FileWriter(new File("./tmp/data/orders.txt"), StandardCharsets.UTF_8);
            writer = new BufferedWriter(fw);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Order save(Order order) {
        try {
                writer.write(order.getNom());
                writer.newLine();
                writer.flush();
                //writer.close();

                return order;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
