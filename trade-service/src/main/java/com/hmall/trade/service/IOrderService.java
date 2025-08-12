package com.hmall.trade.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmall.api.domain.dto.OrderFormDTO;
import com.hmall.api.domain.po.Order;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author itheima
 * @since 2025-08-08
 */
public interface IOrderService extends IService<Order> {

    Long createOrder(OrderFormDTO orderFormDTO);

    void markOrderPaySuccess(Long orderId);
}
