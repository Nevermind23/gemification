package p341ge.bog.mobilebank.eventbus.events;

import g91.C32359z0;
import java.util.ArrayList;
import java.util.Iterator;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;

/* renamed from: ge.bog.mobilebank.eventbus.events.DDSTOListEvent */
public class DDSTOListEvent extends RootEvent {
    private ArrayList<DDSTO> list;

    public ArrayList<DDSTO> getList() {
        return this.list;
    }

    public DDSTO getStoByPaymentId(long j) {
        ArrayList<DDSTO> arrayList = this.list;
        if (arrayList == null) {
            return null;
        }
        Iterator<DDSTO> it = arrayList.iterator();
        while (it.hasNext()) {
            DDSTO next = it.next();
            if (C32359z0.m95598z(Long.valueOf(next.paymentId), Long.valueOf(j))) {
                return next;
            }
        }
        return null;
    }

    public void setList(ArrayList<DDSTO> arrayList) {
        this.list = arrayList;
    }
}
