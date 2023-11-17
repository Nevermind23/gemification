package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C0829d;
import androidx.core.util.C1002c;
import androidx.core.util.C1008h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class WindowInsetsCompat {

    /* renamed from: b */
    public static final WindowInsetsCompat f3676b;

    /* renamed from: a */
    private final C1047l f3677a;

    /* renamed from: androidx.core.view.WindowInsetsCompat$a */
    static class C1036a {

        /* renamed from: a */
        private static Field f3678a;

        /* renamed from: b */
        private static Field f3679b;

        /* renamed from: c */
        private static Field f3680c;

        /* renamed from: d */
        private static boolean f3681d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3678a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3679b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3680c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static WindowInsetsCompat m3835a(View view) {
            if (f3681d && view.isAttachedToWindow()) {
                try {
                    Object obj = f3678a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3679b.get(obj);
                        Rect rect2 = (Rect) f3680c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            WindowInsetsCompat a = new C1037b().mo3507b(C0829d.m3107c(rect)).mo3508c(C0829d.m3107c(rect2)).mo3506a();
                            a.mo3503t(a);
                            a.mo3486d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$e */
    private static class C1040e extends C1039d {
        C1040e() {
        }

        C1040e(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$f */
    private static class C1041f {

        /* renamed from: a */
        private final WindowInsetsCompat f3690a;

        /* renamed from: b */
        C0829d[] f3691b;

        C1041f() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo3515a() {
            C0829d[] dVarArr = this.f3691b;
            if (dVarArr != null) {
                C0829d dVar = dVarArr[C1048m.m3908c(1)];
                C0829d dVar2 = this.f3691b[C1048m.m3908c(2)];
                if (dVar2 == null) {
                    dVar2 = this.f3690a.mo3489f(2);
                }
                if (dVar == null) {
                    dVar = this.f3690a.mo3489f(1);
                }
                mo3511f(C0829d.m3105a(dVar, dVar2));
                C0829d dVar3 = this.f3691b[C1048m.m3908c(16)];
                if (dVar3 != null) {
                    mo3513e(dVar3);
                }
                C0829d dVar4 = this.f3691b[C1048m.m3908c(32)];
                if (dVar4 != null) {
                    mo3512c(dVar4);
                }
                C0829d dVar5 = this.f3691b[C1048m.m3908c(64)];
                if (dVar5 != null) {
                    mo3514g(dVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract WindowInsetsCompat mo3509b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3512c(C0829d dVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo3510d(C0829d dVar);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3513e(C0829d dVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract void mo3511f(C0829d dVar);

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3514g(C0829d dVar) {
        }

        C1041f(WindowInsetsCompat windowInsetsCompat) {
            this.f3690a = windowInsetsCompat;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$i */
    private static class C1044i extends C1043h {
        C1044i(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public WindowInsetsCompat mo3533a() {
            return WindowInsetsCompat.m3812w(this.f3697c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1044i)) {
                return false;
            }
            C1044i iVar = (C1044i) obj;
            if (!Objects.equals(this.f3697c, iVar.f3697c) || !Objects.equals(this.f3701g, iVar.f3701g)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C1253v mo3534f() {
            return C1253v.m4366e(this.f3697c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f3697c.hashCode();
        }

        C1044i(WindowInsetsCompat windowInsetsCompat, C1044i iVar) {
            super(windowInsetsCompat, (C1043h) iVar);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$k */
    private static class C1046k extends C1045j {

        /* renamed from: q */
        static final WindowInsetsCompat f3706q = WindowInsetsCompat.m3812w(WindowInsets.CONSUMED);

        C1046k(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo3516d(View view) {
        }

        /* renamed from: g */
        public C0829d mo3519g(int i) {
            return C0829d.m3108d(this.f3697c.getInsets(C1049n.m3911a(i)));
        }

        /* renamed from: h */
        public C0829d mo3520h(int i) {
            return C0829d.m3108d(this.f3697c.getInsetsIgnoringVisibility(C1049n.m3911a(i)));
        }

        C1046k(WindowInsetsCompat windowInsetsCompat, C1046k kVar) {
            super(windowInsetsCompat, (C1045j) kVar);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$l */
    private static class C1047l {

        /* renamed from: b */
        static final WindowInsetsCompat f3707b = new C1037b().mo3506a().mo3483a().mo3484b().mo3485c();

        /* renamed from: a */
        final WindowInsetsCompat f3708a;

        C1047l(WindowInsetsCompat windowInsetsCompat) {
            this.f3708a = windowInsetsCompat;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public WindowInsetsCompat mo3533a() {
            return this.f3708a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public WindowInsetsCompat mo3528b() {
            return this.f3708a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public WindowInsetsCompat mo3529c() {
            return this.f3708a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3516d(View view) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3517e(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1047l)) {
                return false;
            }
            C1047l lVar = (C1047l) obj;
            if (mo3523p() != lVar.mo3523p() || mo3531o() != lVar.mo3531o() || !C1002c.m3509a(mo3521l(), lVar.mo3521l()) || !C1002c.m3509a(mo3530j(), lVar.mo3530j()) || !C1002c.m3509a(mo3534f(), lVar.mo3534f())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C1253v mo3534f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0829d mo3519g(int i) {
            return C0829d.f3464e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0829d mo3520h(int i) {
            if ((i & 8) == 0) {
                return C0829d.f3464e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return C1002c.m3510b(Boolean.valueOf(mo3523p()), Boolean.valueOf(mo3531o()), mo3521l(), mo3530j(), mo3534f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C0829d mo3536i() {
            return mo3521l();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C0829d mo3530j() {
            return C0829d.f3464e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C0829d mo3537k() {
            return mo3521l();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C0829d mo3521l() {
            return C0829d.f3464e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0829d mo3538m() {
            return mo3521l();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public WindowInsetsCompat mo3522n(int i, int i2, int i3, int i4) {
            return f3707b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo3531o() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo3523p() {
            return false;
        }

        /* renamed from: q */
        public void mo3524q(C0829d[] dVarArr) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo3525r(C0829d dVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo3526s(WindowInsetsCompat windowInsetsCompat) {
        }

        /* renamed from: t */
        public void mo3532t(C0829d dVar) {
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$m */
    public static final class C1048m {
        /* renamed from: a */
        static int m3906a() {
            return -1;
        }

        /* renamed from: b */
        public static int m3907b() {
            return 8;
        }

        /* renamed from: c */
        static int m3908c(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        /* renamed from: d */
        public static int m3909d() {
            return 32;
        }

        /* renamed from: e */
        public static int m3910e() {
            return 7;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$n */
    private static final class C1049n {
        /* renamed from: a */
        static int m3911a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3676b = C1046k.f3706q;
        } else {
            f3676b = C1047l.f3707b;
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f3677a = new C1046k(this, windowInsets);
        } else if (i >= 29) {
            this.f3677a = new C1045j(this, windowInsets);
        } else if (i >= 28) {
            this.f3677a = new C1044i(this, windowInsets);
        } else {
            this.f3677a = new C1043h(this, windowInsets);
        }
    }

    /* renamed from: o */
    static C0829d m3811o(C0829d dVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, dVar.f3465a - i);
        int max2 = Math.max(0, dVar.f3466b - i2);
        int max3 = Math.max(0, dVar.f3467c - i3);
        int max4 = Math.max(0, dVar.f3468d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return dVar;
        }
        return C0829d.m3106b(max, max2, max3, max4);
    }

    /* renamed from: w */
    public static WindowInsetsCompat m3812w(WindowInsets windowInsets) {
        return m3813x(windowInsets, (View) null);
    }

    /* renamed from: x */
    public static WindowInsetsCompat m3813x(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) C1008h.m3530g(windowInsets));
        if (view != null && ViewCompat.m3578U(view)) {
            windowInsetsCompat.mo3503t(ViewCompat.m3553H(view));
            windowInsetsCompat.mo3486d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    @Deprecated
    /* renamed from: a */
    public WindowInsetsCompat mo3483a() {
        return this.f3677a.mo3533a();
    }

    @Deprecated
    /* renamed from: b */
    public WindowInsetsCompat mo3484b() {
        return this.f3677a.mo3528b();
    }

    @Deprecated
    /* renamed from: c */
    public WindowInsetsCompat mo3485c() {
        return this.f3677a.mo3529c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3486d(View view) {
        this.f3677a.mo3516d(view);
    }

    /* renamed from: e */
    public C1253v mo3487e() {
        return this.f3677a.mo3534f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return C1002c.m3509a(this.f3677a, ((WindowInsetsCompat) obj).f3677a);
    }

    /* renamed from: f */
    public C0829d mo3489f(int i) {
        return this.f3677a.mo3519g(i);
    }

    /* renamed from: g */
    public C0829d mo3490g(int i) {
        return this.f3677a.mo3520h(i);
    }

    @Deprecated
    /* renamed from: h */
    public C0829d mo3491h() {
        return this.f3677a.mo3530j();
    }

    public int hashCode() {
        C1047l lVar = this.f3677a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo3493i() {
        return this.f3677a.mo3521l().f3468d;
    }

    @Deprecated
    /* renamed from: j */
    public int mo3494j() {
        return this.f3677a.mo3521l().f3465a;
    }

    @Deprecated
    /* renamed from: k */
    public int mo3495k() {
        return this.f3677a.mo3521l().f3467c;
    }

    @Deprecated
    /* renamed from: l */
    public int mo3496l() {
        return this.f3677a.mo3521l().f3466b;
    }

    /* renamed from: m */
    public boolean mo3497m() {
        C0829d f = mo3489f(C1048m.m3906a());
        C0829d dVar = C0829d.f3464e;
        if (!f.equals(dVar) || !mo3490g(C1048m.m3906a() ^ C1048m.m3907b()).equals(dVar) || mo3487e() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public WindowInsetsCompat mo3498n(int i, int i2, int i3, int i4) {
        return this.f3677a.mo3522n(i, i2, i3, i4);
    }

    /* renamed from: p */
    public boolean mo3499p() {
        return this.f3677a.mo3531o();
    }

    @Deprecated
    /* renamed from: q */
    public WindowInsetsCompat mo3500q(int i, int i2, int i3, int i4) {
        return new C1037b(this).mo3508c(C0829d.m3106b(i, i2, i3, i4)).mo3506a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3501r(C0829d[] dVarArr) {
        this.f3677a.mo3524q(dVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3502s(C0829d dVar) {
        this.f3677a.mo3525r(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3503t(WindowInsetsCompat windowInsetsCompat) {
        this.f3677a.mo3526s(windowInsetsCompat);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3504u(C0829d dVar) {
        this.f3677a.mo3532t(dVar);
    }

    /* renamed from: v */
    public WindowInsets mo3505v() {
        C1047l lVar = this.f3677a;
        if (lVar instanceof C1042g) {
            return ((C1042g) lVar).f3697c;
        }
        return null;
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$c */
    private static class C1038c extends C1041f {

        /* renamed from: e */
        private static Field f3683e = null;

        /* renamed from: f */
        private static boolean f3684f = false;

        /* renamed from: g */
        private static Constructor f3685g = null;

        /* renamed from: h */
        private static boolean f3686h = false;

        /* renamed from: c */
        private WindowInsets f3687c;

        /* renamed from: d */
        private C0829d f3688d;

        C1038c() {
            this.f3687c = m3839h();
        }

        /* renamed from: h */
        private static WindowInsets m3839h() {
            Class<WindowInsets> cls = WindowInsets.class;
            if (!f3684f) {
                try {
                    f3683e = cls.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f3684f = true;
            }
            Field field = f3683e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f3686h) {
                try {
                    f3685g = cls.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f3686h = true;
            }
            Constructor constructor = f3685g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public WindowInsetsCompat mo3509b() {
            mo3515a();
            WindowInsetsCompat w = WindowInsetsCompat.m3812w(this.f3687c);
            w.mo3501r(this.f3691b);
            w.mo3504u(this.f3688d);
            return w;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3510d(C0829d dVar) {
            this.f3688d = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3511f(C0829d dVar) {
            WindowInsets windowInsets = this.f3687c;
            if (windowInsets != null) {
                this.f3687c = windowInsets.replaceSystemWindowInsets(dVar.f3465a, dVar.f3466b, dVar.f3467c, dVar.f3468d);
            }
        }

        C1038c(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f3687c = windowInsetsCompat.mo3505v();
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$d */
    private static class C1039d extends C1041f {

        /* renamed from: c */
        final WindowInsets.Builder f3689c;

        C1039d() {
            C1265w3.m4404a();
            this.f3689c = C1251u3.m4364a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public WindowInsetsCompat mo3509b() {
            mo3515a();
            WindowInsetsCompat w = WindowInsetsCompat.m3812w(this.f3689c.build());
            w.mo3501r(this.f3691b);
            return w;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3512c(C0829d dVar) {
            WindowInsets.Builder unused = this.f3689c.setMandatorySystemGestureInsets(dVar.mo3296e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3510d(C0829d dVar) {
            WindowInsets.Builder unused = this.f3689c.setStableInsets(dVar.mo3296e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3513e(C0829d dVar) {
            WindowInsets.Builder unused = this.f3689c.setSystemGestureInsets(dVar.mo3296e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3511f(C0829d dVar) {
            WindowInsets.Builder unused = this.f3689c.setSystemWindowInsets(dVar.mo3296e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3514g(C0829d dVar) {
            WindowInsets.Builder unused = this.f3689c.setTappableElementInsets(dVar.mo3296e());
        }

        C1039d(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets.Builder builder;
            WindowInsets v = windowInsetsCompat.mo3505v();
            if (v != null) {
                C1265w3.m4404a();
                builder = C1258v3.m4379a(v);
            } else {
                C1265w3.m4404a();
                builder = C1251u3.m4364a();
            }
            this.f3689c = builder;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$h */
    private static class C1043h extends C1042g {

        /* renamed from: m */
        private C0829d f3702m = null;

        C1043h(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public WindowInsetsCompat mo3528b() {
            return WindowInsetsCompat.m3812w(this.f3697c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public WindowInsetsCompat mo3529c() {
            return WindowInsetsCompat.m3812w(this.f3697c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public final C0829d mo3530j() {
            if (this.f3702m == null) {
                this.f3702m = C0829d.m3106b(this.f3697c.getStableInsetLeft(), this.f3697c.getStableInsetTop(), this.f3697c.getStableInsetRight(), this.f3697c.getStableInsetBottom());
            }
            return this.f3702m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo3531o() {
            return this.f3697c.isConsumed();
        }

        /* renamed from: t */
        public void mo3532t(C0829d dVar) {
            this.f3702m = dVar;
        }

        C1043h(WindowInsetsCompat windowInsetsCompat, C1043h hVar) {
            super(windowInsetsCompat, (C1042g) hVar);
            this.f3702m = hVar.f3702m;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$g */
    private static class C1042g extends C1047l {

        /* renamed from: h */
        private static boolean f3692h = false;

        /* renamed from: i */
        private static Method f3693i;

        /* renamed from: j */
        private static Class f3694j;

        /* renamed from: k */
        private static Field f3695k;

        /* renamed from: l */
        private static Field f3696l;

        /* renamed from: c */
        final WindowInsets f3697c;

        /* renamed from: d */
        private C0829d[] f3698d;

        /* renamed from: e */
        private C0829d f3699e;

        /* renamed from: f */
        private WindowInsetsCompat f3700f;

        /* renamed from: g */
        C0829d f3701g;

        C1042g(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f3699e = null;
            this.f3697c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: u */
        private C0829d m3856u(int i, boolean z) {
            C0829d dVar = C0829d.f3464e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    dVar = C0829d.m3105a(dVar, mo3527v(i2, z));
                }
            }
            return dVar;
        }

        /* renamed from: w */
        private C0829d m3857w() {
            WindowInsetsCompat windowInsetsCompat = this.f3700f;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.mo3491h();
            }
            return C0829d.f3464e;
        }

        /* renamed from: x */
        private C0829d m3858x(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3692h) {
                    m3859y();
                }
                Method method = f3693i;
                if (!(method == null || f3694j == null || f3695k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f3695k.get(f3696l.get(invoke));
                        if (rect != null) {
                            return C0829d.m3107c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: y */
        private static void m3859y() {
            try {
                f3693i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3694j = cls;
                f3695k = cls.getDeclaredField("mVisibleInsets");
                f3696l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3695k.setAccessible(true);
                f3696l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f3692h = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3516d(View view) {
            C0829d x = m3858x(view);
            if (x == null) {
                x = C0829d.f3464e;
            }
            mo3525r(x);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3517e(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.mo3503t(this.f3700f);
            windowInsetsCompat.mo3502s(this.f3701g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f3701g, ((C1042g) obj).f3701g);
        }

        /* renamed from: g */
        public C0829d mo3519g(int i) {
            return m3856u(i, false);
        }

        /* renamed from: h */
        public C0829d mo3520h(int i) {
            return m3856u(i, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public final C0829d mo3521l() {
            if (this.f3699e == null) {
                this.f3699e = C0829d.m3106b(this.f3697c.getSystemWindowInsetLeft(), this.f3697c.getSystemWindowInsetTop(), this.f3697c.getSystemWindowInsetRight(), this.f3697c.getSystemWindowInsetBottom());
            }
            return this.f3699e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public WindowInsetsCompat mo3522n(int i, int i2, int i3, int i4) {
            C1037b bVar = new C1037b(WindowInsetsCompat.m3812w(this.f3697c));
            bVar.mo3508c(WindowInsetsCompat.m3811o(mo3521l(), i, i2, i3, i4));
            bVar.mo3507b(WindowInsetsCompat.m3811o(mo3530j(), i, i2, i3, i4));
            return bVar.mo3506a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo3523p() {
            return this.f3697c.isRound();
        }

        /* renamed from: q */
        public void mo3524q(C0829d[] dVarArr) {
            this.f3698d = dVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo3525r(C0829d dVar) {
            this.f3701g = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo3526s(WindowInsetsCompat windowInsetsCompat) {
            this.f3700f = windowInsetsCompat;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public C0829d mo3527v(int i, boolean z) {
            int i2;
            C1253v vVar;
            if (i != 1) {
                C0829d dVar = null;
                if (i != 2) {
                    if (i == 8) {
                        C0829d[] dVarArr = this.f3698d;
                        if (dVarArr != null) {
                            dVar = dVarArr[C1048m.m3908c(8)];
                        }
                        if (dVar != null) {
                            return dVar;
                        }
                        C0829d l = mo3521l();
                        C0829d w = m3857w();
                        int i3 = l.f3468d;
                        if (i3 > w.f3468d) {
                            return C0829d.m3106b(0, 0, 0, i3);
                        }
                        C0829d dVar2 = this.f3701g;
                        if (dVar2 == null || dVar2.equals(C0829d.f3464e) || (i2 = this.f3701g.f3468d) <= w.f3468d) {
                            return C0829d.f3464e;
                        }
                        return C0829d.m3106b(0, 0, 0, i2);
                    } else if (i == 16) {
                        return mo3537k();
                    } else {
                        if (i == 32) {
                            return mo3536i();
                        }
                        if (i == 64) {
                            return mo3538m();
                        }
                        if (i != 128) {
                            return C0829d.f3464e;
                        }
                        WindowInsetsCompat windowInsetsCompat = this.f3700f;
                        if (windowInsetsCompat != null) {
                            vVar = windowInsetsCompat.mo3487e();
                        } else {
                            vVar = mo3534f();
                        }
                        if (vVar != null) {
                            return C0829d.m3106b(vVar.mo3725b(), vVar.mo3727d(), vVar.mo3726c(), vVar.mo3724a());
                        }
                        return C0829d.f3464e;
                    }
                } else if (z) {
                    C0829d w2 = m3857w();
                    C0829d j = mo3530j();
                    return C0829d.m3106b(Math.max(w2.f3465a, j.f3465a), 0, Math.max(w2.f3467c, j.f3467c), Math.max(w2.f3468d, j.f3468d));
                } else {
                    C0829d l2 = mo3521l();
                    WindowInsetsCompat windowInsetsCompat2 = this.f3700f;
                    if (windowInsetsCompat2 != null) {
                        dVar = windowInsetsCompat2.mo3491h();
                    }
                    int i4 = l2.f3468d;
                    if (dVar != null) {
                        i4 = Math.min(i4, dVar.f3468d);
                    }
                    return C0829d.m3106b(l2.f3465a, 0, l2.f3467c, i4);
                }
            } else if (z) {
                return C0829d.m3106b(0, Math.max(m3857w().f3466b, mo3521l().f3466b), 0, 0);
            } else {
                return C0829d.m3106b(0, mo3521l().f3466b, 0, 0);
            }
        }

        C1042g(WindowInsetsCompat windowInsetsCompat, C1042g gVar) {
            this(windowInsetsCompat, new WindowInsets(gVar.f3697c));
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$j */
    private static class C1045j extends C1044i {

        /* renamed from: n */
        private C0829d f3703n = null;

        /* renamed from: o */
        private C0829d f3704o = null;

        /* renamed from: p */
        private C0829d f3705p = null;

        C1045j(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C0829d mo3536i() {
            if (this.f3704o == null) {
                this.f3704o = C0829d.m3108d(this.f3697c.getMandatorySystemGestureInsets());
            }
            return this.f3704o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C0829d mo3537k() {
            if (this.f3703n == null) {
                this.f3703n = C0829d.m3108d(this.f3697c.getSystemGestureInsets());
            }
            return this.f3703n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0829d mo3538m() {
            if (this.f3705p == null) {
                this.f3705p = C0829d.m3108d(this.f3697c.getTappableElementInsets());
            }
            return this.f3705p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public WindowInsetsCompat mo3522n(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.m3812w(this.f3697c.inset(i, i2, i3, i4));
        }

        /* renamed from: t */
        public void mo3532t(C0829d dVar) {
        }

        C1045j(WindowInsetsCompat windowInsetsCompat, C1045j jVar) {
            super(windowInsetsCompat, (C1044i) jVar);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$b */
    public static final class C1037b {

        /* renamed from: a */
        private final C1041f f3682a;

        public C1037b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f3682a = new C1040e();
            } else if (i >= 29) {
                this.f3682a = new C1039d();
            } else {
                this.f3682a = new C1038c();
            }
        }

        /* renamed from: a */
        public WindowInsetsCompat mo3506a() {
            return this.f3682a.mo3509b();
        }

        /* renamed from: b */
        public C1037b mo3507b(C0829d dVar) {
            this.f3682a.mo3510d(dVar);
            return this;
        }

        /* renamed from: c */
        public C1037b mo3508c(C0829d dVar) {
            this.f3682a.mo3511f(dVar);
            return this;
        }

        public C1037b(WindowInsetsCompat windowInsetsCompat) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f3682a = new C1040e(windowInsetsCompat);
            } else if (i >= 29) {
                this.f3682a = new C1039d(windowInsetsCompat);
            } else {
                this.f3682a = new C1038c(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            C1047l lVar = windowInsetsCompat.f3677a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (lVar instanceof C1046k)) {
                this.f3677a = new C1046k(this, (C1046k) lVar);
            } else if (i >= 29 && (lVar instanceof C1045j)) {
                this.f3677a = new C1045j(this, (C1045j) lVar);
            } else if (i >= 28 && (lVar instanceof C1044i)) {
                this.f3677a = new C1044i(this, (C1044i) lVar);
            } else if (lVar instanceof C1043h) {
                this.f3677a = new C1043h(this, (C1043h) lVar);
            } else if (lVar instanceof C1042g) {
                this.f3677a = new C1042g(this, (C1042g) lVar);
            } else {
                this.f3677a = new C1047l(this);
            }
            lVar.mo3517e(this);
            return;
        }
        this.f3677a = new C1047l(this);
    }
}
