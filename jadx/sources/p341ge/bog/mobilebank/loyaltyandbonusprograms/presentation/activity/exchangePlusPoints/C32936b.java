package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusViewModel$ViewModel;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.b */
public interface C32936b {

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.b$a */
    public static final class C32937a implements C32936b {

        /* renamed from: a */
        private final ExchangeMrPointsToPlusViewModel$ViewModel.C32924d f80809a;

        public C32937a(ExchangeMrPointsToPlusViewModel$ViewModel.C32924d dVar) {
            this.f80809a = dVar;
        }

        /* renamed from: a */
        public final ExchangeMrPointsToPlusViewModel$ViewModel.C32924d mo74816a() {
            return this.f80809a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.b$b */
    public static final class C32938b implements C32936b {

        /* renamed from: a */
        public static final C32938b f80810a = new C32938b();

        private C32938b() {
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.b$c */
    public static final class C32939c implements C32936b {

        /* renamed from: a */
        private final boolean f80811a;

        public C32939c(boolean z) {
            this.f80811a = z;
        }

        /* renamed from: a */
        public final boolean mo74817a() {
            return this.f80811a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C32939c) && this.f80811a == ((C32939c) obj).f80811a;
        }

        public int hashCode() {
            boolean z = this.f80811a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f80811a;
            return "ExchangeLoading(isLoading=" + z + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.b$e */
    public static final class C32941e implements C32936b {

        /* renamed from: a */
        public static final C32941e f80815a = new C32941e();

        private C32941e() {
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.b$f */
    public static final class C32942f implements C32936b {

        /* renamed from: a */
        public static final C32942f f80816a = new C32942f();

        private C32942f() {
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.b$g */
    public static final class C32943g implements C32936b {

        /* renamed from: a */
        private final String f80817a;

        public C32943g(String str) {
            C41536l.m120489i(str, "text");
            this.f80817a = str;
        }

        /* renamed from: a */
        public final String mo74827a() {
            return this.f80817a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C32943g) && C41536l.m120484d(this.f80817a, ((C32943g) obj).f80817a);
        }

        public int hashCode() {
            return this.f80817a.hashCode();
        }

        public String toString() {
            String str = this.f80817a;
            return "UserInputText(text=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.b$d */
    public static final class C32940d implements C32936b {

        /* renamed from: a */
        private final String f80812a;

        /* renamed from: b */
        private final String f80813b;

        /* renamed from: c */
        private final String f80814c;

        public C32940d(String str, String str2, String str3) {
            C41536l.m120489i(str, "pointsPlus");
            C41536l.m120489i(str2, "pointsPlusInGel");
            C41536l.m120489i(str3, "pointsMrInGel");
            this.f80812a = str;
            this.f80813b = str2;
            this.f80814c = str3;
        }

        /* renamed from: a */
        public final String mo74821a() {
            return this.f80814c;
        }

        /* renamed from: b */
        public final String mo74822b() {
            return this.f80812a;
        }

        /* renamed from: c */
        public final String mo74823c() {
            return this.f80813b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32940d)) {
                return false;
            }
            C32940d dVar = (C32940d) obj;
            return C41536l.m120484d(this.f80812a, dVar.f80812a) && C41536l.m120484d(this.f80813b, dVar.f80813b) && C41536l.m120484d(this.f80814c, dVar.f80814c);
        }

        public int hashCode() {
            return (((this.f80812a.hashCode() * 31) + this.f80813b.hashCode()) * 31) + this.f80814c.hashCode();
        }

        public String toString() {
            String str = this.f80812a;
            String str2 = this.f80813b;
            String str3 = this.f80814c;
            return "ExchangePointsData(pointsPlus=" + str + ", pointsPlusInGel=" + str2 + ", pointsMrInGel=" + str3 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C32940d(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "0.00" : str, (i & 2) != 0 ? "0.00" : str2, (i & 4) != 0 ? "0.00" : str3);
        }
    }
}
