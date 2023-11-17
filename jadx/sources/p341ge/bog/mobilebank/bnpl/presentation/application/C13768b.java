package p341ge.bog.mobilebank.bnpl.presentation.application;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import h00.C24846c;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p380ck.C10464h;
import p480jl.C16210a;
import p480jl.C16212c;
import p633ul.C18181d;
import p633ul.C18182e;
import p633ul.C18183f;
import p633ul.C18184g;
import p791iu.C25258b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.application.b */
public final class C13768b extends C21481a implements C18183f, C18182e {

    /* renamed from: d */
    private final C25258b f41008d;

    /* renamed from: e */
    private final C24846c f41009e;

    /* renamed from: f */
    private final C18183f f41010f = this;

    /* renamed from: g */
    private final C18182e f41011g = this;

    /* renamed from: h */
    private final C1644x f41012h = new C1644x();

    /* renamed from: i */
    private final C1644x f41013i = new C1644x();

    /* renamed from: j */
    private final C1644x f41014j = new C1644x();

    /* renamed from: k */
    private final C1644x f41015k = new C1644x();

    /* renamed from: l */
    private final C1644x f41016l = new C1644x();

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.b$a */
    static final class C13769a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13768b f41017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13769a(C13768b bVar) {
            super(1);
            this.f41017d = bVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            return C31270e.m92880i(C25258b.m80363c(this.f41017d.mo38135gw(), false, 1, (Object) null), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.b$b */
    public interface C13770b {
        /* renamed from: a */
        C13768b mo32570a(C24846c cVar);
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.b$c */
    public /* synthetic */ class C13771c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41018a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                h00.c[] r0 = h00.C24846c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                h00.c r1 = h00.C24846c.A     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                h00.c r1 = h00.C24846c.TIME_OUT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                h00.c r1 = h00.C24846c.ERROR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                h00.c r1 = h00.C24846c.G     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f41018a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.bnpl.presentation.application.C13768b.C13771c.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13768b(C25258b bVar, C24846c cVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        int i;
        C41536l.m120489i(bVar, "getBnplLimitUseCase");
        this.f41008d = bVar;
        this.f41009e = cVar;
        if (cVar == null) {
            i = -1;
        } else {
            i = C13771c.f41018a[cVar.ordinal()];
        }
        if (i == 1) {
            C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C18184g(new C13769a(this)));
            C41536l.m120488h(L0, "merge(onInit(), onRefres…rc)\n                    }");
            bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo38144zn()));
        } else if (i == 2 || i == 3) {
            mo38144zn().mo4823o(new C31128a.C31129a(new Exception(), 0, (Object) null, 6, (DefaultConstructorMarker) null));
        } else if (i != 4) {
            mo38143ri().mo4823o(new C18181d(C16212c.icons_48_system_error_fill, C16210a.f45710c, C32343x.m95388F("BNPL.limit.rejected", new Object[0]), C32343x.m95388F("BNPL.limit.rejected.explanatory", new Object[0]), C32343x.m95388F("BNPL.button.label.home", new Object[0])));
        } else {
            mo38143ri().mo4823o(new C18181d(C16212c.icons_48_system_error_fill, C16210a.f45711d, C32343x.m95388F("BNPL.limit.cannot.be.approved", new Object[0]), C32343x.m95388F("BNPL.limit.cannot.be.approved.explanatory", new Object[0]), C32343x.m95388F("BNPL.button.label.applications.offers", new Object[0])));
        }
        C32343x.m95397J0(this, "bnpl_check_my_limit", "status_is_" + cVar, "bnpl_finished_application", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m51413ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Ns */
    public void mo38131Ns() {
        int i;
        C24846c cVar = this.f41009e;
        if (cVar == null) {
            i = -1;
        } else {
            i = C13771c.f41018a[cVar.ordinal()];
        }
        if (i == 1) {
            mo38138jr().mo4823o(C32343x.m95466m(C41238w.f97225a));
        } else if (i != 4) {
            mo38132bq().mo4823o(C32343x.m95466m(C41238w.f97225a));
        } else {
            mo38133bw().mo4823o(C32343x.m95466m(C41238w.f97225a));
        }
    }

    /* renamed from: fw */
    public C1644x mo38143ri() {
        return this.f41013i;
    }

    /* renamed from: gw */
    public final C25258b mo38135gw() {
        return this.f41008d;
    }

    /* renamed from: hw */
    public final C18182e mo38136hw() {
        return this.f41011g;
    }

    /* renamed from: iw */
    public C1644x mo38144zn() {
        return this.f41012h;
    }

    /* renamed from: jw */
    public C1644x mo38138jr() {
        return this.f41016l;
    }

    /* renamed from: kw */
    public C1644x mo38132bq() {
        return this.f41014j;
    }

    /* renamed from: lw */
    public C1644x mo38133bw() {
        return this.f41015k;
    }

    /* renamed from: mw */
    public final C18183f mo38142mw() {
        return this.f41010f;
    }
}
