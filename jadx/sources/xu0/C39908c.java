package xu0;

import df1.C40651b;
import df1.C40654d;
import df1.C40655e;
import ed1.C40749p;
import j31.C36725a;
import j31.C36726b;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import md0.C26191f;
import ru0.C38345b;
import su0.C38536a;
import su0.C38537b;
import su0.C38557c;
import su0.C38559d;
import ue1.C43075l;
import vu0.C39474a;

/* renamed from: xu0.c */
public final class C39908c implements C38345b {

    /* renamed from: b */
    public static final C39909a f94661b = new C39909a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C39474a f94662a;

    /* renamed from: xu0.c$a */
    public static final class C39909a {
        private C39909a() {
        }

        public /* synthetic */ C39909a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: xu0.c$b */
    static final class C39910b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39908c f94663d;

        /* renamed from: e */
        final /* synthetic */ boolean f94664e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39910b(C39908c cVar, boolean z) {
            super(1);
            this.f94663d = cVar;
            this.f94664e = z;
        }

        /* renamed from: a */
        public final C26191f invoke(C26191f fVar) {
            C26191f fVar2 = fVar;
            C41536l.m120489i(fVar2, "result");
            if (!(fVar2 instanceof C26191f.C26194c)) {
                return fVar2;
            }
            C39908c cVar = this.f94663d;
            boolean z = this.f94664e;
            ArrayList arrayList = new ArrayList();
            for (Object next : (Iterable) ((C26191f.C26194c) fVar2).mo65223a()) {
                if (cVar.m115694f((C38536a) next, z)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
            int i = 0;
            for (Object next2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    C41341q.m119917t();
                }
                arrayList2.add(C38536a.m113104b((C38536a) next2, 0, (String) null, (C38557c) null, (C38537b) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C36726b) null, (String) null, (String) null, (Integer) null, (Double) null, (Integer) null, false, (String) null, (String) null, false, (String) null, (C38559d) null, (String) null, (String) null, (String) null, (String) null, (C36725a) null, Integer.valueOf(i), (String) null, 402653183, (Object) null));
                i = i2;
            }
            return new C26191f.C26194c(arrayList2);
        }
    }

    public C39908c(C39474a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f94662a = aVar;
    }

    /* renamed from: d */
    private final boolean m115692d(long j) {
        if (j == -1 || System.currentTimeMillis() - j >= C40651b.m117484o(C40654d.m117511o(7, C40655e.DAYS))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C26191f m115693e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26191f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final boolean m115694f(C38536a aVar, boolean z) {
        if (!z || (aVar.mo92126d() && m115692d(this.f94662a.mo90608N1(aVar)))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C40749p mo91880a(boolean z, boolean z2) {
        C40749p k0 = this.f94662a.mo90610W0(z).mo95026k0(new C39907b(new C39910b(this, z2)));
        C41536l.m120488h(k0, "override fun invoke(\n   …         result\n        }");
        return k0;
    }
}
