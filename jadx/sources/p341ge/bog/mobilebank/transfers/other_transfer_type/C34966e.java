package p341ge.bog.mobilebank.transfers.other_transfer_type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p891su.C28269e;

/* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.e */
public abstract class C34966e {

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.e$a */
    public static final class C34967a extends C34966e {

        /* renamed from: a */
        private final long f84413a;

        /* renamed from: b */
        private final String f84414b;

        /* renamed from: c */
        private final String f84415c;

        /* renamed from: d */
        private final String f84416d;

        /* renamed from: e */
        private final boolean f84417e;

        /* renamed from: f */
        private final C28269e f84418f;

        /* renamed from: g */
        private final boolean f84419g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34967a(long j, String str, String str2, String str3, boolean z, C28269e eVar, boolean z2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str2, "contactName");
            C41536l.m120489i(eVar, "contactType");
            this.f84413a = j;
            this.f84414b = str;
            this.f84415c = str2;
            this.f84416d = str3;
            this.f84417e = z;
            this.f84418f = eVar;
            this.f84419g = z2;
        }

        /* renamed from: a */
        public final String mo85497a() {
            return this.f84415c;
        }

        /* renamed from: b */
        public final C28269e mo85498b() {
            return this.f84418f;
        }

        /* renamed from: c */
        public final long mo85499c() {
            return this.f84413a;
        }

        /* renamed from: d */
        public final String mo85500d() {
            return this.f84416d;
        }

        /* renamed from: e */
        public final String mo85501e() {
            return this.f84414b;
        }

        /* renamed from: f */
        public final boolean mo85502f() {
            return this.f84419g;
        }

        /* renamed from: g */
        public final boolean mo85503g() {
            return this.f84417e;
        }
    }

    private C34966e() {
    }

    public /* synthetic */ C34966e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
