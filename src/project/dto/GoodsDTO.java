package project.dto;

import java.util.ArrayList;
import java.util.List;

public class GoodsDTO {
    public static List<GoodsDTO> goodsDTOList = new ArrayList<>();
    private Long productId;
    private String productName;
    private int price;
    private int quantity;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void GoodsLiquidAdd(){
        GoodsDTO goodsDTO1 = new GoodsDTO("알로에베라", 28000, 100);
        GoodsDTO goodsDTO2 = new GoodsDTO("라임소다", 28000, 100);
        GoodsDTO goodsDTO3 = new GoodsDTO("체리밤", 28000, 100);
        GoodsDTO goodsDTO4 = new GoodsDTO("라스트베리", 28000, 100);
        goodsDTOList.add(goodsDTO1);
        goodsDTOList.add(goodsDTO2);
        goodsDTOList.add(goodsDTO3);
        goodsDTOList.add(goodsDTO4);
    }

    public GoodsDTO() {
    }

    public static Long productIdValue = 1L;

    public GoodsDTO(String productName, int price, int quantity) {
        this.productId = productIdValue;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "GoodsDTO{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
