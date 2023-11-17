package p145k8;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.core.graphics.C0856f;
import androidx.core.view.animation.C1109a;
import com.github.mikephil.charting.utils.Utils;
import p184n8.C7342b;

/* renamed from: k8.a */
public abstract class C6835a {
    /* renamed from: a */
    private static float m26560a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= Utils.FLOAT_EPSILON && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    private static String m26561b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    private static TimeInterpolator m26562c(String str) {
        if (m26564e(str, "cubic-bezier")) {
            String[] split = m26561b(str, "cubic-bezier").split(",");
            if (split.length == 4) {
                return C1109a.m4119a(m26560a(split, 0), m26560a(split, 1), m26560a(split, 2), m26560a(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        } else if (m26564e(str, "path")) {
            return C1109a.m4120b(C0856f.m3199e(m26561b(str, "path")));
        } else {
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
    }

    /* renamed from: d */
    private static boolean m26563d(String str) {
        if (m26564e(str, "cubic-bezier") || m26564e(str, "path")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m26564e(String str, String str2) {
        if (!str.startsWith(str2 + "(") || !str.endsWith(")")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static int m26565f(Context context, int i, int i2) {
        return C7342b.m27999c(context, i, i2);
    }

    /* renamed from: g */
    public static TimeInterpolator m26566g(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (m26563d(valueOf)) {
                return m26562c(valueOf);
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }
}
