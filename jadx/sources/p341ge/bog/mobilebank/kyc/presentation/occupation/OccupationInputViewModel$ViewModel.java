package p341ge.bog.mobilebank.kyc.presentation.occupation;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40749p;
import ee1.C40767b;
import g91.C32343x;
import gn0.C15368f;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import hn0.C15541f;
import hn0.C15542g;
import hn0.C15543h;
import java.util.Iterator;
import java.util.List;
import jn0.C16255a0;
import jn0.C16275b0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nn0.C17121i;
import nn0.C17122j;
import nn0.C17123k;
import nn0.C17124l;
import nn0.C17125m;
import nn0.C17126n;
import nn0.C17127o;
import nn0.C17128p;
import nn0.C17131s;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43082s;

/* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputViewModel$ViewModel */
public final class OccupationInputViewModel$ViewModel extends C21481a implements C17121i, C17122j, C16275b0 {

    /* renamed from: d */
    private final /* synthetic */ C16275b0 f43026d;

    /* renamed from: e */
    private final C17121i f43027e = this;

    /* renamed from: f */
    private final C17122j f43028f = this;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1644x f43029g = new C1644x();

    /* renamed from: h */
    private final C40767b f43030h;

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputViewModel$ViewModel$a */
    static final class C14899a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OccupationInputViewModel$ViewModel f43031d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14899a(OccupationInputViewModel$ViewModel occupationInputViewModel$ViewModel) {
            super(1);
            this.f43031d = occupationInputViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41554a(C15543h hVar) {
            int i;
            OccupationInputViewModel$ViewModel occupationInputViewModel$ViewModel = this.f43031d;
            Integer d = hVar.mo42696d();
            if (d != null) {
                i = d.intValue();
            } else {
                i = -1;
            }
            occupationInputViewModel$ViewModel.mo41546M9(i);
            OccupationInputViewModel$ViewModel occupationInputViewModel$ViewModel2 = this.f43031d;
            C15541f a = hVar.mo42693a();
            if (a == null) {
                a = C16255a0.f46066v.mo43270c();
            }
            occupationInputViewModel$ViewModel2.mo41525Vl(a);
            OccupationInputViewModel$ViewModel occupationInputViewModel$ViewModel3 = this.f43031d;
            String c = hVar.mo42695c();
            String str = "";
            if (c == null) {
                c = str;
            }
            occupationInputViewModel$ViewModel3.mo41553v2(c);
            OccupationInputViewModel$ViewModel occupationInputViewModel$ViewModel4 = this.f43031d;
            String c2 = hVar.mo42695c();
            if (c2 != null) {
                str = c2;
            }
            occupationInputViewModel$ViewModel4.mo41548Yk(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41554a((C15543h) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputViewModel$ViewModel$b */
    static final class C14900b extends C41537m implements C43082s {

        /* renamed from: d */
        public static final C14900b f43032d = new C14900b();

        C14900b() {
            super(5);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
            if (r10 == false) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
            if (r3 != false) goto L_0x0068;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final nn0.C17131s mo41133P0(hn0.C15542g r12, hn0.C15541f r13, java.lang.String r14, java.lang.String r15, java.util.List r16) {
            /*
                r11 = this;
                r0 = r12
                r1 = r13
                java.lang.String r2 = "selectedOccupation"
                kotlin.jvm.internal.C41536l.m120489i(r12, r2)
                java.lang.String r2 = "jobPosition"
                kotlin.jvm.internal.C41536l.m120489i(r13, r2)
                java.lang.String r2 = "employer"
                r5 = r14
                kotlin.jvm.internal.C41536l.m120489i(r14, r2)
                java.lang.String r2 = "business"
                r7 = r15
                kotlin.jvm.internal.C41536l.m120489i(r15, r2)
                java.lang.String r2 = "occs"
                r8 = r16
                kotlin.jvm.internal.C41536l.m120489i(r8, r2)
                jn0.a0$d r2 = jn0.C16255a0.f46066v
                hn0.g r3 = r2.mo43271d()
                r4 = 1
                r6 = 0
                if (r0 == r3) goto L_0x002b
                r3 = r4
                goto L_0x002c
            L_0x002b:
                r3 = r6
            L_0x002c:
                r9 = 0
                if (r3 == 0) goto L_0x0031
                r3 = r0
                goto L_0x0032
            L_0x0031:
                r3 = r9
            L_0x0032:
                if (r3 == 0) goto L_0x0069
                boolean r10 = r3.mo42689d()
                if (r10 != 0) goto L_0x0040
                boolean r10 = r3.mo42688c()
                if (r10 == 0) goto L_0x0068
            L_0x0040:
                boolean r10 = r3.mo42689d()
                if (r10 == 0) goto L_0x0051
                int r10 = r15.length()
                if (r10 <= 0) goto L_0x004e
                r10 = r4
                goto L_0x004f
            L_0x004e:
                r10 = r6
            L_0x004f:
                if (r10 != 0) goto L_0x0068
            L_0x0051:
                boolean r3 = r3.mo42688c()
                if (r3 == 0) goto L_0x0069
                hn0.f r3 = r2.mo43270c()
                if (r1 == r3) goto L_0x0069
                int r3 = r14.length()
                if (r3 <= 0) goto L_0x0065
                r3 = r4
                goto L_0x0066
            L_0x0065:
                r3 = r6
            L_0x0066:
                if (r3 == 0) goto L_0x0069
            L_0x0068:
                r6 = r4
            L_0x0069:
                r10 = r6
                int r0 = r12.mo42687b()
                hn0.f r2 = r2.mo43270c()
                boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r13, r2)
                r2 = r2 ^ r4
                if (r2 == 0) goto L_0x007a
                goto L_0x007b
            L_0x007a:
                r1 = r9
            L_0x007b:
                if (r1 == 0) goto L_0x0081
                java.lang.String r9 = r1.mo42682b()
            L_0x0081:
                if (r9 != 0) goto L_0x0087
                java.lang.String r1 = ""
                r6 = r1
                goto L_0x0088
            L_0x0087:
                r6 = r9
            L_0x0088:
                nn0.s r1 = new nn0.s
                r3 = r1
                r4 = r0
                r5 = r14
                r7 = r15
                r8 = r16
                r9 = r10
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputViewModel$ViewModel.C14900b.mo41133P0(hn0.g, hn0.f, java.lang.String, java.lang.String, java.util.List):nn0.s");
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputViewModel$ViewModel$c */
    static final class C14901c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OccupationInputViewModel$ViewModel f43033d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14901c(OccupationInputViewModel$ViewModel occupationInputViewModel$ViewModel) {
            super(1);
            this.f43033d = occupationInputViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41556a(C17131s sVar) {
            this.f43033d.f43029g.mo4826r(sVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41556a((C17131s) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputViewModel$ViewModel$d */
    static final class C14902d extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C14902d f43034d = new C14902d();

        C14902d() {
            super(2);
        }

        /* renamed from: a */
        public final C15542g invoke(Integer num, List list) {
            Object obj;
            boolean z;
            C41536l.m120489i(num, "selected");
            C41536l.m120489i(list, "list");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int b = ((C15542g) obj).mo42687b();
                if (num != null && b == num.intValue()) {
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
            C15542g gVar = (C15542g) obj;
            if (gVar == null) {
                return C16255a0.f46066v.mo43271d();
            }
            return gVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputViewModel$ViewModel$e */
    static final class C14903e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OccupationInputViewModel$ViewModel f43035d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14903e(OccupationInputViewModel$ViewModel occupationInputViewModel$ViewModel) {
            super(1);
            this.f43035d = occupationInputViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41558a(C15542g gVar) {
            OccupationInputViewModel$ViewModel occupationInputViewModel$ViewModel = this.f43035d;
            C41536l.m120488h(gVar, "it");
            occupationInputViewModel$ViewModel.mo41547Rf(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41558a((C15542g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputViewModel$ViewModel$f */
    static final class C14904f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14904f f43036d = new C14904f();

        C14904f() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C15543h hVar) {
            C41536l.m120489i(hVar, "it");
            return hVar.mo42694b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OccupationInputViewModel$ViewModel(C15368f fVar, C16275b0 b0Var) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(fVar, "getOccupationData");
        C41536l.m120489i(b0Var, "delegate");
        this.f43026d = b0Var;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Int>()");
        this.f43030h = h1;
        C40749p m1 = fVar.mo42458a().mo95075O().mo95040w0().mo102096m1(3);
        C41536l.m120488h(m1, "data");
        C41205b F0 = C32343x.m95413R0(m1).mo94981F0(new C17123k(new C14899a(this)));
        C41536l.m120488h(F0, "data.observeOnMainThread…mpty())\n                }");
        bindToLifecycle(F0);
        C40749p k0 = m1.mo95026k0(new C17124l(C14904f.f43036d));
        C40749p k = C40749p.m118045k(mo41550oa(), mo41544Kl(), mo41543Ar(), mo41545Kt(), k0, new C17125m(C14900b.f43032d));
        C41536l.m120488h(k, "combineLatest(\n         …          )\n            }");
        C41205b F02 = C32343x.m95413R0(k).mo94981F0(new C17126n(new C14901c(this)));
        C41536l.m120488h(F02, "combineLatest(\n         …ue = it\n                }");
        bindToLifecycle(F02);
        C40749p Y0 = h1.mo95014Y0(k0, new C17127o(C14902d.f43034d));
        C41536l.m120488h(Y0, "onSelectOccupationId.wit…_OCCUPATION\n            }");
        C41205b F03 = C32343x.m95413R0(Y0).mo94981F0(new C17128p(new C14903e(this)));
        C41536l.m120488h(F03, "onSelectOccupationId.wit…ted(it)\n                }");
        bindToLifecycle(F03);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final List m54682jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final C17131s m54683kw(C43082s sVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C41536l.m120489i(sVar, "$tmp0");
        return (C17131s) sVar.mo41133P0(obj, obj2, obj3, obj4, obj5);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final void m54684lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C15542g m54685mw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C15542g) pVar.invoke(obj, obj2);
    }

    /* renamed from: Ar */
    public C40749p mo41543Ar() {
        return this.f43026d.mo41543Ar();
    }

    /* renamed from: Kl */
    public C40749p mo41544Kl() {
        return this.f43026d.mo41544Kl();
    }

    /* renamed from: Kt */
    public C40749p mo41545Kt() {
        return this.f43026d.mo41545Kt();
    }

    /* renamed from: M9 */
    public void mo41546M9(int i) {
        this.f43030h.onNext(Integer.valueOf(i));
    }

    /* renamed from: Rf */
    public void mo41547Rf(C15542g gVar) {
        C41536l.m120489i(gVar, "occupation");
        this.f43026d.mo41547Rf(gVar);
    }

    /* renamed from: Vl */
    public void mo41525Vl(C15541f fVar) {
        C41536l.m120489i(fVar, "position");
        this.f43026d.mo41525Vl(fVar);
    }

    /* renamed from: Yk */
    public void mo41548Yk(String str) {
        C41536l.m120489i(str, "businessName");
        this.f43026d.mo41548Yk(str);
    }

    /* renamed from: b */
    public LiveData mo41549b() {
        return this.f43029g;
    }

    /* renamed from: oa */
    public C40749p mo41550oa() {
        return this.f43026d.mo41550oa();
    }

    /* renamed from: ow */
    public final C17121i mo41551ow() {
        return this.f43027e;
    }

    /* renamed from: pw */
    public final C17122j mo41552pw() {
        return this.f43028f;
    }

    /* renamed from: v2 */
    public void mo41553v2(String str) {
        C41536l.m120489i(str, "company");
        this.f43026d.mo41553v2(str);
    }
}
