package com.hmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmall.domain.dto.PayApplyDTO;
import com.hmall.domain.dto.PayOrderFormDTO;

/**
 * <p>
 * 支付订单 服务类
 * </p>
 *
 * @author itheima
 * @since 2025-08-08
 */
public interface IPayOrderService extends IService<PayOrder> {

    String applyPayOrder(PayApplyDTO applyDTO);

    void tryPayOrderByBalance(PayOrderFormDTO payOrderFormDTO);
}
