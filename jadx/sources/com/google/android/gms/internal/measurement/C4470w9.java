package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.w9 */
public abstract class C4470w9 {

    /* renamed from: a */
    static final Charset f13781a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f13782b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f13783c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f13784d;

    /* renamed from: e */
    public static final ByteBuffer f13785e;

    /* renamed from: f */
    public static final C4485x8 f13786f;

    static {
        byte[] bArr = new byte[0];
        f13784d = bArr;
        f13785e = ByteBuffer.wrap(bArr);
        int i = C4485x8.f13806a;
        C4452v8 v8Var = new C4452v8(bArr, 0, 0, false, (C4435u8) null);
        try {
            v8Var.mo13779c(0);
            f13786f = v8Var;
        } catch (zzll e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m17095a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    static int m17096b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: c */
    static Object m17097c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static String m17098d(byte[] bArr) {
        return new String(bArr, f13782b);
    }
}
