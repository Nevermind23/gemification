package vo0;

import ao0.C10119a;
import ao0.C10122c;
import ao0.C10123d;
import ao0.C10125f;
import co0.C10521a;
import f10.C20329a;
import fd0.C20463a;
import g91.C32343x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ko0.C16521c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import n41.C37353c;
import p341ge.bog.designsystem.components.chipsbadge.ChipsBadgeView;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.model.OfferProgressCardUiModel;
import p631uj.C18174a;
import uo0.C18270b;
import uo0.C18271c;
import uo0.C18272d;
import uo0.C18273e;
import uo0.C18283h;
import ze1.C43420e;

/* renamed from: vo0.b */
public final class C18490b {

    /* renamed from: vo0.b$a */
    public /* synthetic */ class C18491a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51960a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ao0.a[] r0 = ao0.C10119a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ao0.a r1 = ao0.C10119a.PLUS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ao0.a r1 = ao0.C10119a.MR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ao0.a r1 = ao0.C10119a.CASHBACK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ao0.a r1 = ao0.C10119a.DISCOUNT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ao0.a r1 = ao0.C10119a.PRESENT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ao0.a r1 = ao0.C10119a.INSTALLMENT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                ao0.a r1 = ao0.C10119a.BNPL     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f51960a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vo0.C18490b.C18491a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private final ChipsBadgeView.C13241a m62962a(C10119a aVar, String str, String str2) {
        if (aVar == null) {
            return null;
        }
        String str3 = "";
        if (str != null) {
            if (C41536l.m120484d(str, "+")) {
                if (str2 == null) {
                    str2 = str3;
                }
                str3 = str + str2;
            } else {
                if (str2 == null) {
                    str2 = str3;
                }
                str3 = str2 + str;
            }
        }
        switch (C18491a.f51960a[aVar.ordinal()]) {
            case 1:
                return new ChipsBadgeView.C13241a.C13247f(str3);
            case 2:
                return new ChipsBadgeView.C13241a.C13246e(str3);
            case 3:
                return new ChipsBadgeView.C13241a.C13243b(str3);
            case 4:
                return new ChipsBadgeView.C13241a.C13248g(str3);
            case 5:
                return new ChipsBadgeView.C13241a.C13244c(str3);
            case 6:
                return new ChipsBadgeView.C13241a.C13245d(str3);
            case 7:
                return new ChipsBadgeView.C13241a.C13242a(C32343x.m95388F(C10521a.m38128d(), new Object[0]));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    private final C18174a m62963b(Long l) {
        if (l == null) {
            return C18174a.DISABLED;
        }
        if (l.longValue() > 365) {
            return C18174a.DISABLED;
        }
        if (C43429k.m124593l(new C43420e(8, 365), l.longValue())) {
            return C18174a.INVERT;
        }
        if (C43429k.m124593l(new C43420e(4, 7), l.longValue())) {
            return C18174a.PENDING;
        }
        if (C43429k.m124593l(new C43420e(0, 3), l.longValue())) {
            return C18174a.NEGATIVE;
        }
        return C18174a.DISABLED;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r4 != null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r4 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = g91.C32343x.m95388F("life.style.offers.days.left", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4 + " " + r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m62964c(java.lang.Long r4) {
        /*
            r3 = this;
            uj.a r0 = r3.m62963b(r4)
            uj.a r1 = p631uj.C18174a.DISABLED
            r2 = 0
            if (r0 != r1) goto L_0x0012
            java.lang.String r4 = "life.style.offers.term.permanent"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r4 = g91.C32343x.m95388F(r4, r0)
            goto L_0x0032
        L_0x0012:
            if (r4 != 0) goto L_0x0016
            java.lang.String r4 = ""
        L_0x0016:
            java.lang.String r0 = "life.style.offers.days.left"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = g91.C32343x.m95388F(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = " "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
        L_0x0032:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vo0.C18490b.m62964c(java.lang.Long):java.lang.String");
    }

    /* renamed from: h */
    public static /* synthetic */ List m62965h(C18490b bVar, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return bVar.mo46278d(list, z);
    }

    /* renamed from: i */
    public static /* synthetic */ C18273e m62966i(C18490b bVar, C10122c cVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return bVar.mo46280f(cVar, z);
    }

    /* renamed from: k */
    private final C18271c m62967k(C10123d dVar) {
        String str;
        C37353c h = C20329a.f55281b.mo48813a().mo48811h();
        long d = dVar.mo26616d();
        if (h == C37353c.KA) {
            str = dVar.mo26614b();
        } else {
            str = dVar.mo26613a();
        }
        return new C18271c(d, str, dVar.mo26615c(), dVar.mo26617e());
    }

    /* renamed from: m */
    private final List m62968m(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean unused = C41352v.m119965z(arrayList, ((C10123d) it.next()).mo26619f());
        }
        ArrayList<C10122c> arrayList2 = new ArrayList<>();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C10122c) next).mo26592d() == C10119a.INSTALLMENT) {
                z = true;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
        for (C10122c i : arrayList2) {
            arrayList3.add(m62966i(this, i, false, 2, (Object) null));
        }
        return arrayList3;
    }

    /* renamed from: n */
    private final List m62969n(List list) {
        OfferProgressCardUiModel offerProgressCardUiModel;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20463a aVar = (C20463a) it.next();
            C16521c a = C16521c.f46671j.mo43680a(aVar.mo49003c());
            if (a != null) {
                offerProgressCardUiModel = new OfferProgressCardUiModel(a, C32343x.m95388F(aVar.mo49001a(), new Object[0]));
            } else {
                offerProgressCardUiModel = null;
            }
            if (offerProgressCardUiModel != null) {
                arrayList.add(offerProgressCardUiModel);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List mo46278d(List list, boolean z) {
        if (list == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo46280f((C10122c) it.next(), z));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final C18272d mo46279e(C10123d dVar) {
        String str;
        C41536l.m120489i(dVar, "category");
        C37353c h = C20329a.f55281b.mo48813a().mo48811h();
        long d = dVar.mo26616d();
        if (h == C37353c.KA) {
            str = dVar.mo26614b();
        } else {
            str = dVar.mo26613a();
        }
        return new C18272d(d, str, dVar.mo26615c(), dVar.mo26617e(), m62965h(this, dVar.mo26619f(), false, 2, (Object) null));
    }

    /* renamed from: f */
    public final C18273e mo46280f(C10122c cVar, boolean z) {
        C41536l.m120489i(cVar, "offer");
        long o = cVar.mo26605o();
        return new C18273e(o, cVar.mo26606p(), cVar.mo26602l(), cVar.mo26599i(), cVar.mo26590b(), cVar.mo26609s(), cVar.mo26600j(), cVar.mo26597h(), cVar.mo26592d(), cVar.mo26591c(), cVar.mo26593e(), cVar.mo26596g(), cVar.mo26610t(), cVar.mo26607q(), cVar.mo26603m(), cVar.mo26604n(), cVar.mo26595f(), cVar.mo26608r(), cVar.mo26589a(), cVar.mo26601k(), cVar.mo26612u(), m62963b(cVar.mo26597h()), m62964c(cVar.mo26597h()), m62962a(cVar.mo26592d(), cVar.mo26591c(), cVar.mo26593e()), z);
    }

    /* renamed from: g */
    public final C18283h mo46281g(C10125f fVar, C18270b bVar, List list) {
        List list2 = list;
        C10125f fVar2 = fVar;
        C41536l.m120489i(fVar, "offers");
        C41536l.m120489i(bVar, "bnplOffer");
        C41536l.m120489i(list2, "offersProgressLookups");
        List h = m62965h(this, fVar.mo26631e(), false, 2, (Object) null);
        List d = mo46278d(fVar.mo26629c(), true);
        List h2 = m62965h(this, fVar.mo26628b(), false, 2, (Object) null);
        List m = m62968m(fVar.mo26627a());
        List j = mo46282j(fVar.mo26627a());
        List j2 = mo46282j(fVar.mo26630d());
        List<C10123d> a = fVar.mo26627a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C10123d k : a) {
            arrayList.add(m62967k(k));
        }
        return new C18283h(h, d, h2, bVar, m, j, j2, arrayList, m62969n(list2));
    }

    /* renamed from: j */
    public final List mo46282j(List list) {
        if (list == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo46279e((C10123d) it.next()));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final C18271c mo46283l(C18272d dVar) {
        C41536l.m120489i(dVar, "category");
        return new C18271c(dVar.mo45944e(), dVar.mo45942c(), dVar.mo45943d(), dVar.mo45946f());
    }
}
