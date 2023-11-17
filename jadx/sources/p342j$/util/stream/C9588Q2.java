package p342j$.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p342j$.lang.C9285b;
import p342j$.util.C9371P;
import p342j$.util.C9417e0;
import p342j$.util.function.C9459g;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.Q2 */
class C9588Q2 extends C9644e implements Consumer, Iterable, C9285b {

    /* renamed from: e */
    protected Object[] f26270e = new Object[(1 << 4)];

    /* renamed from: f */
    protected Object[][] f26271f;

    C9588Q2() {
    }

    /* renamed from: a */
    public void mo24915a(Consumer consumer) {
        for (int i = 0; i < this.f26367c; i++) {
            for (Object accept : this.f26271f[i]) {
                consumer.accept(accept);
            }
        }
        for (int i2 = 0; i2 < this.f26366b; i2++) {
            consumer.accept(this.f26270e[i2]);
        }
    }

    public void accept(Object obj) {
        long j;
        int i = this.f26366b;
        Object[] objArr = this.f26270e;
        if (i == objArr.length) {
            if (this.f26271f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f26271f = objArr2;
                this.f26368d = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.f26367c;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.f26271f;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    j = (long) objArr.length;
                } else {
                    j = ((long) objArr3[i2].length) + this.f26368d[i2];
                }
                mo25926w(j + 1);
            }
            this.f26366b = 0;
            int i4 = this.f26367c + 1;
            this.f26367c = i4;
            this.f26270e = this.f26271f[i4];
        }
        Object[] objArr4 = this.f26270e;
        int i5 = this.f26366b;
        this.f26366b = i5 + 1;
        objArr4[i5] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void clear() {
        Object[][] objArr = this.f26271f;
        if (objArr != null) {
            this.f26270e = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.f26270e;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f26271f = null;
            this.f26368d = null;
        } else {
            for (int i2 = 0; i2 < this.f26366b; i2++) {
                this.f26270e[i2] = null;
            }
        }
        this.f26366b = 0;
        this.f26367c = 0;
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        mo24915a(C9459g.m34817a(consumer));
    }

    public final Iterator iterator() {
        return C9417e0.m34761i(spliterator());
    }

    public C9371P spliterator() {
        return new C9551H2(this, 0, this.f26367c, 0, this.f26366b);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        mo24915a(new C9624a(arrayList, 8));
        return "SpinedBuffer:" + arrayList.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo25926w(long j) {
        long j2;
        int i = this.f26367c;
        if (i == 0) {
            j2 = (long) this.f26270e.length;
        } else {
            j2 = ((long) this.f26271f[i].length) + this.f26368d[i];
        }
        if (j > j2) {
            if (this.f26271f == null) {
                Object[][] objArr = new Object[8][];
                this.f26271f = objArr;
                this.f26368d = new long[8];
                objArr[0] = this.f26270e;
            }
            while (true) {
                i++;
                if (j > j2) {
                    Object[][] objArr2 = this.f26271f;
                    if (i >= objArr2.length) {
                        int length = objArr2.length * 2;
                        this.f26271f = (Object[][]) Arrays.copyOf(objArr2, length);
                        this.f26368d = Arrays.copyOf(this.f26368d, length);
                    }
                    int i2 = this.f26365a;
                    if (!(i == 0 || i == 1)) {
                        i2 = Math.min((i2 + i) - 1, 30);
                    }
                    int i3 = 1 << i2;
                    Object[][] objArr3 = this.f26271f;
                    objArr3[i] = new Object[i3];
                    long[] jArr = this.f26368d;
                    int i4 = i - 1;
                    jArr[i] = jArr[i4] + ((long) objArr3[i4].length);
                    j2 += (long) i3;
                } else {
                    return;
                }
            }
        }
    }
}
