package hn0;

import kotlin.jvm.internal.C41536l;

/* renamed from: hn0.a */
public final class C15536a {

    /* renamed from: a */
    private final C15538c f44098a;

    /* renamed from: b */
    private final C15537b f44099b;

    /* renamed from: c */
    private final String f44100c;

    public C15536a(C15538c cVar, C15537b bVar, String str) {
        this.f44098a = cVar;
        this.f44099b = bVar;
        this.f44100c = str;
    }

    /* renamed from: a */
    public final String mo42651a() {
        return this.f44100c;
    }

    /* renamed from: b */
    public final C15537b mo42652b() {
        return this.f44099b;
    }

    /* renamed from: c */
    public final C15538c mo42653c() {
        return this.f44098a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15536a)) {
            return false;
        }
        C15536a aVar = (C15536a) obj;
        return C41536l.m120484d(this.f44098a, aVar.f44098a) && C41536l.m120484d(this.f44099b, aVar.f44099b) && C41536l.m120484d(this.f44100c, aVar.f44100c);
    }

    public int hashCode() {
        C15538c cVar = this.f44098a;
        int i = 0;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        C15537b bVar = this.f44099b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f44100c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        C15538c cVar = this.f44098a;
        C15537b bVar = this.f44099b;
        String str = this.f44100c;
        return "Address(country=" + cVar + ", city=" + bVar + ", addressLine=" + str + ")";
    }
}
