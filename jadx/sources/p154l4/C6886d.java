package p154l4;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import p334z4.C9207a;

/* renamed from: l4.d */
public abstract class C6886d {
    /* renamed from: a */
    private static boolean m26727a(TextView textView) {
        Class<C6886d> cls = C6886d.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            String replaceAll = C6888f.m26747k(textView).replaceAll("\\s", "");
            int length = replaceAll.length();
            if (length < 12) {
                return false;
            }
            if (length > 19) {
                return false;
            }
            int i = length - 1;
            int i2 = 0;
            boolean z = false;
            while (i >= 0) {
                char charAt = replaceAll.charAt(i);
                if (charAt >= '0') {
                    if (charAt <= '9') {
                        int i3 = charAt - '0';
                        if (z && (i3 = i3 * 2) > 9) {
                            i3 = (i3 % 10) + 1;
                        }
                        i2 += i3;
                        z = !z;
                        i--;
                    }
                }
                return false;
            }
            if (i2 % 10 == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m26728b(TextView textView) {
        Class<C6886d> cls = C6886d.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String k = C6888f.m26747k(textView);
            if (k != null) {
                if (k.length() != 0) {
                    return Patterns.EMAIL_ADDRESS.matcher(k).matches();
                }
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m26729c(TextView textView) {
        Class<C6886d> cls = C6886d.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m26730d(TextView textView) {
        Class<C6886d> cls = C6886d.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (textView.getInputType() == 96) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m26731e(TextView textView) {
        Class<C6886d> cls = C6886d.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (textView.getInputType() == 3) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m26732f(TextView textView) {
        Class<C6886d> cls = C6886d.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (textView.getInputType() == 112) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m26733g(View view) {
        Class<C6886d> cls = C6886d.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView = (TextView) view;
            if (m26729c(textView) || m26727a(textView) || m26730d(textView) || m26732f(textView) || m26731e(textView) || m26728b(textView)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }
}
