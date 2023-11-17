package p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes;

import android.os.Parcel;
import android.os.Parcelable;
import g90.C20784f;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType */
public abstract class IncomeType implements Parcelable {

    /* renamed from: d */
    public static final C22675a f59832d = new C22675a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$Bonus */
    public static final class Bonus extends IncomeType {
        public static final Parcelable.Creator<Bonus> CREATOR = new C22669a();

        /* renamed from: e */
        public static final Bonus f59833e = new Bonus();

        /* renamed from: f */
        private static final List f59834f;

        /* renamed from: g */
        private static final List f59835g;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$Bonus$a */
        public static final class C22669a implements Parcelable.Creator {
            /* renamed from: a */
            public final Bonus createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Bonus.f59833e;
            }

            /* renamed from: b */
            public final Bonus[] newArray(int i) {
                return new Bonus[i];
            }
        }

        static {
            C20784f fVar = C20784f.INCOME;
            f59834f = C41341q.m119910m(fVar, C20784f.ORGANIZATION);
            f59835g = C41339p.m119900e(fVar);
        }

        private Bonus() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public List mo56113a() {
            return f59834f;
        }

        /* renamed from: b */
        public String mo56114b() {
            return "bonus";
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$Dividend */
    public static final class Dividend extends IncomeType {
        public static final Parcelable.Creator<Dividend> CREATOR = new C22670a();

        /* renamed from: e */
        public static final Dividend f59836e = new Dividend();

        /* renamed from: f */
        private static final List f59837f;

        /* renamed from: g */
        private static final List f59838g;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$Dividend$a */
        public static final class C22670a implements Parcelable.Creator {
            /* renamed from: a */
            public final Dividend createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Dividend.f59836e;
            }

            /* renamed from: b */
            public final Dividend[] newArray(int i) {
                return new Dividend[i];
            }
        }

        static {
            C20784f fVar = C20784f.INCOME;
            f59837f = C41341q.m119910m(fVar, C20784f.ORGANIZATION);
            f59838g = C41339p.m119900e(fVar);
        }

        private Dividend() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public List mo56113a() {
            return f59837f;
        }

        /* renamed from: b */
        public String mo56121b() {
            return "dividend";
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$MoneyTransfer */
    public static final class MoneyTransfer extends IncomeType {
        public static final Parcelable.Creator<MoneyTransfer> CREATOR = new C22671a();

        /* renamed from: e */
        public static final MoneyTransfer f59839e = new MoneyTransfer();

        /* renamed from: f */
        private static final List f59840f;

        /* renamed from: g */
        private static final List f59841g;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$MoneyTransfer$a */
        public static final class C22671a implements Parcelable.Creator {
            /* renamed from: a */
            public final MoneyTransfer createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return MoneyTransfer.f59839e;
            }

            /* renamed from: b */
            public final MoneyTransfer[] newArray(int i) {
                return new MoneyTransfer[i];
            }
        }

        static {
            C20784f fVar = C20784f.INCOME;
            f59840f = C41341q.m119910m(fVar, C20784f.COUNTRY);
            f59841g = C41339p.m119900e(fVar);
        }

        private MoneyTransfer() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public List mo56113a() {
            return f59840f;
        }

        /* renamed from: b */
        public String mo56128b() {
            return "mtransfer";
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$Other */
    public static final class Other extends IncomeType {
        public static final Parcelable.Creator<Other> CREATOR = new C22672a();

        /* renamed from: e */
        public static final Other f59842e = new Other();

        /* renamed from: f */
        private static final List f59843f;

        /* renamed from: g */
        private static final List f59844g;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$Other$a */
        public static final class C22672a implements Parcelable.Creator {
            /* renamed from: a */
            public final Other createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Other.f59842e;
            }

            /* renamed from: b */
            public final Other[] newArray(int i) {
                return new Other[i];
            }
        }

        static {
            C20784f fVar = C20784f.INCOME;
            f59843f = C41341q.m119910m(fVar, C20784f.JOB_POSITION);
            f59844g = C41339p.m119900e(fVar);
        }

        private Other() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public List mo56113a() {
            return f59843f;
        }

        /* renamed from: b */
        public String mo56135b() {
            return "other";
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$Rent */
    public static final class Rent extends IncomeType {
        public static final Parcelable.Creator<Rent> CREATOR = new C22673a();

        /* renamed from: e */
        public static final Rent f59845e = new Rent();

        /* renamed from: f */
        private static final List f59846f;

        /* renamed from: g */
        private static final List f59847g;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$Rent$a */
        public static final class C22673a implements Parcelable.Creator {
            /* renamed from: a */
            public final Rent createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Rent.f59845e;
            }

            /* renamed from: b */
            public final Rent[] newArray(int i) {
                return new Rent[i];
            }
        }

        static {
            C20784f fVar = C20784f.INCOME;
            f59846f = C41339p.m119900e(fVar);
            f59847g = C41339p.m119900e(fVar);
        }

        private Rent() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public List mo56113a() {
            return f59846f;
        }

        /* renamed from: b */
        public String mo56142b() {
            return "rent";
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$Salary */
    public static final class Salary extends IncomeType {
        public static final Parcelable.Creator<Salary> CREATOR = new C22674a();

        /* renamed from: e */
        public static final Salary f59848e = new Salary();

        /* renamed from: f */
        private static final List f59849f;

        /* renamed from: g */
        private static final List f59850g;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$Salary$a */
        public static final class C22674a implements Parcelable.Creator {
            /* renamed from: a */
            public final Salary createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Salary.f59848e;
            }

            /* renamed from: b */
            public final Salary[] newArray(int i) {
                return new Salary[i];
            }
        }

        static {
            C20784f fVar = C20784f.INCOME;
            f59849f = C41341q.m119910m(fVar, C20784f.ORGANIZATION);
            f59850g = C41339p.m119900e(fVar);
        }

        private Salary() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public List mo56113a() {
            return f59849f;
        }

        /* renamed from: b */
        public String mo56149b() {
            return "salary";
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType$a */
    public static final class C22675a {
        private C22675a() {
        }

        public /* synthetic */ C22675a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final IncomeType mo56156a(String str) {
            Salary salary = Salary.f59848e;
            if (C41536l.m120484d(str, salary.mo56149b())) {
                return salary;
            }
            Bonus bonus = Bonus.f59833e;
            if (C41536l.m120484d(str, bonus.mo56114b())) {
                return bonus;
            }
            Rent rent = Rent.f59845e;
            if (C41536l.m120484d(str, rent.mo56142b())) {
                return rent;
            }
            Dividend dividend = Dividend.f59836e;
            if (C41536l.m120484d(str, dividend.mo56121b())) {
                return dividend;
            }
            MoneyTransfer moneyTransfer = MoneyTransfer.f59839e;
            if (C41536l.m120484d(str, moneyTransfer.mo56128b())) {
                return moneyTransfer;
            }
            Other other = Other.f59842e;
            if (C41536l.m120484d(str, other.mo56135b())) {
                return other;
            }
            return null;
        }
    }

    private IncomeType() {
    }

    public /* synthetic */ IncomeType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract List mo56113a();
}
