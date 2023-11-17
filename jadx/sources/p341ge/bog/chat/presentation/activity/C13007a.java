package p341ge.bog.chat.presentation.activity;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p419fg.C12887l;
import p573qg.C17500c;

/* renamed from: ge.bog.chat.presentation.activity.a */
public final class C13007a implements C17500c {

    /* renamed from: a */
    private final C12887l f38363a;

    /* renamed from: b */
    private final String f38364b;

    public C13007a(C12887l lVar, String str) {
        C41536l.m120489i(lVar, "participantType");
        this.f38363a = lVar;
        this.f38364b = str;
    }

    /* renamed from: a */
    public String mo34234a() {
        return this.f38363a.name();
    }

    /* renamed from: b */
    public String mo34235b() {
        return "AVATAR";
    }

    /* renamed from: c */
    public final C12887l mo34236c() {
        return this.f38363a;
    }

    public String getName() {
        return this.f38364b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13007a(C12887l lVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i & 2) != 0 ? null : str);
    }
}
