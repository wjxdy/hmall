package com.hmall.pay.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmall.api.domain.dto.PayApplyDTO;
import com.hmall.api.domain.dto.PayOrderFormDTO;
import com.hmall.api.domain.po.PayOrder;

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
