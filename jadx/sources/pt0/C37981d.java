package pt0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import g91.C32343x;
import hd1.C41204a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jt0.C36788a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel;

/* renamed from: pt0.d */
public final class C37981d extends C21481a implements C37979b, C37980c {

    /* renamed from: d */
    private final C37979b f91284d = this;

    /* renamed from: e */
    private final C37980c f91285e = this;

    /* renamed from: f */
    private final C1644x f91286f;

    /* renamed from: g */
    private final C1644x f91287g;

    /* renamed from: h */
    private final C1644x f91288h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37981d(List list) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        int i;
        C41536l.m120489i(list, "accounts");
        boolean z = true;
        this.f91286f = new C1644x(m111656dw(list));
        this.f91287g = new C1644x();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((PiggyBankAccountUiModel) it.next()).mo75159d() && (i = i + 1) < 0) {
                    C41341q.m119916s();
                }
            }
        } else {
            i = 0;
        }
        this.f91288h = new C1644x(Boolean.valueOf(i <= 0 ? false : z));
    }

    /* renamed from: dw */
    private final List m111656dw(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PiggyBankAccountUiModel piggyBankAccountUiModel = (PiggyBankAccountUiModel) it.next();
            arrayList.add(new C36788a(piggyBankAccountUiModel.mo75157a(), piggyBankAccountUiModel.mo75158b(), piggyBankAccountUiModel.mo75159d()));
        }
        return arrayList;
    }

    /* renamed from: D3 */
    public LiveData mo91334D3() {
        return this.f91288h;
    }

    /* renamed from: Ol */
    public void mo91332Ol() {
        List list = (List) this.f91286f.mo4814f();
        if (list == null) {
            list = C41341q.m119907j();
        }
        ArrayList<C36788a> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((C36788a) next).mo89682c()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C36788a aVar : arrayList) {
            arrayList2.add(new PiggyBankAccountUiModel(aVar.mo89680a(), aVar.mo89681b(), aVar.mo89682c()));
        }
        this.f91287g.mo4823o(C32343x.m95466m(arrayList2));
    }

    /* renamed from: ew */
    public final C37979b mo91337ew() {
        return this.f91284d;
    }

    /* renamed from: fw */
    public final C37980c mo91338fw() {
        return this.f91285e;
    }

    /* renamed from: g */
    public LiveData mo91335g() {
        return this.f91286f;
    }

    /* renamed from: lp */
    public LiveData mo91336lp() {
        return this.f91287g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: jt0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: jt0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: jt0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: jt0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: jt0.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo91333m8(p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "account"
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            androidx.lifecycle.x r0 = r10.f91286f
            java.lang.Object r0 = r0.mo4814f()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003b
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r0.next()
            r5 = r4
            jt0.a r5 = (jt0.C36788a) r5
            long r6 = r11.mo75002a()
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r5 = r5.mo89680a()
            long r8 = r5.mo75002a()
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0035
            r5 = r2
            goto L_0x0036
        L_0x0035:
            r5 = r3
        L_0x0036:
            if (r5 == 0) goto L_0x0016
            r1 = r4
        L_0x0039:
            jt0.a r1 = (jt0.C36788a) r1
        L_0x003b:
            if (r1 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r1.mo89683d(r12)
        L_0x0041:
            androidx.lifecycle.x r11 = r10.f91288h
            androidx.lifecycle.x r12 = r10.f91286f
            java.lang.Object r12 = r12.mo4814f()
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L_0x0051
            java.util.List r12 = ie1.C41341q.m119907j()
        L_0x0051:
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L_0x005d
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x005d
            r0 = r3
            goto L_0x007c
        L_0x005d:
            java.util.Iterator r12 = r12.iterator()
            r0 = r3
        L_0x0062:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x007c
            java.lang.Object r1 = r12.next()
            jt0.a r1 = (jt0.C36788a) r1
            boolean r1 = r1.mo89682c()
            if (r1 == 0) goto L_0x0062
            int r0 = r0 + 1
            if (r0 >= 0) goto L_0x0062
            ie1.C41341q.m119916s()
            goto L_0x0062
        L_0x007c:
            if (r0 <= 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r2 = r3
        L_0x0080:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            r11.mo4823o(r12)
            androidx.lifecycle.x r11 = r10.f91286f
            java.lang.Object r12 = r11.mo4814f()
            r11.mo4823o(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt0.C37981d.mo91333m8(ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel, boolean):void");
    }
}
