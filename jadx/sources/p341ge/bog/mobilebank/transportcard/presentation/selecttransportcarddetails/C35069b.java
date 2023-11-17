package p341ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.mobilebank.transportcard.domain.interactor.PurchasePassUseCase;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.b */
public abstract class C35069b {

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.b$a */
    public static final class C35070a extends C35069b {

        /* renamed from: a */
        private final String f84590a;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C35070a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35070a) && C41536l.m120484d(this.f84590a, ((C35070a) obj).f84590a);
        }

        public int hashCode() {
            return this.f84590a.hashCode();
        }

        public String toString() {
            String str = this.f84590a;
            return "Error(error=" + str + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35070a(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "error");
            this.f84590a = str;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.b$b */
    public static final class C35071b extends C35069b {

        /* renamed from: a */
        public static final C35071b f84591a = new C35071b();

        private C35071b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.b$c */
    public static final class C35072c extends C35069b {

        /* renamed from: a */
        private final String f84592a;

        /* renamed from: b */
        private final String f84593b;

        /* renamed from: c */
        private final CreditCardView.C13270b f84594c;

        /* renamed from: d */
        private final String f84595d;

        /* renamed from: e */
        private final boolean f84596e;

        /* renamed from: f */
        private final CreditCardSmallPickerView.C13279b f84597f;

        /* renamed from: g */
        private final boolean f84598g;

        /* renamed from: h */
        private final PurchasePassUseCase.Param f84599h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35072c(String str, String str2, CreditCardView.C13270b bVar, String str3, boolean z, CreditCardSmallPickerView.C13279b bVar2, boolean z2, PurchasePassUseCase.Param param) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "passTypeName");
            C41536l.m120489i(str2, "passTypePrice");
            C41536l.m120489i(param, "params");
            this.f84592a = str;
            this.f84593b = str2;
            this.f84594c = bVar;
            this.f84595d = str3;
            this.f84596e = z;
            this.f84597f = bVar2;
            this.f84598g = z2;
            this.f84599h = param;
        }

        /* renamed from: a */
        public final CreditCardView.C13270b mo85940a() {
            return this.f84594c;
        }

        /* renamed from: b */
        public final PurchasePassUseCase.Param mo85941b() {
            return this.f84599h;
        }

        /* renamed from: c */
        public final String mo85942c() {
            return this.f84595d;
        }

        /* renamed from: d */
        public final boolean mo85943d() {
            return this.f84598g;
        }

        /* renamed from: e */
        public final String mo85944e() {
            return this.f84592a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35072c)) {
                return false;
            }
            C35072c cVar = (C35072c) obj;
            return C41536l.m120484d(this.f84592a, cVar.f84592a) && C41536l.m120484d(this.f84593b, cVar.f84593b) && C41536l.m120484d(this.f84594c, cVar.f84594c) && C41536l.m120484d(this.f84595d, cVar.f84595d) && this.f84596e == cVar.f84596e && C41536l.m120484d(this.f84597f, cVar.f84597f) && this.f84598g == cVar.f84598g && C41536l.m120484d(this.f84599h, cVar.f84599h);
        }

        /* renamed from: f */
        public final String mo85946f() {
            return this.f84593b;
        }

        /* renamed from: g */
        public final CreditCardSmallPickerView.C13279b mo85947g() {
            return this.f84597f;
        }

        /* renamed from: h */
        public final boolean mo85948h() {
            return this.f84596e;
        }

        public int hashCode() {
            int hashCode = ((this.f84592a.hashCode() * 31) + this.f84593b.hashCode()) * 31;
            CreditCardView.C13270b bVar = this.f84594c;
            int i = 0;
            int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.f84595d;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.f84596e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
            CreditCardSmallPickerView.C13279b bVar2 = this.f84597f;
            if (bVar2 != null) {
                i = bVar2.hashCode();
            }
            int i3 = (i2 + i) * 31;
            boolean z3 = this.f84598g;
            if (!z3) {
                z2 = z3;
            }
            return ((i3 + (z2 ? 1 : 0)) * 31) + this.f84599h.hashCode();
        }

        public String toString() {
            String str = this.f84592a;
            String str2 = this.f84593b;
            CreditCardView.C13270b bVar = this.f84594c;
            String str3 = this.f84595d;
            boolean z = this.f84596e;
            CreditCardSmallPickerView.C13279b bVar2 = this.f84597f;
            boolean z2 = this.f84598g;
            PurchasePassUseCase.Param param = this.f84599h;
            return "Success(passTypeName=" + str + ", passTypePrice=" + str2 + ", bindCard=" + bVar + ", passDevice=" + str3 + ", isPassDevicePlasticCard=" + z + ", paymentCard=" + bVar2 + ", passDeviceVisible=" + z2 + ", params=" + param + ")";
        }
    }

    private C35069b() {
    }

    public /* synthetic */ C35069b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
