package p072f0;

import android.text.Editable;
import androidx.emoji2.text.C1405n;

/* renamed from: f0.b */
final class C6135b extends Editable.Factory {

    /* renamed from: a */
    private static final Object f19090a = new Object();

    /* renamed from: b */
    private static volatile Editable.Factory f19091b;

    /* renamed from: c */
    private static Class f19092c;

    private C6135b() {
        try {
            f19092c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C6135b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f19091b == null) {
            synchronized (f19090a) {
                if (f19091b == null) {
                    f19091b = new C6135b();
                }
            }
        }
        return f19091b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class cls = f19092c;
        if (cls != null) {
            return C1405n.m4832c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
