package p479jk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.LimitSetApiModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.LimitTypeApiModel;
import p563pk.C17378h;
import p563pk.C17380j;

/* renamed from: jk.c */
public final class C16207c {

    /* renamed from: a */
    public static final C16208a f45707a = new C16208a((DefaultConstructorMarker) null);

    /* renamed from: jk.c$a */
    public static final class C16208a {
        private C16208a() {
        }

        public /* synthetic */ C16208a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final C17378h mo43223a(List list) {
        C41536l.m120489i(list, "limits");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LimitTypeApiModel limitTypeApiModel = (LimitTypeApiModel) it.next();
            if (C41536l.m120484d(limitTypeApiModel.getLimitType(), "CCY")) {
                List<LimitSetApiModel> limitSets = limitTypeApiModel.getLimitSets();
                ArrayList arrayList = new ArrayList(C41343r.m119925u(limitSets, 10));
                for (LimitSetApiModel limitCode : limitSets) {
                    arrayList.add(limitCode.getLimitCode());
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    LimitTypeApiModel limitTypeApiModel2 = (LimitTypeApiModel) it2.next();
                    if (C41536l.m120484d(limitTypeApiModel2.getLimitType(), "PAYPE")) {
                        List<LimitSetApiModel> limitSets2 = limitTypeApiModel2.getLimitSets();
                        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(limitSets2, 10));
                        for (LimitSetApiModel limitSetApiModel : limitSets2) {
                            arrayList2.add(new C17380j(limitSetApiModel.getLimitCode(), limitSetApiModel.getLimitGe(), limitSetApiModel.getLimitEn()));
                        }
                        return new C17378h(arrayList, arrayList2);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
