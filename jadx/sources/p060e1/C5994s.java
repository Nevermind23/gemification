package p060e1;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e1.s */
class C5994s implements C5988q {

    /* renamed from: e */
    private static Class f18728e;

    /* renamed from: f */
    private static boolean f18729f;

    /* renamed from: g */
    private static Method f18730g;

    /* renamed from: h */
    private static boolean f18731h;

    /* renamed from: i */
    private static Method f18732i;

    /* renamed from: j */
    private static boolean f18733j;

    /* renamed from: d */
    private final View f18734d;

    private C5994s(View view) {
        this.f18734d = view;
    }

    /* renamed from: b */
    static C5988q m24072b(View view, ViewGroup viewGroup, Matrix matrix) {
        m24073c();
        Method method = f18730g;
        if (method != null) {
            try {
                return new C5994s((View) method.invoke((Object) null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    private static void m24073c() {
        if (!f18731h) {
            try {
                m24074d();
                Method declaredMethod = f18728e.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                f18730g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
            }
            f18731h = true;
        }
    }

    /* renamed from: d */
    private static void m24074d() {
        if (!f18729f) {
            try {
                f18728e = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
            }
            f18729f = true;
        }
    }

    /* renamed from: e */
    private static void m24075e() {
        if (!f18733j) {
            try {
                m24074d();
                Method declaredMethod = f18728e.getDeclaredMethod("removeGhost", new Class[]{View.class});
                f18732i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
            }
            f18733j = true;
        }
    }

    /* renamed from: f */
    static void m24076f(View view) {
        m24075e();
        Method method = f18732i;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    public void mo19429a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i) {
        this.f18734d.setVisibility(i);
    }
}
