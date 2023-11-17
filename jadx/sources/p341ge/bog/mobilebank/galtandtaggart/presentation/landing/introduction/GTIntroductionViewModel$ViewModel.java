package p341ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction;

import af1.C40303i;
import android.os.Bundle;
import androidx.lifecycle.C1644x;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;
import m41.C37224b;
import o31.C37591c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p380ck.C10464h;
import pf0.C27524d;
import pf0.C27525e;
import qf0.C27790a;
import qf0.C27791b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionViewModel$ViewModel */
public final class GTIntroductionViewModel$ViewModel extends C21481a implements C27524d, C27525e {

    /* renamed from: k */
    public static final C23510a f61402k = new C23510a((DefaultConstructorMarker) null);

    /* renamed from: l */
    static final /* synthetic */ C40303i[] f61403l = {C41520a0.m120439e(new C41539o(GTIntroductionViewModel$ViewModel.class, "currentIndex", "getCurrentIndex()I", 0))};
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final List f61404m = C27790a.f70888a.mo67325a();

    /* renamed from: d */
    private final C27524d f61405d = this;

    /* renamed from: e */
    private final C27525e f61406e = this;

    /* renamed from: f */
    private final C1644x f61407f;

    /* renamed from: g */
    private final C1644x f61408g;

    /* renamed from: h */
    private final C1644x f61409h;

    /* renamed from: i */
    private final C1644x f61410i;

    /* renamed from: j */
    private final C41555e f61411j;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionViewModel$ViewModel$a */
    public static final class C23510a {
        private C23510a() {
        }

        public /* synthetic */ C23510a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionViewModel$ViewModel$b */
    static final class C23511b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTIntroductionViewModel$ViewModel f61412d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23511b(GTIntroductionViewModel$ViewModel gTIntroductionViewModel$ViewModel) {
            super(1);
            this.f61412d = gTIntroductionViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60363a(int i) {
            C27791b bVar = (C27791b) C41358y.m120010Z(GTIntroductionViewModel$ViewModel.f61404m, i);
            this.f61412d.mo60354Yq().mo4823o(bVar != null ? bVar.mo67326a() : null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60363a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    public GTIntroductionViewModel$ViewModel() {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        List list = f61404m;
        this.f61407f = new C1644x(list);
        this.f61408g = new C1644x(((C27791b) C41358y.m120007W(list)).mo67326a());
        this.f61409h = new C1644x();
        this.f61410i = new C1644x();
        this.f61411j = C37591c.f90334a.mo90782a(0, mo60362yc(), new C23511b(this));
    }

    /* renamed from: fw */
    private final int m76057fw() {
        return ((Number) this.f61411j.getValue(this, f61403l[0])).intValue();
    }

    /* renamed from: lw */
    private final void m76058lw(int i) {
        this.f61411j.setValue(this, f61403l[0], Integer.valueOf(i));
    }

    /* renamed from: V8 */
    public void mo60353V8(int i) {
        m76058lw(i);
        if (m76057fw() == 1) {
            C32343x.m95397J0(this, "gt_trading_onboarding", (String) null, "first_slide_click", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
        }
    }

    /* renamed from: ew */
    public C1644x mo60354Yq() {
        return this.f61408g;
    }

    /* renamed from: gw */
    public C1644x mo60351Mr() {
        return this.f61410i;
    }

    /* renamed from: hw */
    public final C27524d mo60357hw() {
        return this.f61405d;
    }

    /* renamed from: iw */
    public final C27525e mo60358iw() {
        return this.f61406e;
    }

    /* renamed from: jw */
    public C1644x mo60352Mv() {
        return this.f61407f;
    }

    /* renamed from: kw */
    public C1644x mo60362yc() {
        return this.f61409h;
    }

    /* renamed from: r */
    public void mo60361r() {
        if (m76057fw() == f61404m.size() - 1) {
            C37224b.m109962a(mo60351Mr());
            C32343x.m95397J0(this, "gt_trading_onboarding", (String) null, "start_investing_click", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
            return;
        }
        m76058lw(m76057fw() + 1);
        C32343x.m95397J0(this, "gt_trading_onboarding", (String) null, "first_slide_click", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
    }
}
