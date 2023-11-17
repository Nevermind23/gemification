package p341ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37590b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p441go.C15383h;
import p441go.C15386k;
import p441go.C15393p;
import p455ho.C15556i;
import p469io.C15708a;
import p469io.C15709b;
import p540np.C17141f;
import p540np.C17142g;
import p540np.C17143h;
import p540np.C17144i;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackViewModel$ViewModel */
public final class PackageCancelFeedbackViewModel$ViewModel extends C21481a implements C17141f, C17142g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C15383h f42772d;

    /* renamed from: e */
    private final C15386k f42773e;

    /* renamed from: f */
    private final C15393p f42774f;

    /* renamed from: g */
    private final C17141f f42775g = this;

    /* renamed from: h */
    private final C17142g f42776h = this;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f42777i = new C1644x();

    /* renamed from: j */
    private final C1644x f42778j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f42779k = new C1644x();

    /* renamed from: l */
    private final C1644x f42780l = new C1644x(C37590b.DISABLED);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f42781m = new C1644x(Boolean.TRUE);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Integer f42782n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C15708a f42783o;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackViewModel$ViewModel$a */
    static final class C14752a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageCancelFeedbackViewModel$ViewModel f42784d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14752a(PackageCancelFeedbackViewModel$ViewModel packageCancelFeedbackViewModel$ViewModel) {
            super(1);
            this.f42784d = packageCancelFeedbackViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(List list) {
            C15708a aVar;
            Object obj;
            C15708a aVar2;
            Object obj2;
            boolean z;
            boolean z2;
            C41536l.m120489i(list, "packagesList");
            PackageCancelFeedbackViewModel$ViewModel packageCancelFeedbackViewModel$ViewModel = this.f42784d;
            Iterator it = list.iterator();
            while (true) {
                aVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C15709b) obj).mo43095r() != null) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            C15709b bVar = (C15709b) obj;
            if (bVar == null || (aVar2 = bVar.mo43095r()) == null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (((C15709b) obj2).mo43078c() != null) {
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
                C15709b bVar2 = (C15709b) obj2;
                if (bVar2 != null) {
                    aVar2 = bVar2.mo43078c();
                } else {
                    aVar2 = null;
                }
                if (aVar2 == null) {
                    throw new NoSuchElementException("Current or active package not found");
                }
            }
            packageCancelFeedbackViewModel$ViewModel.f42783o = aVar2;
            C15383h gw = this.f42784d.f42772d;
            C15708a fw = this.f42784d.f42783o;
            if (fw == null) {
                C41536l.m120506z("currentPackage");
            } else {
                aVar = fw;
            }
            return gw.mo42484a(aVar.mo43072q()).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackViewModel$ViewModel$b */
    static final class C14753b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageCancelFeedbackViewModel$ViewModel f42785d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackViewModel$ViewModel$b$a */
        static final class C14754a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ PackageCancelFeedbackViewModel$ViewModel f42786d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14754a(PackageCancelFeedbackViewModel$ViewModel packageCancelFeedbackViewModel$ViewModel) {
                super(1);
                this.f42786d = packageCancelFeedbackViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo41191a(List list) {
                this.f42786d.f42782n = null;
                this.f42786d.f42781m.mo4823o(Boolean.FALSE);
                this.f42786d.f42779k.mo4823o(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41191a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackViewModel$ViewModel$b$b */
        static final class C14755b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ PackageCancelFeedbackViewModel$ViewModel f42787d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14755b(PackageCancelFeedbackViewModel$ViewModel packageCancelFeedbackViewModel$ViewModel) {
                super(1);
                this.f42787d = packageCancelFeedbackViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo41192a(List list) {
                this.f42787d.f42781m.mo4823o(Boolean.TRUE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41192a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackViewModel$ViewModel$b$c */
        static final class C14756c extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ PackageCancelFeedbackViewModel$ViewModel f42788d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14756c(PackageCancelFeedbackViewModel$ViewModel packageCancelFeedbackViewModel$ViewModel) {
                super(2);
                this.f42788d = packageCancelFeedbackViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo41193a(Throwable th, List list) {
                C41536l.m120489i(th, "error");
                this.f42788d.f42777i.mo4823o(C32343x.m95466m(th));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo41193a((Throwable) obj, (List) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14753b(PackageCancelFeedbackViewModel$ViewModel packageCancelFeedbackViewModel$ViewModel) {
            super(1);
            this.f42785d = packageCancelFeedbackViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41190a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C14754a(this.f42785d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C14755b(this.f42785d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C14756c(this.f42785d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41190a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PackageCancelFeedbackViewModel$ViewModel(C15383h hVar, C15386k kVar, C15393p pVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "getPackageDelReasons");
        C41536l.m120489i(kVar, "getPackages");
        C41536l.m120489i(pVar, "sendPackageDelReason");
        this.f42772d = hVar;
        this.f42773e = kVar;
        this.f42774f = pVar;
        m54296mw();
    }

    /* renamed from: mw */
    private final void m54296mw() {
        C40749p O = C15386k.m55854b(this.f42773e, (String) null, false, 3, (Object) null).mo95075O();
        C41536l.m120488h(O, "getPackages()\n                .toObservable()");
        C40749p Q = C32343x.m95462k1(O).mo94998Q(new C17143h(new C14752a(this)));
        C41536l.m120488h(Q, "private fun fetchCurrent…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95462k1(C31270e.m92879h(Q, -1)).mo94981F0(new C17144i(new C14753b(this)));
        C41536l.m120488h(F0, "private fun fetchCurrent…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final C40754t m54297nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m54298ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Gh */
    public LiveData mo41179Gh() {
        return this.f42780l;
    }

    /* renamed from: P3 */
    public LiveData mo41180P3() {
        return this.f42781m;
    }

    /* renamed from: Y3 */
    public LiveData mo41181Y3() {
        return this.f42779k;
    }

    /* renamed from: o3 */
    public LiveData mo41182o3() {
        return this.f42777i;
    }

    /* renamed from: pw */
    public final C17142g mo41183pw() {
        return this.f42776h;
    }

    /* renamed from: qw */
    public Integer mo41184qw() {
        return this.f42782n;
    }

    /* renamed from: rw */
    public void mo41185rw() {
        int i;
        String a;
        List list = (List) mo41181Y3().mo4814f();
        if (list != null) {
            Integer num = this.f42782n;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            C15556i iVar = (C15556i) C41358y.m120010Z(list, i);
            if (!(iVar == null || (a = iVar.mo42762a()) == null)) {
                C15393p pVar = this.f42774f;
                C15708a aVar = this.f42783o;
                if (aVar == null) {
                    C41536l.m120506z("currentPackage");
                    aVar = null;
                }
                pVar.mo42493a(aVar.mo43055b(), a);
                this.f42778j.mo4823o(C41238w.f97225a);
                return;
            }
        }
        throw new IndexOutOfBoundsException("Invalid selected reason index");
    }

    /* renamed from: sw */
    public void mo41186sw() {
        this.f42778j.mo4823o(C41238w.f97225a);
    }

    /* renamed from: tw */
    public void mo41187tw(Integer num) {
        this.f42782n = num;
    }

    /* renamed from: xs */
    public LiveData mo41188xs() {
        return this.f42778j;
    }
}
