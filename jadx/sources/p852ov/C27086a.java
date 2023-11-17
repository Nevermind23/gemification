package p852ov;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p913uu.C28942h;

/* renamed from: ov.a */
public final class C27086a {

    /* renamed from: a */
    private final C28942h f68027a;

    /* renamed from: b */
    private final String f68028b;

    /* renamed from: c */
    private final OfferProductCode f68029c;

    /* renamed from: d */
    private final String f68030d;

    /* renamed from: e */
    private final String f68031e;

    /* renamed from: f */
    private final String f68032f;

    public C27086a(C28942h hVar, String str, OfferProductCode offerProductCode, String str2, String str3, String str4) {
        C41536l.m120489i(hVar, "operationType");
        C41536l.m120489i(str, "cardCcy");
        C41536l.m120489i(offerProductCode, "limitCategory");
        C41536l.m120489i(str2, "cardLimit");
        this.f68027a = hVar;
        this.f68028b = str;
        this.f68029c = offerProductCode;
        this.f68030d = str2;
        this.f68031e = str3;
        this.f68032f = str4;
    }

    /* renamed from: a */
    public final String mo66339a() {
        return this.f68028b;
    }

    /* renamed from: b */
    public final String mo66340b() {
        return this.f68030d;
    }

    /* renamed from: c */
    public final OfferProductCode mo66341c() {
        return this.f68029c;
    }

    /* renamed from: d */
    public final C28942h mo66342d() {
        return this.f68027a;
    }

    /* renamed from: e */
    public final String mo66343e() {
        return this.f68031e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27086a)) {
            return false;
        }
        C27086a aVar = (C27086a) obj;
        return this.f68027a == aVar.f68027a && C41536l.m120484d(this.f68028b, aVar.f68028b) && C41536l.m120484d(this.f68029c, aVar.f68029c) && C41536l.m120484d(this.f68030d, aVar.f68030d) && C41536l.m120484d(this.f68031e, aVar.f68031e) && C41536l.m120484d(this.f68032f, aVar.f68032f);
    }

    /* renamed from: f */
    public final String mo66345f() {
        return this.f68032f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f68027a.hashCode() * 31) + this.f68028b.hashCode()) * 31) + this.f68029c.hashCode()) * 31) + this.f68030d.hashCode()) * 31;
        String str = this.f68031e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f68032f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        C28942h hVar = this.f68027a;
        String str = this.f68028b;
        OfferProductCode offerProductCode = this.f68029c;
        String str2 = this.f68030d;
        String str3 = this.f68031e;
        String str4 = this.f68032f;
        return "CreditOfferLimit(operationType=" + hVar + ", cardCcy=" + str + ", limitCategory=" + offerProductCode + ", cardLimit=" + str2 + ", titleDictionaryKey=" + str3 + ", titleDictionaryKeyValue=" + str4 + ")";
    }
}
