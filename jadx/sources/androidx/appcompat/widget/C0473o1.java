package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.o1 */
public class C0473o1 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f2190c = new Object();

    /* renamed from: d */
    private static ArrayList f2191d;

    /* renamed from: a */
    private final Resources f2192a;

    /* renamed from: b */
    private final Resources.Theme f2193b;

    private C0473o1(Context context) {
        super(context);
        if (C0413c2.m1673d()) {
            C0413c2 c2Var = new C0413c2(this, context.getResources());
            this.f2192a = c2Var;
            Resources.Theme newTheme = c2Var.newTheme();
            this.f2193b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f2192a = new C0480q1(this, context.getResources());
        this.f2193b = null;
    }

    /* renamed from: a */
    private static boolean m1930a(Context context) {
        if ((context instanceof C0473o1) || (context.getResources() instanceof C0480q1) || (context.getResources() instanceof C0413c2) || !C0413c2.m1673d()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Context m1931b(Context context) {
        C0473o1 o1Var;
        if (!m1930a(context)) {
            return context;
        }
        synchronized (f2190c) {
            ArrayList arrayList = f2191d;
            if (arrayList == null) {
                f2191d = new ArrayList();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f2191d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2191d.remove(size);
                    }
                }
                for (int size2 = f2191d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f2191d.get(size2);
                    if (weakReference2 != null) {
                        o1Var = (C0473o1) weakReference2.get();
                    } else {
                        o1Var = null;
                    }
                    if (o1Var != null && o1Var.getBaseContext() == context) {
                        return o1Var;
                    }
                }
            }
            C0473o1 o1Var2 = new C0473o1(context);
            f2191d.add(new WeakReference(o1Var2));
            return o1Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f2192a.getAssets();
    }

    public Resources getResources() {
        return this.f2192a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2193b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f2193b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
