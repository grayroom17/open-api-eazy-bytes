package com.eazyshop.openapi.controller;

import com.eazyshop.openapi.model.Order;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Order")
@RestController
public class OrderController {

    @PostMapping("/orders")
    public int saveOrderDetails(@RequestBody Order order) {
        int orderId = 1;
        return orderId;
    }

    @GetMapping("/orders")
    public Order getOrderDetails(@RequestParam("orderId") int orderId) {
        Order order = new Order();
        return order;
    }

    @PutMapping("/orders")
    public ResponseEntity<String> updateOrderDetails(@RequestBody Order order) {
        return new ResponseEntity<>("Updated successfully",
                HttpStatus.OK);
    }

    @DeleteMapping("/orders")
    public ResponseEntity<String> deleteOrderDetails(@RequestParam("orderId") int orderId) {
        return new ResponseEntity<>("Deleted successfully",
                HttpStatus.NO_CONTENT);
    }
}
