package p674xm;

import kotlin.jvm.internal.C41536l;
import p603si.C17799b;

/* renamed from: xm.s */
public final class C18835s {

    /* renamed from: a */
    private final C17799b f52643a;

    /* renamed from: b */
    private final C17799b f52644b;

    /* renamed from: c */
    private final C17799b f52645c;

    /* renamed from: d */
    private final C17799b f52646d;

    /* renamed from: e */
    private final C17799b f52647e;

    public C18835s(C17799b bVar, C17799b bVar2, C17799b bVar3, C17799b bVar4, C17799b bVar5) {
        C41536l.m120489i(bVar, "nameOnCard");
        C41536l.m120489i(bVar2, "deliveryAddress");
        C41536l.m120489i(bVar3, "recipientFirstName");
        C41536l.m120489i(bVar4, "recipientLastName");
        C41536l.m120489i(bVar5, "recipientNumber");
        this.f52643a = bVar;
        this.f52644b = bVar2;
        this.f52645c = bVar3;
        this.f52646d = bVar4;
        this.f52647e = bVar5;
    }

    /* renamed from: a */
    public final C17799b mo46785a() {
        return this.f52644b;
    }

    /* renamed from: b */
    public final C17799b mo46786b() {
        return this.f52643a;
    }

    /* renamed from: c */
    public final C17799b mo46787c() {
        return this.f52645c;
    }

    /* renamed from: d */
    public final C17799b mo46788d() {
        return this.f52646d;
    }

    /* renamed from: e */
    public final C17799b mo46789e() {
        return this.f52647e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18835s)) {
            return false;
        }
        C18835s sVar = (C18835s) obj;
        return C41536l.m120484d(this.f52643a, sVar.f52643a) && C41536l.m120484d(this.f52644b, sVar.f52644b) && C41536l.m120484d(this.f52645c, sVar.f52645c) && C41536l.m120484d(this.f52646d, sVar.f52646d) && C41536l.m120484d(this.f52647e, sVar.f52647e);
    }

    public int hashCode() {
        return (((((((this.f52643a.hashCode() * 31) + this.f52644b.hashCode()) * 31) + this.f52645c.hashCode()) * 31) + this.f52646d.hashCode()) * 31) + this.f52647e.hashCode();
    }

    public String toString() {
        C17799b bVar = this.f52643a;
        C17799b bVar2 = this.f52644b;
        C17799b bVar3 = this.f52645c;
        C17799b bVar4 = this.f52646d;
        C17799b bVar5 = this.f52647e;
        return "OrderDebitCardInputValidators(nameOnCard=" + bVar + ", deliveryAddress=" + bVar2 + ", recipientFirstName=" + bVar3 + ", recipientLastName=" + bVar4 + ", recipientNumber=" + bVar5 + ")";
    }
}
