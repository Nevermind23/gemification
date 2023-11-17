package ey0;

import dy0.C31618a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33697a;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import s31.C38421a;
import ue1.C43075l;
import ux0.C39163o;
import ux0.C39165p;
import vx0.C39491a;
import wx0.C39711c;
import wx0.C39718e;
import wx0.C39722h;
import wx0.C39727i;
import wx0.C39728j;
import wx0.C39732l;
import wx0.C39737p;
import wx0.C39743q;
import xx0.C39921b;
import yx0.C40087b;
import zx0.C40265a;

/* renamed from: ey0.a */
public final class C31877a extends C33697a {

    /* renamed from: g */
    public static final C31878a f78593g = new C31878a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private final C39165p f78594c;

    /* renamed from: d */
    private final C39163o f78595d;

    /* renamed from: e */
    public C38421a f78596e;

    /* renamed from: f */
    private int f78597f;

    /* renamed from: ey0.a$a */
    public static final class C31878a {
        private C31878a() {
        }

        public /* synthetic */ C31878a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ey0.a$b */
    public /* synthetic */ class C31879b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78598a;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ge.bog.mobilebank.payments.presentation.form.base.d$a[] r0 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.INPUT_TEXT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.INPUT_MOBILE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.AMOUNT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.SELECT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.PACKAGES_SELECT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.TEMPLATE_LIST     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.TITLE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.DIVIDER     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.DEBT_INFO     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.CARD_CHOOSER     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.CONTACTS     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                ge.bog.mobilebank.payments.presentation.form.base.d$a r1 = p341ge.bog.mobilebank.payments.presentation.form.base.C33702d.C33703a.CHIPS     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                f78598a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ey0.C31877a.C31879b.<clinit>():void");
        }
    }

    public C31877a(C39165p pVar, C39163o oVar) {
        C41536l.m120489i(pVar, "elementsFactory");
        C41536l.m120489i(oVar, "formContext");
        this.f78594c = pVar;
        this.f78595d = oVar;
    }

    /* renamed from: o */
    public static /* synthetic */ List m94206o(C31877a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aVar.mo72307n(z);
    }

    /* renamed from: i */
    public C39491a mo72305i(C33702d.C33703a aVar, int i) {
        C39491a aVar2;
        C41536l.m120489i(aVar, "elementType");
        C33702d.C33703a b = ((C33699b) mo80299c(i)).mo80314b();
        int[] iArr = C31879b.f78598a;
        switch (iArr[b.ordinal()]) {
            case 1:
                aVar2 = new C39732l(this.f78595d);
                break;
            case 2:
                aVar2 = new C39737p(this.f78595d);
                break;
            case 3:
                aVar2 = new C39711c(this.f78595d);
                break;
            case 4:
            case 5:
                aVar2 = new C40087b(this.f78595d);
                break;
            case 6:
                aVar2 = new C40265a(this.f78595d);
                break;
            case 7:
                aVar2 = new C39743q();
                break;
            case 8:
                aVar2 = new C39728j();
                break;
            case 9:
                aVar2 = new C39727i();
                break;
            case 10:
                aVar2 = new C39921b();
                break;
            case 11:
                aVar2 = new C39722h(this.f78595d);
                break;
            case 12:
                aVar2 = new C39718e(this.f78595d);
                break;
            default:
                aVar2 = null;
                break;
        }
        if (aVar2 == null) {
            return null;
        }
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 3) {
            aVar2.mo93134s(999998);
        } else if (i2 != 5) {
            aVar2.mo93134s(this.f78597f);
            this.f78597f++;
        } else {
            aVar2.mo93134s(999999);
        }
        return aVar2;
    }

    /* renamed from: m */
    public final void mo72306m(boolean z) {
        for (C33697a.C33698a aVar : mo80302f()) {
            if (!(aVar.mo80309c() instanceof C39711c) && !(aVar.mo80309c() instanceof C39921b)) {
                aVar.mo80309c().mo93135t(z);
            }
        }
    }

    /* renamed from: n */
    public final List mo72307n(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (C33697a.C33698a aVar : mo80302f()) {
            if (z || !((C33699b) aVar.mo80307a()).mo80328p()) {
                arrayList.add(new C31618a(aVar.mo80309c().mo93120e(), aVar.mo80309c().mo93123h(), aVar.mo80309c().mo93124i()));
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    public final C38421a mo72308p() {
        C38421a aVar = this.f78596e;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("paymentConfig");
        return null;
    }

    /* renamed from: q */
    public final void mo72309q(C38421a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f78596e = aVar;
    }

    /* renamed from: r */
    public final void mo72310r(C38421a aVar, C43075l lVar) {
        C41536l.m120489i(aVar, "config");
        C41536l.m120489i(lVar, "fallback");
        mo72309q(aVar);
        this.f78597f = 0;
        try {
            mo80305k(this.f78594c.mo47566b(aVar));
        } catch (Exception e) {
            lVar.invoke(e);
        }
    }
}
