package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.productconfirmation.entity.PendingProductConfirmationEntity;
import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.PendingProductConfirmationsEvent */
public final class PendingProductConfirmationsEvent extends RootEvent {
    public List<PendingProductConfirmationEntity> result;

    public final List<PendingProductConfirmationEntity> getResult() {
        List<PendingProductConfirmationEntity> list = this.result;
        if (list != null) {
            return list;
        }
        C41536l.m120506z("result");
        return null;
    }

    public final void setResult(List<PendingProductConfirmationEntity> list) {
        C41536l.m120489i(list, "<set-?>");
        this.result = list;
    }
}
