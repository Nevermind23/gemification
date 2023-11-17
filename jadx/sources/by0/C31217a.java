package by0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: by0.a */
public abstract class C31217a {

    /* renamed from: by0.a$a */
    public static final class C31218a extends C31217a {

        /* renamed from: a */
        private final int f77583a;

        public C31218a(int i) {
            super((DefaultConstructorMarker) null);
            this.f77583a = i;
        }

        /* renamed from: a */
        public final int mo71466a() {
            return this.f77583a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31218a) && this.f77583a == ((C31218a) obj).f77583a;
        }

        public int hashCode() {
            return this.f77583a;
        }

        public String toString() {
            int i = this.f77583a;
            return "ChipSelectedEvent(pos=" + i + ")";
        }
    }

    /* renamed from: by0.a$b */
    public static final class C31219b extends C31217a {

        /* renamed from: a */
        private final String f77584a;

        public C31219b(String str) {
            super((DefaultConstructorMarker) null);
            this.f77584a = str;
        }

        /* renamed from: a */
        public final String mo71470a() {
            return this.f77584a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31219b) && C41536l.m120484d(this.f77584a, ((C31219b) obj).f77584a);
        }

        public int hashCode() {
            String str = this.f77584a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f77584a;
            return "ContactSelectedEvent(value=" + str + ")";
        }
    }

    /* renamed from: by0.a$c */
    public static final class C31220c extends C31217a {

        /* renamed from: a */
        private final String f77585a;

        public C31220c(String str) {
            super((DefaultConstructorMarker) null);
            this.f77585a = str;
        }

        /* renamed from: a */
        public final String mo71474a() {
            return this.f77585a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31220c) && C41536l.m120484d(this.f77585a, ((C31220c) obj).f77585a);
        }

        public int hashCode() {
            String str = this.f77585a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f77585a;
            return "MobileInputValueChanged(value=" + str + ")";
        }
    }

    private C31217a() {
    }

    public /* synthetic */ C31217a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
