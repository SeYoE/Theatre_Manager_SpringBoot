package com.tangerine.theatre_manager.ticket.order.service.dto;

import com.tangerine.theatre_manager.ticket.order.vo.Email;
import com.tangerine.theatre_manager.ticket.order.vo.TicketOrderStatus;
import com.tangerine.theatre_manager.ticket.service.model.Ticket;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class TicketOrderParam {
    private UUID orderId;
    private Email email;
    private LocalDate orderedAt;
    private TicketOrderStatus ticketOrderStatus;
    private List<Ticket> tickets;

    public TicketOrderParam(
            UUID orderId,
            Email email,
            LocalDate orderedAt,
            TicketOrderStatus ticketOrderStatus,
            List<Ticket> tickets
    ) {
        this.orderId = orderId;
        this.email = email;
        this.orderedAt = orderedAt;
        this.ticketOrderStatus = ticketOrderStatus;
        this.tickets = tickets;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public LocalDate getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDate orderedAt) {
        this.orderedAt = orderedAt;
    }

    public TicketOrderStatus getTicketOrderStatus() {
        return ticketOrderStatus;
    }

    public void setTicketOrderStatus(TicketOrderStatus ticketOrderStatus) {
        this.ticketOrderStatus = ticketOrderStatus;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

}