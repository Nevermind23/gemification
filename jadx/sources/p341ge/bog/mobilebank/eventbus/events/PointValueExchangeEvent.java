package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.KeyValue;

/* renamed from: ge.bog.mobilebank.eventbus.events.PointValueExchangeEvent */
public class PointValueExchangeEvent extends RootEvent {
    public String amount;
    public List<KeyValue> parameter;
    public String serviceProviderId;

    public String getPointValue() {
        try {
            List<KeyValue> list = this.parameter;
            if (list == null) {
                return null;
            }
            for (KeyValue next : list) {
                if ("bonusPoints".equals(next.getKey()) && Integer.valueOf(next.getValue()).intValue() > 0) {
                    return next.getValue();
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
