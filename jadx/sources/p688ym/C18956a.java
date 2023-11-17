package p688ym;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p565pm.C17389d;

/* renamed from: ym.a */
public final class C18956a {

    /* renamed from: a */
    private final C17389d f52956a;

    /* renamed from: b */
    private final C17389d f52957b;

    /* renamed from: c */
    private final C17389d f52958c;

    /* renamed from: d */
    private final C17389d f52959d;

    public C18956a(C17389d dVar, C17389d dVar2, C17389d dVar3, C17389d dVar4) {
        this.f52956a = dVar;
        this.f52957b = dVar2;
        this.f52958c = dVar3;
        this.f52959d = dVar4;
    }

    /* renamed from: b */
    public static /* synthetic */ C18956a m64051b(C18956a aVar, C17389d dVar, C17389d dVar2, C17389d dVar3, C17389d dVar4, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = aVar.f52956a;
        }
        if ((i & 2) != 0) {
            dVar2 = aVar.f52957b;
        }
        if ((i & 4) != 0) {
            dVar3 = aVar.f52958c;
        }
        if ((i & 8) != 0) {
            dVar4 = aVar.f52959d;
        }
        return aVar.mo47001a(dVar, dVar2, dVar3, dVar4);
    }

    /* renamed from: a */
    public final C18956a mo47001a(C17389d dVar, C17389d dVar2, C17389d dVar3, C17389d dVar4) {
        return new C18956a(dVar, dVar2, dVar3, dVar4);
    }

    /* renamed from: c */
    public final C17389d mo47002c() {
        return this.f52957b;
    }

    /* renamed from: d */
    public final C17389d mo47003d() {
        return this.f52956a;
    }

    /* renamed from: e */
    public final C17389d mo47004e() {
        return this.f52958c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18956a)) {
            return false;
        }
        C18956a aVar = (C18956a) obj;
        return C41536l.m120484d(this.f52956a, aVar.f52956a) && C41536l.m120484d(this.f52957b, aVar.f52957b) && C41536l.m120484d(this.f52958c, aVar.f52958c) && C41536l.m120484d(this.f52959d, aVar.f52959d);
    }

    public int hashCode() {
        C17389d dVar = this.f52956a;
        int i = 0;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        C17389d dVar2 = this.f52957b;
        int hashCode2 = (hashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        C17389d dVar3 = this.f52958c;
        int hashCode3 = (hashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        C17389d dVar4 = this.f52959d;
        if (dVar4 != null) {
            i = dVar4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        C17389d dVar = this.f52956a;
        C17389d dVar2 = this.f52957b;
        C17389d dVar3 = this.f52958c;
        C17389d dVar4 = this.f52959d;
        return "DeliveryData(country=" + dVar + ", city=" + dVar2 + ", office=" + dVar3 + ", pointValue=" + dVar4 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18956a(C17389d dVar, C17389d dVar2, C17389d dVar3, C17389d dVar4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dVar, (i & 2) != 0 ? null : dVar2, (i & 4) != 0 ? null : dVar3, (i & 8) != 0 ? null : dVar4);
    }
}
