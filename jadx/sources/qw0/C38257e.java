package qw0;

import jg1.C41452l;
import nw0.C37489d;
import p341ge.bog.mobilebank.eventbus.events.PaymentBatchExecuteEvent;
import r90.C27950a;

/* renamed from: qw0.e */
public class C38257e extends C38256d {
    public C38257e(C37489d dVar) {
        super(dVar);
    }

    @C41452l
    public void onPaymentBatchExecute(PaymentBatchExecuteEvent paymentBatchExecuteEvent) {
        int state = paymentBatchExecuteEvent.getState();
        if (state == 10) {
            this.f91742c.onLoading(false);
        } else if (state == 20) {
            ((C37489d) this.f91742c).mo90630i(paymentBatchExecuteEvent.getResult());
        } else if (state == 30) {
            this.f91742c.onNetworkError();
        } else if (state == 40) {
            this.f91742c.onDataError(C27950a.m86284a(paymentBatchExecuteEvent.getErrorKey()));
        }
    }
}
