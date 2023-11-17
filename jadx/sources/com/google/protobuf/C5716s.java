package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.s */
public abstract class C5716s {

    /* renamed from: a */
    static final Charset f18067a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f18068b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f18069c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f18070d;

    /* renamed from: e */
    public static final ByteBuffer f18071e;

    /* renamed from: f */
    public static final C5666g f18072f;

    /* renamed from: com.google.protobuf.s$a */
    public interface C5717a {
        /* renamed from: i */
        int mo18790i();
    }

    /* renamed from: com.google.protobuf.s$b */
    public interface C5718b {
    }

    /* renamed from: com.google.protobuf.s$c */
    public interface C5719c {
    }

    /* renamed from: com.google.protobuf.s$d */
    public interface C5720d extends C5721e {
        /* renamed from: a */
        C5720d mo18774a(int i);

        int getInt(int i);

        /* renamed from: p */
        void mo18784p(int i);
    }

    /* renamed from: com.google.protobuf.s$e */
    public interface C5721e extends List, RandomAccess {
        /* renamed from: G0 */
        boolean mo18543G0();

        /* renamed from: a */
        C5721e mo18774a(int i);

        /* renamed from: y */
        void mo18555y();
    }

    static {
        byte[] bArr = new byte[0];
        f18070d = bArr;
        f18071e = ByteBuffer.wrap(bArr);
        f18072f = C5666g.m22666a(bArr);
    }

    /* renamed from: a */
    static Object m22990a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    static Object m22991b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m22992c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m22993d(byte[] bArr) {
        return m22994e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m22994e(byte[] bArr, int i, int i2) {
        int h = m22997h(i2, bArr, i, i2);
        if (h == 0) {
            return 1;
        }
        return h;
    }

    /* renamed from: f */
    public static int m22995f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m22996g(byte[] bArr) {
        return C5670g1.m22685l(bArr);
    }

    /* renamed from: h */
    static int m22997h(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: i */
    public static String m22998i(byte[] bArr) {
        return new String(bArr, f18068b);
    }
}
