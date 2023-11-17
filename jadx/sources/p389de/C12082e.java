package p389de;

import java.nio.ByteBuffer;
import p651wd.C18513i;

/* renamed from: de.e */
class C12082e extends C18513i {

    /* renamed from: de.e$a */
    class C12083a implements C18513i.C18514a {

        /* renamed from: a */
        final /* synthetic */ int f35521a;

        C12083a(int i) {
            this.f35521a = i;
        }

        /* renamed from: a */
        public ByteBuffer create() {
            return ByteBuffer.allocateDirect(this.f35521a);
        }
    }

    C12082e(int i, int i2) {
        super(i2, new C12083a(i));
    }
}
