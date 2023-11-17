package m21;

import android.os.Parcelable;
import androidx.lifecycle.C1644x;
import g91.C32343x;
import hd1.C41204a;
import he1.C41224m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserConfig;
import p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem;
import ue1.C43080q;

/* renamed from: m21.e */
public final class C37221e extends C21481a implements C37219c, C37220d {

    /* renamed from: d */
    private final C37219c f89634d = this;

    /* renamed from: e */
    private final C37220d f89635e = this;

    /* renamed from: f */
    private final C1644x f89636f = new C1644x();

    /* renamed from: g */
    private final C1644x f89637g = new C1644x();

    /* renamed from: h */
    private final C1644x f89638h = new C1644x(Boolean.FALSE);

    /* renamed from: i */
    private final C1644x f89639i = new C1644x();

    /* renamed from: j */
    private List f89640j = C41341q.m119907j();

    /* renamed from: k */
    private String f89641k = "";

    public C37221e() {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: dw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m109938dw(p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem r8) {
        /*
            r7 = this;
            java.util.List r0 = r7.f89640j
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            r5 = r1
            ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem r5 = (p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem) r5
            int r5 = r5.mo84285g()
            int r6 = r8.mo84285g()
            if (r5 != r6) goto L_0x0022
            r5 = r2
            goto L_0x0023
        L_0x0022:
            r5 = r3
        L_0x0023:
            if (r5 == 0) goto L_0x0006
            goto L_0x0027
        L_0x0026:
            r1 = r4
        L_0x0027:
            ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem r1 = (p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem) r1
            if (r1 != 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            boolean r0 = r8.mo84288i()
            r1.mo84289j(r0)
        L_0x0033:
            androidx.lifecycle.x r0 = r7.mo90285P4()
            java.lang.Object r0 = r0.mo4814f()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0062
            java.util.Iterator r0 = r0.iterator()
        L_0x0043:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0060
            java.lang.Object r1 = r0.next()
            r5 = r1
            ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem r5 = (p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem) r5
            int r5 = r5.mo84285g()
            int r6 = r8.mo84285g()
            if (r5 != r6) goto L_0x005c
            r5 = r2
            goto L_0x005d
        L_0x005c:
            r5 = r3
        L_0x005d:
            if (r5 == 0) goto L_0x0043
            r4 = r1
        L_0x0060:
            ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem r4 = (p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem) r4
        L_0x0062:
            if (r4 != 0) goto L_0x0065
            goto L_0x006c
        L_0x0065:
            boolean r8 = r8.mo84288i()
            r4.mo84289j(r8)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m21.C37221e.m109938dw(ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem):void");
    }

    /* renamed from: ew */
    private final void m109939ew(boolean z) {
        boolean z2;
        for (ChooserItem chooserItem : this.f89640j) {
            if (chooserItem.mo84288i() || z) {
                z2 = true;
            } else {
                z2 = false;
            }
            chooserItem.mo84290k(z2);
        }
    }

    /* renamed from: fw */
    private final void m109940fw(List list) {
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            ((ChooserItem) next).mo84291l(i);
            i = i2;
        }
    }

    /* renamed from: gw */
    private final List m109941gw() {
        List list = this.f89640j;
        ArrayList<ChooserItem> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((ChooserItem) next).mo84288i()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (ChooserItem h : arrayList) {
            arrayList2.add(h.mo84286h());
        }
        return arrayList2;
    }

    /* renamed from: Nd */
    public void mo90280Nd(String str) {
        C41536l.m120489i(str, "searchText");
        C1644x jw = mo90285P4();
        List<ChooserItem> list = this.f89640j;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (ChooserItem b : list) {
            arrayList.add(ChooserItem.m101694b(b, (Parcelable) null, (C43080q) null, (String) null, false, false, 0, 63, (Object) null));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (C40440x.m117135K(((ChooserItem) next).mo84282e(), str, true)) {
                arrayList2.add(next);
            }
        }
        jw.mo4826r(arrayList2);
        this.f89641k = str;
    }

    /* renamed from: S0 */
    public void mo90281S0() {
        ChooserConfig chooserConfig = (ChooserConfig) mo90284Co().mo4814f();
        if (chooserConfig != null) {
            mo90287eh().mo4823o(C32343x.m95466m(new C41224m(chooserConfig.mo84269i(), m109941gw())));
        }
    }

    /* renamed from: Ud */
    public void mo90282Ud(ChooserItem chooserItem) {
        boolean z;
        C41536l.m120489i(chooserItem, "item");
        ChooserConfig chooserConfig = (ChooserConfig) mo90284Co().mo4814f();
        if (chooserConfig == null) {
            return;
        }
        if (!chooserConfig.mo84261d()) {
            mo90287eh().mo4823o(C32343x.m95466m(new C41224m(chooserConfig.mo84269i(), C41339p.m119900e(chooserItem.mo84286h()))));
            return;
        }
        m109938dw(chooserItem);
        List gw = m109941gw();
        C1644x iw = mo90286W4();
        boolean z2 = true;
        if (gw.size() >= chooserConfig.mo84267h()) {
            z = true;
        } else {
            z = false;
        }
        iw.mo4823o(Boolean.valueOf(z));
        Integer g = chooserConfig.mo84266g();
        if (g != null) {
            if (gw.size() >= g.intValue()) {
                z2 = false;
            }
            m109939ew(z2);
            mo90280Nd(this.f89641k);
        }
    }

    /* renamed from: f4 */
    public void mo90283f4(ChooserConfig chooserConfig) {
        boolean z;
        C41536l.m120489i(chooserConfig, "config");
        List b = chooserConfig.mo84260b();
        this.f89640j = b;
        m109940fw(b);
        mo90284Co().mo4823o(chooserConfig);
        C1644x jw = mo90285P4();
        List<ChooserItem> list = this.f89640j;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (ChooserItem b2 : list) {
            arrayList.add(ChooserItem.m101694b(b2, (Parcelable) null, (C43080q) null, (String) null, false, false, 0, 63, (Object) null));
        }
        jw.mo4823o(arrayList);
        C1644x iw = mo90286W4();
        if (m109941gw().size() >= chooserConfig.mo84267h()) {
            z = true;
        } else {
            z = false;
        }
        iw.mo4823o(Boolean.valueOf(z));
    }

    /* renamed from: hw */
    public C1644x mo90284Co() {
        return this.f89637g;
    }

    /* renamed from: iw */
    public C1644x mo90286W4() {
        return this.f89638h;
    }

    /* renamed from: jw */
    public C1644x mo90285P4() {
        return this.f89636f;
    }

    /* renamed from: kw */
    public C1644x mo90287eh() {
        return this.f89639i;
    }

    /* renamed from: lw */
    public final C37219c mo90292lw() {
        return this.f89634d;
    }

    /* renamed from: mw */
    public final C37220d mo90293mw() {
        return this.f89635e;
    }
}
