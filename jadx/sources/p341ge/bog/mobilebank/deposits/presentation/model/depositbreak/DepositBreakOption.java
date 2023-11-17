package p341ge.bog.mobilebank.deposits.presentation.model.depositbreak;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import rb0.C27982a;
import rb0.C27983b;
import rb0.C27984c;

/* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption */
public abstract class DepositBreakOption implements Parcelable {

    /* renamed from: d */
    private final StringSource f60811d;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption$BreakDeposit */
    public static final class BreakDeposit extends DepositBreakActionOption {
        public static final Parcelable.Creator<BreakDeposit> CREATOR = new C23230a();

        /* renamed from: j */
        public static final BreakDeposit f60812j = new BreakDeposit();

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption$BreakDeposit$a */
        public static final class C23230a implements Parcelable.Creator {
            /* renamed from: a */
            public final BreakDeposit createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return BreakDeposit.f60812j;
            }

            /* renamed from: b */
            public final BreakDeposit[] newArray(int i) {
                return new BreakDeposit[i];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private BreakDeposit() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "deposits.break.actionsheet.break"
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r3 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                int r4 = rb0.C27984c.f71247x
                ge.bog.designsystem.components.common.Color$Resource r5 = new ge.bog.designsystem.components.common.Color$Resource
                int r0 = rb0.C27983b.f71223e
                r5.<init>(r0)
                ge.bog.designsystem.components.common.Color$Resource r6 = new ge.bog.designsystem.components.common.Color$Resource
                int r1 = rb0.C27983b.f71225g
                r6.<init>(r1)
                ge.bog.designsystem.components.common.Color$Resource r7 = new ge.bog.designsystem.components.common.Color$Resource
                r7.<init>(r0)
                r8 = 0
                r2 = r9
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption.BreakDeposit.<init>():void");
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption$CashCoverLoan */
    public static final class CashCoverLoan extends DepositBreakActionOption {
        public static final Parcelable.Creator<CashCoverLoan> CREATOR = new C23231a();

        /* renamed from: j */
        public static final CashCoverLoan f60813j = new CashCoverLoan();

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption$CashCoverLoan$a */
        public static final class C23231a implements Parcelable.Creator {
            /* renamed from: a */
            public final CashCoverLoan createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return CashCoverLoan.f60813j;
            }

            /* renamed from: b */
            public final CashCoverLoan[] newArray(int i) {
                return new CashCoverLoan[i];
            }
        }

        private CashCoverLoan() {
            super(C34646b.m101748b("deposits.break.actionsheet.dep.loan", new Object[0]), C27984c.f71244t, new Color.Attribute(C27982a.f71216a), new Color.Attribute(C27982a.f71217b), (Color) null, 16, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption$DepositBreakActionOption */
    public static abstract class DepositBreakActionOption extends DepositBreakOption {

        /* renamed from: e */
        private final StringSource f60814e;

        /* renamed from: f */
        private final int f60815f;

        /* renamed from: g */
        private final Color f60816g;

        /* renamed from: h */
        private final Color f60817h;

        /* renamed from: i */
        private final Color f60818i;

        public /* synthetic */ DepositBreakActionOption(StringSource stringSource, int i, Color color, Color color2, Color color3, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, color, color2, color3);
        }

        /* renamed from: a */
        public StringSource mo58087a() {
            return this.f60814e;
        }

        /* renamed from: b */
        public final Color mo58100b() {
            return this.f60817h;
        }

        /* renamed from: d */
        public final int mo58101d() {
            return this.f60815f;
        }

        /* renamed from: e */
        public final Color mo58102e() {
            return this.f60816g;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DepositBreakActionOption(StringSource stringSource, int i, Color color, Color color2, Color color3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, color, color2, (i2 & 16) != 0 ? new Color.Resource(C27983b.f71219a) : color3, (DefaultConstructorMarker) null);
        }

        private DepositBreakActionOption(StringSource stringSource, int i, Color color, Color color2, Color color3) {
            super(stringSource, (DefaultConstructorMarker) null);
            this.f60814e = stringSource;
            this.f60815f = i;
            this.f60816g = color;
            this.f60817h = color2;
            this.f60818i = color3;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption$NoOptions */
    public static final class NoOptions extends DepositBreakOption {
        public static final Parcelable.Creator<NoOptions> CREATOR = new C23232a();

        /* renamed from: e */
        public static final NoOptions f60819e = new NoOptions();

        /* renamed from: ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption$NoOptions$a */
        public static final class C23232a implements Parcelable.Creator {
            /* renamed from: a */
            public final NoOptions createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return NoOptions.f60819e;
            }

            /* renamed from: b */
            public final NoOptions[] newArray(int i) {
                return new NoOptions[i];
            }
        }

        private NoOptions() {
            super(C34646b.m101748b("deposits.break.actionsheet.ok", new Object[0]), (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ DepositBreakOption(StringSource stringSource, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringSource);
    }

    /* renamed from: a */
    public StringSource mo58087a() {
        return this.f60811d;
    }

    private DepositBreakOption(StringSource stringSource) {
        this.f60811d = stringSource;
    }
}
