package p31;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p31.a */
public abstract class C37896a {

    /* renamed from: a */
    private final Object f90966a;

    /* renamed from: b */
    private final boolean f90967b;

    /* renamed from: c */
    private final boolean f90968c;

    public C37896a(Object obj, boolean z, boolean z2) {
        this.f90966a = obj;
        this.f90967b = z;
        this.f90968c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37896a(Object obj, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
    }
}
