package wx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import g91.C32343x;
import he1.C41238w;
import java.util.List;
import jx0.C36842x;
import kotlin.jvm.internal.C41536l;
import lx0.C37179d;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import s31.C38421a;
import vx0.C39491a;

/* renamed from: wx0.j */
public final class C39728j extends C39491a {

    /* renamed from: b */
    private C36842x f94390b;

    /* renamed from: c */
    private String f94391c;

    /* renamed from: d */
    private boolean f94392d = true;

    /* renamed from: e */
    private int f94393e = -1;

    /* renamed from: f */
    private boolean f94394f;

    /* renamed from: g */
    private boolean f94395g = true;

    /* renamed from: wx0.j$a */
    public enum C39729a {
        TOP("TOP"),
        BOTTOM("BOTTOM");
        

        /* renamed from: d */
        private final String f94399d;

        private C39729a(String str) {
            this.f94399d = str;
        }

        /* renamed from: b */
        public final String mo93460b() {
            return this.f94399d;
        }
    }

    /* renamed from: wx0.j$b */
    public /* synthetic */ class C39730b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94400a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                wx0.j$a[] r0 = wx0.C39728j.C39729a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wx0.j$a r1 = wx0.C39728j.C39729a.TOP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wx0.j$a r1 = wx0.C39728j.C39729a.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f94400a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wx0.C39728j.C39730b.<clinit>():void");
        }
    }

    /* renamed from: x */
    private final C36842x m115426x() {
        C36842x xVar = this.f94390b;
        C41536l.m120486f(xVar);
        return xVar;
    }

    /* renamed from: z */
    private final void m115427z() {
        String g = mo93122g();
        C41238w wVar = null;
        if (g != null) {
            C36842x x = m115426x();
            LinearLayout c = x.mo3946b();
            C41536l.m120488h(c, "root");
            C32343x.m95447f1(c);
            int i = C39730b.f94400a[C39729a.valueOf(g).ordinal()];
            if (i == 1) {
                LayerView layerView = x.f88916g;
                C41536l.m120488h(layerView, "topBackground");
                C32343x.m95483r1(layerView, mo93124i(), false, 2, (Object) null);
                View view = x.f88915f;
                C41536l.m120488h(view, "middleBackground");
                C32343x.m95483r1(view, mo93124i(), false, 2, (Object) null);
                LayerView layerView2 = x.f88914e;
                C41536l.m120488h(layerView2, "bottomBackground");
                C32343x.m95455i0(layerView2);
            } else if (i == 2) {
                LayerView layerView3 = x.f88916g;
                C41536l.m120488h(layerView3, "topBackground");
                C32343x.m95455i0(layerView3);
                View view2 = x.f88915f;
                C41536l.m120488h(view2, "middleBackground");
                C32343x.m95455i0(view2);
                LayerView layerView4 = x.f88914e;
                C41536l.m120488h(layerView4, "bottomBackground");
                C32343x.m95483r1(layerView4, mo93124i(), false, 2, (Object) null);
            }
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            LinearLayout c2 = m115426x().mo3946b();
            C41536l.m120488h(c2, "binding.root");
            C32343x.m95455i0(c2);
        }
    }

    /* renamed from: e */
    public int mo93120e() {
        return this.f94393e;
    }

    /* renamed from: g */
    public String mo93122g() {
        return this.f94391c;
    }

    /* renamed from: h */
    public Object mo93123h() {
        return mo93122g();
    }

    /* renamed from: i */
    public boolean mo93124i() {
        return this.f94392d;
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
        m115427z();
    }

    /* renamed from: p */
    public void mo93131p() {
        mo93137v(this.f94394f);
    }

    /* renamed from: q */
    public void mo93132q(Object obj) {
        mo93136u(String.valueOf(obj));
    }

    /* renamed from: s */
    public void mo93134s(int i) {
        this.f94393e = i;
    }

    /* renamed from: t */
    public void mo93135t(boolean z) {
        this.f94395g = z;
    }

    /* renamed from: u */
    public void mo93136u(String str) {
        this.f94391c = str;
        if (this.f94390b != null) {
            m115427z();
        }
    }

    /* renamed from: v */
    public void mo93137v(boolean z) {
        LinearLayout c;
        this.f94392d = z;
        C36842x xVar = this.f94390b;
        if (xVar != null && (c = xVar.mo3946b()) != null) {
            C32343x.m95483r1(c, z, false, 2, (Object) null);
        }
    }

    /* renamed from: y */
    public View mo93127l(ViewGroup viewGroup, C33699b bVar) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(bVar, "element");
        this.f94390b = C36842x.m109181d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        mo93136u(bVar.mo80324l());
        boolean z = !bVar.mo80328p();
        this.f94394f = z;
        mo93137v(z);
        m115427z();
        LinearLayout c = m115426x().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }
}
