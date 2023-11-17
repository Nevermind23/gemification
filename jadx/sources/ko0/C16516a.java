package ko0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import uo0.C18269a;
import uo0.C18273e;
import uo0.C18282g;

/* renamed from: ko0.a */
public abstract class C16516a {

    /* renamed from: ko0.a$b */
    public static final class C16518b extends C16516a {

        /* renamed from: a */
        private final C18273e f46664a;

        /* renamed from: b */
        private final int f46665b = C16519c.OFFER.ordinal();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16518b(C18273e eVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(eVar, "offer");
            this.f46664a = eVar;
        }

        /* renamed from: a */
        public int mo43656a() {
            return this.f46665b;
        }

        /* renamed from: b */
        public final C18273e mo43663b() {
            return this.f46664a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C16518b) && C41536l.m120484d(this.f46664a, ((C16518b) obj).f46664a);
        }

        public int hashCode() {
            return this.f46664a.hashCode();
        }

        public String toString() {
            C18273e eVar = this.f46664a;
            return "Offer(offer=" + eVar + ")";
        }
    }

    /* renamed from: ko0.a$c */
    public enum C16519c {
        HEADER,
        OFFER
    }

    private C16516a() {
    }

    public /* synthetic */ C16516a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract int mo43656a();

    /* renamed from: ko0.a$a */
    public static final class C16517a extends C16516a {

        /* renamed from: a */
        private final Image f46660a;

        /* renamed from: b */
        private final String f46661b;

        /* renamed from: c */
        private final C18269a f46662c;

        /* renamed from: d */
        private final int f46663d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16517a(Image image, String str, C18269a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(image, str, (i & 4) != 0 ? C18282g.m62550a() : aVar);
        }

        /* renamed from: a */
        public int mo43656a() {
            return this.f46663d;
        }

        /* renamed from: b */
        public final C18269a mo43657b() {
            return this.f46662c;
        }

        /* renamed from: c */
        public final String mo43658c() {
            return this.f46661b;
        }

        /* renamed from: d */
        public final Image mo43659d() {
            return this.f46660a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16517a)) {
                return false;
            }
            C16517a aVar = (C16517a) obj;
            return C41536l.m120484d(this.f46660a, aVar.f46660a) && C41536l.m120484d(this.f46661b, aVar.f46661b) && C41536l.m120484d(this.f46662c, aVar.f46662c);
        }

        public int hashCode() {
            return (((this.f46660a.hashCode() * 31) + this.f46661b.hashCode()) * 31) + this.f46662c.hashCode();
        }

        public String toString() {
            Image image = this.f46660a;
            String str = this.f46661b;
            C18269a aVar = this.f46662c;
            return "Header(icon=" + image + ", headerText=" + str + ", headerStyle=" + aVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16517a(Image image, String str, C18269a aVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(image, "icon");
            C41536l.m120489i(str, "headerText");
            C41536l.m120489i(aVar, "headerStyle");
            this.f46660a = image;
            this.f46661b = str;
            this.f46662c = aVar;
            this.f46663d = C16519c.HEADER.ordinal();
        }
    }
}
