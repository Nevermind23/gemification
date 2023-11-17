package p389de;

import android.media.MediaCodec;
import p651wd.C18513i;

/* renamed from: de.l */
class C12100l extends C18513i {

    /* renamed from: de.l$a */
    class C12101a implements C18513i.C18514a {

        /* renamed from: a */
        final /* synthetic */ int f35577a;

        C12101a(int i) {
            this.f35577a = i;
        }

        /* renamed from: a */
        public C12099k create() {
            C12099k kVar = new C12099k();
            kVar.f35575b = this.f35577a;
            kVar.f35574a = new MediaCodec.BufferInfo();
            return kVar;
        }
    }

    C12100l(int i) {
        super(Integer.MAX_VALUE, new C12101a(i));
    }
}
