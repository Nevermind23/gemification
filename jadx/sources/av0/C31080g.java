package av0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lu0.C37155a;
import m41.C37224b;
import md0.C26186e;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ru0.C38345b;
import su0.C38536a;
import su0.C38557c;
import ue1.C43075l;
import xu0.C39908c;

/* renamed from: av0.g */
public final class C31080g extends C21481a implements C31075b, C31076c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C39908c f77273d;

    /* renamed from: e */
    private final C37155a f77274e;

    /* renamed from: f */
    private final C31075b f77275f = this;

    /* renamed from: g */
    private final C31076c f77276g = this;

    /* renamed from: h */
    private final C1644x f77277h;

    /* renamed from: i */
    private final C1644x f77278i;

    /* renamed from: j */
    private final C1644x f77279j;

    /* renamed from: k */
    private final C1644x f77280k;

    /* renamed from: av0.g$a */
    static final class C31081a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31080g f77281d;

        /* renamed from: e */
        final /* synthetic */ long f77282e;

        /* renamed from: av0.g$a$a */
        static final class C31082a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ long f77283d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31082a(long j) {
                super(1);
                this.f77283d = j;
            }

            /* renamed from: a */
            public final C38536a invoke(List list) {
                Object obj;
                boolean z;
                C41536l.m120489i(list, "it");
                long j = this.f77283d;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C38536a) obj).mo92133i() == j) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                return (C38536a) obj;
            }
        }

        /* renamed from: av0.g$a$b */
        static final class C31083b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31080g f77284d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31083b(C31080g gVar) {
                super(1);
                this.f77284d = gVar;
            }

            /* renamed from: a */
            public final void mo71284a(C38536a aVar) {
                C31080g gVar = this.f77284d;
                C41536l.m120488h(aVar, "offer");
                gVar.m92501iw(aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo71284a((C38536a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31081a(C31080g gVar, long j) {
            super(1);
            this.f77281d = gVar;
            this.f77282e = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C38536a m92509d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C38536a) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m92510e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40762x m = C26186e.m81990h(C32343x.m95462k1(C38345b.C38346a.m112650a(this.f77281d.f77273d, false, false, 3, (Object) null))).mo95062A(new C31078e(new C31082a(this.f77282e))).mo95084m(new C31079f(new C31083b(this.f77281d)));
            C41536l.m120488h(m, "class ViewModel @Assiste…        }\n        }\n    }");
            return C31270e.m92880i(m, num.intValue());
        }
    }

    /* renamed from: av0.g$b */
    public /* synthetic */ class C31084b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f77285a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                su0.c[] r0 = su0.C38557c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                su0.c r1 = su0.C38557c.OFFER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                su0.c r1 = su0.C38557c.LIMIT_BANNER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                su0.c r1 = su0.C38557c.LOAN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                su0.c r1 = su0.C38557c.CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f77285a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: av0.C31080g.C31084b.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31080g(C39908c cVar, C37155a aVar, long j) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "getNboOffers");
        C41536l.m120489i(aVar, "nboDomainMapper");
        this.f77273d = cVar;
        this.f77274e = aVar;
        C1644x xVar = new C1644x();
        this.f77277h = xVar;
        this.f77278i = new C1644x();
        this.f77279j = new C1644x();
        this.f77280k = new C1644x();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C31077d(new C31081a(this, j)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(rc)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m92498ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public final void m92501iw(C38536a aVar) {
        int i;
        C41238w wVar;
        C38557c B = aVar.mo92120B();
        if (B == null) {
            i = -1;
        } else {
            i = C31084b.f77285a[B.ordinal()];
        }
        if (i == -1) {
            C37224b.m109962a(this.f77280k);
        } else if (i == 1 || i == 2) {
            C37224b.m109965d(this.f77278i, aVar);
        } else if (i == 3 || i == 4) {
            OfferInfo c = this.f77274e.mo90145c(aVar);
            if (c != null) {
                C37224b.m109965d(this.f77279j, c);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                C37224b.m109962a(this.f77280k);
            }
        }
    }

    /* renamed from: Mp */
    public LiveData mo71277Mp() {
        return this.f77279j;
    }

    /* renamed from: Qp */
    public LiveData mo71278Qp() {
        return this.f77277h;
    }

    /* renamed from: X7 */
    public LiveData mo71279X7() {
        return this.f77280k;
    }

    /* renamed from: hw */
    public final C31076c mo71281hw() {
        return this.f77276g;
    }

    /* renamed from: v4 */
    public LiveData mo71280v4() {
        return this.f77278i;
    }
}
