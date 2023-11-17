package p341ge.bog.mobilebank.bnpl.presentation.categories;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41238w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p578ql.C17531e;
import p646vl.C18414d;
import p646vl.C18415e;
import p646vl.C18416f;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesViewModel$ViewModel */
public final class BnplCategoriesViewModel$ViewModel extends C21481a implements C18414d, C18415e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C17531e f41038d;

    /* renamed from: e */
    private final C18414d f41039e = this;

    /* renamed from: f */
    private final C18415e f41040f = this;

    /* renamed from: g */
    private final C1644x f41041g = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Map f41042h = new LinkedHashMap();

    /* renamed from: i */
    private final C40767b f41043i;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesViewModel$ViewModel$a */
    static final class C13785a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplCategoriesViewModel$ViewModel f41044d;

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesViewModel$ViewModel$a$a */
        static final class C13786a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ BnplCategoriesViewModel$ViewModel f41045d;

            /* renamed from: e */
            final /* synthetic */ Long f41046e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13786a(BnplCategoriesViewModel$ViewModel bnplCategoriesViewModel$ViewModel, Long l) {
                super(1);
                this.f41045d = bnplCategoriesViewModel$ViewModel;
                this.f41046e = l;
            }

            /* renamed from: a */
            public final void mo38158a(List list) {
                Map fw = this.f41045d.f41042h;
                Long l = this.f41046e;
                C41536l.m120488h(l, "it");
                C41536l.m120488h(list, "merchants");
                fw.put(l, list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo38158a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13785a(BnplCategoriesViewModel$ViewModel bnplCategoriesViewModel$ViewModel) {
            super(1);
            this.f41044d = bnplCategoriesViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m51468c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "it");
            C40762x m = C17531e.m61059c(this.f41044d.f41038d, l.longValue(), (String) null, 2, (Object) null).mo95084m(new C13791c(new C13786a(this.f41044d, l)));
            C41536l.m120488h(m, "private fun configureMer…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1).mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BnplCategoriesViewModel$ViewModel(C17531e eVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "getMerchants");
        this.f41038d = eVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Long>()");
        this.f41043i = h1;
        m51462gw();
    }

    /* renamed from: gw */
    private final void m51462gw() {
        C40749p o0 = this.f41043i.mo94989L0(new C18416f(new C13785a(this))).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "private fun configureMer…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(o0, this.f41041g));
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m51463hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Ah */
    public void mo38154Ah(long j) {
        List list = (List) this.f41042h.get(Long.valueOf(j));
        if (list != null) {
            this.f41041g.mo4823o(new C31128a.C31131c(list, 0, 2, (DefaultConstructorMarker) null));
        } else {
            this.f41043i.onNext(Long.valueOf(j));
        }
    }

    /* renamed from: iw */
    public final C18415e mo38155iw() {
        return this.f41040f;
    }

    /* renamed from: zt */
    public LiveData mo38156zt() {
        return this.f41041g;
    }
}
