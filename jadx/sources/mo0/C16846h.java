package mo0;

import androidx.lifecycle.C1644x;
import ao0.C10119a;
import ao0.C10122c;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41233s;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p842nv.C26615g;
import ue1.C43075l;
import uo0.C18273e;
import vo0.C18490b;
import zn0.C19101m;

/* renamed from: mo0.h */
public final class C16846h extends C21481a implements C16839a, C16840b {

    /* renamed from: q */
    public static final C16851c f47129q = new C16851c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final Map f47130r = C41344r0.m119931m(C41233s.m119492a(C10119a.MR, OfferProductCode.C21000AC.f56467f), C41233s.m119492a(C10119a.INSTALLMENT, OfferProductCode.C21021PL.f56478f));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final long f47131d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C19101m f47132e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C26615g f47133f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C18490b f47134g;

    /* renamed from: h */
    private final C16839a f47135h = this;

    /* renamed from: i */
    private final C16840b f47136i = this;

    /* renamed from: j */
    private final C1644x f47137j = new C1644x();

    /* renamed from: k */
    private final C1644x f47138k = new C1644x();

    /* renamed from: l */
    private final C1644x f47139l = new C1644x();

    /* renamed from: m */
    private final C1644x f47140m = new C1644x();

    /* renamed from: n */
    private final C1644x f47141n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C10119a f47142o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C40767b f47143p;

    /* renamed from: mo0.h$a */
    static final class C16847a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16846h f47144d;

        /* renamed from: mo0.h$a$a */
        static final class C16848a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C16846h f47145d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16848a(C16846h hVar) {
                super(1);
                this.f47145d = hVar;
            }

            /* renamed from: a */
            public final C18273e invoke(C10122c cVar) {
                C41536l.m120489i(cVar, "offer");
                return C18490b.m62966i(this.f47145d.f47134g, cVar, false, 2, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16847a(C16846h hVar) {
            super(1);
            this.f47144d = hVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C18273e m59357c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C18273e) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p k0 = this.f47144d.f47132e.mo47302a(this.f47144d.f47131d).mo95075O().mo95026k0(new C16845g(new C16848a(this.f47144d)));
            C41536l.m120488h(k0, "class ViewModel @Assiste…        )\n        }\n    }");
            return C31270e.m92879h(k0, -1);
        }
    }

    /* renamed from: mo0.h$b */
    static final class C16849b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16846h f47146d;

        /* renamed from: mo0.h$b$a */
        static final class C16850a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C16846h f47147d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16850a(C16846h hVar) {
                super(1);
                this.f47147d = hVar;
            }

            /* renamed from: a */
            public final void mo43978a(C18273e eVar) {
                this.f47147d.f47142o = eVar.mo45952c();
                if (C16846h.f47129q.mo43979a().containsKey(this.f47147d.f47142o)) {
                    this.f47147d.f47143p.onNext(C41238w.f97225a);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo43978a((C18273e) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16849b(C16846h hVar) {
            super(1);
            this.f47146d = hVar;
        }

        /* renamed from: a */
        public final void mo43977a(C31128a aVar) {
            this.f47146d.mo43962I6().mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C16850a(this.f47146d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo43977a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: mo0.h$c */
    public static final class C16851c {
        private C16851c() {
        }

        public /* synthetic */ C16851c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Map mo43979a() {
            return C16846h.f47130r;
        }
    }

    /* renamed from: mo0.h$d */
    public interface C16852d {
        /* renamed from: a */
        C16846h mo32564a(long j);
    }

    /* renamed from: mo0.h$e */
    static final class C16853e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16846h f47148d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16853e(C16846h hVar) {
            super(1);
            this.f47148d = hVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C31270e.m92879h(C26615g.m83078c(this.f47148d.f47133f, false, false, 3, (Object) null), -1);
        }
    }

    /* renamed from: mo0.h$f */
    static final class C16854f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16846h f47149d;

        /* renamed from: mo0.h$f$a */
        static final class C16855a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C16846h f47150d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16855a(C16846h hVar) {
                super(1);
                this.f47150d = hVar;
            }

            /* renamed from: a */
            public final void mo43982a(List list) {
                Object obj;
                C41536l.m120489i(list, "offers");
                C16846h hVar = this.f47150d;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C41536l.m120484d(((OfferInfo) obj).getProductCode(), C16846h.f47129q.mo43979a().get(hVar.f47142o))) {
                        break;
                    }
                }
                OfferInfo offerInfo = (OfferInfo) obj;
                if (offerInfo != null) {
                    this.f47150d.mo43966x6().mo4826r(offerInfo);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo43982a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16854f(C16846h hVar) {
            super(1);
            this.f47149d = hVar;
        }

        /* renamed from: a */
        public final void mo43981a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C16855a(this.f47149d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo43981a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16846h(long j, C19101m mVar, C26615g gVar, C18490b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(mVar, "getLifestyleOfferById");
        C41536l.m120489i(gVar, "getOffersInfoUseCase");
        C41536l.m120489i(bVar, "mapper");
        this.f47131d = j;
        this.f47132e = mVar;
        this.f47133f = gVar;
        this.f47134g = bVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f47143p = h1;
        m59340zw();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C16843e(new C16847a(this)));
        C41536l.m120488h(L0, "merge(\n                o…T_CODE)\n                }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C16844f(new C16849b(this)));
        C41536l.m120488h(F0, "merge(\n                o…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final C40754t m59324Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m59325Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m59330hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m59331iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: zw */
    private final void m59340zw() {
        C40749p Q = this.f47143p.mo94998Q(new C16841c(new C16853e(this)));
        C41536l.m120488h(Q, "private fun subscribePro…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C16842d(new C16854f(this)));
        C41536l.m120488h(F0, "private fun subscribePro…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: It */
    public void mo43960It(String str) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        mo43963Jb().mo4823o(C32343x.m95466m(str));
    }

    /* renamed from: rw */
    public final C16839a mo43967rw() {
        return this.f47135h;
    }

    /* renamed from: sw */
    public C1644x mo43962I6() {
        return this.f47137j;
    }

    /* renamed from: tw */
    public C1644x mo43964Rl() {
        return this.f47139l;
    }

    /* renamed from: uw */
    public C1644x mo43965Zo() {
        return this.f47141n;
    }

    /* renamed from: vw */
    public C1644x mo43963Jb() {
        return this.f47140m;
    }

    /* renamed from: ww */
    public final C16840b mo43972ww() {
        return this.f47136i;
    }

    /* renamed from: xw */
    public C1644x mo43966x6() {
        return this.f47138k;
    }

    /* renamed from: yw */
    public void mo43974yw(OfferInfo offerInfo) {
        C41536l.m120489i(offerInfo, "offer");
        C37224b.m109965d(mo43965Zo(), offerInfo);
    }

    /* renamed from: za */
    public void mo43961za(String str) {
        C41536l.m120489i(str, "number");
        mo43964Rl().mo4823o(C32343x.m95466m(str));
    }
}
