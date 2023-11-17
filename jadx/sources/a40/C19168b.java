package a40;

import kotlin.jvm.internal.C41536l;

/* renamed from: a40.b */
public final class C19168b {

    /* renamed from: a */
    private final C19167a f53370a;

    /* renamed from: b */
    private final C19167a f53371b;

    public C19168b(C19167a aVar, C19167a aVar2) {
        C41536l.m120489i(aVar, "expenses");
        C41536l.m120489i(aVar2, "incomes");
        this.f53370a = aVar;
        this.f53371b = aVar2;
    }

    /* renamed from: a */
    public final C19167a mo47397a() {
        return this.f53370a;
    }

    /* renamed from: b */
    public final C19167a mo47398b() {
        return this.f53371b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19168b)) {
            return false;
        }
        C19168b bVar = (C19168b) obj;
        return C41536l.m120484d(this.f53370a, bVar.f53370a) && C41536l.m120484d(this.f53371b, bVar.f53371b);
    }

    public int hashCode() {
        return (this.f53370a.hashCode() * 31) + this.f53371b.hashCode();
    }

    public String toString() {
        C19167a aVar = this.f53370a;
        C19167a aVar2 = this.f53371b;
        return "AnalysisModel(expenses=" + aVar + ", incomes=" + aVar2 + ")";
    }
}
