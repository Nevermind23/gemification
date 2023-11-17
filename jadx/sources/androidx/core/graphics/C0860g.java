package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.LruCache;
import androidx.core.content.res.C0799e;
import androidx.core.content.res.C0808h;
import androidx.core.provider.C0953g;

/* renamed from: androidx.core.graphics.g */
public abstract class C0860g {

    /* renamed from: a */
    private static final C0880p0 f3498a;

    /* renamed from: b */
    private static final LruCache f3499b = new LruCache(16);

    /* renamed from: androidx.core.graphics.g$a */
    public static class C0861a extends C0953g.C0956c {

        /* renamed from: a */
        private C0808h.C0813e f3500a;

        public C0861a(C0808h.C0813e eVar) {
            this.f3500a = eVar;
        }

        /* renamed from: a */
        public void mo3329a(int i) {
            C0808h.C0813e eVar = this.f3500a;
            if (eVar != null) {
                eVar.m3048f(i);
            }
        }

        /* renamed from: b */
        public void mo3330b(Typeface typeface) {
            C0808h.C0813e eVar = this.f3500a;
            if (eVar != null) {
                eVar.m3049g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f3498a = new C0878o0();
        } else if (i >= 28) {
            f3498a = new C0883q();
        } else if (i >= 26) {
            f3498a = new C0879p();
        } else if (i < 24 || !C0865i.m3231j()) {
            f3498a = new C0863h();
        } else {
            f3498a = new C0865i();
        }
    }

    /* renamed from: a */
    public static Typeface m3211a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m3212b(Context context, CancellationSignal cancellationSignal, C0953g.C0955b[] bVarArr, int i) {
        return f3498a.mo3332b(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m3213c(Context context, C0799e.C0801b bVar, Resources resources, int i, String str, int i2, int i3, C0808h.C0813e eVar, Handler handler, boolean z) {
        Typeface typeface;
        boolean z2;
        int i4;
        C0799e.C0801b bVar2 = bVar;
        C0808h.C0813e eVar2 = eVar;
        Handler handler2 = handler;
        if (bVar2 instanceof C0799e.C0804e) {
            C0799e.C0804e eVar3 = (C0799e.C0804e) bVar2;
            Typeface g = m3217g(eVar3.mo3278c());
            if (g != null) {
                if (eVar2 != null) {
                    eVar2.mo3283d(g, handler2);
                }
                return g;
            }
            if (!z ? eVar2 != null : eVar3.mo3276a() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                i4 = eVar3.mo3279d();
            } else {
                i4 = -1;
            }
            Context context2 = context;
            typeface = C0953g.m3420c(context2, eVar3.mo3277b(), i3, z2, i4, C0808h.C0813e.m3047e(handler), new C0861a(eVar2));
            Resources resources2 = resources;
            int i5 = i3;
        } else {
            Context context3 = context;
            Resources resources3 = resources;
            typeface = f3498a.mo3331a(context, (C0799e.C0802c) bVar2, resources, i3);
            if (eVar2 != null) {
                if (typeface != null) {
                    eVar2.mo3283d(typeface, handler2);
                } else {
                    eVar2.mo3282c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f3499b.put(m3215e(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m3214d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface d = f3498a.mo3333d(context, resources, i, str, i3);
        if (d != null) {
            f3499b.put(m3215e(resources, i, str, i2, i3), d);
        }
        return d;
    }

    /* renamed from: e */
    private static String m3215e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* renamed from: f */
    public static Typeface m3216f(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) f3499b.get(m3215e(resources, i, str, i2, i3));
    }

    /* renamed from: g */
    private static Typeface m3217g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
