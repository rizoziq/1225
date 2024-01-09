package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketMapper ticketMapper;
    public Ticket getTicketById(Integer id) {
        return ticketMapper.getTicketById(id);
    }
    public int getTicketNum() {
        return ticketMapper.getTicketNum();
    }

    public List<Ticket> getAllTickets() {
        return ticketMapper.getAllTickets();
    }

    public void addTicket(Ticket ticket){
        ticketMapper.addTicket(ticket);
    };

    public void updateTicket(Ticket ticket){
        ticketMapper.updateTicket(ticket);
    };

    public void deleteTicket(int id){
        ticketMapper.deleteTicket(id);
    };
    public void sellTicket(int id){
        ticketMapper.sellTicket(id);
    };  // 卖出一张票

    public void refundTicket(int id){
        ticketMapper.refundTicket(id);
    };  // 退票
}
