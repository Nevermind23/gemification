package com.medallia.digital.mobilesdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.medallia.digital.mobilesdk.C10880i3;
import com.medallia.digital.mobilesdk.C10992m1;

/* renamed from: com.medallia.digital.mobilesdk.x */
final class C11184x implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: n */
    private static final long f32127n = 300;

    /* renamed from: a */
    private final CharSequence f32128a;

    /* renamed from: b */
    private final C10992m1 f32129b;

    /* renamed from: c */
    private final C10771d0 f32130c;

    /* renamed from: d */
    private Activity f32131d;

    /* renamed from: e */
    private ViewGroup f32132e = null;

    /* renamed from: f */
    private Animation f32133f;

    /* renamed from: g */
    private Animation f32134g;

    /* renamed from: h */
    private C11207y f32135h;

    /* renamed from: i */
    private final C10953l1 f32136i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f32137j;

    /* renamed from: k */
    private Handler f32138k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f32139l;

    /* renamed from: m */
    private boolean f32140m;

    /* renamed from: com.medallia.digital.mobilesdk.x$a */
    class C11185a extends C11033o4 {
        C11185a() {
        }

        /* renamed from: a */
        public void mo27617a() {
            if (!(C11184x.this.mo29175r() == null || C11184x.this.mo29175r().getParent() == null)) {
                ((ViewGroup) C11184x.this.mo29175r().getParent()).removeView(C11184x.this.mo29175r());
            }
            C11184x.this.m41023A();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.x$b */
    class C11186b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11207y f32142a;

        C11186b(C11207y yVar) {
            this.f32142a = yVar;
        }

        public void onClick(View view) {
            C11184x xVar = C11184x.this;
            xVar.m41038a(this.f32142a, new C10880i3(xVar.mo29173p(), C10880i3.C10881a.buttonClicked, C11184x.this.mo29175r().mo28057b()));
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.x$c */
    class C11187c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11207y f32144a;

        C11187c(C11207y yVar) {
            this.f32144a = yVar;
        }

        public void onClick(View view) {
            C11184x.this.m41037a(this.f32144a);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.x$d */
    class C11188d extends C11231z {

        /* renamed from: q */
        final /* synthetic */ C11207y f32146q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11188d(C10992m1 m1Var, boolean z, C10771d0 d0Var, C11207y yVar) {
            super(m1Var, z, d0Var);
            this.f32146q = yVar;
        }

        /* renamed from: c */
        public void mo29185c() {
            C11184x.this.m41037a(this.f32146q);
        }

        /* renamed from: d */
        public void mo29186d() {
            boolean unused = C11184x.this.f32137j = true;
        }

        /* renamed from: e */
        public void mo29187e() {
            if (C11184x.this.m41055j().f31564b == C10992m1.C10995c.BOTTOM) {
                C11207y yVar = this.f32146q;
                if (yVar != null) {
                    yVar.mo28404a(new C10880i3(C11184x.this.mo29173p(), C10880i3.C10881a.swipeDown, C11184x.this.mo29175r().mo28057b()));
                }
                C11184x.this.m41031a(C11193i.DOWN);
            }
        }

        /* renamed from: f */
        public void mo29188f() {
            C11207y yVar = this.f32146q;
            if (yVar != null) {
                yVar.mo28404a(new C10880i3(C11184x.this.mo29173p(), C10880i3.C10881a.swipeLeft, C11184x.this.mo29175r().mo28057b()));
            }
            C11184x.this.m41031a(C11193i.LEFT);
        }

        /* renamed from: g */
        public void mo29189g() {
            C11207y yVar = this.f32146q;
            if (yVar != null) {
                yVar.mo28404a(new C10880i3(C11184x.this.mo29173p(), C10880i3.C10881a.swipeRight, C11184x.this.mo29175r().mo28057b()));
            }
            C11184x.this.m41031a(C11193i.RIGHT);
        }

        /* renamed from: h */
        public void mo29190h() {
            if (C11184x.this.m41055j().f31564b == C10992m1.C10995c.TOP) {
                C11207y yVar = this.f32146q;
                if (yVar != null) {
                    yVar.mo28404a(new C10880i3(C11184x.this.mo29173p(), C10880i3.C10881a.swipeUp, C11184x.this.mo29175r().mo28057b()));
                }
                C11184x.this.m41031a(C11193i.UP);
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.x$e */
    class C11189e implements Runnable {
        C11189e() {
        }

        public void run() {
            if (!C11184x.this.f32137j) {
                C11184x.this.m41032a(C11194j.REMOVE_BANNER);
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.x$f */
    class C11190f extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ View f32149a;

        C11190f(View view) {
            this.f32149a = view;
        }

        /* renamed from: a */
        public void mo27617a() {
            this.f32149a.performAccessibilityAction(64, (Bundle) null);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.x$g */
    class C11191g implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ View f32151a;

        C11191g(View view) {
            this.f32151a = view;
        }

        @TargetApi(16)
        public void onGlobalLayout() {
            long j;
            this.f32151a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (C11184x.this.m41056k() != null) {
                long j2 = 0;
                if (C11184x.this.f32139l == 0) {
                    this.f32151a.startAnimation(C11184x.this.m41056k());
                    j = C11184x.this.m41056k().getDuration();
                } else {
                    j = 0;
                }
                if (-1 != C11184x.this.m41055j().f31563a) {
                    if (C11184x.this.f32139l == 0) {
                        long unused = C11184x.this.f32139l = System.currentTimeMillis();
                    } else {
                        j2 = System.currentTimeMillis() - C11184x.this.f32139l;
                    }
                    if (!C11184x.this.mo29175r().mo28058c()) {
                        C11184x xVar = C11184x.this;
                        xVar.m41028a((xVar.m41055j().f31563a - j2) + j);
                    }
                }
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.x$h */
    static /* synthetic */ class C11192h {

        /* renamed from: a */
        static final /* synthetic */ int[] f32153a;

        /* renamed from: b */
        static final /* synthetic */ int[] f32154b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                com.medallia.digital.mobilesdk.x$j[] r0 = com.medallia.digital.mobilesdk.C11184x.C11194j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32154b = r0
                r1 = 1
                com.medallia.digital.mobilesdk.x$j r2 = com.medallia.digital.mobilesdk.C11184x.C11194j.DISPLAY_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f32154b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.x$j r3 = com.medallia.digital.mobilesdk.C11184x.C11194j.ADD_BANNER_TO_VIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f32154b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.x$j r4 = com.medallia.digital.mobilesdk.C11184x.C11194j.REMOVE_BANNER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.medallia.digital.mobilesdk.x$i[] r3 = com.medallia.digital.mobilesdk.C11184x.C11193i.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f32153a = r3
                com.medallia.digital.mobilesdk.x$i r4 = com.medallia.digital.mobilesdk.C11184x.C11193i.LEFT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f32153a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.medallia.digital.mobilesdk.x$i r3 = com.medallia.digital.mobilesdk.C11184x.C11193i.RIGHT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f32153a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.medallia.digital.mobilesdk.x$i r1 = com.medallia.digital.mobilesdk.C11184x.C11193i.DOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f32153a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.medallia.digital.mobilesdk.x$i r1 = com.medallia.digital.mobilesdk.C11184x.C11193i.UP     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11184x.C11192h.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.x$i */
    enum C11193i {
        UP,
        LEFT,
        RIGHT,
        DOWN;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Animation mo29193a(C11184x xVar) {
            int i = C11192h.f32153a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? xVar.m41060o() : xVar.m41057l() : xVar.m41059n() : xVar.m41058m();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.x$j */
    enum C11194j {
        DISPLAY_BANNER,
        ADD_BANNER_TO_VIEW,
        REMOVE_BANNER
    }

    private C11184x(long j, boolean z, Activity activity, C10771d0 d0Var, C10992m1 m1Var, C11207y yVar) {
        this.f32139l = j;
        this.f32137j = z;
        this.f32131d = activity;
        this.f32130c = d0Var;
        if (d0Var != null) {
            this.f32140m = d0Var.mo28057b();
        }
        this.f32129b = m1Var == null ? C10992m1.f31562f : m1Var;
        this.f32128a = null;
        this.f32135h = yVar;
        this.f32136i = new C10953l1();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m41023A() {
        ViewGroup viewGroup;
        if (mo29181x() && (viewGroup = (ViewGroup) mo29175r().getParent()) != null) {
            viewGroup.removeView(mo29175r());
        }
    }

    /* renamed from: g */
    private Activity m41050g() {
        return this.f32131d;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public C10992m1 m41055j() {
        return this.f32129b;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public Animation m41056k() {
        if (this.f32133f == null && this.f32131d != null) {
            m41062z();
            this.f32133f = this.f32129b.f31564b == C10992m1.C10995c.BOTTOM ? this.f32136i.mo28652d(mo29175r()) : this.f32136i.mo28651c(mo29175r());
        }
        return this.f32133f;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public Animation m41057l() {
        if (this.f32134g == null && this.f32131d != null) {
            this.f32134g = this.f32136i.mo28653e(mo29175r());
        }
        return this.f32134g;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public Animation m41058m() {
        if (this.f32131d != null) {
            this.f32134g = this.f32136i.mo28654f(mo29175r());
        }
        return this.f32134g;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public Animation m41059n() {
        if (this.f32131d != null) {
            this.f32134g = this.f32136i.mo28655g(mo29175r());
        }
        return this.f32134g;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public Animation m41060o() {
        if (this.f32134g == null && this.f32131d != null) {
            this.f32134g = this.f32136i.mo28656h(mo29175r());
        }
        return this.f32134g;
    }

    /* renamed from: v */
    private boolean m41061v() {
        C10771d0 d0Var = this.f32130c;
        return (d0Var == null || d0Var.getParent() == null) ? false : true;
    }

    /* renamed from: z */
    private void m41062z() {
        C10771d0 r = mo29175r();
        View view = this.f32132e;
        if (view == null) {
            view = this.f32131d.getWindow().getDecorView();
        }
        r.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo29168B() {
        m41049f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public long mo29170i() {
        return this.f32139l;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C10880i3.C10883c mo29173p() {
        if (mo29175r() == null) {
            return null;
        }
        if (mo29175r().mo28058c()) {
            return C10880i3.C10883c.StickyByConfiguration;
        }
        if (mo29180w()) {
            return C10880i3.C10883c.StickyByGesture;
        }
        if (!mo29175r().mo28058c()) {
            return C10880i3.C10883c.No;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public CharSequence mo29174q() {
        return this.f32128a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C10771d0 mo29175r() {
        return this.f32130c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public ViewGroup mo29176s() {
        return this.f32132e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo29177t() {
        m41031a(m41055j().f31564b == C10992m1.C10995c.BOTTOM ? C11193i.DOWN : C11193i.UP);
    }

    public String toString() {
        return "Banner{text=" + this.f32128a + ", configuration=" + this.f32129b + ", customView=" + this.f32130c + ", activity=" + this.f32131d + ", viewGroup=" + this.f32132e + ", inAnimation=" + this.f32133f + ", outAnimation=" + this.f32134g + ", bannerCallbacks=" + this.f32135h + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo29179u() {
        return this.f32140m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo29180w() {
        return this.f32137j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo29181x() {
        return this.f32131d != null && m41061v();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo29182y() {
        if (mo29175r() == null) {
            return false;
        }
        mo29175r().mo28059d();
        return false;
    }

    /* renamed from: c */
    private void m41043c() {
        this.f32131d = null;
    }

    /* renamed from: d */
    private void m41045d() {
        this.f32135h = null;
    }

    /* renamed from: e */
    private void m41047e() {
        this.f32132e = null;
    }

    /* renamed from: f */
    private void m41049f() {
        if (m41050g() != null && mo29175r() != null && !mo29181x()) {
            C11207y h = m41053h();
            if (mo29175r().mo28057b() && mo29175r().mo28060e() != null) {
                mo29175r().mo28060e().setOnClickListener(new C11186b(h));
            }
            if (mo29175r().mo28057b() && mo29175r().mo28061f() != null) {
                mo29175r().mo28061f().setOnClickListener(new C11187c(h));
            }
            mo29175r().setOnTouchListener(new C11188d(m41055j(), !mo29175r().mo28057b(), this.f32130c, h));
            m41032a(C11194j.ADD_BANNER_TO_VIEW);
            if (m41053h() != null) {
                m41053h().mo28403a();
            }
        }
    }

    /* renamed from: h */
    private C11207y m41053h() {
        return this.f32135h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29169b() {
        try {
            Activity g = m41050g();
            if (g == null) {
                g = (Activity) C10884i4.m39721c().mo28484d().getBaseContext();
            }
            g.runOnUiThread(new C11185a());
            Handler handler = this.f32138k;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                this.f32138k = null;
            }
            this.f32135h = null;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: a */
    static C11184x m41026a(long j, boolean z, Activity activity, C10771d0 d0Var, C10992m1 m1Var, C11207y yVar) {
        return new C11184x(j, z, activity, d0Var, m1Var, yVar);
    }

    /* renamed from: a */
    private void m41027a() {
        if (!mo29181x()) {
            C10771d0 r = mo29175r();
            if (r.getParent() == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                }
                Activity g = m41050g();
                if (g != null && !g.isFinishing()) {
                    if (m41055j().f31564b == C10992m1.C10995c.TOP) {
                        layoutParams.gravity = 48;
                        m41030a((ViewGroup.MarginLayoutParams) layoutParams, g);
                    } else if (m41055j().f31564b == C10992m1.C10995c.BOTTOM) {
                        layoutParams.gravity = 80;
                    }
                    if (g.getWindow() != null) {
                        new Handler(Looper.getMainLooper()).postDelayed(new C11190f(r), f32127n);
                        g.getWindow().addContentView(r, layoutParams);
                    }
                } else {
                    return;
                }
            }
            r.requestLayout();
            ViewTreeObserver viewTreeObserver = r.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new C11191g(r));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m41028a(long j) {
        Handler handler = new Handler();
        this.f32138k = handler;
        handler.postDelayed(new C11189e(), j);
    }

    /* renamed from: a */
    protected static void m41029a(Activity activity, C10771d0 d0Var, C10992m1 m1Var, C11207y yVar) {
        m41026a(0, false, activity, d0Var, m1Var, yVar).mo29168B();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051 A[Catch:{ Exception -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[Catch:{ Exception -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f A[Catch:{ Exception -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060 A[Catch:{ Exception -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[Catch:{ Exception -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090 A[Catch:{ Exception -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ea A[Catch:{ Exception -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m41030a(android.view.ViewGroup.MarginLayoutParams r8, android.app.Activity r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f5 }
            r0.<init>()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r1 = "activity = "
            r0.append(r1)     // Catch:{ Exception -> 0x00f5 }
            java.lang.Class r1 = r9.getClass()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ Exception -> 0x00f5 }
            r0.append(r1)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00f5 }
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r0)     // Catch:{ Exception -> 0x00f5 }
            android.view.Window r0 = r9.getWindow()     // Catch:{ Exception -> 0x00f5 }
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()     // Catch:{ Exception -> 0x00f5 }
            int r1 = r1.flags     // Catch:{ Exception -> 0x00f5 }
            r2 = 1024(0x400, float:1.435E-42)
            r1 = r1 & r2
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x003b
            android.view.View r1 = r0.getDecorView()     // Catch:{ Exception -> 0x00f5 }
            int r1 = r1.getSystemUiVisibility()     // Catch:{ Exception -> 0x00f5 }
            r5 = 4
            if (r1 < r5) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r1 = r4
            goto L_0x003c
        L_0x003b:
            r1 = r3
        L_0x003c:
            android.view.WindowManager$LayoutParams r5 = r0.getAttributes()     // Catch:{ Exception -> 0x00f5 }
            int r5 = r5.flags     // Catch:{ Exception -> 0x00f5 }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0053
            android.view.View r5 = r0.getDecorView()     // Catch:{ Exception -> 0x00f5 }
            int r5 = r5.getSystemUiVisibility()     // Catch:{ Exception -> 0x00f5 }
            if (r5 != r2) goto L_0x0053
            r2 = r3
            goto L_0x0054
        L_0x0053:
            r2 = r4
        L_0x0054:
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()     // Catch:{ Exception -> 0x00f5 }
            int r0 = r0.flags     // Catch:{ Exception -> 0x00f5 }
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = r4
        L_0x0061:
            if (r3 == 0) goto L_0x0090
            int r0 = com.medallia.digital.mobilesdk.C10985l6.m40217b()     // Catch:{ Exception -> 0x00f5 }
            if (r0 <= 0) goto L_0x0071
            android.content.res.Resources r1 = r9.getResources()     // Catch:{ Exception -> 0x00f5 }
            int r4 = r1.getDimensionPixelSize(r0)     // Catch:{ Exception -> 0x00f5 }
        L_0x0071:
            com.medallia.digital.mobilesdk.d0 r0 = r7.f32130c     // Catch:{ Exception -> 0x00f5 }
            com.medallia.digital.mobilesdk.b0 r0 = r0.f30850a     // Catch:{ Exception -> 0x00f5 }
            boolean r0 = r0.f30679l     // Catch:{ Exception -> 0x00f5 }
            if (r0 == 0) goto L_0x007b
            int r4 = r4 + 15
        L_0x007b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f5 }
            r0.<init>()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r1 = "activity = status is transparent = "
            r0.append(r1)     // Catch:{ Exception -> 0x00f5 }
            r0.append(r4)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00f5 }
        L_0x008c:
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r0)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00dc
        L_0x0090:
            if (r1 == 0) goto L_0x00b0
            com.medallia.digital.mobilesdk.d0 r0 = r7.f32130c     // Catch:{ Exception -> 0x00f5 }
            com.medallia.digital.mobilesdk.b0 r0 = r0.f30850a     // Catch:{ Exception -> 0x00f5 }
            boolean r0 = r0.f30679l     // Catch:{ Exception -> 0x00f5 }
            if (r0 == 0) goto L_0x00b0
            if (r2 != 0) goto L_0x00b0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f5 }
            r0.<init>()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r1 = "activity = status is transparent and fullscreen = "
            r0.append(r1)     // Catch:{ Exception -> 0x00f5 }
            r4 = 15
            r0.append(r4)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00f5 }
            goto L_0x008c
        L_0x00b0:
            if (r2 == 0) goto L_0x00de
            int r0 = com.medallia.digital.mobilesdk.C10985l6.m40217b()     // Catch:{ Exception -> 0x00f5 }
            if (r0 <= 0) goto L_0x00c0
            android.content.res.Resources r1 = r9.getResources()     // Catch:{ Exception -> 0x00f5 }
            int r4 = r1.getDimensionPixelSize(r0)     // Catch:{ Exception -> 0x00f5 }
        L_0x00c0:
            com.medallia.digital.mobilesdk.d0 r0 = r7.f32130c     // Catch:{ Exception -> 0x00f5 }
            com.medallia.digital.mobilesdk.b0 r0 = r0.f30850a     // Catch:{ Exception -> 0x00f5 }
            boolean r0 = r0.f30679l     // Catch:{ Exception -> 0x00f5 }
            if (r0 == 0) goto L_0x00ca
            int r4 = r4 + 15
        L_0x00ca:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f5 }
            r0.<init>()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r1 = "activity = status is draw system bar = "
            r0.append(r1)     // Catch:{ Exception -> 0x00f5 }
            r0.append(r4)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00f5 }
            goto L_0x008c
        L_0x00dc:
            r8.topMargin = r4     // Catch:{ Exception -> 0x00f5 }
        L_0x00de:
            com.medallia.digital.mobilesdk.m1 r0 = r7.f32129b     // Catch:{ Exception -> 0x00f5 }
            boolean r0 = r0.f31565c     // Catch:{ Exception -> 0x00f5 }
            if (r0 == 0) goto L_0x00fd
            int r0 = com.medallia.digital.mobilesdk.C10985l6.m40217b()     // Catch:{ Exception -> 0x00f5 }
            if (r0 <= 0) goto L_0x00fd
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ Exception -> 0x00f5 }
            int r9 = r9.getDimensionPixelSize(r0)     // Catch:{ Exception -> 0x00f5 }
            r8.topMargin = r9     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00fd
        L_0x00f5:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r8)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11184x.m41030a(android.view.ViewGroup$MarginLayoutParams, android.app.Activity):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m41031a(C11193i iVar) {
        C10771d0 r = mo29175r();
        if (r != null) {
            r.startAnimation(iVar.mo29193a(this));
            ViewGroup viewGroup = (ViewGroup) r.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(r);
            }
            m41043c();
            m41047e();
            m41045d();
            mo29169b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m41032a(C11194j jVar) {
        int i = C11192h.f32154b[jVar.ordinal()];
        if (i == 1) {
            m41049f();
        } else if (i == 2) {
            m41027a();
        } else if (i == 3) {
            if (m41053h() != null) {
                m41053h().mo28406b(new C10880i3(mo29173p(), C10880i3.C10882b.timeoutPassed, mo29175r().mo28057b()));
            }
            m41031a(m41055j().f31564b == C10992m1.C10995c.BOTTOM ? C11193i.DOWN : C11193i.UP);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m41037a(C11207y yVar) {
        if (yVar != null) {
            yVar.mo28407c(new C10880i3(mo29173p(), mo29175r().mo28057b()));
        }
        m41031a(m41055j().f31564b == C10992m1.C10995c.BOTTOM ? C11193i.DOWN : C11193i.UP);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m41038a(C11207y yVar, C10880i3 i3Var) {
        if (yVar != null) {
            yVar.mo28404a(i3Var);
        }
        m41031a(m41055j().f31564b == C10992m1.C10995c.BOTTOM ? C11193i.DOWN : C11193i.UP);
    }
}
