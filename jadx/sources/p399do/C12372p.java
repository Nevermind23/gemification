package p399do;

import com.google.gson.Gson;
import ed1.C40734b;
import ed1.C40762x;
import he1.C41238w;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import m00.C26116a;
import p341ge.bog.mobilebank.categorypackages.data.entity.ApplicationFieldsEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageActivateResponseEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageLimitApiModel;
import p341ge.bog.mobilebank.categorypackages.data.entity.ServiceCenterEntity;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p370bo.C10343a;
import p384co.C10520a;
import p441go.C15376d;
import p455ho.C15548b;
import p455ho.C15554g;
import p455ho.C15557j;
import p455ho.C15558k;
import p483jo.C16301a;
import ue1.C43075l;

/* renamed from: do.p */
public final class C12372p implements C16301a {

    /* renamed from: j */
    public static final C12373a f37037j = new C12373a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10520a f37038d;

    /* renamed from: e */
    private final C26116a f37039e;

    /* renamed from: f */
    private final C10343a f37040f;

    /* renamed from: g */
    private final Gson f37041g;

    /* renamed from: h */
    private AtomicReference f37042h = new AtomicReference();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AtomicReference f37043i = new AtomicReference();

    /* renamed from: do.p$a */
    public static final class C12373a {

        /* renamed from: do.p$a$a */
        public /* synthetic */ class C12374a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f37044a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    go.d$a$a[] r0 = p441go.C15376d.C15377a.C15378a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    go.d$a$a r1 = p441go.C15376d.C15377a.C15378a.RB     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    go.d$a$a r1 = p441go.C15376d.C15377a.C15378a.SOLO     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    go.d$a$a r1 = p441go.C15376d.C15377a.C15378a.BECOME_SOLO     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f37044a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p399do.C12372p.C12373a.C12374a.<clinit>():void");
            }
        }

        private C12373a() {
        }

        public /* synthetic */ C12373a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo32974a(C15376d.C15377a.C15378a aVar) {
            C41536l.m120489i(aVar, "<this>");
            int i = C12374a.f37044a[aVar.ordinal()];
            if (i == 1) {
                return "RB_PACKAGES_GENERAL_BENEFITS";
            }
            if (i == 2) {
                return "SOLO_PACKAGES_GENERAL_BENEFITS";
            }
            if (i == 3) {
                return "BECOME_SOLO_GENERAL_BENEFITS";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: do.p$b */
    /* synthetic */ class C12375b extends C41535k implements C43075l {
        C12375b(Object obj) {
            super(1, obj, C10520a.class, "transform", "transform(Lge/bog/mobilebank/categorypackages/data/entity/PackageActivateResponseEntity;)Lge/bog/mobilebank/categorypackages/domain/model/PackageActivateResponse;", 0);
        }

        /* renamed from: b */
        public final C15554g invoke(PackageActivateResponseEntity packageActivateResponseEntity) {
            C41536l.m120489i(packageActivateResponseEntity, "p0");
            return ((C10520a) this.receiver).mo27252f(packageActivateResponseEntity);
        }
    }

    /* renamed from: do.p$c */
    /* synthetic */ class C12376c extends C41535k implements C43075l {
        C12376c(Object obj) {
            super(1, obj, C26116a.class, "transform", "transform(Lge/bog/mobilebank/cleanarch/precontract/data/entity/PreContractEntity;)Lge/bog/mobilebank/domain/precontract/model/PreContract;", 0);
        }

        /* renamed from: b */
        public final C25950a invoke(PreContractEntity preContractEntity) {
            C41536l.m120489i(preContractEntity, "p0");
            return ((C26116a) this.receiver).mo65027a(preContractEntity);
        }
    }

    /* renamed from: do.p$d */
    /* synthetic */ class C12377d extends C41535k implements C43075l {
        C12377d(Object obj) {
            super(1, obj, C26116a.class, "transform", "transform(Lge/bog/mobilebank/cleanarch/precontract/data/entity/PreContractEntity;)Lge/bog/mobilebank/domain/precontract/model/PreContract;", 0);
        }

        /* renamed from: b */
        public final C25950a invoke(PreContractEntity preContractEntity) {
            C41536l.m120489i(preContractEntity, "p0");
            return ((C26116a) this.receiver).mo65027a(preContractEntity);
        }
    }

    /* renamed from: do.p$e */
    /* synthetic */ class C12378e extends C41535k implements C43075l {
        C12378e(Object obj) {
            super(1, obj, C10520a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C10520a) this.receiver).mo27256j(list);
        }
    }

    /* renamed from: do.p$f */
    /* synthetic */ class C12379f extends C41535k implements C43075l {
        C12379f(Object obj) {
            super(1, obj, C10520a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C10520a) this.receiver).mo27249a(list);
        }
    }

    /* renamed from: do.p$g */
    /* synthetic */ class C12380g extends C41535k implements C43075l {
        C12380g(Object obj) {
            super(1, obj, C10520a.class, "transform", "transformPackageBenefitEntities(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C10520a) this.receiver).mo27257k(list);
        }
    }

    /* renamed from: do.p$h */
    static final class C12381h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12372p f37045d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12381h(C12372p pVar) {
            super(1);
            this.f37045d = pVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f37045d.f37038d.mo27258l(list);
        }
    }

    /* renamed from: do.p$i */
    /* synthetic */ class C12382i extends C41535k implements C43075l {
        C12382i(Object obj) {
            super(1, obj, C10520a.class, "convertPackageItems", "convertPackageItems(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C10520a) this.receiver).mo27250c(list);
        }
    }

    /* renamed from: do.p$j */
    static final class C12383j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12372p f37046d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12383j(C12372p pVar) {
            super(1);
            this.f37046d = pVar;
        }

        /* renamed from: a */
        public final void mo32983a(List list) {
            this.f37046d.f37043i.set(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo32983a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: do.p$k */
    static final class C12384k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12372p f37047d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12384k(C12372p pVar) {
            super(1);
            this.f37047d = pVar;
        }

        /* renamed from: a */
        public final C15557j invoke(PackageLimitApiModel packageLimitApiModel) {
            C41536l.m120489i(packageLimitApiModel, "it");
            return this.f37047d.f37038d.mo27259m(packageLimitApiModel);
        }
    }

    /* renamed from: do.p$l */
    /* synthetic */ class C12385l extends C41535k implements C43075l {
        C12385l(Object obj) {
            super(1, obj, C10520a.class, "transform", "transform(Lge/bog/mobilebank/categorypackages/data/entity/ApplicationFieldsEntity;)Lge/bog/mobilebank/categorypackages/domain/model/ApplicationFields;", 0);
        }

        /* renamed from: b */
        public final C15548b invoke(ApplicationFieldsEntity applicationFieldsEntity) {
            C41536l.m120489i(applicationFieldsEntity, "p0");
            return ((C10520a) this.receiver).mo27251d(applicationFieldsEntity);
        }
    }

    /* renamed from: do.p$m */
    /* synthetic */ class C12386m extends C41535k implements C43075l {
        C12386m(Object obj) {
            super(1, obj, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final void mo32986b(C15548b bVar) {
            ((AtomicReference) this.receiver).set(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo32986b((C15548b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: do.p$n */
    /* synthetic */ class C12387n extends C41535k implements C43075l {
        C12387n(Object obj) {
            super(1, obj, C10520a.class, "transform", "transform(Lge/bog/mobilebank/categorypackages/data/entity/ServiceCenterEntity;)Lge/bog/mobilebank/categorypackages/domain/model/ServiceCenter;", 0);
        }

        /* renamed from: b */
        public final C15558k invoke(ServiceCenterEntity serviceCenterEntity) {
            C41536l.m120489i(serviceCenterEntity, "p0");
            return ((C10520a) this.receiver).mo27254h(serviceCenterEntity);
        }
    }

    /* renamed from: do.p$o */
    /* synthetic */ class C12388o extends C41535k implements C43075l {
        C12388o(Object obj) {
            super(1, obj, C10520a.class, "transform", "transformTransactionsEntities(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C10520a) this.receiver).mo27260n(list);
        }
    }

    /* renamed from: do.p$p */
    static final class C12389p extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C12389p f37048d = new C12389p();

        C12389p() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(YesNoApiEntity yesNoApiEntity) {
            boolean z;
            C41536l.m120489i(yesNoApiEntity, "it");
            if (yesNoApiEntity == YesNoApiEntity.YES) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C12372p(C10520a aVar, C26116a aVar2, C10343a aVar3, Gson gson) {
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(aVar2, "preContractMapper");
        C41536l.m120489i(aVar3, "service");
        C41536l.m120489i(gson, "gson");
        this.f37038d = aVar;
        this.f37039e = aVar2;
        this.f37040f = aVar3;
        this.f37041g = gson;
    }

    /* access modifiers changed from: private */
    /* renamed from: A4 */
    public static final C15557j m47324A4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C15557j) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: B4 */
    public static final C15548b m47325B4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C15548b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public static final void m47326C4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public static final C15558k m47327D4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C15558k) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: E4 */
    public static final List m47328E4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: F4 */
    public static final Boolean m47329F4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public static final C15554g m47347r4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C15554g) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final C25950a m47348s4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25950a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static final C25950a m47349t4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25950a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static final List m47350u4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static final List m47351v4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public static final List m47352w4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public static final List m47353x4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public static final List m47354y4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public static final void m47355z4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: C */
    public C40734b mo32956C(long j, String str) {
        return this.f37040f.mo26950C(j, str);
    }

    /* renamed from: F3 */
    public C40762x mo32957F3(String str, String str2, boolean z) {
        C41536l.m120489i(str, "existingPackageName");
        C41536l.m120489i(str2, "newPackageName");
        if (this.f37042h.get() == null || z) {
            C40762x m = this.f37040f.mo26956g0(str, str2).mo95062A(new C12368l(new C12385l(this.f37038d))).mo95084m(new C12369m(new C12386m(this.f37042h)));
            C41536l.m120488h(m, "service.getRequiredAppli…s(applicationFields::set)");
            return m;
        }
        C40762x z2 = C40762x.m118162z(this.f37042h.get());
        C41536l.m120488h(z2, "just(applicationFields.get())");
        return z2;
    }

    /* renamed from: P2 */
    public C40762x mo32958P2(String str, boolean z) {
        if (z || this.f37043i.get() == null) {
            C40762x m = this.f37040f.mo26955f0(str).mo95062A(new C12357a(new C12382i(this.f37038d))).mo95084m(new C12363g(new C12383j(this)));
            C41536l.m120488h(m, "override fun getPackageI…              }\n        }");
            return m;
        }
        C40762x z2 = C40762x.m118162z(this.f37043i.get());
        C41536l.m120488h(z2, "{\n            Single.jus…ageItems.get())\n        }");
        return z2;
    }

    /* renamed from: b */
    public C40762x mo32959b(String str) {
        C41536l.m120489i(str, "bankLine");
        C40762x A = this.f37040f.mo26951b(str).mo95062A(new C12371o(new C12387n(this.f37038d)));
        C41536l.m120488h(A, "service.getServiceCenter…e).map(mapper::transform)");
        return A;
    }

    /* renamed from: c0 */
    public C40762x mo32960c0() {
        C40762x A = this.f37040f.mo26952c0().mo95062A(new C12360d(new C12378e(this.f37038d)));
        C41536l.m120488h(A, "service.getEligibleCardT…().map(mapper::transform)");
        return A;
    }

    public void clean() {
        this.f37042h.set((Object) null);
        this.f37043i.set((Object) null);
    }

    /* renamed from: d0 */
    public C40734b mo32962d0(long j, String str) {
        C41536l.m120489i(str, "delReason");
        return this.f37040f.mo26953d0(j, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: io.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: io.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: io.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: io.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p469io.C15709b mo32963d3(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "packageName"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.util.concurrent.atomic.AtomicReference r0 = r4.f37043i
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x002e
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r0.next()
            r3 = r2
            io.b r3 = (p469io.C15709b) r3
            java.lang.String r3 = r3.mo43093p()
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r5)
            if (r3 == 0) goto L_0x0014
            r1 = r2
        L_0x002c:
            io.b r1 = (p469io.C15709b) r1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p399do.C12372p.mo32963d3(java.lang.String):io.b");
    }

    /* renamed from: e0 */
    public C40762x mo32964e0(String str) {
        C41536l.m120489i(str, "packageName");
        C40762x A = this.f37040f.mo26954e0(str).mo95062A(new C12364h(new C12381h(this)));
        C41536l.m120488h(A, "override fun getPackageD…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: m */
    public C40762x mo32965m(String str) {
        C41536l.m120489i(str, "preContractType");
        C40762x A = this.f37040f.mo26958m(str).mo95062A(new C12366j(new C12377d(this.f37039e)));
        C41536l.m120488h(A, "service.getConciergePreC…ontractMapper::transform)");
        return A;
    }

    /* renamed from: o */
    public C40762x mo32966o(String str, String str2) {
        C41536l.m120489i(str, "packageName");
        C41536l.m120489i(str2, "pageName");
        C40762x A = this.f37040f.mo26959o(str, str2).mo95062A(new C12367k(new C12380g(this.f37038d)));
        C41536l.m120488h(A, "service.getPackageBenefi…e).map(mapper::transform)");
        return A;
    }

    /* renamed from: p */
    public C40762x mo32967p(long j) {
        C40762x A = this.f37040f.mo26960p(j).mo95062A(new C12358b(new C12388o(this.f37038d)));
        C41536l.m120488h(A, "service.getStatisticsTra…d).map(mapper::transform)");
        return A;
    }

    /* renamed from: p0 */
    public C40762x mo32968p0(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x A = this.f37040f.useOtpForActionSinglePost(hashMap).mo95062A(new C12370n(new C12375b(this.f37038d)));
        C41536l.m120488h(A, "service.useOtpForActionS…  .map(mapper::transform)");
        return A;
    }

    /* renamed from: s */
    public C40734b mo32969s(String str, String str2) {
        return this.f37040f.mo26961s(str, str2);
    }

    /* renamed from: s2 */
    public C40762x mo32970s2(C15376d.C15377a.C15378a aVar) {
        C41536l.m120489i(aVar, "benefitType");
        C40762x A = this.f37040f.mo26957h0(f37037j.mo32974a(aVar)).mo95062A(new C12359c(new C12379f(this.f37038d)));
        C41536l.m120488h(A, "service.getPackageBenefi…    .map(mapper::convert)");
        return A;
    }

    /* renamed from: u */
    public C40762x mo32971u() {
        C40762x A = this.f37040f.mo26962u().mo95062A(new C12361e(C12389p.f37048d));
        C41536l.m120488h(A, "service.isClientSoloElig…t == YesNoApiEntity.YES }");
        return A;
    }

    /* renamed from: v */
    public C40762x mo32972v() {
        C40762x A = this.f37040f.mo26964v().mo95062A(new C12362f(new C12384k(this)));
        C41536l.m120488h(A, "override fun getPackageL…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: y */
    public C40762x mo32973y(String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "activePackageName");
        C41536l.m120489i(str2, "activePackageDesc");
        C41536l.m120489i(str3, "newPackageName");
        C41536l.m120489i(str4, "newPackageDesc");
        C41536l.m120489i(str5, "commissionPaymentPeriod");
        C41536l.m120489i(str6, "email");
        C40762x A = this.f37040f.mo26965y(str, str2, str3, str4, str5, str6).mo95062A(new C12365i(new C12376c(this.f37039e)));
        C41536l.m120488h(A, "service.getApplicationPr…ontractMapper::transform)");
        return A;
    }
}
