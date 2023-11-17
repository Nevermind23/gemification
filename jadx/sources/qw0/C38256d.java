package qw0;

import jg1.C41452l;
import nw0.C37488c;
import p341ge.bog.mobilebank.eventbus.events.OperationHistoryEvent;
import p341ge.bog.mobilebank.eventbus.events.PaymentDebtEvent;
import r90.C27950a;

/* renamed from: qw0.d */
public class C38256d extends C38254c {

    /* renamed from: g */
    public OperationHistoryEvent f91746g;

    /* renamed from: h */
    public String f91747h;

    public C38256d(C37488c cVar) {
        super(cVar);
    }

    @C41452l
    public void onDebtResponse(PaymentDebtEvent paymentDebtEvent) {
        if (paymentDebtEvent != this.f91740a && paymentDebtEvent.getInstance() == this.f91742c) {
            this.f91740a = paymentDebtEvent;
            int state = paymentDebtEvent.getState();
            if (state == 10) {
                this.f91742c.onLoading(false);
            } else if (state == 20) {
                this.f91742c.onDebtEventSuccess(paymentDebtEvent);
            } else if (state == 30) {
                this.f91742c.onNetworkError();
            } else if (state == 40) {
                ((C37488c) this.f91742c).mo90628d(C27950a.m86286c(paymentDebtEvent.getErrorKey(), false));
            }
        }
    }

    @C41452l
    public void onOperationHistory(OperationHistoryEvent operationHistoryEvent) {
        String str;
        if (this.f91746g != operationHistoryEvent && (str = this.f91747h) != null && str.equals(operationHistoryEvent.getEssId())) {
            this.f91746g = operationHistoryEvent;
            int state = operationHistoryEvent.getState();
            if (state == 10) {
                this.f91742c.onLoading(false);
            } else if (state == 20) {
                ((C37488c) this.f91742c).mo90629g(operationHistoryEvent);
            } else if (state == 30 || state == 40) {
                this.f91742c.onNetworkError();
            }
        }
    }
}
