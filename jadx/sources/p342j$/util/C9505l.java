package p342j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.l */
public final class C9505l {

    /* renamed from: c */
    private static final C9505l f26150c = new C9505l();

    /* renamed from: a */
    private final boolean f26151a;

    /* renamed from: b */
    private final int f26152b;

    private C9505l() {
        this.f26151a = false;
        this.f26152b = 0;
    }

    private C9505l(int i) {
        this.f26151a = true;
        this.f26152b = i;
    }

    /* renamed from: a */
    public static C9505l m34868a() {
        return f26150c;
    }

    /* renamed from: d */
    public static C9505l m34869d(int i) {
        return new C9505l(i);
    }

    /* renamed from: b */
    public final int mo25649b() {
        if (this.f26151a) {
            return this.f26152b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean mo25650c() {
        return this.f26151a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9505l)) {
            return false;
        }
        C9505l lVar = (C9505l) obj;
        boolean z = this.f26151a;
        if (!z || !lVar.f26151a) {
            if (z == lVar.f26151a) {
                return true;
            }
        } else if (this.f26152b == lVar.f26152b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26151a) {
            return this.f26152b;
        }
        return 0;
    }

    public final String toString() {
        if (!this.f26151a) {
            return "OptionalInt.empty";
        }
        return String.format("OptionalInt[%s]", new Object[]{Integer.valueOf(this.f26152b)});
    }
}
