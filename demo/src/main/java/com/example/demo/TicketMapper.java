package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TicketMapper {
    Ticket getTicketById(Integer id);  // 根据id获取票
    int getTicketNum();  // 获取票数
    List<Ticket> getAllTickets();

    void addTicket(Ticket ticket);

    void updateTicket(Ticket ticket);

    void deleteTicket(int id);
    void sellTicket(int id);  // 卖出一张票

    void refundTicket(int id);  // 退票
}