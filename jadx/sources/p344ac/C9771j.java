package p344ac;

import p200ob.C7507a;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: ac.j */
public abstract class C9771j {

    /* renamed from: a */
    private final C7507a f26550a;

    /* renamed from: b */
    private final C9781s f26551b;

    C9771j(C7507a aVar) {
        this.f26550a = aVar;
        this.f26551b = new C9781s(aVar);
    }

    /* renamed from: a */
    public static C9771j m35929a(C7507a aVar) {
        if (aVar.mo21956g(1)) {
            return new C9768g(aVar);
        }
        if (!aVar.mo21956g(2)) {
            return new C9772k(aVar);
        }
        int g = C9781s.m35960g(aVar, 1, 4);
        if (g == 4) {
            return new C9762a(aVar);
        }
        if (g == 5) {
            return new C9763b(aVar);
        }
        int g2 = C9781s.m35960g(aVar, 1, 5);
        if (g2 == 12) {
            return new C9764c(aVar);
        }
        if (g2 == 13) {
            return new C9765d(aVar);
        }
        switch (C9781s.m35960g(aVar, 1, 7)) {
            case 56:
                return new C9766e(aVar, "310", "11");
            case 57:
                return new C9766e(aVar, "320", "11");
            case 58:
                return new C9766e(aVar, "310", BankApiResponse.INVALID_SESSION_CODE);
            case 59:
                return new C9766e(aVar, "320", BankApiResponse.INVALID_SESSION_CODE);
            case 60:
                return new C9766e(aVar, "310", "15");
            case 61:
                return new C9766e(aVar, "320", "15");
            case 62:
                return new C9766e(aVar, "310", "17");
            case 63:
                return new C9766e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C9781s mo26222b() {
        return this.f26551b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C7507a mo26223c() {
        return this.f26550a;
    }

    /* renamed from: d */
    public abstract String mo26218d();
}
