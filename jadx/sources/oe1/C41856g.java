package oe1;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C41536l;

/* renamed from: oe1.g */
public abstract class C41856g {
    /* renamed from: a */
    private static final void m121269a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final C41855f m121270b(C41850a aVar) {
        return (C41855f) aVar.getClass().getAnnotation(C41855f.class);
    }

    /* renamed from: c */
    private static final int m121271c(C41850a aVar) {
        Integer num;
        int i;
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m121272d(C41850a aVar) {
        int i;
        String str;
        C41536l.m120489i(aVar, "<this>");
        C41855f b = m121270b(aVar);
        if (b == null) {
            return null;
        }
        m121269a(1, b.mo96653v());
        int c = m121271c(aVar);
        if (c < 0) {
            i = -1;
        } else {
            i = b.mo96651l()[c];
        }
        String b2 = C41858i.f98233a.mo96654b(aVar);
        if (b2 == null) {
            str = b.mo96649c();
        } else {
            str = b2 + '/' + b.mo96649c();
        }
        return new StackTraceElement(str, b.mo96652m(), b.mo96650f(), i);
    }
}
