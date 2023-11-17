package xo0;

import dp0.C12419a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.linksharing.data.model.P2PAccountApiModel;

/* renamed from: xo0.a */
public final class C18869a {
    /* renamed from: a */
    public final C12419a mo46839a(P2PAccountApiModel p2PAccountApiModel) {
        C41536l.m120489i(p2PAccountApiModel, "p2PAccountApiModel");
        return new C12419a(p2PAccountApiModel.getClientKey(), p2PAccountApiModel.getAcctKey(), p2PAccountApiModel.getAcctNo(), p2PAccountApiModel.getAcctDesc(), p2PAccountApiModel.getProductCode(), C41536l.m120484d(p2PAccountApiModel.getDefaultAcc(), "Y"), p2PAccountApiModel.getAvailableAmount(), p2PAccountApiModel.getCcy(), p2PAccountApiModel.getCardId(), p2PAccountApiModel.getCardClass(), p2PAccountApiModel.getCardType(), p2PAccountApiModel.getSubProductCode(), p2PAccountApiModel.getCardImage().asDomainModel(), p2PAccountApiModel.getCardSmallImage().asDomainModel());
    }

    /* renamed from: b */
    public final List mo46840b(List list) {
        C41536l.m120489i(list, "p2PAccountApiModel");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo46839a((P2PAccountApiModel) it.next()));
        }
        return arrayList;
    }
}
