package wx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import by0.C31217a;
import g91.C32343x;
import he1.C41238w;
import java.util.List;
import jx0.C36839u;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lx0.C37179d;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import s31.C38421a;
import ux0.C39163o;
import vx0.C39491a;

/* renamed from: wx0.e */
public final class C39718e extends C39491a {

    /* renamed from: k */
    public static final C39719a f94362k = new C39719a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C39163o f94363b;

    /* renamed from: c */
    private C36839u f94364c;

    /* renamed from: d */
    private String f94365d;

    /* renamed from: e */
    private boolean f94366e = true;

    /* renamed from: f */
    private boolean f94367f = true;

    /* renamed from: g */
    private int f94368g = -1;

    /* renamed from: h */
    private boolean f94369h;

    /* renamed from: i */
    private String f94370i;

    /* renamed from: j */
    private String f94371j;

    /* renamed from: wx0.e$a */
    public static final class C39719a {
        private C39719a() {
        }

        public /* synthetic */ C39719a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C39718e(C39163o oVar) {
        C41536l.m120489i(oVar, "formContext");
        this.f94363b = oVar;
    }

    /* renamed from: C */
    private final void m115366C() {
        m115370y().f88906f.mo35182m(0, true);
        m115370y().f88906f.setOnChipActivatedChangedListener(new C39717d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static final void m115367D(C39718e eVar, Chip chip, int i) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(chip, "<anonymous parameter 0>");
        eVar.mo93136u(String.valueOf(i));
        eVar.f94363b.mo92816e(new C31217a.C31218a(i));
    }

    /* renamed from: E */
    private final void m115368E() {
        C41238w wVar;
        String g = mo93122g();
        if (g != null) {
            int parseInt = Integer.parseInt(g);
            int chipCount = m115370y().f88906f.getChipCount();
            for (int i = 0; i < chipCount; i++) {
                m115370y().f88906f.mo35185q(i, false);
            }
            m115370y().f88906f.mo35182m(parseInt, false);
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            m115370y().f88906f.mo35182m(0, false);
        }
    }

    /* renamed from: y */
    private final C36839u m115370y() {
        C36839u uVar = this.f94364c;
        C41536l.m120486f(uVar);
        return uVar;
    }

    /* renamed from: A */
    public final void mo93447A(String str) {
        this.f94370i = str;
        m115370y().f88905e.setChipTitle(str);
    }

    /* renamed from: B */
    public final void mo93448B(String str) {
        this.f94371j = str;
        m115370y().f88907g.setChipTitle(str);
    }

    /* renamed from: e */
    public int mo93120e() {
        return this.f94368g;
    }

    /* renamed from: g */
    public String mo93122g() {
        return this.f94365d;
    }

    /* renamed from: h */
    public Object mo93123h() {
        return mo93122g();
    }

    /* renamed from: i */
    public boolean mo93124i() {
        return this.f94366e;
    }

    /* renamed from: j */
    public boolean mo93125j() {
        return true;
    }

    /* renamed from: m */
    public void mo93128m(C37179d dVar, List list, C38421a aVar) {
        C41536l.m120489i(dVar, "debt");
        C41536l.m120489i(list, "debtInput");
        C41536l.m120489i(aVar, "oldConfig");
        mo93137v(true);
    }

    /* renamed from: p */
    public void mo93131p() {
        mo93137v(this.f94369h);
        m115370y().f88906f.mo35182m(0, true);
    }

    /* renamed from: q */
    public void mo93132q(Object obj) {
        String str;
        boolean z;
        if (obj != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        mo93136u(str);
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f94363b.mo92816e(new C31217a.C31218a(Integer.parseInt(str)));
        }
    }

    /* renamed from: s */
    public void mo93134s(int i) {
        this.f94368g = i;
    }

    /* renamed from: t */
    public void mo93135t(boolean z) {
        ChipGroup chipGroup;
        this.f94367f = z;
        C36839u uVar = this.f94364c;
        if (uVar != null) {
            chipGroup = uVar.f88906f;
        } else {
            chipGroup = null;
        }
        if (chipGroup != null) {
            chipGroup.setEnabled(z);
        }
    }

    /* renamed from: u */
    public void mo93136u(String str) {
        this.f94365d = str;
        m115368E();
    }

    /* renamed from: v */
    public void mo93137v(boolean z) {
        LinearLayout c;
        this.f94366e = z;
        C36839u uVar = this.f94364c;
        if (uVar != null && (c = uVar.mo3946b()) != null) {
            C32343x.m95483r1(c, z, false, 2, (Object) null);
        }
    }

    /* renamed from: z */
    public View mo93127l(ViewGroup viewGroup, C33699b bVar) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(bVar, "element");
        this.f94364c = C36839u.m109169d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        m115366C();
        boolean z = !bVar.mo80328p();
        this.f94369h = z;
        mo93137v(z);
        return m115370y().mo3946b();
    }
}
