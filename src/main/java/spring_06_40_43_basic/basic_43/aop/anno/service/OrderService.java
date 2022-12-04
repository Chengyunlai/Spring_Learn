package spring_06_40_43_basic.basic_43.aop.anno.service;

import java.util.List;

public interface OrderService {
    // 创建订单
    void createOrder();

    // 删除订单
    void deleteOrderById(String id);

    // 通过ID拿到订单
    String getOrderById(String id);

    // 查询所有的订单
    List<String> findAll();
}
