package com.facetec.sdk;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Timer;

/* renamed from: com.facetec.sdk.bx */
final class C2864bx {

    /* renamed from: a */
    private static Timer f9388a = null;

    /* renamed from: b */
    private static final HashMap<Integer, Object> f9389b = new HashMap<>();

    C2864bx() {
    }

    /* renamed from: d */
    private static synchronized int m11697d(Object obj) {
        int hashCode;
        synchronized (C2864bx.class) {
            hashCode = obj.hashCode();
            if (f9388a == null) {
                f9388a = new Timer();
            }
            f9388a.schedule(new C2936da(new C3412m9(hashCode)), 300000);
            f9389b.put(Integer.valueOf(hashCode), obj);
        }
        return hashCode;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static synchronized Object m11698e(int i) {
        Object remove;
        synchronized (C2864bx.class) {
            HashMap<Integer, Object> hashMap = f9389b;
            remove = hashMap.remove(Integer.valueOf(i));
            if (f9388a != null && hashMap.isEmpty()) {
                f9388a.cancel();
                f9388a = null;
            }
        }
        return remove;
    }

    /* renamed from: a */
    static <T> void m11695a(T t, Parcel parcel) {
        if (t != null) {
            parcel.writeInt(m11697d(t));
        } else {
            parcel.writeInt(0);
        }
    }

    /* renamed from: a */
    static <T> T m11693a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != 0) {
            return m11698e(readInt);
        }
        return null;
    }
}
