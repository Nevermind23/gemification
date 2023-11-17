package p342j$.util.stream;

import java.util.Arrays;
import p342j$.lang.C9285b;
import p342j$.util.C9371P;

/* renamed from: j$.util.stream.P2 */
abstract class C9584P2 extends C9644e implements Iterable, C9285b {

    /* renamed from: e */
    Object f26266e = mo25884d(16);

    /* renamed from: f */
    Object[] f26267f;

    C9584P2() {
    }

    C9584P2(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract Object[] mo25882A();

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo25913B() {
        long j;
        if (this.f26366b == mo25889x(this.f26266e)) {
            if (this.f26267f == null) {
                Object[] A = mo25882A();
                this.f26267f = A;
                this.f26368d = new long[8];
                A[0] = this.f26266e;
            }
            int i = this.f26367c;
            int i2 = i + 1;
            Object[] objArr = this.f26267f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    j = (long) mo25889x(this.f26266e);
                } else {
                    j = ((long) mo25889x(objArr[i])) + this.f26368d[i];
                }
                mo25919z(j + 1);
            }
            this.f26366b = 0;
            int i3 = this.f26367c + 1;
            this.f26367c = i3;
            this.f26266e = this.f26267f[i3];
        }
    }

    public final void clear() {
        Object[] objArr = this.f26267f;
        if (objArr != null) {
            this.f26266e = objArr[0];
            this.f26267f = null;
            this.f26368d = null;
        }
        this.f26366b = 0;
        this.f26367c = 0;
    }

    /* renamed from: d */
    public abstract Object mo25884d(int i);

    /* renamed from: e */
    public void mo25915e(Object obj, int i) {
        long j = (long) i;
        long count = count() + j;
        if (count > ((long) mo25889x(obj)) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f26367c == 0) {
            System.arraycopy(this.f26266e, 0, obj, i, this.f26366b);
        } else {
            for (int i2 = 0; i2 < this.f26367c; i2++) {
                Object obj2 = this.f26267f[i2];
                System.arraycopy(obj2, 0, obj, i, mo25889x(obj2));
                i += mo25889x(this.f26267f[i2]);
            }
            int i3 = this.f26366b;
            if (i3 > 0) {
                System.arraycopy(this.f26266e, 0, obj, i, i3);
            }
        }
    }

    /* renamed from: g */
    public Object mo25916g() {
        long count = count();
        if (count < 2147483639) {
            Object d = mo25884d((int) count);
            mo25915e(d, 0);
            return d;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: h */
    public void mo25917h(Object obj) {
        for (int i = 0; i < this.f26367c; i++) {
            Object obj2 = this.f26267f[i];
            mo25888w(obj2, 0, mo25889x(obj2), obj);
        }
        mo25888w(this.f26266e, 0, this.f26366b, obj);
    }

    public abstract C9371P spliterator();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo25888w(Object obj, int i, int i2, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract int mo25889x(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final int mo25918y(long j) {
        if (this.f26367c == 0) {
            if (j < ((long) this.f26366b)) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j < count()) {
            for (int i = 0; i <= this.f26367c; i++) {
                if (j < this.f26368d[i] + ((long) mo25889x(this.f26267f[i]))) {
                    return i;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo25919z(long j) {
        long j2;
        int i = this.f26367c;
        if (i == 0) {
            j2 = (long) mo25889x(this.f26266e);
        } else {
            j2 = ((long) mo25889x(this.f26267f[i])) + this.f26368d[i];
        }
        if (j > j2) {
            if (this.f26267f == null) {
                Object[] A = mo25882A();
                this.f26267f = A;
                this.f26368d = new long[8];
                A[0] = this.f26266e;
            }
            int i2 = this.f26367c;
            while (true) {
                i2++;
                if (j > j2) {
                    Object[] objArr = this.f26267f;
                    if (i2 >= objArr.length) {
                        int length = objArr.length * 2;
                        this.f26267f = Arrays.copyOf(objArr, length);
                        this.f26368d = Arrays.copyOf(this.f26368d, length);
                    }
                    int i3 = this.f26365a;
                    if (!(i2 == 0 || i2 == 1)) {
                        i3 = Math.min((i3 + i2) - 1, 30);
                    }
                    int i4 = 1 << i3;
                    this.f26267f[i2] = mo25884d(i4);
                    long[] jArr = this.f26368d;
                    int i5 = i2 - 1;
                    jArr[i2] = jArr[i5] + ((long) mo25889x(this.f26267f[i5]));
                    j2 += (long) i4;
                } else {
                    return;
                }
            }
        }
    }
}
