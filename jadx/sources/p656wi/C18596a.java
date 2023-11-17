package p656wi;

import p341ge.bog.designsystem.components.statusbadge.StatusBadgeType;
import p601sg.C17780e;

/* renamed from: wi.a */
public enum C18596a {
    CLEAR(r10, (int) null, 1),
    WAITING(r10, StatusBadgeType.Loading.f40349l, 2),
    SUCCESS(C17780e.shape_messaging_steps_success, StatusBadgeType.Success.f40356l, 3),
    ERROR(C17780e.shape_messaging_steps_error, StatusBadgeType.Error.f40347l, 4);
    

    /* renamed from: d */
    private final int f52185d;

    /* renamed from: e */
    private final StatusBadgeType f52186e;

    /* renamed from: f */
    private final int f52187f;

    private C18596a(int i, StatusBadgeType statusBadgeType, int i2) {
        this.f52185d = i;
        this.f52186e = statusBadgeType;
        this.f52187f = i2;
    }

    /* renamed from: b */
    public final int mo46440b() {
        return this.f52187f;
    }

    /* renamed from: c */
    public final int mo46441c() {
        return this.f52185d;
    }

    /* renamed from: e */
    public final StatusBadgeType mo46442e() {
        return this.f52186e;
    }
}
