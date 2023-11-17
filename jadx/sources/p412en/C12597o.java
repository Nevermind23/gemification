package p412en;

import af1.C40303i;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;
import m41.C37224b;
import o31.C37591c;
import p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.SelectedAddress;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p674xm.C18781a;
import ue1.C43075l;

/* renamed from: en.o */
public final class C12597o extends C21481a implements C12587m, C12592n {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f37413n;

    /* renamed from: d */
    private final List f37414d;

    /* renamed from: e */
    private final Set f37415e;

    /* renamed from: f */
    private final C1644x f37416f;

    /* renamed from: g */
    private final C1644x f37417g;

    /* renamed from: h */
    private final C1644x f37418h = new C1644x();

    /* renamed from: i */
    private final C1644x f37419i = new C1644x();

    /* renamed from: j */
    private final C41555e f37420j;

    /* renamed from: k */
    private final C41555e f37421k;

    /* renamed from: l */
    private List f37422l;

    /* renamed from: m */
    private final Stack f37423m;

    static {
        Class<C12597o> cls = C12597o.class;
        f37413n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "currentStep", "getCurrentStep()Lge/bog/mobilebank/cardapplications/presentation/model/AddressSelectionStep;", 0)), C41520a0.m120439e(new C41539o(cls, "filteredAddressList", "getFilteredAddressList()Ljava/util/List;", 0))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12597o(List list, Set set, C18781a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(list, "addresses");
        C41536l.m120489i(set, "selectedAddresses");
        C41536l.m120489i(aVar, "startingStep");
        this.f37414d = list;
        this.f37415e = set;
        C1644x xVar = new C1644x(m47866iw(aVar));
        this.f37416f = xVar;
        C1644x xVar2 = new C1644x(list);
        this.f37417g = xVar2;
        C37591c cVar = C37591c.f90334a;
        this.f37420j = C37591c.m110557b(cVar, m47866iw(aVar), xVar, (C43075l) null, 4, (Object) null);
        this.f37421k = C37591c.m110557b(cVar, list, xVar2, (C43075l) null, 4, (Object) null);
        this.f37422l = list;
        this.f37423m = new Stack();
        m47863dw(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: dw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m47863dw(p674xm.C18781a r12) {
        /*
            r11 = this;
            java.util.List r0 = r11.f37414d
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0034
            java.lang.Object r1 = r0.next()
            r5 = r1
            ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel r5 = (p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel) r5
            java.util.Set r6 = r11.f37415e
            xm.a r7 = r11.m47866iw(r12)
            ge.bog.mobilebank.cardapplications.presentation.model.SelectedAddress r6 = r11.m47864ew(r6, r7)
            if (r6 == 0) goto L_0x0030
            long r6 = r6.mo39869a()
            long r8 = r5.mo39272d()
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0030
            r5 = r2
            goto L_0x0031
        L_0x0030:
            r5 = r4
        L_0x0031:
            if (r5 == 0) goto L_0x0006
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel r1 = (p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel) r1
            if (r1 != 0) goto L_0x0042
            java.util.List r0 = r11.f37414d
            java.lang.Object r0 = ie1.C41358y.m120009Y(r0)
            r1 = r0
            ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel r1 = (p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel) r1
        L_0x0042:
            if (r1 == 0) goto L_0x0049
            xm.a r0 = r1.mo39277g()
            goto L_0x004a
        L_0x0049:
            r0 = r3
        L_0x004a:
            if (r0 == 0) goto L_0x00ab
            xm.a r0 = r1.mo39277g()
            if (r0 == r12) goto L_0x00ab
            r11.mo33272ev(r1)
            java.util.List r0 = r1.mo39278h()
            if (r0 == 0) goto L_0x009b
            java.util.Iterator r0 = r0.iterator()
        L_0x005f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0093
            java.lang.Object r5 = r0.next()
            r6 = r5
            ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel r6 = (p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel) r6
            java.util.Set r7 = r11.f37415e
            xm.a r8 = r1.mo39277g()
            if (r8 == 0) goto L_0x008f
            xm.a r8 = r8.mo46583f()
            if (r8 != 0) goto L_0x007b
            goto L_0x008f
        L_0x007b:
            ge.bog.mobilebank.cardapplications.presentation.model.SelectedAddress r7 = r11.m47864ew(r7, r8)
            if (r7 == 0) goto L_0x008f
            long r7 = r7.mo39869a()
            long r9 = r6.mo39272d()
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x008f
            r6 = r2
            goto L_0x0090
        L_0x008f:
            r6 = r4
        L_0x0090:
            if (r6 == 0) goto L_0x005f
            goto L_0x0094
        L_0x0093:
            r5 = r3
        L_0x0094:
            ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel r5 = (p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel) r5
            if (r5 != 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r1 = r5
            goto L_0x0042
        L_0x009b:
            java.util.List r0 = r1.mo39278h()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = ie1.C41358y.m120009Y(r0)
            ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel r0 = (p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel) r0
            r1 = r0
            goto L_0x0042
        L_0x00a9:
            r1 = r3
            goto L_0x0042
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12597o.m47863dw(xm.a):void");
    }

    /* renamed from: ew */
    private final SelectedAddress m47864ew(Set set, C18781a aVar) {
        Object obj;
        boolean z;
        C41536l.m120489i(set, "<this>");
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SelectedAddress) obj).mo39870b() == aVar) {
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
        return (SelectedAddress) obj;
    }

    /* renamed from: fw */
    private final C18781a m47865fw() {
        return (C18781a) this.f37420j.getValue(this, f37413n[0]);
    }

    /* renamed from: iw */
    private final C18781a m47866iw(C18781a aVar) {
        while (aVar.mo46580b() != null) {
            aVar = aVar.mo46580b();
            C41536l.m120486f(aVar);
        }
        return aVar;
    }

    /* renamed from: jw */
    private final void m47867jw(C18781a aVar) {
        this.f37420j.setValue(this, f37413n[0], aVar);
    }

    /* renamed from: kw */
    private final void m47868kw(List list) {
        this.f37421k.setValue(this, f37413n[1], list);
    }

    /* renamed from: Fu */
    public LiveData mo33273Fu() {
        return this.f37417g;
    }

    /* renamed from: N6 */
    public LiveData mo33274N6() {
        return this.f37419i;
    }

    /* renamed from: Op */
    public LiveData mo33275Op() {
        return this.f37418h;
    }

    /* renamed from: Rg */
    public LiveData mo33276Rg() {
        return this.f37416f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r3 == false) goto L_0x0055;
     */
    /* renamed from: U9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33270U9(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            java.util.List r0 = r8.f37422l
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = r0.next()
            r3 = r2
            ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel r3 = (p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel) r3
            java.lang.String r4 = r3.mo39276f()
            r5 = 2
            r6 = 0
            r7 = 0
            boolean r4 = cf1.C40440x.m117139M(r4, r9, r7, r5, r6)
            r5 = 1
            if (r4 != 0) goto L_0x0054
            java.util.List r3 = r3.mo39274e()
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x003b
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x003b
        L_0x0039:
            r3 = r7
            goto L_0x0052
        L_0x003b:
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = cf1.C40440x.m117135K(r4, r9, r5)
            if (r4 == 0) goto L_0x003f
            r3 = r5
        L_0x0052:
            if (r3 == 0) goto L_0x0055
        L_0x0054:
            r7 = r5
        L_0x0055:
            if (r7 == 0) goto L_0x0010
            r1.add(r2)
            goto L_0x0010
        L_0x005b:
            r8.m47868kw(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12597o.mo33270U9(java.lang.String):void");
    }

    /* renamed from: ec */
    public void mo33271ec() {
        List list;
        C18781a b = m47865fw().mo46580b();
        if (b != null) {
            m47867jw(b);
            if (!this.f37423m.isEmpty()) {
                Object pop = this.f37423m.pop();
                C41536l.m120488h(pop, "{\n                    ad…k.pop()\n                }");
                list = (List) pop;
            } else {
                list = this.f37414d;
            }
            this.f37422l = list;
            m47868kw(list);
            C37224b.m109962a(this.f37419i);
        }
    }

    /* renamed from: ev */
    public void mo33272ev(AddressAdapterModel addressAdapterModel) {
        C41536l.m120489i(addressAdapterModel, "address");
        if (m47865fw().mo46583f() != null) {
            m47867jw(m47865fw().mo46583f());
            this.f37423m.add(this.f37422l);
            List h = addressAdapterModel.mo39278h();
            if (h == null) {
                h = C41341q.m119907j();
            }
            this.f37422l = h;
            m47868kw(h);
            C37224b.m109962a(this.f37419i);
            return;
        }
        C37224b.m109965d(this.f37418h, addressAdapterModel);
    }

    /* renamed from: gw */
    public final C12587m mo33277gw() {
        return this;
    }

    /* renamed from: hw */
    public final C12592n mo33278hw() {
        return this;
    }
}
