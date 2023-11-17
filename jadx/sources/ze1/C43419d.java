package ze1;

import ie1.C41330k0;
import java.util.NoSuchElementException;

/* renamed from: ze1.d */
public final class C43419d extends C41330k0 {

    /* renamed from: d */
    private final int f101278d;

    /* renamed from: e */
    private final int f101279e;

    /* renamed from: f */
    private boolean f101280f;

    /* renamed from: g */
    private int f101281g;

    public C43419d(int i, int i2, int i3) {
        this.f101278d = i3;
        this.f101279e = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f101280f = z;
        this.f101281g = !z ? i2 : i;
    }

    public boolean hasNext() {
        return this.f101280f;
    }

    public int nextInt() {
        int i = this.f101281g;
        if (i != this.f101279e) {
            this.f101281g = this.f101278d + i;
        } else if (this.f101280f) {
            this.f101280f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
