package ov0;

import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ov0.d */
public abstract class C37810d {

    /* renamed from: ov0.d$a */
    public static final class C37811a extends C37810d {

        /* renamed from: a */
        private final String f90751a;

        /* renamed from: b */
        private final String f90752b;

        /* renamed from: c */
        private final Double f90753c;

        /* renamed from: d */
        private final String f90754d;

        /* renamed from: e */
        private final Map f90755e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37811a(String str, String str2, Double d, String str3, Map map) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "id");
            C41536l.m120489i(str2, "name");
            C41536l.m120489i(str3, "currency");
            C41536l.m120489i(map, "currencyBadges");
            this.f90751a = str;
            this.f90752b = str2;
            this.f90753c = d;
            this.f90754d = str3;
            this.f90755e = map;
        }

        /* renamed from: a */
        public final Double mo91058a() {
            return this.f90753c;
        }

        /* renamed from: b */
        public final String mo91059b() {
            return this.f90754d;
        }

        /* renamed from: c */
        public final Map mo91060c() {
            return this.f90755e;
        }

        /* renamed from: d */
        public final String mo91061d() {
            return this.f90751a;
        }

        /* renamed from: e */
        public final String mo91062e() {
            return this.f90752b;
        }
    }

    /* renamed from: ov0.d$b */
    public static final class C37812b extends C37810d {

        /* renamed from: a */
        private final Integer f90756a;

        /* renamed from: b */
        private final String f90757b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37812b(Integer num, String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "totalAmount");
            this.f90756a = num;
            this.f90757b = str;
        }

        /* renamed from: a */
        public final Integer mo91063a() {
            return this.f90756a;
        }

        /* renamed from: b */
        public final String mo91064b() {
            return this.f90757b;
        }
    }

    private C37810d() {
    }

    public /* synthetic */ C37810d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
