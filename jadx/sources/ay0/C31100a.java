package ay0;

import he1.C41238w;
import java.util.Arrays;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p603si.C17799b;
import ue1.C43075l;

/* renamed from: ay0.a */
public final class C31100a implements C17799b {

    /* renamed from: d */
    private final C17799b f77301d;

    /* renamed from: e */
    private final C43075l f77302e;

    /* renamed from: f */
    private boolean f77303f;

    /* renamed from: ay0.a$a */
    static final class C31101a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C31101a f77304d = new C31101a();

        C31101a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo71300a(boolean z) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71300a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    public C31100a(C17799b bVar, C43075l lVar) {
        C41536l.m120489i(bVar, "validator");
        C41536l.m120489i(lVar, "onValidated");
        this.f77301d = bVar;
        this.f77302e = lVar;
    }

    /* renamed from: a */
    public final boolean mo71299a() {
        return this.f77303f;
    }

    /* renamed from: b */
    public String mo45383b() {
        return this.f77301d.mo45383b();
    }

    /* renamed from: c */
    public Object[] mo45384c() {
        return this.f77301d.mo45384c();
    }

    /* renamed from: g */
    public boolean mo45386g(String... strArr) {
        C41536l.m120489i(strArr, "inputs");
        boolean g = this.f77301d.mo45386g((String[]) Arrays.copyOf(strArr, strArr.length));
        this.f77303f = g;
        this.f77302e.invoke(Boolean.valueOf(g));
        return g;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31100a(C17799b bVar, C43075l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? C31101a.f77304d : lVar);
    }
}
