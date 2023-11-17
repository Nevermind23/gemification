package oz0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import hd1.C41204a;
import he1.C41233s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.products.domain.model.BillInfo;
import ue1.C43075l;

/* renamed from: oz0.j */
public final class C37862j extends C21481a implements C37860h, C37861i {

    /* renamed from: d */
    private final BillInfo f90919d;

    /* renamed from: e */
    private final C37860h f90920e = this;

    /* renamed from: f */
    private final C37861i f90921f = this;

    /* renamed from: g */
    private final C1644x f90922g;

    /* renamed from: h */
    private final C1644x f90923h;

    /* renamed from: oz0.j$a */
    public interface C37863a {
        /* renamed from: a */
        C37862j mo32794a(BillInfo billInfo);
    }

    /* renamed from: oz0.j$b */
    public /* synthetic */ class C37864b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f90924a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                oz0.g[] r0 = oz0.C37859g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                oz0.g r1 = oz0.C37859g.MINIMUM     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                oz0.g r1 = oz0.C37859g.FULL_PAYMENT_DUE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                oz0.g r1 = oz0.C37859g.FULL_PAYMENT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f90924a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oz0.C37862j.C37864b.<clinit>():void");
        }
    }

    /* renamed from: oz0.j$c */
    static final class C37865c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C37865c f90925d = new C37865c();

        C37865c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo91212a(double d) {
            return Boolean.valueOf(d > Utils.DOUBLE_EPSILON);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo91212a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37862j(BillInfo billInfo) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(billInfo, "billInfo");
        this.f90919d = billInfo;
        C1644x xVar = new C1644x();
        this.f90922g = xVar;
        this.f90923h = new C1644x();
        Double valueOf = Double.valueOf(billInfo.mo81919l());
        Double valueOf2 = Double.valueOf(Utils.DOUBLE_EPSILON);
        xVar.mo4823o(new C37866k(!C32343x.m95488t0(valueOf, valueOf2), !C32343x.m95488t0(billInfo.mo81916i(), valueOf2)));
    }

    /* renamed from: dw */
    private final double m111332dw(Double d) {
        if (C32343x.m95491u0(d, C37865c.f90925d)) {
            return Utils.DOUBLE_EPSILON;
        }
        C41536l.m120486f(d);
        return Math.abs(d.doubleValue());
    }

    /* renamed from: Ap */
    public LiveData mo91208Ap() {
        return this.f90922g;
    }

    /* renamed from: Ho */
    public LiveData mo91209Ho() {
        return this.f90923h;
    }

    /* renamed from: ew */
    public final C37860h mo91210ew() {
        return this.f90920e;
    }

    /* renamed from: fw */
    public final C37861i mo91211fw() {
        return this.f90921f;
    }

    /* renamed from: gc */
    public void mo91207gc(C37859g gVar) {
        String str;
        C41536l.m120489i(gVar, "type");
        C1644x xVar = this.f90923h;
        Long valueOf = Long.valueOf(this.f90919d.mo81906a());
        int i = C37864b.f90924a[gVar.ordinal()];
        if (i == 1) {
            str = String.valueOf(this.f90919d.mo81919l());
        } else if (i == 2) {
            str = String.valueOf(this.f90919d.mo81916i());
        } else if (i == 3) {
            str = String.valueOf(m111332dw(this.f90919d.mo81914h()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C37224b.m109965d(xVar, C41233s.m119492a(valueOf, str));
    }
}
