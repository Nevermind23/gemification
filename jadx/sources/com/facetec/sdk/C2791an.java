package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.EncryptStrings;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

@EncryptStrings
/* renamed from: com.facetec.sdk.an */
abstract class C2791an {
    public static final byte[] $$d = null;
    public static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static int[] f8930a = {-168669521, -348102766, 640942614, -1558141209, -1214471163, -1376783428, 149388726, 899594580, -462721079, -1710432177, 744141276, -288725545, 2140428104, 561898322, 562769229, -1987661962, -416524339, 1644927238};

    /* renamed from: b */
    private static int f8931b = 0;

    /* renamed from: e */
    private static int f8932e = 1;

    static {
        init$0();
    }

    protected C2791an() {
    }

    /* renamed from: a */
    protected static byte[] m10851a(Cipher cipher, byte[] bArr) {
        boolean z;
        int i = f8931b + 79;
        f8932e = i % 128;
        int i2 = i % 2;
        try {
            byte[] doFinal = cipher.doFinal(bArr);
            int i3 = f8932e + 17;
            f8931b = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return doFinal;
            }
            throw null;
        } catch (Exception e) {
            C3330l.m13346d(e);
            return null;
        }
    }

    /* renamed from: d */
    protected static byte[] m10852d() {
        char c;
        SecureRandom secureRandom = new SecureRandom();
        try {
            Object[] objArr = new Object[1];
            m10854j(new int[]{1691112956, 1247813769}, 3 - (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), objArr);
            KeyGenerator instance = KeyGenerator.getInstance(((String) objArr[0]).intern());
            instance.init(128, secureRandom);
            byte[] encoded = instance.generateKey().getEncoded();
            int i = f8932e + 65;
            f8931b = i % 128;
            if (i % 2 != 0) {
                c = '&';
            } else {
                c = '<';
            }
            if (c != '&') {
                return encoded;
            }
            int i2 = 58 / 0;
            return encoded;
        } catch (NoSuchAlgorithmException e) {
            throw new Exception(C2810ax.m10991b(e.getMessage()));
        }
    }

    /* renamed from: e */
    protected static byte[] m10853e(Cipher cipher, byte[] bArr) {
        char c;
        int i = f8931b + 61;
        f8932e = i % 128;
        if (i % 2 == 0) {
            c = '2';
        } else {
            c = 13;
        }
        if (c == 13) {
            try {
                byte[] doFinal = cipher.doFinal(bArr);
                int i2 = f8931b + 97;
                f8932e = i2 % 128;
                int i3 = i2 % 2;
                return doFinal;
            } catch (Exception e) {
                C3330l.m13346d(e);
                return null;
            }
        } else {
            cipher.doFinal(bArr);
            throw null;
        }
    }

    static void init$0() {
        $$d = new byte[]{120, -70, -26, 107};
        $$e = 174;
    }

    /* renamed from: j */
    private static void m10854j(int[] iArr, int i, Object[] objArr) {
        boolean z;
        int i2;
        boolean z2;
        Class<Object> cls;
        int i3;
        int i4;
        int[] iArr2 = iArr;
        C3168gj gjVar = new C3168gj();
        char[] cArr = new char[4];
        char[] cArr2 = new char[(iArr2.length * 2)];
        int[] iArr3 = f8930a;
        float f = Utils.FLOAT_EPSILON;
        int i5 = -1747701087;
        int i6 = 1;
        char c = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    i4 = i6;
                } else {
                    i4 = 0;
                }
                if (i4 == 0) {
                    break;
                }
                try {
                    Object[] objArr2 = new Object[i6];
                    objArr2[0] = Integer.valueOf(iArr3[i7]);
                    Map<Integer, Object> map = C2854bp.f9335p;
                    Object obj = map.get(Integer.valueOf(i5));
                    if (obj == null) {
                        obj = ((Class) C2854bp.m11559b((char) View.MeasureSpec.getSize(0), 1717 - TextUtils.indexOf("", "", 0), 24 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)))).getMethod("f", new Class[]{Integer.TYPE});
                        map.put(-1747701087, obj);
                    }
                    iArr4[i7] = ((Integer) ((Method) obj).invoke((Object) null, objArr2)).intValue();
                    i7++;
                    f = Utils.FLOAT_EPSILON;
                    i5 = -1747701087;
                    i6 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = f8930a;
        if (iArr6 != null) {
            z = true;
        } else {
            z = false;
        }
        int i8 = 16;
        if (z) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = Integer.valueOf(iArr6[i9]);
                    Map<Integer, Object> map2 = C2854bp.f9335p;
                    Object obj2 = map2.get(-1747701087);
                    if (obj2 == null) {
                        obj2 = ((Class) C2854bp.m11559b((char) ExpandableListView.getPackedPositionGroup(0), (ViewConfiguration.getFadingEdgeLength() >> i8) + 1717, 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("f", new Class[]{Integer.TYPE});
                        map2.put(-1747701087, obj2);
                    }
                    iArr7[i9] = ((Integer) ((Method) obj2).invoke((Object) null, objArr3)).intValue();
                    i9++;
                    int i12 = $11 + 91;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i8 = 16;
                    c = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            iArr6 = iArr7;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length2);
        gjVar.f10459e = i2;
        while (true) {
            int i14 = gjVar.f10459e;
            if (i14 < iArr2.length) {
                int i15 = iArr2[i14];
                char c2 = (char) (i15 >> 16);
                cArr[i2] = c2;
                char c3 = (char) i15;
                cArr[1] = c3;
                int i16 = 16;
                char c4 = (char) (iArr2[i14 + 1] >> 16);
                cArr[2] = c4;
                char c5 = (char) iArr2[i14 + 1];
                int i17 = 3;
                cArr[3] = c5;
                gjVar.f10458d = (c2 << 16) + c3;
                gjVar.f10457a = (c4 << 16) + c5;
                C3168gj.m12972b(iArr5);
                int i18 = 0;
                while (true) {
                    if (i18 < i16) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cls = Object.class;
                    if (!z2) {
                        break;
                    }
                    int i19 = i16;
                    int i22 = gjVar.f10458d ^ iArr5[i18];
                    gjVar.f10458d = i22;
                    int b = C3168gj.m12971b(i22);
                    try {
                        Object[] objArr4 = new Object[4];
                        objArr4[i17] = gjVar;
                        objArr4[2] = gjVar;
                        objArr4[1] = Integer.valueOf(b);
                        objArr4[0] = gjVar;
                        Map<Integer, Object> map3 = C2854bp.f9335p;
                        Object obj3 = map3.get(-43003330);
                        if (obj3 != null) {
                            i3 = i17;
                        } else {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) b2;
                            Object[] objArr5 = new Object[1];
                            m10855k(b2, b3, (byte) b3, objArr5);
                            i3 = 3;
                            obj3 = ((Class) C2854bp.m11559b((char) ((AudioTrack.getMaxVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMaxVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + 43788), (Process.myTid() >> 22) + 481, View.combineMeasuredStates(0, 0) + 32)).getMethod((String) objArr5[0], new Class[]{cls, Integer.TYPE, cls, cls});
                            map3.put(-43003330, obj3);
                        }
                        int intValue = ((Integer) ((Method) obj3).invoke((Object) null, objArr4)).intValue();
                        gjVar.f10458d = gjVar.f10457a;
                        gjVar.f10457a = intValue;
                        i18++;
                        int i23 = $10 + 33;
                        $11 = i23 % 128;
                        int i24 = i23 % 2;
                        i17 = i3;
                        i16 = 16;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
                int i25 = gjVar.f10458d;
                int i26 = gjVar.f10457a;
                int i27 = i25 ^ iArr5[i16];
                gjVar.f10457a = i27;
                int i28 = i26 ^ iArr5[17];
                gjVar.f10458d = i28;
                cArr[0] = (char) (i28 >>> 16);
                cArr[1] = (char) i28;
                cArr[2] = (char) (i27 >>> 16);
                cArr[i17] = (char) i27;
                C3168gj.m12972b(iArr5);
                int i29 = gjVar.f10459e;
                cArr2[i29 * 2] = cArr[0];
                cArr2[(i29 * 2) + 1] = cArr[1];
                cArr2[(i29 * 2) + 2] = cArr[2];
                cArr2[(i29 * 2) + i17] = cArr[i17];
                try {
                    Object[] objArr6 = new Object[2];
                    objArr6[1] = gjVar;
                    objArr6[0] = gjVar;
                    Map<Integer, Object> map4 = C2854bp.f9335p;
                    Object obj4 = map4.get(-259238060);
                    if (obj4 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        Object[] objArr7 = new Object[1];
                        m10855k(b4, b5, (byte) b5, objArr7);
                        obj4 = ((Class) C2854bp.m11559b((char) (TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)), 663 - Color.argb(0, 0, 0, 0), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod((String) objArr7[0], new Class[]{cls, cls});
                        map4.put(-259238060, obj4);
                    }
                    ((Method) obj4).invoke((Object) null, objArr6);
                    int i32 = $10 + 97;
                    $11 = i32 % 128;
                    int i33 = i32 % 2;
                    i2 = 0;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            } else {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10855k(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = 106 - r6
            byte[] r0 = $$d
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001c
            r6 = r7
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x0037
        L_0x001c:
            r3 = r2
        L_0x001d:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L_0x002a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x002a:
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L_0x0037:
            int r7 = -r7
            int r7 = r7 + r8
            int r6 = r6 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2791an.m10855k(short, byte, byte, java.lang.Object[]):void");
    }
}
