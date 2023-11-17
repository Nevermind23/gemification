package p267u0;

import android.content.Context;
import kotlin.jvm.internal.C41536l;
import p267u0.C8503w;

/* renamed from: u0.v */
public final class C8502v {

    /* renamed from: a */
    public static final C8502v f24153a = new C8502v();

    private C8502v() {
    }

    /* renamed from: a */
    public static final C8503w.C8504a m31831a(Context context, Class cls, String str) {
        boolean z;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cls, "klass");
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (true ^ z) {
            return new C8503w.C8504a(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    /* renamed from: b */
    public static final Object m31832b(Class cls, String str) {
        boolean z;
        String str2;
        C41536l.m120489i(cls, "klass");
        C41536l.m120489i(str, "suffix");
        Package packageR = cls.getPackage();
        C41536l.m120486f(packageR);
        String name = packageR.getName();
        String canonicalName = cls.getCanonicalName();
        C41536l.m120486f(canonicalName);
        C41536l.m120488h(name, "fullPackage");
        boolean z2 = false;
        if (name.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            canonicalName = canonicalName.substring(name.length() + 1);
            C41536l.m120488h(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = canonicalName;
        String str4 = C40439w.m117102A(str3, '.', '_', false, 4, (Object) null) + str;
        try {
            if (name.length() == 0) {
                z2 = true;
            }
            if (z2) {
                str2 = str4;
            } else {
                str2 = name + '.' + str4;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            C41536l.m120487g(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    /* renamed from: c */
    public static final C8503w.C8504a m31833c(Context context, Class cls) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cls, "klass");
        return new C8503w.C8504a(context, cls, (String) null);
    }
}
