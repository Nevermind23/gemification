package d71;

import j71.C36758j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.transportcard.data.model.TransportCardPassTypeApiModel;

/* renamed from: d71.e */
public final class C31548e {
    /* renamed from: a */
    public final List mo71951a(List list) {
        C41536l.m120489i(list, "passTypeApiModel");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TransportCardPassTypeApiModel transportCardPassTypeApiModel = (TransportCardPassTypeApiModel) it.next();
            arrayList.add(new C36758j(transportCardPassTypeApiModel.getTypeId(), transportCardPassTypeApiModel.getPrice(), transportCardPassTypeApiModel.getTypeCode(), transportCardPassTypeApiModel.getTitle(), transportCardPassTypeApiModel.isDefault()));
        }
        return arrayList;
    }
}
