package p341ge.bog.chat.presentation.activity;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.chat.presentation.activity.e */
public final class C13015e {

    /* renamed from: a */
    private final Long f38375a;

    /* renamed from: b */
    private final Long f38376b;

    public C13015e(Long l, Long l2) {
        this.f38375a = l;
        this.f38376b = l2;
    }

    /* renamed from: b */
    public static /* synthetic */ C13015e m49157b(C13015e eVar, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = eVar.f38375a;
        }
        if ((i & 2) != 0) {
            l2 = eVar.f38376b;
        }
        return eVar.mo34249a(l, l2);
    }

    /* renamed from: a */
    public final C13015e mo34249a(Long l, Long l2) {
        return new C13015e(l, l2);
    }

    /* renamed from: c */
    public final Long mo34250c() {
        return this.f38376b;
    }

    /* renamed from: d */
    public final Long mo34251d() {
        return this.f38375a;
    }

    /* renamed from: e */
    public final boolean mo34252e() {
        return (this.f38375a == null || this.f38376b == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13015e)) {
            return false;
        }
        C13015e eVar = (C13015e) obj;
        return C41536l.m120484d(this.f38375a, eVar.f38375a) && C41536l.m120484d(this.f38376b, eVar.f38376b);
    }

    public int hashCode() {
        Long l = this.f38375a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f38376b;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Long l = this.f38375a;
        Long l2 = this.f38376b;
        return "CalendarRange(startDate=" + l + ", endDate=" + l2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13015e(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}
