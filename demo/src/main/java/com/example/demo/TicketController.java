package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;
    @GetMapping("/{id}")
    public Ticket getTicketStock(@PathVariable("id") Integer id) {
        return ticketService.getTicketById(id);
    }
    @GetMapping("/getNum")
    public int getNum() {
        return ticketService.getTicketNum();
    }

    @GetMapping("/submit-order/{id}")
    public ResponseEntity<?> submitOrder(@PathVariable int id) {
        Ticket ticket = ticketService.getTicketById(id);
        if (ticket != null && ticket.getNum() > 0) {
            ticketService.sellTicket(id);
            return ResponseEntity.ok("订单处理成功.");
        }
        else {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("订单处理失败: 库存不足.");
        }
    }
    @GetMapping("/{id}/stock")
    public ResponseEntity<Ticket> getTicketStock(@PathVariable int id) {
        Ticket ticket = ticketService.getTicketById(id);
        if (ticket != null) {
            return ResponseEntity.ok(ticket);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
