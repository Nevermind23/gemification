package ib1;

import ba1.C10220y;
import gb1.C32388r;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb1.C37123e;

/* renamed from: ib1.g */
public final class C36434g extends C32388r {

    /* renamed from: d */
    private final C36437h f87903d;

    /* renamed from: e */
    private final boolean f87904e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36434g(C36437h hVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i & 2) != 0 ? true : z);
    }

    /* renamed from: a */
    public void mo72874a() {
        this.f87903d.mo89257p().mo4823o(Boolean.valueOf(this.f87904e));
        this.f87903d.mo89245d().mo4823o(C37123e.m109725c(C10220y.onboarding_identify));
    }

    /* renamed from: b */
    public void mo72875b() {
        this.f87903d.mo89250i().mo4823o(C41238w.f97225a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36434g(C36437h hVar, boolean z) {
        super(hVar);
        C41536l.m120489i(hVar, "context");
        this.f87903d = hVar;
        this.f87904e = z;
    }
}
