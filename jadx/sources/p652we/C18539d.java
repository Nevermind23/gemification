package p652we;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: we.d */
public abstract class C18539d {

    /* renamed from: we.d$a */
    public static final class C18540a extends C18539d {

        /* renamed from: a */
        private final byte[] f52033a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18540a(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(bArr, C11755a.C11756a.f34100b);
            this.f52033a = bArr;
        }

        /* renamed from: a */
        public final byte[] mo46351a() {
            return this.f52033a;
        }
    }

    /* renamed from: we.d$b */
    public static final class C18541b extends C18539d {

        /* renamed from: a */
        private final String f52034a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18541b(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(str, C11755a.C11756a.f34100b);
            this.f52034a = str;
        }

        /* renamed from: a */
        public final String mo46352a() {
            return this.f52034a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C18541b) && C41536l.m120484d(this.f52034a, ((C18541b) obj).f52034a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.f52034a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Text(value=" + this.f52034a + ")";
        }
    }

    private C18539d() {
    }

    public /* synthetic */ C18539d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
