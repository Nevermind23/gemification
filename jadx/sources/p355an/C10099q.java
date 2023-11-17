package p355an;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37622x;
import p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel;
import p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel;
import p411em.C12487d;
import p565pm.C17389d;
import p565pm.C17390e;
import p674xm.C18781a;

/* renamed from: an.q */
public final class C10099q {

    /* renamed from: an.q$a */
    public /* synthetic */ class C10100a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27868a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                pm.e[] r0 = p565pm.C17390e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                pm.e r1 = p565pm.C17390e.COUNTRY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                pm.e r1 = p565pm.C17390e.CITY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                pm.e r1 = p565pm.C17390e.ADDRESS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f27868a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p355an.C10099q.C10100a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final AddressAdapterModel mo26574a(ServiceCenterUiModel serviceCenterUiModel) {
        long j;
        List list;
        int i;
        boolean z;
        List g;
        ServiceCenterUiModel serviceCenterUiModel2;
        C41536l.m120489i(serviceCenterUiModel, "sc");
        String d = serviceCenterUiModel.mo55424d();
        if (!C41536l.m120484d(serviceCenterUiModel.mo55426e(), "STREET") || (g = serviceCenterUiModel.mo55429g()) == null || (serviceCenterUiModel2 = (ServiceCenterUiModel) C41358y.m120009Y(g)) == null) {
            j = serviceCenterUiModel.mo55422a();
        } else {
            j = serviceCenterUiModel2.mo55422a();
        }
        List g2 = serviceCenterUiModel.mo55429g();
        if (g2 != null) {
            list = mo26576c(g2);
        } else {
            list = null;
        }
        List list2 = list;
        if (C41536l.m120484d(serviceCenterUiModel.mo55426e(), "STREET")) {
            i = C12487d.icons_24_channel_service_center;
        } else {
            i = C12487d.f37162e;
        }
        int i2 = i;
        List m = C41341q.m119910m(serviceCenterUiModel.mo55424d(), C37622x.f90386a.mo90794a(serviceCenterUiModel.mo55424d()));
        if (serviceCenterUiModel.mo55429g() != null) {
            z = true;
        } else {
            z = false;
        }
        C18781a a = C18781a.f52495g.mo46584a(serviceCenterUiModel.mo55426e());
        if (a == null) {
            a = C18781a.SC_CITY;
        }
        return new AddressAdapterModel(d, j, list2, a, i2, m, z);
    }

    /* renamed from: b */
    public final AddressAdapterModel mo26575b(C17389d dVar) {
        List list;
        C18781a aVar;
        C41536l.m120489i(dVar, "cardDetail");
        String b = dVar.mo44908b();
        long a = dVar.mo44907a();
        List e = dVar.mo44911e();
        if (e != null) {
            list = mo26577d(e);
        } else {
            list = null;
        }
        List list2 = list;
        C17390e c = dVar.mo44909c();
        if (c == null) {
            c = C17390e.COUNTRY;
        }
        int i = C10100a.f27868a[c.ordinal()];
        if (i == 1) {
            aVar = C18781a.INSTANT_COUNTRY;
        } else if (i == 2) {
            aVar = C18781a.INSTANT_CITY;
        } else if (i == 3) {
            aVar = C18781a.INSTANT_SERVICE_CENTER;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new AddressAdapterModel(b, a, list2, aVar, 0, (List) null, false, 112, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final List mo26576c(List list) {
        C41536l.m120489i(list, "cities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo26574a((ServiceCenterUiModel) it.next()));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List mo26577d(List list) {
        C41536l.m120489i(list, "cardDetails");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo26575b((C17389d) it.next()));
        }
        return arrayList;
    }
}
