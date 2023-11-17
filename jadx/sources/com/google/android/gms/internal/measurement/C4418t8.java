package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.t8 */
public abstract class C4418t8 implements Iterable, Serializable {

    /* renamed from: e */
    public static final C4418t8 f13699e = new C4350p8(C4470w9.f13784d);

    /* renamed from: f */
    private static final Comparator f13700f = new C4265k8();

    /* renamed from: g */
    private static final C4384r8 f13701g = new C4384r8((C4367q8) null);

    /* renamed from: d */
    private int f13702d = 0;

    static {
        int i = C4180f8.f13235a;
    }

    C4418t8() {
    }

    /* renamed from: r */
    static int m16749r(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: w */
    public static C4418t8 m16750w(byte[] bArr, int i, int i2) {
        m16749r(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C4350p8(bArr2);
    }

    /* renamed from: b */
    public abstract byte mo13353b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract byte mo13354c(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: g */
    public abstract int mo13355g();

    public final int hashCode() {
        int i = this.f13702d;
        if (i == 0) {
            int g = mo13355g();
            i = mo13460i(g, 0, g);
            if (i == 0) {
                i = 1;
            }
            this.f13702d = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo13460i(int i, int i2, int i3);

    public final /* synthetic */ Iterator iterator() {
        return new C4248j8(this);
    }

    /* renamed from: k */
    public abstract C4418t8 mo13461k(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract String mo13462l(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract void mo13463n(C4231i8 i8Var);

    /* renamed from: o */
    public abstract boolean mo13464o();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo13355g());
        if (mo13355g() <= 50) {
            str = C4200gb.m15912a(this);
        } else {
            str = C4200gb.m15912a(mo13461k(0, 47)).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo13647v() {
        return this.f13702d;
    }

    /* renamed from: x */
    public final String mo13648x(Charset charset) {
        return mo13355g() == 0 ? "" : mo13462l(charset);
    }
}
