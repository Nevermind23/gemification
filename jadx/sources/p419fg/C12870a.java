package p419fg;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fg.a */
public abstract class C12870a {

    /* renamed from: a */
    private final String f38016a;

    /* renamed from: b */
    private final Long f38017b;

    /* renamed from: c */
    private final String f38018c;

    /* renamed from: fg.a$a */
    public static final class C12871a extends C12870a {

        /* renamed from: d */
        private final byte[] f38019d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12871a(byte[] bArr, String str, Long l, String str2) {
            super(str, l, str2, (DefaultConstructorMarker) null);
            C41536l.m120489i(bArr, "content");
            this.f38019d = bArr;
        }

        /* renamed from: d */
        public final byte[] mo33557d() {
            return this.f38019d;
        }
    }

    /* renamed from: fg.a$b */
    public static final class C12872b extends C12870a {

        /* renamed from: d */
        private final String f38020d;

        public C12872b(String str, String str2, Long l, String str3) {
            super(str2, l, str3, (DefaultConstructorMarker) null);
            this.f38020d = str;
        }

        /* renamed from: d */
        public final String mo33558d() {
            return this.f38020d;
        }
    }

    public /* synthetic */ C12870a(String str, Long l, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, str2);
    }

    /* renamed from: a */
    public final String mo33554a() {
        return this.f38018c;
    }

    /* renamed from: b */
    public final String mo33555b() {
        return this.f38016a;
    }

    /* renamed from: c */
    public final Long mo33556c() {
        return this.f38017b;
    }

    private C12870a(String str, Long l, String str2) {
        this.f38016a = str;
        this.f38017b = l;
        this.f38018c = str2;
    }
}
