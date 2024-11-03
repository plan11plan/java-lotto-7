package lotto.application.ticket.domain.ticket;

import java.util.List;

public class Ticket {
    private final Long id;
    private final Lottos lottos;

    private Ticket(Long id, Lottos lottos) {
        this.id = id;
        this.lottos = lottos;
    }

    public static Ticket issue(Long id, Lottos lottos) {
        validate(id, lottos);
        return new Ticket(id, lottos);
    }

    public Long getId() {
        return id;
    }

    public Lottos getLottos() {
        return lottos;
    }

    public List<List<Integer>> getLottosValue() {
        return lottos.getValue();
    }

    public int getLottosSize() {
        return lottos.getLottosSize();
    }

    private static void validate(Long id, Lottos lottos) {
        validateId(id);
        validateLottos(lottos);
    }

    private static void validateId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("[ERROR] 티켓 ID는 null일 수 없습니다.");
        }
    }

    private static void validateLottos(Lottos lottos) {
        if (lottos == null) {
            throw new IllegalArgumentException("[ERROR] 로또 목록은 null일 수 없습니다.");
        }
    }

}