package top.upcjoker.payment.service;

import java.util.Map;

public interface PaymentInfoService {

    void createPaymentInfo(String plainText);

    void createPaymentInfoForAliPay(Map<String, String> params);
}
