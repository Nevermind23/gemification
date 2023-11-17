package p704zo;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SoloLoungeItem;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p441go.C15390m;
import p455ho.C15558k;
import p690yo.C18979a;
import ue1.C43075l;

/* renamed from: zo.n */
public final class C19138n extends C21481a implements C19133i, C19134j {

    /* renamed from: n */
    public static final C19143c f53317n = new C19143c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final SelectedLoungeData f53318d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C15390m f53319e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C18979a f53320f;

    /* renamed from: g */
    private final C19133i f53321g = this;

    /* renamed from: h */
    private final C19134j f53322h = this;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C19132h f53323i = C19132h.CITY;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List f53324j = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f53325k = new C1644x();

    /* renamed from: l */
    private final C1644x f53326l = new C1644x();

    /* renamed from: m */
    private final C1644x f53327m = new C1644x();

    /* renamed from: zo.n$a */
    static final class C19139a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19138n f53328d;

        /* renamed from: zo.n$a$a */
        /* synthetic */ class C19140a extends C41535k implements C43075l {
            C19140a(Object obj) {
                super(1, obj, C18979a.class, "transform", "transform(Lge/bog/mobilebank/categorypackages/domain/model/ServiceCenter;)Lge/bog/mobilebank/categorypackages/presentation/application/secondstage/solo_lounge_selector/model/ServiceCenterUiModel;", 0);
            }

            /* renamed from: b */
            public final ServiceCenterUiModel invoke(C15558k kVar) {
                C41536l.m120489i(kVar, "p0");
                return ((C18979a) this.receiver).mo47027a(kVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19139a(C19138n nVar) {
            super(1);
            this.f53328d = nVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final ServiceCenterUiModel m64528c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (ServiceCenterUiModel) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x A = this.f53328d.f53319e.mo42490a("SOLO").mo95062A(new C19137m(new C19140a(this.f53328d.f53320f)));
            C41536l.m120488h(A, "getServiceCenters(BANK_L…  .map(mapper::transform)");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: zo.n$b */
    static final class C19141b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19138n f53329d;

        /* renamed from: zo.n$b$a */
        static final class C19142a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C19138n f53330d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C19142a(C19138n nVar) {
                super(1);
                this.f53330d = nVar;
            }

            /* renamed from: a */
            public final void mo47339a(ServiceCenterUiModel serviceCenterUiModel) {
                C19138n nVar = this.f53330d;
                List g = serviceCenterUiModel.mo40883g();
                C41536l.m120486f(g);
                nVar.f53324j = g;
                if (!this.f53330d.f53318d.mo40864e()) {
                    this.f53330d.f53323i = C19132h.STREET;
                }
                this.f53330d.m64517qw();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo47339a((ServiceCenterUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19141b(C19138n nVar) {
            super(1);
            this.f53329d = nVar;
        }

        /* renamed from: a */
        public final void mo47338a(C31128a aVar) {
            this.f53329d.f53325k.mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C19142a(this.f53329d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47338a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: zo.n$c */
    public static final class C19143c {
        private C19143c() {
        }

        public /* synthetic */ C19143c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: zo.n$d */
    public interface C19144d {
        /* renamed from: a */
        C19138n mo32830a(SelectedLoungeData selectedLoungeData);
    }

    /* renamed from: zo.n$e */
    public /* synthetic */ class C19145e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53331a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                zo.h[] r0 = p704zo.C19132h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                zo.h r1 = p704zo.C19132h.CITY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                zo.h r1 = p704zo.C19132h.DISTRICT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                zo.h r1 = p704zo.C19132h.STREET     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f53331a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p704zo.C19138n.C19145e.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19138n(SelectedLoungeData selectedLoungeData, C15390m mVar, C18979a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(selectedLoungeData, "selectedLounge");
        C41536l.m120489i(mVar, "getServiceCenters");
        C41536l.m120489i(aVar, "mapper");
        this.f53318d = selectedLoungeData;
        this.f53319e = mVar;
        this.f53320f = aVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C19135k(new C19139a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…QUEST_CODE)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C19136l(new C19141b(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m64508fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m64509gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public final void m64517qw() {
        List<ServiceCenterUiModel> list;
        List list2;
        Object obj;
        boolean z;
        Object obj2;
        List g;
        Object obj3;
        boolean z2;
        boolean z3;
        int i = C19145e.f53331a[this.f53323i.ordinal()];
        if (i != 1) {
            list = null;
            if (i == 2) {
                Iterator it = this.f53324j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    long a = ((ServiceCenterUiModel) obj).mo40876a();
                    Long a2 = this.f53318d.mo40860a();
                    if (a2 != null && a == a2.longValue()) {
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
                ServiceCenterUiModel serviceCenterUiModel = (ServiceCenterUiModel) obj;
                if (serviceCenterUiModel != null) {
                    list = serviceCenterUiModel.mo40883g();
                }
            } else if (i == 3) {
                Iterator it2 = this.f53324j.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    long a3 = ((ServiceCenterUiModel) obj2).mo40876a();
                    Long a4 = this.f53318d.mo40860a();
                    if (a4 != null && a3 == a4.longValue()) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        break;
                    }
                }
                ServiceCenterUiModel serviceCenterUiModel2 = (ServiceCenterUiModel) obj2;
                if (!(serviceCenterUiModel2 == null || (g = serviceCenterUiModel2.mo40883g()) == null)) {
                    Iterator it3 = g.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it3.next();
                        long a5 = ((ServiceCenterUiModel) obj3).mo40876a();
                        Long b = this.f53318d.mo40861b();
                        if (b != null && a5 == b.longValue()) {
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
                    ServiceCenterUiModel serviceCenterUiModel3 = (ServiceCenterUiModel) obj3;
                    if (serviceCenterUiModel3 != null) {
                        list = serviceCenterUiModel3.mo40883g();
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            list = this.f53324j;
        }
        if (list != null) {
            list2 = new ArrayList(C41343r.m119925u(list, 10));
            for (ServiceCenterUiModel sw : list) {
                list2.add(m64519sw(sw));
            }
        } else {
            list2 = C41341q.m119907j();
        }
        m64518rw(list2);
    }

    /* renamed from: rw */
    private final void m64518rw(List list) {
        this.f53326l.mo4826r(C41233s.m119492a(list, this.f53323i));
    }

    /* renamed from: sw */
    private final SoloLoungeItem m64519sw(ServiceCenterUiModel serviceCenterUiModel) {
        ServiceCenterUiModel serviceCenterUiModel2;
        String str;
        List g;
        String str2 = null;
        if (!C41536l.m120484d(serviceCenterUiModel.mo40880e(), "STREET") || (g = serviceCenterUiModel.mo40883g()) == null) {
            serviceCenterUiModel2 = null;
        } else {
            serviceCenterUiModel2 = (ServiceCenterUiModel) C41358y.m120009Y(g);
        }
        long a = serviceCenterUiModel.mo40876a();
        String d = serviceCenterUiModel.mo40878d();
        String b = serviceCenterUiModel.mo40877b();
        if (serviceCenterUiModel2 != null) {
            str = serviceCenterUiModel2.mo40882f();
        } else {
            str = null;
        }
        if (serviceCenterUiModel2 != null) {
            str2 = serviceCenterUiModel2.mo40877b();
        }
        return new SoloLoungeItem(a, d, b, str, str2);
    }

    /* renamed from: L */
    public LiveData mo47331L() {
        return this.f53325k;
    }

    /* renamed from: R0 */
    public LiveData mo47332R0() {
        return this.f53327m;
    }

    /* renamed from: hf */
    public void mo47329hf() {
        int i = C19145e.f53331a[this.f53323i.ordinal()];
        if (i == 2) {
            this.f53323i = C19132h.CITY;
            m64517qw();
        } else if (i == 3) {
            this.f53323i = C19132h.DISTRICT;
            m64517qw();
        }
    }

    /* renamed from: ob */
    public void mo47330ob(SoloLoungeItem soloLoungeItem) {
        C41536l.m120489i(soloLoungeItem, "item");
        int i = C19145e.f53331a[this.f53323i.ordinal()];
        if (i == 1) {
            this.f53323i = C19132h.DISTRICT;
            this.f53318d.mo40866f(Long.valueOf(soloLoungeItem.mo40893d()));
            m64517qw();
        } else if (i == 2) {
            this.f53323i = C19132h.STREET;
            this.f53318d.mo40867g(Long.valueOf(soloLoungeItem.mo40893d()));
            m64517qw();
        } else if (i == 3) {
            this.f53318d.mo40868h(soloLoungeItem);
            C37224b.m109965d(this.f53327m, this.f53318d);
        }
    }

    /* renamed from: ow */
    public final C19133i mo47334ow() {
        return this.f53321g;
    }

    /* renamed from: pw */
    public final C19134j mo47335pw() {
        return this.f53322h;
    }

    /* renamed from: q */
    public LiveData mo47333q() {
        return this.f53326l;
    }
}
