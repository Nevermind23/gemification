package p195o6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: o6.a */
public abstract class C7461a {
    /* renamed from: A */
    public static void m28362A(Parcel parcel, int i, SparseArray sparseArray, boolean z) {
        if (sparseArray != null) {
            int D = m28365D(parcel, i);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeString((String) sparseArray.valueAt(i2));
            }
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: B */
    public static void m28363B(Parcel parcel, int i, Parcelable[] parcelableArr, int i2, boolean z) {
        if (parcelableArr != null) {
            int D = m28365D(parcel, i);
            parcel.writeInt(r7);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m28368G(parcel, parcelable, i2);
                }
            }
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: C */
    public static void m28364C(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int D = m28365D(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m28368G(parcel, parcelable, 0);
                }
            }
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: D */
    private static int m28365D(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: E */
    private static void m28366E(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: F */
    private static void m28367F(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: G */
    private static void m28368G(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m28369a(Parcel parcel) {
        return m28365D(parcel, 20293);
    }

    /* renamed from: b */
    public static void m28370b(Parcel parcel, int i) {
        m28366E(parcel, i);
    }

    /* renamed from: c */
    public static void m28371c(Parcel parcel, int i, BigDecimal bigDecimal, boolean z) {
        if (bigDecimal != null) {
            int D = m28365D(parcel, i);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: d */
    public static void m28372d(Parcel parcel, int i, boolean z) {
        m28367F(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: e */
    public static void m28373e(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m28367F(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m28374f(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int D = m28365D(parcel, i);
            parcel.writeBundle(bundle);
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: g */
    public static void m28375g(Parcel parcel, int i, byte b) {
        m28367F(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: h */
    public static void m28376h(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int D = m28365D(parcel, i);
            parcel.writeByteArray(bArr);
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: i */
    public static void m28377i(Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr != null) {
            int D = m28365D(parcel, i);
            parcel.writeInt(r5);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m28378j(Parcel parcel, int i, double d) {
        m28367F(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: k */
    public static void m28379k(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m28367F(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: l */
    public static void m28380l(Parcel parcel, int i, float f) {
        m28367F(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: m */
    public static void m28381m(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m28367F(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m28382n(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int D = m28365D(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static void m28383o(Parcel parcel, int i, int i2) {
        m28367F(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: p */
    public static void m28384p(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int D = m28365D(parcel, i);
            parcel.writeIntArray(iArr);
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m28385q(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m28367F(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static void m28386r(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int D = m28365D(parcel, i);
            parcel.writeList(list);
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: s */
    public static void m28387s(Parcel parcel, int i, long j) {
        m28367F(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: t */
    public static void m28388t(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m28367F(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static void m28389u(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int D = m28365D(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: v */
    public static void m28390v(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int D = m28365D(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: w */
    public static void m28391w(Parcel parcel, int i, short s) {
        m28367F(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: x */
    public static void m28392x(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int D = m28365D(parcel, i);
            parcel.writeString(str);
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: y */
    public static void m28393y(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int D = m28365D(parcel, i);
            parcel.writeStringArray(strArr);
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }

    /* renamed from: z */
    public static void m28394z(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int D = m28365D(parcel, i);
            parcel.writeStringList(list);
            m28366E(parcel, D);
        } else if (z) {
            m28367F(parcel, i, 0);
        }
    }
}
