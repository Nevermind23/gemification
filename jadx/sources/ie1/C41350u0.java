package ie1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.u0 */
final class C41350u0 extends C41308c implements RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object[] f97385e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f97386f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f97387g;

    /* renamed from: h */
    private int f97388h;

    /* renamed from: ie1.u0$a */
    public static final class C41351a extends C41305b {

        /* renamed from: f */
        private int f97389f;

        /* renamed from: g */
        private int f97390g;

        /* renamed from: h */
        final /* synthetic */ C41350u0 f97391h;

        C41351a(C41350u0 u0Var) {
            this.f97391h = u0Var;
            this.f97389f = u0Var.size();
            this.f97390g = u0Var.f97387g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo95823b() {
            if (this.f97389f == 0) {
                mo95824d();
                return;
            }
            mo95825e(this.f97391h.f97385e[this.f97390g]);
            this.f97390g = (this.f97390g + 1) % this.f97391h.f97386f;
            this.f97389f--;
        }
    }

    public C41350u0(Object[] objArr, int i) {
        C41536l.m120489i(objArr, "buffer");
        this.f97385e = objArr;
        boolean z = true;
        if (i >= 0) {
            if (i > objArr.length ? false : z) {
                this.f97386f = objArr.length;
                this.f97388h = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }

    /* renamed from: b */
    public int mo94472b() {
        return this.f97388h;
    }

    public Object get(int i) {
        C41308c.f97363d.mo95862b(i, size());
        return this.f97385e[(this.f97387g + i) % this.f97386f];
    }

    public Iterator iterator() {
        return new C41351a(this);
    }

    /* renamed from: l */
    public final void mo95980l(Object obj) {
        if (!mo95982o()) {
            this.f97385e[(this.f97387g + size()) % this.f97386f] = obj;
            this.f97388h = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* renamed from: n */
    public final C41350u0 mo95981n(int i) {
        Object[] objArr;
        int i2 = this.f97386f;
        int g = C43429k.m124588g(i2 + (i2 >> 1) + 1, i);
        if (this.f97387g == 0) {
            objArr = Arrays.copyOf(this.f97385e, g);
            C41536l.m120488h(objArr, "copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[g]);
        }
        return new C41350u0(objArr, size());
    }

    /* renamed from: o */
    public final boolean mo95982o() {
        return size() == this.f97386f;
    }

    /* renamed from: r */
    public final void mo95983r(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > size()) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
            } else if (i > 0) {
                int i2 = this.f97387g;
                int i3 = (i2 + i) % this.f97386f;
                if (i2 > i3) {
                    C41331l.m119767k(this.f97385e, (Object) null, i2, this.f97386f);
                    C41331l.m119767k(this.f97385e, (Object) null, 0, i3);
                } else {
                    C41331l.m119767k(this.f97385e, (Object) null, i2, i3);
                }
                this.f97387g = i3;
                this.f97388h = size() - i;
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
    }

    public Object[] toArray(Object[] objArr) {
        C41536l.m120489i(objArr, "array");
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            C41536l.m120488h(objArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i = this.f97387g;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size && i < this.f97386f) {
            objArr[i3] = this.f97385e[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = this.f97385e[i2];
            i3++;
            i2++;
        }
        if (objArr.length > size()) {
            objArr[size()] = null;
        }
        return objArr;
    }

    public C41350u0(int i) {
        this(new Object[i], 0);
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
