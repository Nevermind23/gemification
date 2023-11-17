package p925vv;

import ed1.C40762x;
import g91.C32319m;
import he1.C41224m;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p936wv.C29579e;
import p936wv.C29580f;
import p936wv.C29581g;
import p947xv.C29860a;
import ue1.C43079p;

/* renamed from: vv.e */
public final class C29171e {

    /* renamed from: a */
    private final C29860a f74189a;

    /* renamed from: b */
    private final C29176h f74190b;

    /* renamed from: vv.e$a */
    static final class C29172a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C29172a f74191d = new C29172a();

        /* renamed from: vv.e$a$a */
        public static final class C29173a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(C32319m.m95289I(((C29580f) obj).mo69465b()), C32319m.m95289I(((C29580f) obj2).mo69465b()));
            }
        }

        C29172a() {
            super(2);
        }

        /* renamed from: a */
        public final C29579e invoke(List list, C41224m mVar) {
            C41536l.m120489i(list, "history");
            C41536l.m120489i(mVar, "<name for destructuring parameter 1>");
            return new C29579e(C41358y.m120030t0(list, new C29173a()), (C29581g) mVar.mo95675a(), (List) mVar.mo95676b());
        }
    }

    public C29171e(C29860a aVar, C29176h hVar) {
        C41536l.m120489i(aVar, "budgetingRepository");
        C41536l.m120489i(hVar, "budgetsAndCategoriesUseCase");
        this.f74189a = aVar;
        this.f74190b = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C29579e m89107c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C29579e) pVar.invoke(obj, obj2);
    }

    /* renamed from: b */
    public final C40762x mo69011b(String str, String str2) {
        C41536l.m120489i(str, "fromDate");
        C41536l.m120489i(str2, "toDate");
        C40762x T = C40762x.m118154T(this.f74189a.mo70102d1(str, str2), this.f74190b.mo69015b(), new C29170d(C29172a.f74191d));
        C41536l.m120488h(T, "zip(\n            budgeti…)\n            }\n        )");
        return T;
    }
}
