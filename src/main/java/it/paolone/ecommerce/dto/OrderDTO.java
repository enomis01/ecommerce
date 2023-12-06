package it.paolone.ecommerce.dto;

public class OrderDTO {

    private Long orderId;
    private Long customerId;
    private String orderDate;
    private Long shippingId;
    private Long transactionId;

    public Long getCustomerId() {
        return customerId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public Long getShippingId() {
        return shippingId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setShippingId(Long shippingId) {
        this.shippingId = shippingId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getTransactionId() {
        return transactionId;
    }
}
