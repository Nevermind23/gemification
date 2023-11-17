package p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.b */
public abstract class C33326b {

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.b$a */
    public static final class C33327a extends C33326b {

        /* renamed from: a */
        private final String f81451a;

        /* renamed from: b */
        private final String f81452b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33327a(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "iban");
            this.f81451a = str;
            this.f81452b = str2;
        }

        /* renamed from: a */
        public final String mo79135a() {
            return this.f81452b;
        }

        /* renamed from: b */
        public final String mo79136b() {
            return this.f81451a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C33327a)) {
                return false;
            }
            C33327a aVar = (C33327a) obj;
            return C41536l.m120484d(this.f81451a, aVar.f81451a) && C41536l.m120484d(this.f81452b, aVar.f81452b);
        }

        public int hashCode() {
            int hashCode = this.f81451a.hashCode() * 31;
            String str = this.f81452b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f81451a;
            String str2 = this.f81452b;
            return "Account(iban=" + str + ", amount=" + str2 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.b$b */
    public static final class C33328b extends C33326b {

        /* renamed from: a */
        public static final C33328b f81453a = new C33328b();

        private C33328b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.b$c */
    public static final class C33329c extends C33326b {

        /* renamed from: a */
        private final String f81454a;

        /* renamed from: b */
        private final int f81455b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33329c(String str, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "bankName");
            this.f81454a = str;
            this.f81455b = i;
        }

        /* renamed from: a */
        public final String mo79140a() {
            return this.f81454a;
        }

        /* renamed from: b */
        public final int mo79141b() {
            return this.f81455b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C33329c)) {
                return false;
            }
            C33329c cVar = (C33329c) obj;
            return C41536l.m120484d(this.f81454a, cVar.f81454a) && this.f81455b == cVar.f81455b;
        }

        public int hashCode() {
            return (this.f81454a.hashCode() * 31) + this.f81455b;
        }

        public String toString() {
            String str = this.f81454a;
            int i = this.f81455b;
            return "Header(bankName=" + str + ", drawableId=" + i + ")";
        }
    }

    private C33326b() {
    }

    public /* synthetic */ C33326b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
