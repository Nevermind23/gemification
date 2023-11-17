package p276u9;

import p276u9.C8653d;

/* renamed from: u9.a */
public final class C8649a {

    /* renamed from: a */
    private int f24441a;

    /* renamed from: b */
    private C8653d.C8654a f24442b = C8653d.C8654a.DEFAULT;

    /* renamed from: u9.a$a */
    private static final class C8650a implements C8653d {

        /* renamed from: a */
        private final int f24443a;

        /* renamed from: b */
        private final C8653d.C8654a f24444b;

        C8650a(int i, C8653d.C8654a aVar) {
            this.f24443a = i;
            this.f24444b = aVar;
        }

        public Class annotationType() {
            return C8653d.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8653d)) {
                return false;
            }
            C8653d dVar = (C8653d) obj;
            if (this.f24443a != dVar.tag() || !this.f24444b.equals(dVar.intEncoding())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (14552422 ^ this.f24443a) + (this.f24444b.hashCode() ^ 2041407134);
        }

        public C8653d.C8654a intEncoding() {
            return this.f24444b;
        }

        public int tag() {
            return this.f24443a;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f24443a + "intEncoding=" + this.f24444b + ')';
        }
    }

    /* renamed from: b */
    public static C8649a m32272b() {
        return new C8649a();
    }

    /* renamed from: a */
    public C8653d mo23985a() {
        return new C8650a(this.f24441a, this.f24442b);
    }

    /* renamed from: c */
    public C8649a mo23986c(int i) {
        this.f24441a = i;
        return this;
    }
}
