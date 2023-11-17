package p080f8;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.core.graphics.C0825b;
import p184n8.C7342b;

/* renamed from: f8.a */
public abstract class C6170a {
    /* renamed from: a */
    public static int m24580a(int i, int i2) {
        return C0825b.m3101j(i, (Color.alpha(i) * i2) / C11051p3.f31759c);
    }

    /* renamed from: b */
    public static int m24581b(Context context, int i, int i2) {
        TypedValue a = C7342b.m27997a(context, i);
        if (a != null) {
            return m24589j(context, a);
        }
        return i2;
    }

    /* renamed from: c */
    public static int m24582c(Context context, int i, String str) {
        return m24589j(context, C7342b.m28001e(context, i, str));
    }

    /* renamed from: d */
    public static int m24583d(View view, int i) {
        return m24589j(view.getContext(), C7342b.m28002f(view, i));
    }

    /* renamed from: e */
    public static int m24584e(View view, int i, int i2) {
        return m24581b(view.getContext(), i, i2);
    }

    /* renamed from: f */
    public static boolean m24585f(int i) {
        return i != 0 && C0825b.m3094c(i) > 0.5d;
    }

    /* renamed from: g */
    public static int m24586g(int i, int i2) {
        return C0825b.m3097f(i2, i);
    }

    /* renamed from: h */
    public static int m24587h(int i, int i2, float f) {
        return m24586g(i, C0825b.m3101j(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: i */
    public static int m24588i(View view, int i, int i2, float f) {
        return m24587h(m24583d(view, i), m24583d(view, i2), f);
    }

    /* renamed from: j */
    private static int m24589j(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        if (i != 0) {
            return C0767a.m2893c(context, i);
        }
        return typedValue.data;
    }
}
