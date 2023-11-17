package kg1;

import java.lang.reflect.InvocationTargetException;
import org.greenrobot.eventbus.android.AndroidComponentsImpl;

/* renamed from: kg1.b */
public abstract class C41513b {
    /* renamed from: a */
    public static boolean m120417a() {
        try {
            int i = AndroidComponentsImpl.f98746d;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static C41512a m120418b() {
        Class<AndroidComponentsImpl> cls = AndroidComponentsImpl.class;
        try {
            int i = AndroidComponentsImpl.f98746d;
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m120419c() {
        try {
            if (Class.forName("android.os.Looper").getDeclaredMethod("getMainLooper", new Class[0]).invoke((Object) null, new Object[0]) != null) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
