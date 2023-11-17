package p184n8;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: n8.b */
public abstract class C7342b {
    /* renamed from: a */
    public static TypedValue m27997a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m27998b(Context context, int i, boolean z) {
        TypedValue a = m27997a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        if (a.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m27999c(Context context, int i, int i2) {
        TypedValue a = m27997a(context, i);
        if (a == null || a.type != 16) {
            return i2;
        }
        return a.data;
    }

    /* renamed from: d */
    public static int m28000d(Context context, int i, String str) {
        return m28001e(context, i, str).data;
    }

    /* renamed from: e */
    public static TypedValue m28001e(Context context, int i, String str) {
        TypedValue a = m27997a(context, i);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: f */
    public static TypedValue m28002f(View view, int i) {
        return m28001e(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
