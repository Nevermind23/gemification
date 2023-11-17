package ze1;

import ie1.C41330k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe1.C42193c;
import ve1.C43151a;

/* renamed from: ze1.c */
public class C43417c implements Iterable, C43151a {

    /* renamed from: g */
    public static final C43418a f101274g = new C43418a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final int f101275d;

    /* renamed from: e */
    private final int f101276e;

    /* renamed from: f */
    private final int f101277f;

    /* renamed from: ze1.c$a */
    public static final class C43418a {
        private C43418a() {
        }

        public /* synthetic */ C43418a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43417c mo102114a(int i, int i2, int i3) {
            return new C43417c(i, i2, i3);
        }
    }

    public C43417c(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f101275d = i;
            this.f101276e = C42193c.m122497c(i, i2, i3);
            this.f101277f = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C43417c) {
            if (!isEmpty() || !((C43417c) obj).isEmpty()) {
                C43417c cVar = (C43417c) obj;
                if (!(this.f101275d == cVar.f101275d && this.f101276e == cVar.f101276e && this.f101277f == cVar.f101277f)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f101275d * 31) + this.f101276e) * 31) + this.f101277f;
    }

    public boolean isEmpty() {
        if (this.f101277f > 0) {
            if (this.f101275d > this.f101276e) {
                return true;
            }
        } else if (this.f101275d < this.f101276e) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int mo102109j() {
        return this.f101275d;
    }

    /* renamed from: l */
    public final int mo102110l() {
        return this.f101276e;
    }

    /* renamed from: n */
    public final int mo102111n() {
        return this.f101277f;
    }

    /* renamed from: o */
    public C41330k0 iterator() {
        return new C43419d(this.f101275d, this.f101276e, this.f101277f);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f101277f > 0) {
            sb = new StringBuilder();
            sb.append(this.f101275d);
            sb.append("..");
            sb.append(this.f101276e);
            sb.append(" step ");
            i = this.f101277f;
        } else {
            sb = new StringBuilder();
            sb.append(this.f101275d);
            sb.append(" downTo ");
            sb.append(this.f101276e);
            sb.append(" step ");
            i = -this.f101277f;
        }
        sb.append(i);
        return sb.toString();
    }
}
