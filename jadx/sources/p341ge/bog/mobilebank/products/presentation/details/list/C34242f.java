package p341ge.bog.mobilebank.products.presentation.details.list;

import hy0.C36274h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: ge.bog.mobilebank.products.presentation.details.list.f */
public abstract class C34242f {

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.f$a */
    public static final class C34243a extends C34242f {

        /* renamed from: a */
        private final String f83107a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34243a(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "label");
            this.f83107a = str;
        }

        /* renamed from: a */
        public final String mo82603a() {
            return this.f83107a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.f$c */
    public static final class C34245c extends C34242f {

        /* renamed from: a */
        private final long f83108a;

        /* renamed from: b */
        private final Object f83109b;

        public C34245c(long j, Object obj) {
            super((DefaultConstructorMarker) null);
            this.f83108a = j;
            this.f83109b = obj;
        }

        /* renamed from: a */
        public final Object mo82604a() {
            return this.f83109b;
        }

        /* renamed from: b */
        public final long mo82605b() {
            return this.f83108a;
        }
    }

    private C34242f() {
    }

    public /* synthetic */ C34242f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.f$b */
    public static final class C34244b extends C34246d {
        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C34244b(String str, StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? C34646b.m101750d(C36274h.total_amount_text, new Object[0]) : stringSource);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34244b(String str, StringSource stringSource) {
            super(str, stringSource);
            C41536l.m120489i(str, "totalAmount");
            C41536l.m120489i(stringSource, "title");
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.f$d */
    public static class C34246d extends C34242f {

        /* renamed from: a */
        private final String f83110a;

        /* renamed from: b */
        private final StringSource f83111b;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C34246d(String str, StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? C34646b.m101750d(C36274h.total_amount_text, new Object[0]) : stringSource);
        }

        /* renamed from: a */
        public final StringSource mo82606a() {
            return this.f83111b;
        }

        /* renamed from: b */
        public final String mo82607b() {
            return this.f83110a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34246d(String str, StringSource stringSource) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "totalAmount");
            C41536l.m120489i(stringSource, "title");
            this.f83110a = str;
            this.f83111b = stringSource;
        }
    }
}
