package p51;

import ed1.C40749p;
import g91.C32343x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p843nw.C26628j;
import p863pw.C27623a;
import p863pw.C27633k;
import p863pw.C27635m;
import q51.C38131b;
import q51.C38132c;
import r51.C38285a;
import ue1.C43075l;

/* renamed from: p51.b */
public final class C37900b {

    /* renamed from: a */
    private final C26628j f90975a;

    /* renamed from: p51.b$a */
    static final class C37901a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C37901a f90976d = new C37901a();

        C37901a() {
            super(1);
        }

        /* renamed from: a */
        public final C38285a invoke(C27633k kVar) {
            boolean z;
            String str;
            String str2;
            String str3;
            C41536l.m120489i(kVar, "accsAndCards");
            List<C27623a> a = kVar.mo67087a().mo67081a();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
            for (C27623a aVar : a) {
                long b = aVar.mo67002b();
                String l = aVar.mo67014l();
                String c = aVar.mo67003c();
                if (c == null) {
                    str3 = C32343x.m95388F(aVar.mo67016n(), new Object[0]);
                } else {
                    str3 = c;
                }
                arrayList.add(new C38131b(b, l, str3, aVar.mo67004d(), aVar.mo67008g()));
            }
            HashSet x0 = C41358y.m120034x0(arrayList);
            List<C27635m> w = C41343r.m119927w(kVar.mo67088b().values());
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(w, 10));
            for (C27635m mVar : w) {
                long j = mVar.mo67126j();
                String l2 = mVar.mo67128l();
                if (l2 == null || l2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = mVar.mo67128l();
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = mVar.mo67142y();
                    if (str == null) {
                        str = mVar.mo67117c();
                    }
                }
                String str4 = str;
                String w2 = mVar.mo67140w();
                CardExternalFile f = mVar.mo67121f();
                if (f != null) {
                    str2 = f.getFileUrl();
                } else {
                    str2 = null;
                }
                arrayList2.add(new C38132c(j, str4, w2, str2));
            }
            return new C38285a(x0, C41358y.m120034x0(arrayList2));
        }
    }

    public C37900b(C26628j jVar) {
        C41536l.m120489i(jVar, "accountsWithCardsUseCase");
        this.f90975a = jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C38285a m111385c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38285a) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40749p mo91243b(boolean z) {
        C40749p k0 = this.f90975a.mo65882c(z).mo95026k0(new C37899a(C37901a.f90976d));
        C41536l.m120488h(k0, "accountsWithCardsUseCase…)\n            )\n        }");
        return k0;
    }
}
