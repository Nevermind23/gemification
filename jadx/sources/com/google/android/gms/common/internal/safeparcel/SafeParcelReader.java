package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public abstract class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: A */
    public static double m15112A(Parcel parcel, int i) {
        m15128Q(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: B */
    public static Double m15113B(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        if (M == 0) {
            return null;
        }
        m15127P(parcel, i, M, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: C */
    public static float m15114C(Parcel parcel, int i) {
        m15128Q(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: D */
    public static Float m15115D(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        if (M == 0) {
            return null;
        }
        m15127P(parcel, i, M, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: E */
    public static int m15116E(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: F */
    public static IBinder m15117F(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + M);
        return readStrongBinder;
    }

    /* renamed from: G */
    public static int m15118G(Parcel parcel, int i) {
        m15128Q(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: H */
    public static Integer m15119H(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        if (M == 0) {
            return null;
        }
        m15127P(parcel, i, M, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: I */
    public static void m15120I(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + M);
        }
    }

    /* renamed from: J */
    public static long m15121J(Parcel parcel, int i) {
        m15128Q(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: K */
    public static Long m15122K(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        if (M == 0) {
            return null;
        }
        m15127P(parcel, i, M, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: L */
    public static short m15123L(Parcel parcel, int i) {
        m15128Q(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: M */
    public static int m15124M(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: N */
    public static void m15125N(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m15124M(parcel, i));
    }

    /* renamed from: O */
    public static int m15126O(Parcel parcel) {
        int E = m15116E(parcel);
        int M = m15124M(parcel, E);
        int w = m15151w(E);
        int dataPosition = parcel.dataPosition();
        if (w == 20293) {
            int i = M + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(E))), parcel);
    }

    /* renamed from: P */
    private static void m15127P(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            throw new ParseException("Expected size " + i3 + " got " + i2 + " (0x" + hexString + ")", parcel);
        }
    }

    /* renamed from: Q */
    private static void m15128Q(Parcel parcel, int i, int i2) {
        int M = m15124M(parcel, i);
        if (M != i2) {
            String hexString = Integer.toHexString(M);
            throw new ParseException("Expected size " + i2 + " got " + M + " (0x" + hexString + ")", parcel);
        }
    }

    /* renamed from: a */
    public static BigDecimal m15129a(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + M);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: b */
    public static BigDecimal[] m15130b(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + M);
        return bigDecimalArr;
    }

    /* renamed from: c */
    public static BigInteger m15131c(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + M);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m15132d(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + M);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m15133e(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + M);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m15134f(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + M);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m15135g(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + M);
        return createByteArray;
    }

    /* renamed from: h */
    public static byte[][] m15136h(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + M);
        return bArr;
    }

    /* renamed from: i */
    public static double[] m15137i(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + M);
        return createDoubleArray;
    }

    /* renamed from: j */
    public static float[] m15138j(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + M);
        return createFloatArray;
    }

    /* renamed from: k */
    public static int[] m15139k(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + M);
        return createIntArray;
    }

    /* renamed from: l */
    public static long[] m15140l(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + M);
        return createLongArray;
    }

    /* renamed from: m */
    public static Parcel m15141m(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, M);
        parcel.setDataPosition(dataPosition + M);
        return obtain;
    }

    /* renamed from: n */
    public static Parcel[] m15142n(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + M);
        return parcelArr;
    }

    /* renamed from: o */
    public static Parcelable m15143o(Parcel parcel, int i, Parcelable.Creator creator) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + M);
        return parcelable;
    }

    /* renamed from: p */
    public static String m15144p(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + M);
        return readString;
    }

    /* renamed from: q */
    public static String[] m15145q(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + M);
        return createStringArray;
    }

    /* renamed from: r */
    public static ArrayList m15146r(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + M);
        return createStringArrayList;
    }

    /* renamed from: s */
    public static SparseArray m15147s(Parcel parcel, int i) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        SparseArray sparseArray = new SparseArray();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(dataPosition + M);
        return sparseArray;
    }

    /* renamed from: t */
    public static Object[] m15148t(Parcel parcel, int i, Parcelable.Creator creator) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + M);
        return createTypedArray;
    }

    /* renamed from: u */
    public static ArrayList m15149u(Parcel parcel, int i, Parcelable.Creator creator) {
        int M = m15124M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + M);
        return createTypedArrayList;
    }

    /* renamed from: v */
    public static void m15150v(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ParseException("Overread allowed size end=" + i, parcel);
        }
    }

    /* renamed from: w */
    public static int m15151w(int i) {
        return (char) i;
    }

    /* renamed from: x */
    public static boolean m15152x(Parcel parcel, int i) {
        m15128Q(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static Boolean m15153y(Parcel parcel, int i) {
        boolean z;
        int M = m15124M(parcel, i);
        if (M == 0) {
            return null;
        }
        m15127P(parcel, i, M, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: z */
    public static byte m15154z(Parcel parcel, int i) {
        m15128Q(parcel, i, 4);
        return (byte) parcel.readInt();
    }
}
