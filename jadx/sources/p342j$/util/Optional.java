package p342j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.Optional */
public final class Optional<T> {

    /* renamed from: b */
    private static final Optional f25938b = new Optional();

    /* renamed from: a */
    private final Object f25939a;

    private Optional() {
        this.f25939a = null;
    }

    private Optional(Object obj) {
        obj.getClass();
        this.f25939a = obj;
    }

    /* renamed from: a */
    public static Optional m34603a() {
        return f25938b;
    }

    /* renamed from: d */
    public static Optional m34604d(Object obj) {
        return new Optional(obj);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? f25938b : new Optional<>(t);
    }

    /* renamed from: b */
    public final Object mo25270b() {
        Object obj = this.f25939a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean mo25271c() {
        return this.f25939a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        return C9381a.m34639D(this.f25939a, ((Optional) obj).f25939a);
    }

    public final int hashCode() {
        Object obj = this.f25939a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f25939a;
        if (obj == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{obj});
    }
}
