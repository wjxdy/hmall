package com.hmall.trade.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmall.api.domain.po.Order;
import com.hmall.trade.domain.dto.OrderFormDTO;

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
