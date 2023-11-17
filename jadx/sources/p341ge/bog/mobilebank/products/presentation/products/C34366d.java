package p341ge.bog.mobilebank.products.presentation.products;

import hy0.C36270d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.productcards.AccountCardView;
import p341ge.bog.designsystem.components.productcards.CreditCardView;
import q70.C27685a;

/* renamed from: ge.bog.mobilebank.products.presentation.products.d */
public abstract class C34366d {

    /* renamed from: a */
    private final C27685a f83316a;

    /* renamed from: b */
    private int f83317b;

    /* renamed from: ge.bog.mobilebank.products.presentation.products.d$a */
    public static final class C34367a extends C34366d {

        /* renamed from: c */
        private final long f83318c;

        /* renamed from: d */
        private final AccountCardView.C13445a f83319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34367a(long j, AccountCardView.C13445a aVar, C27685a aVar2, int i) {
            super(i, aVar2, (DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "product");
            C41536l.m120489i(aVar2, "type");
            this.f83318c = j;
            this.f83319d = aVar;
        }

        /* renamed from: d */
        public final long mo82747d() {
            return this.f83318c;
        }

        /* renamed from: e */
        public final AccountCardView.C13445a mo82748e() {
            return this.f83319d;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.d$b */
    public static final class C34368b extends C34366d {

        /* renamed from: c */
        public static final C34368b f83320c = new C34368b();

        private C34368b() {
            super(2, (C27685a) null, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.d$c */
    public static final class C34369c extends C34366d {

        /* renamed from: c */
        private final long f83321c;

        /* renamed from: d */
        private final CreditCardView.C13448a f83322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34369c(long j, CreditCardView.C13448a aVar, C27685a aVar2, int i) {
            super(i, aVar2, (DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "product");
            C41536l.m120489i(aVar2, "type");
            this.f83321c = j;
            this.f83322d = aVar;
        }

        /* renamed from: d */
        public final long mo82749d() {
            return this.f83321c;
        }

        /* renamed from: e */
        public final CreditCardView.C13448a mo82750e() {
            return this.f83322d;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.d$d */
    public static final class C34370d extends C34366d {

        /* renamed from: c */
        private final Object f83323c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34370d(C27685a aVar, Object obj) {
            super(2, aVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "type");
            this.f83323c = obj;
        }

        /* renamed from: d */
        public final Object mo82751d() {
            return this.f83323c;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.d$e */
    public static final class C34371e extends C34366d {

        /* renamed from: c */
        private final Long f83324c;

        /* renamed from: d */
        private final String f83325d;

        /* renamed from: e */
        private Amount f83326e;

        /* renamed from: f */
        private Integer f83327f;

        /* renamed from: g */
        private boolean f83328g;

        /* renamed from: h */
        private String f83329h;

        /* renamed from: i */
        private Integer f83330i;

        /* renamed from: j */
        private Integer f83331j;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C34371e(java.lang.Long r15, java.lang.String r16, p341ge.bog.designsystem.components.Amount r17, java.lang.Integer r18, q70.C27685a r19, boolean r20, java.lang.String r21, java.lang.Integer r22, java.lang.Integer r23, int r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
            /*
                r14 = this;
                r0 = r25
                r1 = r0 & 64
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r10 = r2
                goto L_0x000b
            L_0x0009:
                r10 = r21
            L_0x000b:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0011
                r11 = r2
                goto L_0x0013
            L_0x0011:
                r11 = r22
            L_0x0013:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0019
                r12 = r2
                goto L_0x001b
            L_0x0019:
                r12 = r23
            L_0x001b:
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r8 = r19
                r9 = r20
                r13 = r24
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.products.C34366d.C34371e.<init>(java.lang.Long, java.lang.String, ge.bog.designsystem.components.Amount, java.lang.Integer, q70.a, boolean, java.lang.String, java.lang.Integer, java.lang.Integer, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: d */
        public final Long mo82752d() {
            return this.f83324c;
        }

        /* renamed from: e */
        public final boolean mo82753e() {
            return this.f83328g;
        }

        /* renamed from: f */
        public final Integer mo82754f() {
            return this.f83327f;
        }

        /* renamed from: g */
        public final Integer mo82755g() {
            return this.f83330i;
        }

        /* renamed from: h */
        public final String mo82756h() {
            return this.f83329h;
        }

        /* renamed from: i */
        public final Integer mo82757i() {
            return this.f83331j;
        }

        /* renamed from: j */
        public final String mo82758j() {
            return this.f83325d;
        }

        /* renamed from: k */
        public final Amount mo82759k() {
            return this.f83326e;
        }

        /* renamed from: l */
        public final void mo82760l(Integer num) {
            this.f83327f = num;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34371e(Long l, String str, Amount amount, Integer num, C27685a aVar, boolean z, String str2, Integer num2, Integer num3, int i) {
            super(i, aVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "name");
            C41536l.m120489i(aVar, "type");
            this.f83324c = l;
            this.f83325d = str;
            this.f83326e = amount;
            this.f83327f = num;
            this.f83328g = z;
            this.f83329h = str2;
            this.f83330i = num2;
            this.f83331j = num3;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.d$f */
    public static final class C34372f extends C34366d {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34372f(C27685a aVar) {
            super(2, aVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "type");
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.d$g */
    public static final class C34373g extends C34366d {

        /* renamed from: c */
        public static final C34373g f83332c = new C34373g();

        private C34373g() {
            super(2, (C27685a) null, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.d$h */
    public static final class C34374h extends C34366d {

        /* renamed from: c */
        public static final C34374h f83333c = new C34374h();

        private C34374h() {
            super(2, (C27685a) null, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.d$i */
    public static final class C34375i extends C34366d {

        /* renamed from: c */
        public static final C34375i f83334c = new C34375i();

        private C34375i() {
            super(2, (C27685a) null, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.d$j */
    public /* synthetic */ class C34376j {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83335a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                q70.a[] r0 = q70.C27685a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                q70.a r1 = q70.C27685a.ACC_TYPE_ACCOUNT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                q70.a r1 = q70.C27685a.ACC_TYPE_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                q70.a r1 = q70.C27685a.ACC_TYPE_DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                q70.a r1 = q70.C27685a.ACC_TYPE_LOAN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                q70.a r1 = q70.C27685a.ACC_TYPE_GT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                q70.a r1 = q70.C27685a.ACC_TYPE_PENSION     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                q70.a r1 = q70.C27685a.TYPE_GTP_TRADING     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f83335a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.products.C34366d.C34376j.<clinit>():void");
        }
    }

    public /* synthetic */ C34366d(int i, C27685a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, aVar);
    }

    /* renamed from: a */
    public final int mo82744a() {
        return this.f83317b;
    }

    /* renamed from: b */
    public final C27685a mo82745b() {
        return this.f83316a;
    }

    /* renamed from: c */
    public final void mo82746c(int i) {
        int i2;
        Integer num;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.f83317b = i;
        if (this instanceof C34371e) {
            C34371e eVar = (C34371e) this;
            C27685a aVar = this.f83316a;
            if (aVar == null) {
                i2 = -1;
            } else {
                i2 = C34376j.f83335a[aVar.ordinal()];
            }
            switch (i2) {
                case 1:
                    if (this.f83317b == 2) {
                        i3 = C36270d.product_group_wide_account;
                    } else {
                        i3 = C36270d.product_group_square_account;
                    }
                    num = Integer.valueOf(i3);
                    break;
                case 2:
                    if (this.f83317b == 2) {
                        i4 = C36270d.product_group_wide_credit_card;
                    } else {
                        i4 = C36270d.product_group_square_credit_card;
                    }
                    num = Integer.valueOf(i4);
                    break;
                case 3:
                    if (this.f83317b == 2) {
                        i5 = C36270d.product_group_wide_deposit;
                    } else {
                        i5 = C36270d.product_group_square_deposit;
                    }
                    num = Integer.valueOf(i5);
                    break;
                case 4:
                    if (this.f83317b == 2) {
                        i6 = C36270d.product_group_wide_loan;
                    } else {
                        i6 = C36270d.product_group_square_loan;
                    }
                    num = Integer.valueOf(i6);
                    break;
                case 5:
                    if (this.f83317b == 2) {
                        i7 = C36270d.product_group_wide_galt;
                    } else {
                        i7 = C36270d.product_group_square_galt;
                    }
                    num = Integer.valueOf(i7);
                    break;
                case 6:
                    if (this.f83317b == 2) {
                        i8 = C36270d.product_group_wide_pension;
                    } else {
                        i8 = C36270d.product_group_square_pension;
                    }
                    num = Integer.valueOf(i8);
                    break;
                case 7:
                    if (this.f83317b == 2) {
                        i9 = C36270d.product_group_wide_galt;
                    } else {
                        i9 = C36270d.product_group_square_galt;
                    }
                    num = Integer.valueOf(i9);
                    break;
                default:
                    num = null;
                    break;
            }
            eVar.mo82760l(num);
        }
    }

    private C34366d(int i, C27685a aVar) {
        this.f83316a = aVar;
        this.f83317b = i;
    }
}
