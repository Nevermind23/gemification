package com.facetec.sdk;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.EncryptStrings;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

@EncryptStrings
/* renamed from: com.facetec.sdk.ck */
final class C2898ck implements X509TrustManager {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static final String[] f9611a;

    /* renamed from: d */
    private static char f9612d;

    /* renamed from: e */
    private static char f9613e;

    /* renamed from: g */
    private static int f9614g;

    /* renamed from: h */
    private static char f9615h;

    /* renamed from: i */
    private static char f9616i;

    /* renamed from: j */
    private static int f9617j = 1;

    /* renamed from: b */
    private final MessageDigest f9618b;

    /* renamed from: c */
    private final ArrayList<byte[]> f9619c = new ArrayList<>();

    static {
        init$0();
        f9614g = 0;
        m11977e();
        Object[] objArr = new Object[1];
        m11978f("췮ᗿ願⎋䟅⎍㭧㰨豨ꢉ?䯒ᅸ懴櫓ૻ㸐඼玣崀믭规ꐴ?殫創澌僔ᥥ쁶摾ゲ⓭Ǌ?ಂ䍟", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, objArr);
        Object[] objArr2 = new Object[1];
        m11978f("凊谶饅?羒㜋箄?셨훐冧寉ꉶ阔瞷錦粫ଵ觷ꮔ홟偧ﲷ븝彔幽藪鐿⁧ᅲ轂䒳퍪裏㧼咔鍒缹ℬ᭼⶞", TextUtils.getOffsetBefore("", 0) + 44, objArr2);
        f9611a = new String[]{((String) objArr[0]).intern(), ((String) objArr2[0]).intern()};
        int i = f9617j + 57;
        f9614g = i % 128;
        int i2 = i % 2;
    }

    private C2898ck() {
        for (String decode : f9611a) {
            this.f9619c.add(Base64.decode(decode, 0));
        }
        Object[] objArr = new Object[1];
        m11978f("⭿숚ዘ⌲ﾤ", ((byte) KeyEvent.getModifierMetaStateMask()) + 7, objArr);
        this.f9618b = MessageDigest.getInstance(((String) objArr[0]).intern());
    }

    /* renamed from: c */
    static X509TrustManager m11976c() {
        C2898ck ckVar = new C2898ck();
        int i = f9614g + 83;
        f9617j = i % 128;
        int i2 = i % 2;
        return ckVar;
    }

    /* renamed from: e */
    static void m11977e() {
        f9612d = 55309;
        f9613e = 2251;
        f9616i = 712;
        f9615h = 49164;
    }

    /* renamed from: f */
    private static void m11978f(String str, int i, Object[] objArr) {
        Object obj;
        int i2;
        int i3;
        int i4;
        int i5;
        Throwable cause;
        Class<Object> cls = Object.class;
        int i6 = $10;
        int i7 = i6 + 97;
        $11 = i7 % 128;
        int i8 = 2;
        int i9 = i7 % 2;
        if (str != null) {
            int i12 = i6 + 119;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            obj = str.toCharArray();
        } else {
            obj = str;
        }
        char[] cArr = (char[]) obj;
        C3163ge geVar = new C3163ge();
        char[] cArr2 = new char[cArr.length];
        int i14 = 0;
        geVar.f10441b = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i15 = geVar.f10441b;
            if (i15 < cArr.length) {
                i2 = 1;
            } else {
                i2 = i14;
            }
            if (i2 != 1) {
                objArr[i14] = new String(cArr2, i14, i);
                return;
            }
            int i16 = i;
            int i17 = $11 + 29;
            $10 = i17 % 128;
            int i18 = i17 % i8;
            cArr3[i14] = cArr[i15];
            cArr3[1] = cArr[i15 + 1];
            int i19 = 58224;
            int i22 = i14;
            while (true) {
                if (i22 < 16) {
                    i3 = i14;
                } else {
                    i3 = 1;
                }
                if (i3 == 1) {
                    break;
                }
                int i23 = $11 + 13;
                $10 = i23 % 128;
                int i24 = i23 % i8;
                char c = cArr3[1];
                char c2 = cArr3[i14];
                int i25 = (c2 + i19) ^ ((c2 << 4) + ((char) ((int) (((long) f9616i) ^ 595417797124296349L))));
                int i26 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f9615h);
                    objArr2[i8] = Integer.valueOf(i26);
                    objArr2[1] = Integer.valueOf(i25);
                    objArr2[0] = Integer.valueOf(c);
                    Map<Integer, Object> map = C2854bp.f9335p;
                    Object obj2 = map.get(1276772069);
                    if (obj2 == null) {
                        byte b = (byte) -1;
                        byte b2 = (byte) (-b);
                        Object[] objArr3 = new Object[1];
                        m11979k(b, b2, (byte) (b2 - 1), objArr3);
                        Class cls2 = Integer.TYPE;
                        obj2 = ((Class) C2854bp.m11559b((char) ((SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 8635), 1311 - MotionEvent.axisFromString(""), (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)) + 23)).getMethod((String) objArr3[0], new Class[]{cls2, cls2, cls2, cls2});
                        map.put(1276772069, obj2);
                    }
                    char charValue = ((Character) ((Method) obj2).invoke((Object) null, objArr2)).charValue();
                    cArr3[1] = charValue;
                    char c3 = cArr3[0];
                    int i27 = (charValue + i19) ^ ((charValue << 4) + ((char) ((int) (((long) f9612d) ^ 595417797124296349L))));
                    int i28 = charValue >>> 5;
                    try {
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(f9613e);
                        objArr4[2] = Integer.valueOf(i28);
                        objArr4[1] = Integer.valueOf(i27);
                        objArr4[0] = Integer.valueOf(c3);
                        Object obj3 = map.get(1276772069);
                        if (obj3 == null) {
                            byte b3 = (byte) -1;
                            byte b4 = (byte) (-b3);
                            Object[] objArr5 = new Object[1];
                            m11979k(b3, b4, (byte) (b4 - 1), objArr5);
                            Class cls3 = Integer.TYPE;
                            obj3 = ((Class) C2854bp.m11559b((char) (8636 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), View.getDefaultSize(0, 0) + 1312, View.resolveSize(0, 0) + 23)).getMethod((String) objArr5[0], new Class[]{cls3, cls3, cls3, cls3});
                            map.put(1276772069, obj3);
                        }
                        cArr3[0] = ((Character) ((Method) obj3).invoke((Object) null, objArr4)).charValue();
                        i19 -= 40503;
                        i22++;
                        i8 = 2;
                        i14 = 0;
                    } catch (Throwable th) {
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } finally {
                    cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                }
            }
            int i29 = geVar.f10441b;
            cArr2[i29] = cArr3[0];
            cArr2[i29 + 1] = cArr3[1];
            try {
                Object[] objArr6 = new Object[2];
                objArr6[1] = geVar;
                objArr6[0] = geVar;
                Map<Integer, Object> map2 = C2854bp.f9335p;
                Object obj4 = map2.get(-417016338);
                if (obj4 != null) {
                    i5 = 0;
                    i4 = 2;
                } else {
                    byte b5 = (byte) -1;
                    byte b6 = (byte) (b5 + 1);
                    Object[] objArr7 = new Object[1];
                    m11979k(b5, b6, (byte) b6, objArr7);
                    i5 = 0;
                    i4 = 2;
                    obj4 = ((Class) C2854bp.m11559b((char) (28387 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 838, (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 25)).getMethod((String) objArr7[0], new Class[]{cls, cls});
                    map2.put(-417016338, obj4);
                }
                ((Method) obj4).invoke((Object) null, objArr6);
                i14 = i5;
                i8 = i4;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{101, Byte.MIN_VALUE, 43, 46};
        $$b = 18;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11979k(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = $$a
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 2
            int r7 = r7 + 118
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r3 = r7
            r4 = r2
            r7 = r6
            goto L_0x002e
        L_0x0017:
            r3 = r2
        L_0x0018:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L_0x0027
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0027:
            int r6 = r6 + 1
            byte r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x002e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2898ck.m11979k(short, int, byte, java.lang.Object[]):void");
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        Object[] objArr = new Object[1];
        m11978f("찯臾䭎鈼⤨㽭ᜱ轎ྴ͔묁䗭溤꘺捀༺䏗㛪銦?හ䇂䅢倛㮵啦㰼떨꦳关䏗㛪眉", 33 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        throw new CertificateException(((String) objArr[0]).intern());
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        byte[] bArr;
        boolean z;
        boolean z2;
        try {
            Object[] objArr = new Object[1];
            m11978f("᭤ퟠ㬷顱", (ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1)) + 3, objArr);
            TrustManagerFactory instance = TrustManagerFactory.getInstance(((String) objArr[0]).intern());
            instance.init((KeyStore) null);
            for (TrustManager trustManager : instance.getTrustManagers()) {
                ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
            }
            int i = f9617j + 27;
            f9614g = i % 128;
            if (i % 2 != 0) {
                bArr = this.f9618b.digest(x509CertificateArr[1].getPublicKey().getEncoded());
            } else {
                bArr = this.f9618b.digest(x509CertificateArr[0].getPublicKey().getEncoded());
            }
            Iterator<byte[]> it = this.f9619c.iterator();
            int i2 = f9617j + 27;
            f9614g = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                if (it.hasNext()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i4 = f9617j + 17;
                    f9614g = i4 % 128;
                    if (i4 % 2 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        int i5 = 43 / 0;
                        if (Arrays.equals(it.next(), bArr)) {
                            break;
                        }
                    } else if (Arrays.equals(it.next(), bArr)) {
                        break;
                    }
                } else {
                    Object[] objArr2 = new Object[1];
                    m11978f("⅔镋툋暺彾챛炒?හ䇂䅢倛㱺Ⴈ漕綤䏗㛪眉", 23 - Color.green(0), objArr2);
                    throw new CertificateException(((String) objArr2[0]).intern());
                }
            }
            int i6 = f9617j + 47;
            f9614g = i6 % 128;
            int i7 = i6 % 2;
        } catch (Exception e) {
            throw new CertificateException(e.toString());
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        int i = f9614g + 113;
        int i2 = i % 128;
        f9617j = i2;
        boolean z = false;
        if (i % 2 == 0) {
        }
        X509Certificate[] x509CertificateArr = new X509Certificate[0];
        int i3 = i2 + 109;
        f9614g = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
        }
        if (z) {
            return x509CertificateArr;
        }
        throw null;
    }
}
