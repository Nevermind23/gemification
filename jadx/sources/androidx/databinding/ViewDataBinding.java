package androidx.databinding;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1646z;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p031c0.C2220a;
import p086g1.C6201a;

public abstract class ViewDataBinding extends C1354a implements C6201a {

    /* renamed from: o */
    static int f3892o = Build.VERSION.SDK_INT;

    /* renamed from: p */
    private static final int f3893p = 8;

    /* renamed from: q */
    private static final boolean f3894q = true;

    /* renamed from: r */
    private static final C1357d f3895r = new C1345a();

    /* renamed from: s */
    private static final C1357d f3896s = new C1346b();

    /* renamed from: t */
    private static final C1357d f3897t = new C1347c();

    /* renamed from: u */
    private static final C1357d f3898u = new C1348d();

    /* renamed from: v */
    private static final C1356c f3899v = new C1349e();

    /* renamed from: w */
    private static final ReferenceQueue f3900w = new ReferenceQueue();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final View.OnAttachStateChangeListener f3901x = new C1350f();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Runnable f3902d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f3903e;

    /* renamed from: f */
    private boolean f3904f;

    /* renamed from: g */
    private C1362i[] f3905g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final View f3906h;

    /* renamed from: i */
    private boolean f3907i;

    /* renamed from: j */
    private Choreographer f3908j;

    /* renamed from: k */
    private final Choreographer.FrameCallback f3909k;

    /* renamed from: l */
    private Handler f3910l;

    /* renamed from: m */
    private ViewDataBinding f3911m;

    /* renamed from: n */
    private C1619q f3912n;

    static class OnStartListener implements C1616p {

        /* renamed from: d */
        final WeakReference f3913d;

        @C1646z(C1593j.C1594a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.f3913d.get();
            if (viewDataBinding != null) {
                viewDataBinding.mo3948m();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$a */
    class C1345a implements C1357d {
        C1345a() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$b */
    class C1346b implements C1357d {
        C1346b() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$c */
    class C1347c implements C1357d {
        C1347c() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$d */
    class C1348d implements C1357d {
        C1348d() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$e */
    class C1349e extends C1356c {
        C1349e() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$f */
    class C1350f implements View.OnAttachStateChangeListener {
        C1350f() {
        }

        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m4663p(view).f3902d.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$g */
    class C1351g implements Runnable {
        C1351g() {
        }

        public void run() {
            synchronized (this) {
                boolean unused = ViewDataBinding.this.f3903e = false;
            }
            ViewDataBinding.m4669w();
            if (!ViewDataBinding.this.f3906h.isAttachedToWindow()) {
                ViewDataBinding.this.f3906h.removeOnAttachStateChangeListener(ViewDataBinding.f3901x);
                ViewDataBinding.this.f3906h.addOnAttachStateChangeListener(ViewDataBinding.f3901x);
                return;
            }
            ViewDataBinding.this.mo3948m();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$h */
    class C1352h implements Choreographer.FrameCallback {
        C1352h() {
        }

        public void doFrame(long j) {
            ViewDataBinding.this.f3902d.run();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$i */
    protected static class C1353i {
    }

    protected ViewDataBinding(C1359f fVar, View view, int i) {
        this.f3902d = new C1351g();
        this.f3903e = false;
        this.f3904f = false;
        this.f3905g = new C1362i[i];
        this.f3906h = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f3894q) {
            this.f3908j = Choreographer.getInstance();
            this.f3909k = new C1352h();
        } else {
            this.f3909k = null;
            this.f3910l = new Handler(Looper.myLooper());
        }
    }

    /* renamed from: i */
    private static C1359f m4661i(Object obj) {
        if (obj == null) {
            return null;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* renamed from: l */
    private void m4662l() {
        if (this.f3907i) {
            mo3950x();
        } else if (mo3949q()) {
            this.f3907i = true;
            this.f3904f = false;
            mo3947k();
            this.f3907i = false;
        }
    }

    /* renamed from: p */
    static ViewDataBinding m4663p(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(C2220a.dataBinding);
        }
        return null;
    }

    /* renamed from: r */
    protected static ViewDataBinding m4664r(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, Object obj) {
        m4661i(obj);
        return C1360g.m4685e(layoutInflater, i, viewGroup, z, (C1359f) null);
    }

    /* renamed from: s */
    private static boolean m4665s(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m4666t(androidx.databinding.C1359f r8, android.view.View r9, java.lang.Object[] r10, androidx.databinding.ViewDataBinding.C1353i r11, android.util.SparseIntArray r12, boolean r13) {
        /*
            androidx.databinding.ViewDataBinding r0 = m4663p(r9)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r0 = r9.getTag()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r1 = 0
            r2 = 1
            if (r13 == 0) goto L_0x003b
            if (r0 == 0) goto L_0x003b
            java.lang.String r13 = "layout"
            boolean r13 = r0.startsWith(r13)
            if (r13 == 0) goto L_0x003b
            r13 = 95
            int r13 = r0.lastIndexOf(r13)
            if (r13 <= 0) goto L_0x0052
            int r13 = r13 + r2
            boolean r3 = m4665s(r0, r13)
            if (r3 == 0) goto L_0x0052
            int r13 = m4668v(r0, r13)
            r0 = r10[r13]
            if (r0 != 0) goto L_0x0053
            r10[r13] = r9
            goto L_0x0053
        L_0x003b:
            if (r0 == 0) goto L_0x0052
            java.lang.String r13 = "binding_"
            boolean r13 = r0.startsWith(r13)
            if (r13 == 0) goto L_0x0052
            int r13 = f3893p
            int r13 = m4668v(r0, r13)
            r0 = r10[r13]
            if (r0 != 0) goto L_0x0053
            r10[r13] = r9
            goto L_0x0053
        L_0x0052:
            r2 = r1
        L_0x0053:
            if (r2 != 0) goto L_0x006a
            int r13 = r9.getId()
            if (r13 <= 0) goto L_0x006a
            if (r12 == 0) goto L_0x006a
            r0 = -1
            int r13 = r12.get(r13, r0)
            if (r13 < 0) goto L_0x006a
            r0 = r10[r13]
            if (r0 != 0) goto L_0x006a
            r10[r13] = r9
        L_0x006a:
            boolean r13 = r9 instanceof android.view.ViewGroup
            if (r13 == 0) goto L_0x0085
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r13 = r9.getChildCount()
        L_0x0074:
            if (r1 >= r13) goto L_0x0085
            android.view.View r3 = r9.getChildAt(r1)
            r7 = 0
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            m4666t(r2, r3, r4, r5, r6, r7)
            int r1 = r1 + 1
            goto L_0x0074
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.m4666t(androidx.databinding.f, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$i, android.util.SparseIntArray, boolean):void");
    }

    /* renamed from: u */
    protected static Object[] m4667u(C1359f fVar, View view, int i, C1353i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        m4666t(fVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    /* renamed from: v */
    private static int m4668v(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            i2 = (i2 * 10) + (str.charAt(i) - '0');
            i++;
        }
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static void m4669w() {
        do {
        } while (f3900w.poll() != null);
    }

    /* renamed from: y */
    protected static long m4670y(Long l) {
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo3945A(View view) {
        view.setTag(C2220a.dataBinding, this);
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f3906h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo3947k();

    /* renamed from: m */
    public void mo3948m() {
        ViewDataBinding viewDataBinding = this.f3911m;
        if (viewDataBinding == null) {
            m4662l();
        } else {
            viewDataBinding.mo3948m();
        }
    }

    /* renamed from: q */
    public abstract boolean mo3949q();

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (f3894q == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2.f3908j.postFrameCallback(r2.f3909k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.f3910l.post(r2.f3902d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3950x() {
        /*
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.f3911m
            if (r0 == 0) goto L_0x0008
            r0.mo3950x()
            goto L_0x003b
        L_0x0008:
            androidx.lifecycle.q r0 = r2.f3912n
            if (r0 == 0) goto L_0x001d
            androidx.lifecycle.j r0 = r0.getLifecycle()
            androidx.lifecycle.j$b r0 = r0.mo4907b()
            androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.STARTED
            boolean r0 = r0.mo4914b(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.f3903e     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r0 = 1
            r2.f3903e = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            boolean r0 = f3894q
            if (r0 == 0) goto L_0x0034
            android.view.Choreographer r0 = r2.f3908j
            android.view.Choreographer$FrameCallback r1 = r2.f3909k
            r0.postFrameCallback(r1)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r0 = r2.f3910l
            java.lang.Runnable r1 = r2.f3902d
            r0.post(r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.mo3950x():void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected ViewDataBinding(Object obj, View view, int i) {
        this((C1359f) null, view, i);
        m4661i(obj);
    }
}
