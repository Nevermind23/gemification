package p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import ja0.C25372h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka0.C25695d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nb0.C26394a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;
import p380ck.C10464h;
import pb0.C27493a;
import qb0.C27766a;
import qb0.C27767b;
import qb0.C27768c;
import qb0.C27769d;
import qb0.C27770e;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.viewmodel.DepositTypesViewModel$ViewModel */
public final class DepositTypesViewModel$ViewModel extends C21481a implements C27767b, C27768c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C25372h f60497d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C27493a f60498e;

    /* renamed from: f */
    private final C27767b f60499f = this;

    /* renamed from: g */
    private final C27768c f60500g = this;

    /* renamed from: h */
    private String f60501h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List f60502i;

    /* renamed from: j */
    private final C1644x f60503j = new C1644x();

    /* renamed from: k */
    private final C1644x f60504k = new C1644x();

    /* renamed from: l */
    private final C1644x f60505l = new C1644x();

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.viewmodel.DepositTypesViewModel$ViewModel$a */
    static final class C22993a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositTypesViewModel$ViewModel f60506d;

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.viewmodel.DepositTypesViewModel$ViewModel$a$a */
        /* synthetic */ class C22994a extends C41535k implements C43075l {
            C22994a(Object obj) {
                super(1, obj, C27493a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C27493a) this.receiver).mo66807c(list);
            }
        }

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.viewmodel.DepositTypesViewModel$ViewModel$a$b */
        static final class C22995b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DepositTypesViewModel$ViewModel f60507d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22995b(DepositTypesViewModel$ViewModel depositTypesViewModel$ViewModel) {
                super(1);
                this.f60507d = depositTypesViewModel$ViewModel;
            }

            /* renamed from: a */
            public final C41224m invoke(List list) {
                C41536l.m120489i(list, "deposits");
                return C41233s.m119492a(list, this.f60507d.m74567sw(list));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22993a(DepositTypesViewModel$ViewModel depositTypesViewModel$ViewModel) {
            super(1);
            this.f60506d = depositTypesViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C41224m m74582d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p k0 = this.f60506d.f60497d.mo63959b().mo95075O().mo95026k0(new C22998a(new C22994a(this.f60506d.f60498e))).mo95026k0(new C22999b(new C22995b(this.f60506d)));
            C41536l.m120488h(k0, "@HiltViewModel\n    class…        )\n        }\n    }");
            return C31270e.m92879h(k0, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.viewmodel.DepositTypesViewModel$ViewModel$b */
    static final class C22996b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositTypesViewModel$ViewModel f60508d;

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.viewmodel.DepositTypesViewModel$ViewModel$b$a */
        static final class C22997a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DepositTypesViewModel$ViewModel f60509d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22997a(DepositTypesViewModel$ViewModel depositTypesViewModel$ViewModel) {
                super(1);
                this.f60509d = depositTypesViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo57252a(C41224m mVar) {
                List list = (List) mVar.mo95675a();
                this.f60509d.f60502i = list;
                DepositTypesViewModel$ViewModel depositTypesViewModel$ViewModel = this.f60509d;
                C41536l.m120488h(list, "deposits");
                depositTypesViewModel$ViewModel.m74568tw(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo57252a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22996b(DepositTypesViewModel$ViewModel depositTypesViewModel$ViewModel) {
            super(1);
            this.f60508d = depositTypesViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo57251a(C31128a aVar) {
            Object obj;
            C31128a.C31129a aVar2;
            C1644x qw = this.f60508d.mo57245r1();
            C41536l.m120488h(aVar, "result");
            try {
                if (aVar instanceof C31128a.C31131c) {
                    obj = new C31128a.C31131c((List) ((C41224m) ((C31128a.C31131c) aVar).mo71340a()).mo95680f(), aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    aVar2 = new C31128a.C31129a(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                    obj = aVar2;
                } else if (aVar instanceof C31128a.C31130b) {
                    obj = new C31128a.C31130b(aVar.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                aVar2 = new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
            qw.mo4823o(obj);
            C31132b.m92648j(aVar, (int[]) null, new C22997a(this.f60508d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57251a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepositTypesViewModel$ViewModel(C25372h hVar, C27493a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "getDepositTypesUseCase");
        C41536l.m120489i(aVar, "mapper");
        this.f60497d = hVar;
        this.f60498e = aVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C27769d(new C22993a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ble(it)\n                }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C27770e(new C22996b(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m74559fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m74560gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: rw */
    private final void m74566rw(DepositTypeDetailsUiModel depositTypeDetailsUiModel) {
        C32343x.m95397J0(this, "deposit_application", depositTypeDetailsUiModel.mo57218e().name(), "choose_deposit_type", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public final List m74567sw(List list) {
        List e = C41339p.m119900e(C26394a.C26395a.f66893a);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C26394a.C26396b((DepositTypeDetailsUiModel) it.next()));
        }
        return C41358y.m120023m0(e, arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public final void m74568tw(List list) {
        Object obj;
        if (this.f60501h != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((DepositTypeDetailsUiModel) obj).mo57218e().name(), this.f60501h)) {
                    break;
                }
            }
            DepositTypeDetailsUiModel depositTypeDetailsUiModel = (DepositTypeDetailsUiModel) obj;
            if (depositTypeDetailsUiModel != null) {
                mo57237A0().mo4823o(C32343x.m95466m(new C27766a(new ArrayList(list), depositTypeDetailsUiModel.mo57218e(), true)));
                this.f60501h = null;
            }
        }
    }

    /* renamed from: h1 */
    public void mo57238h1(C25695d dVar) {
        Object obj;
        boolean z;
        C41536l.m120489i(dVar, "depositType");
        List list = this.f60502i;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((DepositTypeDetailsUiModel) obj).mo57218e() == dVar) {
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
            DepositTypeDetailsUiModel depositTypeDetailsUiModel = (DepositTypeDetailsUiModel) obj;
            if (depositTypeDetailsUiModel != null) {
                C1644x ow = mo57237A0();
                List list2 = this.f60502i;
                C41536l.m120486f(list2);
                ow.mo4823o(C32343x.m95466m(new C27766a(new ArrayList(list2), depositTypeDetailsUiModel.mo57218e(), false)));
                m74566rw(depositTypeDetailsUiModel);
            }
        }
    }

    /* renamed from: k3 */
    public void mo57239k3() {
        List list = this.f60502i;
        if (list != null) {
            mo57247zq().mo4823o(C32343x.m95466m(list));
        }
    }

    /* renamed from: mw */
    public final C27767b mo57240mw() {
        return this.f60499f;
    }

    /* renamed from: nw */
    public C1644x mo57247zq() {
        return this.f60505l;
    }

    /* renamed from: ow */
    public C1644x mo57237A0() {
        return this.f60504k;
    }

    /* renamed from: pw */
    public final C27768c mo57243pw() {
        return this.f60500g;
    }

    /* renamed from: qw */
    public C1644x mo57245r1() {
        return this.f60503j;
    }

    /* renamed from: uw */
    public void mo57246uw(String str) {
        this.f60501h = str;
    }
}
