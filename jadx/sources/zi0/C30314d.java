package zi0;

import cj0.C19762a;
import cj0.C19763b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37614q;

/* renamed from: zi0.d */
public final class C30314d {

    /* renamed from: a */
    private final C19763b f76224a;

    /* renamed from: b */
    private final C19762a f76225b;

    public C30314d(C19763b bVar, C19762a aVar) {
        this.f76224a = bVar;
        this.f76225b = aVar;
    }

    /* renamed from: a */
    public final List mo70636a() {
        ArrayList arrayList = new ArrayList();
        C37614q.m110615a(arrayList, this.f76224a);
        C37614q.m110615a(arrayList, this.f76225b);
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30314d)) {
            return false;
        }
        C30314d dVar = (C30314d) obj;
        return C41536l.m120484d(this.f76224a, dVar.f76224a) && C41536l.m120484d(this.f76225b, dVar.f76225b);
    }

    public int hashCode() {
        C19763b bVar = this.f76224a;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        C19762a aVar = this.f76225b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        C19763b bVar = this.f76224a;
        C19762a aVar = this.f76225b;
        return "OffersAndApplicationsViewState(statementHeaderItem=" + bVar + ", statementDetailsItem=" + aVar + ")";
    }
}
