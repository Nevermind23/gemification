package nb1;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import dd1.C40578p1;
import gb1.C32381m;
import gb1.C32392v;
import ha1.C15458b;
import he1.C41238w;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb1.C37119a;
import p341ge.bog.sso_client.onboarding.model.AddressElementUiModel;
import p341ge.bog.sso_client.onboarding.model.AddressUiModel;
import p341ge.bog.sso_client.onboarding.model.LegalAddressUiModel;
import qb1.C38229a;
import qb1.C38230b;
import qb1.C38231c;
import qb1.C38232d;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: nb1.k */
public interface C37417k {

    /* renamed from: nb1.k$a */
    public static final class C37418a {

        /* renamed from: a */
        private final AddressUiModel f89940a;

        /* renamed from: b */
        private final boolean f89941b;

        public C37418a(AddressUiModel addressUiModel, boolean z) {
            C41536l.m120489i(addressUiModel, "actualAddress");
            this.f89940a = addressUiModel;
            this.f89941b = z;
        }

        /* renamed from: b */
        public static /* synthetic */ C37418a m110256b(C37418a aVar, AddressUiModel addressUiModel, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                addressUiModel = aVar.f89940a;
            }
            if ((i & 2) != 0) {
                z = aVar.f89941b;
            }
            return aVar.mo90509a(addressUiModel, z);
        }

        /* renamed from: a */
        public final C37418a mo90509a(AddressUiModel addressUiModel, boolean z) {
            C41536l.m120489i(addressUiModel, "actualAddress");
            return new C37418a(addressUiModel, z);
        }

        /* renamed from: c */
        public final AddressUiModel mo90510c() {
            return this.f89940a;
        }

        /* renamed from: d */
        public final boolean mo90511d() {
            return this.f89941b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37418a)) {
                return false;
            }
            C37418a aVar = (C37418a) obj;
            return C41536l.m120484d(this.f89940a, aVar.f89940a) && this.f89941b == aVar.f89941b;
        }

        public int hashCode() {
            int hashCode = this.f89940a.hashCode() * 31;
            boolean z = this.f89941b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "ActualAddressData(actualAddress=" + this.f89940a + ", sameAsLegal=" + this.f89941b + ')';
        }
    }

    /* renamed from: nb1.k$b */
    public interface C37419b {
        /* renamed from: Lb */
        void mo90515Lb(boolean z);

        /* renamed from: Ql */
        void mo90516Ql();

        /* renamed from: Ub */
        void mo90517Ub(AddressElementUiModel addressElementUiModel, C37119a aVar);

        /* renamed from: Ya */
        void mo90518Ya();

        /* renamed from: i7 */
        void mo90519i7();

        /* renamed from: nc */
        void mo90520nc();
    }

    /* renamed from: nb1.k$c */
    public static final class C37420c extends C15458b implements C37417k, C37419b, C37434d {

        /* renamed from: h */
        private final C38231c f89942h;

        /* renamed from: i */
        private final C38230b f89943i;

        /* renamed from: j */
        private final C38232d f89944j;

        /* renamed from: k */
        private final C38229a f89945k;

        /* renamed from: l */
        private boolean f89946l;

        /* renamed from: m */
        private final C1644x f89947m = new C1644x();

        /* renamed from: n */
        private final C1644x f89948n = new C1644x();

        /* renamed from: o */
        private final C1644x f89949o = new C1644x();

        /* renamed from: p */
        private final C1644x f89950p = new C1644x();

        /* renamed from: q */
        private final C1644x f89951q = new C1644x();

        /* renamed from: r */
        private final C1644x f89952r = new C1644x();
        /* access modifiers changed from: private */

        /* renamed from: s */
        public LegalAddressUiModel f89953s;

        /* renamed from: t */
        private C37418a f89954t = new C37418a(new AddressUiModel(new AddressElementUiModel("", ""), new AddressElementUiModel("", ""), ""), false);
        /* access modifiers changed from: private */

        /* renamed from: u */
        public List f89955u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public final HashMap f89956v = new HashMap();

        /* renamed from: w */
        private final C37419b f89957w = this;

        /* renamed from: x */
        private final C37434d f89958x = this;

        /* renamed from: nb1.k$c$a */
        public /* synthetic */ class C37421a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f89959a;

            static {
                int[] iArr = new int[C37119a.values().length];
                iArr[C37119a.COUNTRY.ordinal()] = 1;
                iArr[C37119a.REGION.ordinal()] = 2;
                iArr[C37119a.ADDRESS_LINE.ordinal()] = 3;
                f89959a = iArr;
            }
        }

        /* renamed from: nb1.k$c$b */
        /* synthetic */ class C37422b extends C41535k implements C43064a {
            C37422b(Object obj) {
                super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
            }

            /* renamed from: b */
            public final void mo90533b() {
                C32392v.m95657i((C1644x) this.receiver);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo90533b();
                return C41238w.f97225a;
            }
        }

        /* renamed from: nb1.k$c$c */
        /* synthetic */ class C37423c extends C41535k implements C43075l {
            C37423c(Object obj) {
                super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
            }

            /* renamed from: b */
            public final void mo90534b(Throwable th) {
                C32392v.m95656h((C1644x) this.receiver, th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo90534b((Throwable) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: nb1.k$c$d */
        /* synthetic */ class C37424d extends C41535k implements C43064a {
            C37424d(Object obj) {
                super(0, obj, C32392v.class, "setSuccess", "setSuccess(Landroidx/lifecycle/MutableLiveData;)V", 1);
            }

            /* renamed from: b */
            public final void mo90535b() {
                C32392v.m95658j((C1644x) this.receiver);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo90535b();
                return C41238w.f97225a;
            }
        }

        /* renamed from: nb1.k$c$e */
        /* synthetic */ class C37425e extends C41535k implements C43064a {
            C37425e(Object obj) {
                super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
            }

            /* renamed from: b */
            public final void mo90536b() {
                C32392v.m95657i((C1644x) this.receiver);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo90536b();
                return C41238w.f97225a;
            }
        }

        /* renamed from: nb1.k$c$f */
        static final class C37426f extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C37420c f89960d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37426f(C37420c cVar) {
                super(1);
                this.f89960d = cVar;
            }

            /* renamed from: a */
            public final void mo90537a(LegalAddressUiModel legalAddressUiModel) {
                C41536l.m120489i(legalAddressUiModel, "it");
                this.f89960d.f89953s = legalAddressUiModel;
                C1644x qw = this.f89960d.mo90524d3();
                LegalAddressUiModel jw = this.f89960d.f89953s;
                if (jw == null) {
                    C41536l.m120506z("legalAddressValue");
                    jw = null;
                }
                C32392v.m95659k(qw, jw);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo90537a((LegalAddressUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: nb1.k$c$g */
        /* synthetic */ class C37427g extends C41535k implements C43075l {
            C37427g(Object obj) {
                super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
            }

            /* renamed from: b */
            public final void mo90538b(Throwable th) {
                C32392v.m95656h((C1644x) this.receiver, th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo90538b((Throwable) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: nb1.k$c$h */
        /* synthetic */ class C37428h extends C41535k implements C43064a {
            C37428h(Object obj) {
                super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
            }

            /* renamed from: b */
            public final void mo90539b() {
                C32392v.m95657i((C1644x) this.receiver);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo90539b();
                return C41238w.f97225a;
            }
        }

        /* renamed from: nb1.k$c$i */
        static final class C37429i extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C37420c f89961d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37429i(C37420c cVar) {
                super(1);
                this.f89961d = cVar;
            }

            /* renamed from: a */
            public final void mo90540a(List list) {
                C41536l.m120489i(list, "it");
                this.f89961d.f89955u = list;
                C32392v.m95659k(this.f89961d.mo90523Tk(), list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo90540a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: nb1.k$c$j */
        /* synthetic */ class C37430j extends C41535k implements C43075l {
            C37430j(Object obj) {
                super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
            }

            /* renamed from: b */
            public final void mo90541b(Throwable th) {
                C32392v.m95656h((C1644x) this.receiver, th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo90541b((Throwable) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: nb1.k$c$k */
        /* synthetic */ class C37431k extends C41535k implements C43064a {
            C37431k(Object obj) {
                super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
            }

            /* renamed from: b */
            public final void mo90542b() {
                C32392v.m95657i((C1644x) this.receiver);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo90542b();
                return C41238w.f97225a;
            }
        }

        /* renamed from: nb1.k$c$l */
        /* synthetic */ class C37432l extends C41535k implements C43075l {
            C37432l(Object obj) {
                super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
            }

            /* renamed from: b */
            public final void mo90543b(Throwable th) {
                C32392v.m95656h((C1644x) this.receiver, th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo90543b((Throwable) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: nb1.k$c$m */
        static final class C37433m extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C37420c f89962d;

            /* renamed from: e */
            final /* synthetic */ AddressElementUiModel f89963e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37433m(C37420c cVar, AddressElementUiModel addressElementUiModel) {
                super(1);
                this.f89962d = cVar;
                this.f89963e = addressElementUiModel;
            }

            /* renamed from: a */
            public final void mo90544a(List list) {
                C41536l.m120489i(list, "it");
                this.f89962d.f89956v.put(this.f89963e.mo88604b(), list);
                C32392v.m95659k(this.f89962d.mo90522Fm(), list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo90544a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37420c(C38231c cVar, C38230b bVar, C38232d dVar, C38229a aVar) {
            super((C40578p1) null, 1, (DefaultConstructorMarker) null);
            C41536l.m120489i(cVar, "getLegalAddress");
            C41536l.m120489i(bVar, "getCountries");
            C41536l.m120489i(dVar, "getRegions");
            C41536l.m120489i(aVar, "addActualAddress");
            this.f89942h = cVar;
            this.f89943i = bVar;
            this.f89944j = dVar;
            this.f89945k = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
        /* renamed from: mw */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m110270mw() {
            /*
                r7 = this;
                nb1.k$a r0 = r7.f89954t
                ge.bog.sso_client.onboarding.model.AddressUiModel r0 = r0.mo90510c()
                androidx.lifecycle.x r1 = r7.mo90532zi()
                boolean r2 = r7.f89946l
                r3 = 1
                if (r2 != 0) goto L_0x0076
                r2 = 2
                ge.bog.sso_client.onboarding.model.AddressElementUiModel[] r2 = new p341ge.bog.sso_client.onboarding.model.AddressElementUiModel[r2]
                ge.bog.sso_client.onboarding.model.AddressElementUiModel r4 = r0.mo88619f()
                r5 = 0
                r2[r5] = r4
                ge.bog.sso_client.onboarding.model.AddressElementUiModel r4 = r0.mo88617e()
                r2[r3] = r4
                java.util.List r2 = ie1.C41341q.m119910m(r2)
                java.util.ArrayList r4 = new java.util.ArrayList
                r6 = 10
                int r6 = ie1.C41343r.m119925u(r2, r6)
                r4.<init>(r6)
                java.util.Iterator r2 = r2.iterator()
            L_0x0032:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0046
                java.lang.Object r6 = r2.next()
                ge.bog.sso_client.onboarding.model.AddressElementUiModel r6 = (p341ge.bog.sso_client.onboarding.model.AddressElementUiModel) r6
                java.lang.String r6 = r6.mo88604b()
                r4.add(r6)
                goto L_0x0032
            L_0x0046:
                java.lang.String r0 = r0.mo88615d()
                java.util.List r0 = ie1.C41358y.m120024n0(r4, r0)
                boolean r2 = r0 instanceof java.util.Collection
                if (r2 == 0) goto L_0x005a
                boolean r2 = r0.isEmpty()
                if (r2 == 0) goto L_0x005a
            L_0x0058:
                r0 = r3
                goto L_0x0072
            L_0x005a:
                java.util.Iterator r0 = r0.iterator()
            L_0x005e:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0058
                java.lang.Object r2 = r0.next()
                java.lang.String r2 = (java.lang.String) r2
                boolean r2 = cf1.C40439w.m117118v(r2)
                r2 = r2 ^ r3
                if (r2 != 0) goto L_0x005e
                r0 = r5
            L_0x0072:
                if (r0 == 0) goto L_0x0075
                goto L_0x0076
            L_0x0075:
                r3 = r5
            L_0x0076:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                r1.mo4823o(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nb1.C37417k.C37420c.m110270mw():void");
        }

        /* renamed from: H5 */
        public C37419b mo90507H5() {
            return this.f89957w;
        }

        /* renamed from: I3 */
        public C37434d mo90508I3() {
            return this.f89958x;
        }

        /* renamed from: Lb */
        public void mo90515Lb(boolean z) {
            C37418a aVar;
            LegalAddressUiModel legalAddressUiModel;
            this.f89946l = z;
            if (z && (legalAddressUiModel = this.f89953s) != null) {
                LegalAddressUiModel legalAddressUiModel2 = null;
                if (legalAddressUiModel == null) {
                    C41536l.m120506z("legalAddressValue");
                    legalAddressUiModel = null;
                }
                if (legalAddressUiModel.mo88645a() != null) {
                    LegalAddressUiModel legalAddressUiModel3 = this.f89953s;
                    if (legalAddressUiModel3 == null) {
                        C41536l.m120506z("legalAddressValue");
                    } else {
                        legalAddressUiModel2 = legalAddressUiModel3;
                    }
                    AddressUiModel a = legalAddressUiModel2.mo88645a();
                    C41536l.m120486f(a);
                    aVar = new C37418a(a, true);
                    this.f89954t = aVar;
                    mo90521Fc().mo4823o(this.f89954t);
                    m110270mw();
                }
            }
            aVar = new C37418a(new AddressUiModel(new AddressElementUiModel("", ""), new AddressElementUiModel("", ""), ""), false);
            this.f89954t = aVar;
            mo90521Fc().mo4823o(this.f89954t);
            m110270mw();
        }

        /* renamed from: Ql */
        public void mo90516Ql() {
            mo90521Fc().mo4823o(this.f89954t);
            C32381m.m95619h(this.f89942h.mo91761a(), new C37425e(mo90524d3()), new C37426f(this), new C37427g(mo90524d3()));
        }

        /* renamed from: Ub */
        public void mo90517Ub(AddressElementUiModel addressElementUiModel, C37119a aVar) {
            C37418a aVar2;
            C41536l.m120489i(addressElementUiModel, "address");
            C41536l.m120489i(aVar, "addressType");
            int i = C37421a.f89959a[aVar.ordinal()];
            if (i == 1) {
                C37418a aVar3 = this.f89954t;
                aVar2 = C37418a.m110256b(aVar3, AddressUiModel.m107111b(aVar3.mo90510c(), addressElementUiModel, (AddressElementUiModel) null, (String) null, 6, (Object) null), false, 2, (Object) null);
            } else if (i == 2) {
                C37418a aVar4 = this.f89954t;
                aVar2 = C37418a.m110256b(aVar4, AddressUiModel.m107111b(aVar4.mo90510c(), (AddressElementUiModel) null, addressElementUiModel, (String) null, 5, (Object) null), false, 2, (Object) null);
            } else if (i == 3) {
                C37418a aVar5 = this.f89954t;
                aVar2 = C37418a.m110256b(aVar5, AddressUiModel.m107111b(aVar5.mo90510c(), (AddressElementUiModel) null, (AddressElementUiModel) null, addressElementUiModel.mo88604b(), 3, (Object) null), false, 2, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.f89954t = aVar2;
            if (aVar != C37119a.ADDRESS_LINE) {
                mo90521Fc().mo4823o(this.f89954t);
            }
            m110270mw();
        }

        /* renamed from: Ya */
        public void mo90518Ya() {
            boolean z;
            AddressUiModel c = this.f89954t.mo90510c();
            C38229a aVar = this.f89945k;
            String b = c.mo88617e().mo88604b();
            String b2 = c.mo88619f().mo88604b();
            String d = c.mo88615d();
            LegalAddressUiModel legalAddressUiModel = this.f89953s;
            if (legalAddressUiModel == null) {
                C41536l.m120506z("legalAddressValue");
                legalAddressUiModel = null;
            }
            if (legalAddressUiModel.mo88645a() == null) {
                z = true;
            } else {
                z = false;
            }
            C32381m.m95618g(aVar.mo91759a(b, b2, d, z), new C37422b(mo90531ve()), new C37424d(mo90531ve()), new C37423c(mo90531ve()));
        }

        /* renamed from: i7 */
        public void mo90519i7() {
            if (this.f89955u != null) {
                C1644x sw = mo90523Tk();
                List list = this.f89955u;
                if (list == null) {
                    C41536l.m120506z("countriesList");
                    list = null;
                }
                C32392v.m95659k(sw, list);
                return;
            }
            C32381m.m95619h(this.f89943i.mo91760a(), new C37428h(mo90523Tk()), new C37429i(this), new C37430j(mo90523Tk()));
        }

        /* renamed from: nc */
        public void mo90520nc() {
            AddressElementUiModel e = this.f89954t.mo90510c().mo88617e();
            List list = (List) this.f89956v.get(e.mo88604b());
            if (list != null) {
                C32392v.m95659k(mo90522Fm(), list);
                return;
            }
            C32381m.m95619h(this.f89944j.mo91762a(e.mo88604b()), new C37431k(mo90522Fm()), new C37433m(this, e), new C37432l(mo90522Fm()));
        }

        /* renamed from: nw */
        public C1644x mo90521Fc() {
            return this.f89950p;
        }

        /* renamed from: ow */
        public C1644x mo90531ve() {
            return this.f89952r;
        }

        /* renamed from: pw */
        public C1644x mo90532zi() {
            return this.f89951q;
        }

        /* renamed from: qw */
        public C1644x mo90524d3() {
            return this.f89949o;
        }

        /* renamed from: rw */
        public C1644x mo90522Fm() {
            return this.f89948n;
        }

        /* renamed from: sw */
        public C1644x mo90523Tk() {
            return this.f89947m;
        }
    }

    /* renamed from: nb1.k$d */
    public interface C37434d {
        /* renamed from: Fc */
        LiveData mo90521Fc();

        /* renamed from: Fm */
        LiveData mo90522Fm();

        /* renamed from: Tk */
        LiveData mo90523Tk();

        /* renamed from: d3 */
        LiveData mo90524d3();

        /* renamed from: ve */
        LiveData mo90531ve();

        /* renamed from: zi */
        LiveData mo90532zi();
    }

    /* renamed from: H5 */
    C37419b mo90507H5();

    /* renamed from: I3 */
    C37434d mo90508I3();
}
