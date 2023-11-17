package p673xl;

import kotlin.jvm.internal.C41536l;
import p606sl.C17845k;
import p782hu.C25065a;

/* renamed from: xl.c */
public final class C18780c {

    /* renamed from: a */
    private final C17845k f52492a;

    /* renamed from: b */
    private final C18779b f52493b;

    /* renamed from: c */
    private final C25065a f52494c;

    public C18780c(C17845k kVar, C18779b bVar, C25065a aVar) {
        C41536l.m120489i(kVar, "merchantDetails");
        C41536l.m120489i(bVar, "buyOptions");
        C41536l.m120489i(aVar, "limitInfo");
        this.f52492a = kVar;
        this.f52493b = bVar;
        this.f52494c = aVar;
    }

    /* renamed from: a */
    public final C18779b mo46574a() {
        return this.f52493b;
    }

    /* renamed from: b */
    public final C25065a mo46575b() {
        return this.f52494c;
    }

    /* renamed from: c */
    public final C17845k mo46576c() {
        return this.f52492a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18780c)) {
            return false;
        }
        C18780c cVar = (C18780c) obj;
        return C41536l.m120484d(this.f52492a, cVar.f52492a) && C41536l.m120484d(this.f52493b, cVar.f52493b) && C41536l.m120484d(this.f52494c, cVar.f52494c);
    }

    public int hashCode() {
        return (((this.f52492a.hashCode() * 31) + this.f52493b.hashCode()) * 31) + this.f52494c.hashCode();
    }

    public String toString() {
        C17845k kVar = this.f52492a;
        C18779b bVar = this.f52493b;
        C25065a aVar = this.f52494c;
        return "BnplOfferDetailsUiModel(merchantDetails=" + kVar + ", buyOptions=" + bVar + ", limitInfo=" + aVar + ")";
    }
}
