package p383cn;

import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: cn.e */
public final class C10517e extends C10514b {

    /* renamed from: a */
    private C10516d f29855a = new C10516d(C10515c.CARD_DETAILS, 1, Utils.FLOAT_EPSILON);

    /* renamed from: b */
    private C10516d f29856b = new C10516d(C10515c.PICKUP_DETAILS, 2, Utils.FLOAT_EPSILON);

    /* renamed from: c */
    private C10516d f29857c = new C10516d(C10515c.SUMMARY, 3, Utils.FLOAT_EPSILON);

    /* renamed from: d */
    private C10516d f29858d = this.f29855a;

    /* renamed from: cn.e$a */
    public /* synthetic */ class C10518a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29859a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                cn.c[] r0 = p383cn.C10515c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cn.c r1 = p383cn.C10515c.CARD_DETAILS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                cn.c r1 = p383cn.C10515c.PICKUP_DETAILS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                cn.c r1 = p383cn.C10515c.SUMMARY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f29859a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p383cn.C10517e.C10518a.<clinit>():void");
        }
    }

    public C10517e() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public C10516d mo27230a() {
        return mo27245h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C10516d mo27231b() {
        int i = C10518a.f29859a[mo27245h().mo27239c().ordinal()];
        if (i == 1) {
            return this.f29856b;
        }
        if (i != 2) {
            return null;
        }
        return this.f29857c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C10516d mo27232c() {
        int i = C10518a.f29859a[mo27245h().mo27239c().ordinal()];
        if (i == 2) {
            return this.f29855a;
        }
        if (i != 3) {
            return null;
        }
        return this.f29856b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo27233f(C10516d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f29858d = dVar;
    }

    /* renamed from: g */
    public void mo27234g(float f) {
        C10516d dVar;
        int i = C10518a.f29859a[mo27245h().mo27239c().ordinal()];
        if (i == 1) {
            dVar = C10516d.m38098b(this.f29855a, (C10515c) null, 0, f, 3, (Object) null);
            this.f29855a = dVar;
        } else if (i != 2) {
            dVar = C10516d.m38098b(this.f29857c, (C10515c) null, 0, f, 3, (Object) null);
            this.f29857c = dVar;
        } else {
            dVar = C10516d.m38098b(this.f29856b, (C10515c) null, 0, f, 3, (Object) null);
            this.f29856b = dVar;
        }
        mo27233f(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C10516d mo27245h() {
        return this.f29858d;
    }
}
