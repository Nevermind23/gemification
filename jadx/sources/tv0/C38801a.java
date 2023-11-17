package tv0;

import kotlin.jvm.internal.C41536l;
import tv0.C38806f;

/* renamed from: tv0.a */
public final class C38801a {

    /* renamed from: a */
    private final C38806f.C38808b f92857a;

    /* renamed from: b */
    private final int f92858b;

    /* renamed from: c */
    private final int f92859c;

    /* renamed from: d */
    private final int f92860d;

    /* renamed from: e */
    private final Integer f92861e;

    /* renamed from: f */
    private final int f92862f;

    public C38801a(C38806f.C38808b bVar, int i, int i2, int i3, Integer num, int i4) {
        C41536l.m120489i(bVar, "type");
        this.f92857a = bVar;
        this.f92858b = i;
        this.f92859c = i2;
        this.f92860d = i3;
        this.f92861e = num;
        this.f92862f = i4;
    }

    /* renamed from: a */
    public final int mo92514a() {
        return this.f92859c;
    }

    /* renamed from: b */
    public final int mo92515b() {
        return this.f92862f;
    }

    /* renamed from: c */
    public final Integer mo92516c() {
        return this.f92861e;
    }

    /* renamed from: d */
    public final int mo92517d() {
        return this.f92858b;
    }

    /* renamed from: e */
    public final int mo92518e() {
        return this.f92860d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38801a)) {
            return false;
        }
        C38801a aVar = (C38801a) obj;
        return this.f92857a == aVar.f92857a && this.f92858b == aVar.f92858b && this.f92859c == aVar.f92859c && this.f92860d == aVar.f92860d && C41536l.m120484d(this.f92861e, aVar.f92861e) && this.f92862f == aVar.f92862f;
    }

    /* renamed from: f */
    public final C38806f.C38808b mo92520f() {
        return this.f92857a;
    }

    public int hashCode() {
        int hashCode = ((((((this.f92857a.hashCode() * 31) + this.f92858b) * 31) + this.f92859c) * 31) + this.f92860d) * 31;
        Integer num = this.f92861e;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f92862f;
    }

    public String toString() {
        C38806f.C38808b bVar = this.f92857a;
        int i = this.f92858b;
        int i2 = this.f92859c;
        int i3 = this.f92860d;
        Integer num = this.f92861e;
        int i4 = this.f92862f;
        return "MenuItem(type=" + bVar + ", titleResId=" + i + ", iconResId=" + i2 + ", titleTextColorId=" + i3 + ", imageTintColor=" + num + ", imageBackgroundTintColor=" + i4 + ")";
    }
}
