package com.medallia.digital.mobilesdk;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.g5 */
class C10837g5 extends C10717a2<C10839b> {

    /* renamed from: g */
    private ComponentCallbacks2 f31022g;

    /* renamed from: com.medallia.digital.mobilesdk.g5$a */
    class C10838a implements ComponentCallbacks2 {
        C10838a() {
        }

        public void onConfigurationChanged(Configuration configuration) {
            C10837g5 g5Var;
            C10839b bVar;
            try {
                int i = C10884i4.m39721c().mo28483b().getResources().getConfiguration().orientation;
                if (i == 1 || i == 2) {
                    g5Var = C10837g5.this;
                    bVar = g5Var.m39532o();
                } else {
                    g5Var = C10837g5.this;
                    bVar = C10839b.Unknown;
                }
                g5Var.mo28117a(bVar);
                Locale locale = Locale.US;
                C10735b4.m39109b(String.format(locale, "Collectors > Orientation : %s", new Object[]{((C10839b) C10837g5.this.mo28863f()).toString()}));
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.g5$b */
    enum C10839b {
        Portrait(0),
        PortraitUpsidedown(2),
        LandscapeLeft(1),
        LandscapeRight(3),
        Unknown(-1);
        

        /* renamed from: a */
        private final int f31030a;

        private C10839b(int i) {
            this.f31030a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo28355a() {
            return this.f31030a;
        }

        /* renamed from: a */
        static C10839b m39539a(int i) {
            for (C10839b bVar : values()) {
                if (bVar.mo28355a() == i) {
                    return bVar;
                }
            }
            return Unknown;
        }
    }

    protected C10837g5(C11083s0 s0Var) {
        super(s0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public C10839b m39532o() {
        return C10884i4.m39721c().mo28483b().getSystemService("window") != null ? C10839b.m39539a(((WindowManager) C10884i4.m39721c().mo28483b().getSystemService("window")).getDefaultDisplay().getRotation()) : C10839b.Unknown;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32169D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo28066k() {
        super.mo28066k();
        if (mo28863f() != null) {
            C10735b4.m39109b(String.format(Locale.US, "Collectors > Orientation : %s", new Object[]{((C10839b) mo28863f()).toString()}));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28067l() {
        super.mo28067l();
        if (mo28952h()) {
            this.f31022g = new C10838a();
            C10884i4.m39721c().mo28483b().registerComponentCallbacks(this.f31022g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28068m() {
        super.mo28068m();
        try {
            if (this.f31022g != null) {
                C10884i4.m39721c().mo28483b().unregisterComponentCallbacks(this.f31022g);
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C10839b mo28065j() {
        return m39532o();
    }
}
