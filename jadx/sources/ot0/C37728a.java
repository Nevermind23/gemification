package ot0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: ot0.a */
public abstract class C37728a {

    /* renamed from: a */
    private final long f90639a;

    /* renamed from: ot0.a$a */
    public static final class C37729a extends C37728a {

        /* renamed from: b */
        private final long f90640b;

        public C37729a(long j) {
            super(j, (DefaultConstructorMarker) null);
            this.f90640b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37729a) && this.f90640b == ((C37729a) obj).f90640b;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f90640b);
        }

        public String toString() {
            long j = this.f90640b;
            return "FromCasService(casServiceId=" + j + ")";
        }
    }

    /* renamed from: ot0.a$b */
    public static final class C37730b extends C37728a {

        /* renamed from: b */
        private final long f90641b;

        public C37730b(long j) {
            super(j, (DefaultConstructorMarker) null);
            this.f90641b = j;
        }

        /* renamed from: b */
        public final long mo90991b() {
            return this.f90641b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37730b) && this.f90641b == ((C37730b) obj).f90641b;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f90641b);
        }

        public String toString() {
            long j = this.f90641b;
            return "FromDepositAcctKey(depositAgreeKey=" + j + ")";
        }
    }

    public /* synthetic */ C37728a(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: a */
    public final long mo90987a() {
        return this.f90639a;
    }

    private C37728a(long j) {
        this.f90639a = j;
    }
}
