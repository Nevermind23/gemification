package p341ge.bog.mobilebank.kyc.presentation.jobposition;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40744k;
import ed1.C40749p;
import ee1.C40767b;
import g91.C32343x;
import gn0.C15367e;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import hn0.C15541f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.C16283i;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import mn0.C16804c;
import mn0.C16805d;
import mn0.C16806e;
import mn0.C16807f;
import mn0.C16808g;
import mn0.C16809h;
import mn0.C16810i;
import mn0.C16811j;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import rn0.C17680a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorViewModel$ViewModel */
public final class JobPositionSelectorViewModel$ViewModel extends C21481a implements C16804c, C16805d, C16283i {

    /* renamed from: d */
    private final /* synthetic */ C16283i f42997d;

    /* renamed from: e */
    private final C16804c f42998e = this;

    /* renamed from: f */
    private final C16805d f42999f = this;

    /* renamed from: g */
    private final C40767b f43000g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f43001h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f43002i;

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorViewModel$ViewModel$a */
    static final class C14881a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14881a f43003d = new C14881a();

        C14881a() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C15541f fVar = (C15541f) it.next();
                arrayList.add(new C17680a(String.valueOf(fVar.mo42681a()), fVar.mo42682b()));
            }
            return arrayList;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorViewModel$ViewModel$b */
    static final class C14882b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14882b f43004d = new C14882b();

        C14882b() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return String.valueOf(num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorViewModel$ViewModel$c */
    /* synthetic */ class C14883c extends C41535k implements C43079p {

        /* renamed from: d */
        public static final C14883c f43005d = new C14883c();

        C14883c() {
            super(2, C41224m.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final C41224m invoke(List list, String str) {
            C41536l.m120489i(list, "p0");
            return new C41224m(list, str);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorViewModel$ViewModel$d */
    static final class C14884d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ JobPositionSelectorViewModel$ViewModel f43006d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14884d(JobPositionSelectorViewModel$ViewModel jobPositionSelectorViewModel$ViewModel) {
            super(1);
            this.f43006d = jobPositionSelectorViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41534a(C41224m mVar) {
            this.f43006d.f43001h.mo4826r(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41534a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorViewModel$ViewModel$e */
    static final class C14885e extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C14885e f43007d = new C14885e();

        C14885e() {
            super(2);
        }

        /* renamed from: a */
        public final C15541f invoke(String str, List list) {
            Object obj;
            C41536l.m120489i(str, "code");
            C41536l.m120489i(list, "list");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(String.valueOf(((C15541f) obj).mo42681a()), str)) {
                    break;
                }
            }
            C41536l.m120486f(obj);
            return (C15541f) obj;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorViewModel$ViewModel$f */
    static final class C14886f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ JobPositionSelectorViewModel$ViewModel f43008d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14886f(JobPositionSelectorViewModel$ViewModel jobPositionSelectorViewModel$ViewModel) {
            super(1);
            this.f43008d = jobPositionSelectorViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41536a(C15541f fVar) {
            JobPositionSelectorViewModel$ViewModel jobPositionSelectorViewModel$ViewModel = this.f43008d;
            C41536l.m120488h(fVar, "it");
            jobPositionSelectorViewModel$ViewModel.mo41525Vl(fVar);
            C37224b.m109962a(this.f43008d.f43002i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41536a((C15541f) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JobPositionSelectorViewModel$ViewModel(C15367e eVar, C16283i iVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "getJobPositions");
        C41536l.m120489i(iVar, "delegate");
        this.f42997d = iVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f43000g = h1;
        this.f43001h = new C1644x();
        this.f43002i = new C1644x();
        C40749p m1 = eVar.mo42457a().mo95075O().mo95040w0().mo102096m1(2);
        C40749p Y0 = m1.mo95026k0(new C16806e(C14881a.f43003d)).mo95014Y0(mo41527kr().mo94956r(new C16807f(C14882b.f43004d)).mo94949h("").mo94945B(), new C16808g(C14883c.f43005d));
        C41536l.m120488h(Y0, "positions.map {\n        …     ::Pair\n            )");
        C41205b F0 = C32343x.m95413R0(Y0).mo94981F0(new C16809h(new C14884d(this)));
        C41536l.m120488h(F0, "positions.map {\n        …ue = it\n                }");
        bindToLifecycle(F0);
        C40749p Y02 = h1.mo95014Y0(m1, new C16810i(C14885e.f43007d));
        C41536l.m120488h(Y02, "onSelectPositionId.withL…== code }!!\n            }");
        C41205b F02 = C32343x.m95413R0(Y02).mo94981F0(new C16811j(new C14886f(this)));
        C41536l.m120488h(F02, "onSelectPositionId.withL….call()\n                }");
        bindToLifecycle(F02);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final List m54647jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final String m54648kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (String) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C41224m m54649lw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m54650mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final C15541f m54651nw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C15541f) pVar.invoke(obj, obj2);
    }

    /* renamed from: C */
    public void mo41524C(String str) {
        C41536l.m120489i(str, "jobPositionId");
        this.f43000g.onNext(str);
    }

    /* renamed from: Vl */
    public void mo41525Vl(C15541f fVar) {
        C41536l.m120489i(fVar, "position");
        this.f42997d.mo41525Vl(fVar);
    }

    /* renamed from: b */
    public LiveData mo41526b() {
        return this.f43001h;
    }

    /* renamed from: kr */
    public C40744k mo41527kr() {
        return this.f42997d.mo41527kr();
    }

    /* renamed from: p */
    public LiveData mo41528p() {
        return this.f43002i;
    }

    /* renamed from: qw */
    public final C16804c mo41529qw() {
        return this.f42998e;
    }

    /* renamed from: rw */
    public final C16805d mo41530rw() {
        return this.f42999f;
    }
}
