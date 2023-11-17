package p008a7;

import android.os.Parcel;

/* renamed from: a7.c */
public abstract class C0064c {

    /* renamed from: a */
    private static final ClassLoader f115a = C0064c.class.getClassLoader();

    /* renamed from: a */
    public static void m205a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    /* renamed from: b */
    public static boolean m206b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
