package p249s8;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.C0267d;
import p009a8.C0072b;

/* renamed from: s8.a */
public abstract class C8273a {

    /* renamed from: a */
    private static final int[] f23471a = {16842752, C0072b.f142a0};

    /* renamed from: b */
    private static final int[] f23472b = {C0072b.f129I};

    /* renamed from: a */
    private static int m31118a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23471a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return resourceId;
        }
        return resourceId2;
    }

    /* renamed from: b */
    private static int m31119b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23472b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m31120c(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        int b = m31119b(context, attributeSet, i, i2);
        if (!(context instanceof C0267d) || ((C0267d) context).mo745c() != b) {
            z = false;
        } else {
            z = true;
        }
        if (b == 0 || z) {
            return context;
        }
        C0267d dVar = new C0267d(context, b);
        int a = m31118a(context, attributeSet);
        if (a != 0) {
            dVar.getTheme().applyStyle(a, true);
        }
        return dVar;
    }
}
