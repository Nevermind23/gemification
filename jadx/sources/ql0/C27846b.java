package ql0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.LimitSetApiModel;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.LimitTypeApiModel;
import ul0.C28875b;
import ul0.C28876c;
import y71.C40034h;

/* renamed from: ql0.b */
public final class C27846b {

    /* renamed from: b */
    public static final C27847a f70979b = new C27847a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f70980a;

    /* renamed from: ql0.b$a */
    public static final class C27847a {
        private C27847a() {
        }

        public /* synthetic */ C27847a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ql0.b$b */
    public static final class C27848b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Boolean.valueOf(C41536l.m120484d(((C28875b) obj2).mo68606a(), "EUR")), Boolean.valueOf(C41536l.m120484d(((C28875b) obj).mo68606a(), "EUR")));
        }
    }

    public C27846b(Context context) {
        C41536l.m120489i(context, "context");
        this.f70980a = context;
    }

    /* renamed from: b */
    private final String m86042b(String str) {
        if (C41536l.m120484d(str, "EUR")) {
            return this.f70980a.getString(C40034h.curr_eur_with_symbol);
        }
        if (C41536l.m120484d(str, "USD")) {
            return this.f70980a.getString(C40034h.curr_usd_with_symbol);
        }
        return null;
    }

    /* renamed from: a */
    public final C28876c mo67364a(List list) {
        C41536l.m120489i(list, "limits");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LimitTypeApiModel limitTypeApiModel = (LimitTypeApiModel) it.next();
            if (C41536l.m120484d(limitTypeApiModel.getLimitType(), "CCY")) {
                List<LimitSetApiModel> limitSets = limitTypeApiModel.getLimitSets();
                ArrayList arrayList = new ArrayList(C41343r.m119925u(limitSets, 10));
                for (LimitSetApiModel limitSetApiModel : limitSets) {
                    arrayList.add(new C28875b(limitSetApiModel.getLimitCode(), m86042b(limitSetApiModel.getLimitCode())));
                }
                List B0 = C41358y.m119991B0(arrayList);
                if (B0.size() > 1) {
                    C41349u.m119946y(B0, new C27848b());
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    LimitTypeApiModel limitTypeApiModel2 = (LimitTypeApiModel) it2.next();
                    if (C41536l.m120484d(limitTypeApiModel2.getLimitType(), "INS")) {
                        return new C28876c(B0, ((LimitSetApiModel) C41358y.m120007W(limitTypeApiModel2.getLimitSets())).getLimitCode());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
