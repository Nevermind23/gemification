package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.C0799e;
import androidx.core.provider.C0953g;
import java.io.File;
import java.io.InputStream;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.core.graphics.p0 */
abstract class C0880p0 {

    /* renamed from: a */
    private ConcurrentHashMap f3517a = new ConcurrentHashMap();

    /* renamed from: androidx.core.graphics.p0$a */
    class C0881a implements C0882b {
        C0881a() {
        }

        /* renamed from: c */
        public int mo3345b(C0953g.C0955b bVar) {
            return bVar.mo3405e();
        }

        /* renamed from: d */
        public boolean mo3344a(C0953g.C0955b bVar) {
            return bVar.mo3406f();
        }
    }

    /* renamed from: androidx.core.graphics.p0$b */
    private interface C0882b {
        /* renamed from: a */
        boolean mo3344a(Object obj);

        /* renamed from: b */
        int mo3345b(Object obj);
    }

    C0880p0() {
    }

    /* renamed from: e */
    private static Object m3270e(Object[] objArr, int i, C0882b bVar) {
        return m3271f(objArr, (i & 1) == 0 ? TextTypeView.SEPARATOR_FULL : 700, (i & 2) != 0, bVar);
    }

    /* renamed from: f */
    private static Object m3271f(Object[] objArr, int i, boolean z, C0882b bVar) {
        int i2;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(bVar.mo3345b(obj2) - i) * 2;
            if (bVar.mo3344a(obj2) == z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i4 = abs + i2;
            if (obj == null || i3 > i4) {
                obj = obj2;
                i3 = i4;
            }
        }
        return obj;
    }

    /* renamed from: a */
    public abstract Typeface mo3331a(Context context, C0799e.C0802c cVar, Resources resources, int i);

    /* renamed from: b */
    public abstract Typeface mo3332b(Context context, CancellationSignal cancellationSignal, C0953g.C0955b[] bVarArr, int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Typeface mo3343c(Context context, InputStream inputStream) {
        File e = C0884q0.m3289e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C0884q0.m3288d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo3333d(Context context, Resources resources, int i, String str, int i2) {
        File e = C0884q0.m3289e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C0884q0.m3287c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0953g.C0955b mo3334g(C0953g.C0955b[] bVarArr, int i) {
        return (C0953g.C0955b) m3270e(bVarArr, i, new C0881a());
    }
}
