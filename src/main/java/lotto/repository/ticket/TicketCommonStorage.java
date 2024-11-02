package lotto.repository.ticket;

import java.util.concurrent.ConcurrentHashMap;
import lotto.domain.ticket.Ticket;

class TicketCommonStorage {
    private static final ConcurrentHashMap<Long, Ticket> repository = new ConcurrentHashMap<>();

    private TicketCommonStorage() {
    }

    public static ConcurrentHashMap<Long, Ticket> getRepository() {
        return repository;
    }

}