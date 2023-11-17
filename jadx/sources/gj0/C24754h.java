package gj0;

import p190o1.C7397t;

/* renamed from: gj0.h */
public interface C24754h {

    /* renamed from: gj0.h$a */
    public static final class C24755a implements C24754h {

        /* renamed from: a */
        private final long f63640a;

        public C24755a(long j) {
            this.f63640a = j;
        }

        /* renamed from: a */
        public final long mo63139a() {
            return this.f63640a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24755a) && this.f63640a == ((C24755a) obj).f63640a;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f63640a);
        }

        public String toString() {
            long j = this.f63640a;
            return "OpenGiftCardDetails(cardId=" + j + ")";
        }
    }

    /* renamed from: gj0.h$b */
    public static final class C24756b implements C24754h {

        /* renamed from: a */
        private final long f63641a;

        public C24756b(long j) {
            this.f63641a = j;
        }

        /* renamed from: a */
        public final long mo63143a() {
            return this.f63641a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24756b) && this.f63641a == ((C24756b) obj).f63641a;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f63641a);
        }

        public String toString() {
            long j = this.f63641a;
            return "OpenGiftCardIntroduction(cardId=" + j + ")";
        }
    }
}
