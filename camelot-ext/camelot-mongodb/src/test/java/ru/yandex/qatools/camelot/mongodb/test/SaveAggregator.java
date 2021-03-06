package ru.yandex.qatools.camelot.mongodb.test;

import ru.yandex.qatools.camelot.api.annotations.Aggregate;
import ru.yandex.qatools.camelot.api.annotations.AggregationKey;
import ru.yandex.qatools.fsm.annotations.FSM;
import ru.yandex.qatools.fsm.annotations.OnTransit;
import ru.yandex.qatools.fsm.annotations.Transit;
import ru.yandex.qatools.fsm.annotations.Transitions;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ilya Sadykov
 * @author Innokenty Shuvalov
 */
@Aggregate
@FSM(start = AtomicInteger.class)
@Transitions(@Transit(on = Integer.class))
public class SaveAggregator {

    @AggregationKey
    public String aggregate(Integer value) {
        return String.valueOf(value);
    }

    @OnTransit
    public void onInteger(AtomicInteger result, Integer value) {
        result.set(value);
    }
}
