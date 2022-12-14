package com.example.demo3.model;

import com.example.demo3.dto.CartDto;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.List;

public class CartCost {
    private List<CartDto> cartItems;
    private double totalCost;

    public CartCost(List<CartDto> cartDtoList, double totalCost){
        this.cartItems = cartDtoList;
        this.totalCost = totalCost;
    }

    public List<CartDto> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartDto> cartItems) {
        this.cartItems = cartItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "CartCost{" +
                "cartItems=" + cartItems + //this how to print  List items??
                ", totalCost=" + totalCost +
                '}';
    }
}
