package p341ge.bog.mobilebank.openbanking.presentation.products;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import hv0.C36228b;
import hv0.C36237i;
import hv0.C36242m;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import rv0.C38357h;
import rv0.C38358i;
import rv0.C38359j;
import rv0.C38360k;
import rv0.C38361l;
import rv0.C38362m;
import sv0.C38562a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.products.OpenBanksProductsViewModel$ViewModel */
public final class OpenBanksProductsViewModel$ViewModel extends C21481a implements C38357h, C38358i {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C36228b f81663d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C36237i f81664e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C38562a f81665f;

    /* renamed from: g */
    private final C36242m f81666g;

    /* renamed from: h */
    private final C38357h f81667h = this;

    /* renamed from: i */
    private final C38358i f81668i = this;

    /* renamed from: j */
    private final C1644x f81669j;

    /* renamed from: k */
    private final C1644x f81670k;

    /* renamed from: l */
    private final C40767b f81671l;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.OpenBanksProductsViewModel$ViewModel$a */
    static final class C33456a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33456a f81672d = new C33456a();

        C33456a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return 6;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.OpenBanksProductsViewModel$ViewModel$b */
    static final class C33457b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OpenBanksProductsViewModel$ViewModel f81673d;

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.OpenBanksProductsViewModel$ViewModel$b$a */
        /* synthetic */ class C33458a extends C41535k implements C43075l {
            C33458a(Object obj) {
                super(1, obj, C38562a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C38562a) this.receiver).mo92163b(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33457b(OpenBanksProductsViewModel$ViewModel openBanksProductsViewModel$ViewModel) {
            super(1);
            this.f81673d = openBanksProductsViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            boolean z;
            C41536l.m120489i(num, "it");
            if (num.intValue() == 2 || num.intValue() == 6) {
                z = true;
            } else {
                z = false;
            }
            C40749p k0 = this.f81673d.f81664e.mo88978a(z).mo95075O().mo95026k0(new C33483c(new C33458a(this.f81673d.f81665f)));
            C41536l.m120488h(k0, "getProducts(refresh)\n   …    .map(mapper::convert)");
            return C31270e.m92879h(k0, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.OpenBanksProductsViewModel$ViewModel$c */
    static final class C33459c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OpenBanksProductsViewModel$ViewModel f81674d;

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.OpenBanksProductsViewModel$ViewModel$c$a */
        static final class C33460a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C33460a f81675d = new C33460a();

            C33460a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33459c(OpenBanksProductsViewModel$ViewModel openBanksProductsViewModel$ViewModel) {
            super(1);
            this.f81674d = openBanksProductsViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m98253c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            return this.f81674d.f81663d.mo88972a((String) mVar.mo95675a(), (String) mVar.mo95676b()).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C33484d(C33460a.f81675d));
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.OpenBanksProductsViewModel$ViewModel$d */
    static final class C33461d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OpenBanksProductsViewModel$ViewModel f81676d;

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.OpenBanksProductsViewModel$ViewModel$d$a */
        static final class C33462a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ OpenBanksProductsViewModel$ViewModel f81677d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33462a(OpenBanksProductsViewModel$ViewModel openBanksProductsViewModel$ViewModel) {
                super(1);
                this.f81677d = openBanksProductsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo79316a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f81677d.onRefresh(6);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79316a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33461d(OpenBanksProductsViewModel$ViewModel openBanksProductsViewModel$ViewModel) {
            super(1);
            this.f81676d = openBanksProductsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo79315a(C31128a aVar) {
            this.f81676d.mo79309ud().mo4826r(new C37223a(aVar));
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C33462a(this.f81676d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79315a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenBanksProductsViewModel$ViewModel(C36228b bVar, C36237i iVar, C38562a aVar, C36242m mVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "deleteConsentUseCase");
        C41536l.m120489i(iVar, "getProducts");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(mVar, "reloadProductsAfterAuth");
        this.f81663d = bVar;
        this.f81664e = iVar;
        this.f81665f = aVar;
        this.f81666g = mVar;
        C1644x xVar = new C1644x();
        this.f81669j = xVar;
        this.f81670k = new C1644x();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Pair<String, String>>()");
        this.f81671l = h1;
        C40749p o0 = C40749p.m118049m0(onInit(), onRefresh(), mVar.mo88983b().mo95026k0(new C38359j(C33456a.f81672d))).mo94989L0(new C38360k(new C33457b(this))).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "merge(\n                o…dSchedulers.mainThread())");
        bindToLifecycle(C31270e.m92876e(o0, xVar));
        C41205b F0 = h1.mo94998Q(new C38361l(new C33459c(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C38362m(new C33461d(this)));
        C41536l.m120488h(F0, "deleteBankAccountSubject…          }\n            }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final Integer m98236hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final C40754t m98237iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final C40754t m98238jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m98239kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: T9 */
    public LiveData mo79304T9() {
        return this.f81669j;
    }

    /* renamed from: dj */
    public void mo79305dj(String str, String str2) {
        C41536l.m120489i(str, "bankId");
        C41536l.m120489i(str2, "consentId");
        this.f81671l.onNext(C41233s.m119492a(str, str2));
    }

    /* renamed from: ow */
    public C1644x mo79309ud() {
        return this.f81670k;
    }

    /* renamed from: pw */
    public final C38357h mo79307pw() {
        return this.f81667h;
    }

    /* renamed from: qw */
    public final C38358i mo79308qw() {
        return this.f81668i;
    }
}
