package p341ge.bog.mobilebank.products.presentation.managecardsandaccounts.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import hd0.C24978b;
import hd1.C41204a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p843nw.C26633o;
import p863pw.C27635m;
import p863pw.C27636n;
import p863pw.C27637o;
import ue1.C43075l;
import zz0.C40276a;
import zz0.C40277b;
import zz0.C40278c;

/* renamed from: ge.bog.mobilebank.products.presentation.managecardsandaccounts.viewmodel.ManageCardsViewModel$ViewModel */
public final class ManageCardsViewModel$ViewModel extends C21481a implements C40276a, C40277b {

    /* renamed from: d */
    private final C40276a f83161d = this;

    /* renamed from: e */
    private final C40277b f83162e = this;

    /* renamed from: f */
    private final C1644x f83163f;

    /* renamed from: ge.bog.mobilebank.products.presentation.managecardsandaccounts.viewmodel.ManageCardsViewModel$ViewModel$a */
    static final class C34269a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26633o f83164d;

        /* renamed from: ge.bog.mobilebank.products.presentation.managecardsandaccounts.viewmodel.ManageCardsViewModel$ViewModel$a$a */
        static final class C34270a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C34270a f83165d = new C34270a();

            C34270a() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(C27637o oVar) {
                C24978b bVar;
                boolean z;
                C41536l.m120489i(oVar, "cardsAndDetails");
                List w = C41343r.m119927w(oVar.mo67167a().values());
                boolean z2 = false;
                if (!(w instanceof Collection) || !w.isEmpty()) {
                    Iterator it = w.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C27636n v = ((C27635m) it.next()).mo67139v();
                            if (v != null) {
                                bVar = v.mo67154i();
                            } else {
                                bVar = null;
                            }
                            if (bVar == C24978b.YES) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.managecardsandaccounts.viewmodel.ManageCardsViewModel$ViewModel$a$b */
        static final class C34271b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C34271b f83166d = new C34271b();

            C34271b() {
                super(1);
            }

            public final Boolean invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34269a(C26633o oVar) {
            super(1);
            this.f83164d = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final Boolean m100785d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (Boolean) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final Boolean m100786e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (Boolean) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40749p t0 = C26633o.m83102d(this.f83164d, false, 1, (Object) null).mo95026k0(new C34272a(C34270a.f83165d)).mo95035t0(new C34273b(C34271b.f83166d));
            C41536l.m120488h(t0, "getCardsAndDetails.get()… .onErrorReturn { false }");
            return C31270e.m92879h(t0, num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ManageCardsViewModel$ViewModel(C26633o oVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(oVar, "getCardsAndDetails");
        C1644x xVar = new C1644x();
        this.f83163f = xVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C40278c(new C34269a(oVar)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ble(rc)\n                }");
        C31270e.m92876e(L0, xVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m100780ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: fw */
    public final C40277b mo82660fw() {
        return this.f83162e;
    }

    /* renamed from: sf */
    public LiveData mo82661sf() {
        return this.f83163f;
    }
}
