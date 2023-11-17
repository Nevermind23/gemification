package p383cn;

import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: cn.a */
public final class C10512a extends C10514b {

    /* renamed from: a */
    private C10516d f29844a = new C10516d(C10515c.CARD_DETAILS, 1, Utils.FLOAT_EPSILON);

    /* renamed from: b */
    private C10516d f29845b = new C10516d(C10515c.SUMMARY, 2, Utils.FLOAT_EPSILON);

    /* renamed from: c */
    private C10516d f29846c = this.f29844a;

    /* renamed from: cn.a$a */
    public /* synthetic */ class C10513a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29847a;

        static {
            int[] iArr = new int[C10515c.values().length];
            try {
                iArr[C10515c.CARD_DETAILS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f29847a = iArr;
        }
    }

    public C10512a() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public C10516d mo27230a() {
        return mo27235h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C10516d mo27231b() {
        if (mo27235h().mo27239c() == C10515c.CARD_DETAILS) {
            return this.f29845b;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C10516d mo27232c() {
        if (mo27235h().mo27239c() == C10515c.SUMMARY) {
            return this.f29844a;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo27233f(C10516d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f29846c = dVar;
    }

    /* renamed from: g */
    public void mo27234g(float f) {
        C10516d dVar;
        if (C10513a.f29847a[mo27235h().mo27239c().ordinal()] == 1) {
            dVar = C10516d.m38098b(this.f29844a, (C10515c) null, 0, f, 3, (Object) null);
            this.f29844a = dVar;
        } else {
            dVar = C10516d.m38098b(this.f29845b, (C10515c) null, 0, f, 3, (Object) null);
            this.f29845b = dVar;
        }
        mo27233f(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C10516d mo27235h() {
        return this.f29846c;
    }
}
