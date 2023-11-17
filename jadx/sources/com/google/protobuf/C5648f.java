package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.f */
public abstract class C5648f implements Iterable, Serializable {

    /* renamed from: e */
    public static final C5648f f17856e = new C5657i(C5716s.f18070d);

    /* renamed from: f */
    private static final C5654f f17857f;

    /* renamed from: g */
    private static final Comparator f17858g = new C5650b();

    /* renamed from: d */
    private int f17859d = 0;

    /* renamed from: com.google.protobuf.f$a */
    class C5649a extends C5651c {

        /* renamed from: d */
        private int f17860d = 0;

        /* renamed from: e */
        private final int f17861e;

        C5649a() {
            this.f17861e = C5648f.this.size();
        }

        /* renamed from: c */
        public byte mo18621c() {
            int i = this.f17860d;
            if (i < this.f17861e) {
                this.f17860d = i + 1;
                return C5648f.this.mo18613n(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f17860d < this.f17861e;
        }
    }

    /* renamed from: com.google.protobuf.f$b */
    class C5650b implements Comparator {
        C5650b() {
        }

        /* renamed from: a */
        public int compare(C5648f fVar, C5648f fVar2) {
            C5655g r = fVar.mo18615r();
            C5655g r2 = fVar2.mo18615r();
            while (r.hasNext() && r2.hasNext()) {
                int compareTo = Integer.valueOf(C5648f.m22531B(r.mo18621c())).compareTo(Integer.valueOf(C5648f.m22531B(r2.mo18621c())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(fVar.size()).compareTo(Integer.valueOf(fVar2.size()));
        }
    }

    /* renamed from: com.google.protobuf.f$c */
    static abstract class C5651c implements C5655g {
        C5651c() {
        }

        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(mo18621c());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.f$d */
    private static final class C5652d implements C5654f {
        private C5652d() {
        }

        /* synthetic */ C5652d(C5649a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.f$e */
    private static final class C5653e extends C5657i {
        private static final long serialVersionUID = 1;

        /* renamed from: i */
        private final int f17863i;

        /* renamed from: j */
        private final int f17864j;

        C5653e(byte[] bArr, int i, int i2) {
            super(bArr);
            C5648f.m22536i(i, i + i2, bArr.length);
            this.f17863i = i;
            this.f17864j = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public int mo18628J() {
            return this.f17863i;
        }

        /* renamed from: c */
        public byte mo18609c(int i) {
            C5648f.m22535g(i, size());
            return this.f17865h[this.f17863i + i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo18612l(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f17865h, mo18628J() + i, bArr, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public byte mo18613n(int i) {
            return this.f17865h[this.f17863i + i];
        }

        public int size() {
            return this.f17864j;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return C5648f.m22533G(mo18604A());
        }
    }

    /* renamed from: com.google.protobuf.f$f */
    private interface C5654f {
    }

    /* renamed from: com.google.protobuf.f$g */
    public interface C5655g extends Iterator {
        /* renamed from: c */
        byte mo18621c();
    }

    /* renamed from: com.google.protobuf.f$h */
    static abstract class C5656h extends C5648f {
        C5656h() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C5648f.super.mo18615r();
        }
    }

    /* renamed from: com.google.protobuf.f$i */
    private static class C5657i extends C5656h {
        private static final long serialVersionUID = 1;

        /* renamed from: h */
        protected final byte[] f17865h;

        C5657i(byte[] bArr) {
            bArr.getClass();
            this.f17865h = bArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public final String mo18606D(Charset charset) {
            return new String(this.f17865h, mo18628J(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public final void mo18608H(C5643e eVar) {
            eVar.mo18488a(this.f17865h, mo18628J(), size());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public final boolean mo18631I(C5648f fVar, int i, int i2) {
            if (i2 <= fVar.size()) {
                int i3 = i + i2;
                if (i3 > fVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + fVar.size());
                } else if (!(fVar instanceof C5657i)) {
                    return fVar.mo18620x(i, i3).equals(mo18620x(0, i2));
                } else {
                    C5657i iVar = (C5657i) fVar;
                    byte[] bArr = this.f17865h;
                    byte[] bArr2 = iVar.f17865h;
                    int J = mo18628J() + i2;
                    int J2 = mo18628J();
                    int J3 = iVar.mo18628J() + i;
                    while (J2 < J) {
                        if (bArr[J2] != bArr2[J3]) {
                            return false;
                        }
                        J2++;
                        J3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public int mo18628J() {
            return 0;
        }

        /* renamed from: c */
        public byte mo18609c(int i) {
            return this.f17865h[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5648f) || size() != ((C5648f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C5657i)) {
                return obj.equals(this);
            }
            C5657i iVar = (C5657i) obj;
            int w = mo18619w();
            int w2 = iVar.mo18619w();
            if (w == 0 || w2 == 0 || w == w2) {
                return mo18631I(iVar, 0, size());
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo18612l(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f17865h, i, bArr, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public byte mo18613n(int i) {
            return this.f17865h[i];
        }

        /* renamed from: o */
        public final boolean mo18614o() {
            int J = mo18628J();
            return C5670g1.m22686m(this.f17865h, J, size() + J);
        }

        public int size() {
            return this.f17865h.length;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public final int mo18618v(int i, int i2, int i3) {
            return C5716s.m22997h(i, this.f17865h, mo18628J() + i2, i3);
        }

        /* renamed from: x */
        public final C5648f mo18620x(int i, int i2) {
            int i3 = C5648f.m22536i(i, i2, size());
            if (i3 == 0) {
                return C5648f.f17856e;
            }
            return new C5653e(this.f17865h, mo18628J() + i, i3);
        }
    }

    /* renamed from: com.google.protobuf.f$j */
    private static final class C5658j implements C5654f {
        private C5658j() {
        }

        /* synthetic */ C5658j(C5649a aVar) {
            this();
        }
    }

    static {
        C5654f fVar;
        if (C5640d.m22493c()) {
            fVar = new C5658j((C5649a) null);
        } else {
            fVar = new C5652d((C5649a) null);
        }
        f17857f = fVar;
    }

    C5648f() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static int m22531B(byte b) {
        return b & 255;
    }

    /* renamed from: F */
    private String m22532F() {
        if (size() <= 50) {
            return C5631a1.m22443a(this);
        }
        return C5631a1.m22443a(mo18620x(0, 47)) + "...";
    }

    /* renamed from: G */
    static C5648f m22533G(byte[] bArr) {
        return new C5657i(bArr);
    }

    /* renamed from: g */
    static void m22535g(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: i */
    static int m22536i(int i, int i2, int i3) {
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

    /* renamed from: k */
    public static C5648f m22537k(String str) {
        return new C5657i(str.getBytes(C5716s.f18068b));
    }

    /* renamed from: A */
    public final byte[] mo18604A() {
        int size = size();
        if (size == 0) {
            return C5716s.f18070d;
        }
        byte[] bArr = new byte[size];
        mo18612l(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: C */
    public final String mo18605C(Charset charset) {
        return size() == 0 ? "" : mo18606D(charset);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract String mo18606D(Charset charset);

    /* renamed from: E */
    public final String mo18607E() {
        return mo18605C(C5716s.f18068b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract void mo18608H(C5643e eVar);

    /* renamed from: c */
    public abstract byte mo18609c(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f17859d;
        if (i == 0) {
            int size = size();
            i = mo18618v(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f17859d = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo18612l(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract byte mo18613n(int i);

    /* renamed from: o */
    public abstract boolean mo18614o();

    /* renamed from: r */
    public C5655g mo18615r() {
        return new C5649a();
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m22532F()});
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract int mo18618v(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final int mo18619w() {
        return this.f17859d;
    }

    /* renamed from: x */
    public abstract C5648f mo18620x(int i, int i2);
}
