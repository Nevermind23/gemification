package p341ge.bog.mobilebank.hubmenu.presentation.actionsheet;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import vk0.C29121b;
import vk0.C29122c;
import xk0.C29816a;
import yk0.C30083a;

/* renamed from: ge.bog.mobilebank.hubmenu.presentation.actionsheet.TransfersActionSheetViewModel$ViewModel */
public final class TransfersActionSheetViewModel$ViewModel extends C21481a implements C29121b, C29122c {

    /* renamed from: d */
    private final C29122c f63030d = this;

    /* renamed from: e */
    private final C29121b f63031e = this;

    /* renamed from: f */
    private final C1644x f63032f;

    /* renamed from: g */
    private final C1644x f63033g;

    /* renamed from: h */
    private final C1644x f63034h;

    /* renamed from: i */
    private final C1644x f63035i;

    /* renamed from: j */
    private final C1644x f63036j;

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.actionsheet.TransfersActionSheetViewModel$ViewModel$a */
    public /* synthetic */ class C24435a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63037a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                xk0.a[] r0 = xk0.C29816a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xk0.a r1 = xk0.C29816a.OWN_ACCOUNT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xk0.a r1 = xk0.C29816a.CURRENCY_EXCHANGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xk0.a r1 = xk0.C29816a.SOMEONE_ELSE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                xk0.a r1 = xk0.C29816a.TREASURE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f63037a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.hubmenu.presentation.actionsheet.TransfersActionSheetViewModel$ViewModel.C24435a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransfersActionSheetViewModel$ViewModel(C30083a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getTransferTypes");
        this.f63032f = new C1644x(aVar.mo70353a());
        this.f63033g = new C1644x();
        this.f63034h = new C1644x();
        this.f63035i = new C1644x();
        this.f63036j = new C1644x();
    }

    /* renamed from: jw */
    private final void m78470jw() {
        C37224b.m109962a(this.f63034h);
    }

    /* renamed from: kw */
    private final void m78471kw() {
        C37224b.m109962a(this.f63033g);
    }

    /* renamed from: lw */
    private final void m78472lw() {
        C37224b.m109962a(this.f63035i);
    }

    /* renamed from: mw */
    private final void m78473mw() {
        C37224b.m109962a(this.f63036j);
    }

    /* renamed from: Vq */
    public void mo62197Vq(C29816a aVar) {
        C41536l.m120489i(aVar, "transferType");
        int i = C24435a.f63037a[aVar.ordinal()];
        if (i == 1) {
            m78471kw();
        } else if (i == 2) {
            m78470jw();
        } else if (i == 3) {
            m78472lw();
        } else if (i == 4) {
            m78473mw();
        }
    }

    /* renamed from: dw */
    public final C29121b mo62199dw() {
        return this.f63031e;
    }

    /* renamed from: ek */
    public LiveData mo62200ek() {
        return this.f63032f;
    }

    /* renamed from: ew */
    public C1644x mo62206xd() {
        return this.f63034h;
    }

    /* renamed from: fw */
    public C1644x mo62198Xp() {
        return this.f63033g;
    }

    /* renamed from: gw */
    public C1644x mo62196Jr() {
        return this.f63035i;
    }

    /* renamed from: hw */
    public C1644x mo62195Aa() {
        return this.f63036j;
    }

    /* renamed from: iw */
    public final C29122c mo62205iw() {
        return this.f63030d;
    }
}
