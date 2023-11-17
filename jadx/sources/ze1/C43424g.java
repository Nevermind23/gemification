package ze1;

import ie1.C41332l0;
import java.util.NoSuchElementException;

/* renamed from: ze1.g */
public final class C43424g extends C41332l0 {

    /* renamed from: d */
    private final long f101288d;

    /* renamed from: e */
    private final long f101289e;

    /* renamed from: f */
    private boolean f101290f;

    /* renamed from: g */
    private long f101291g;

    public C43424g(long j, long j2, long j3) {
        this.f101288d = j3;
        this.f101289e = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.f101290f = z;
        this.f101291g = !z ? j2 : j;
    }

    public boolean hasNext() {
        return this.f101290f;
    }

    public long nextLong() {
        long j = this.f101291g;
        if (j != this.f101289e) {
            this.f101291g = this.f101288d + j;
        } else if (this.f101290f) {
            this.f101290f = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }
}
