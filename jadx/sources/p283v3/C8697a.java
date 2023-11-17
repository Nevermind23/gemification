package p283v3;

import com.bumptech.glide.load.data.C2417e;
import java.nio.ByteBuffer;

/* renamed from: v3.a */
public class C8697a implements C2417e {

    /* renamed from: a */
    private final ByteBuffer f24521a;

    /* renamed from: v3.a$a */
    public static class C8698a implements C2417e.C2418a {
        /* renamed from: a */
        public Class mo7778a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public C2417e mo7779b(ByteBuffer byteBuffer) {
            return new C8697a(byteBuffer);
        }
    }

    public C8697a(ByteBuffer byteBuffer) {
        this.f24521a = byteBuffer;
    }

    /* renamed from: b */
    public void mo7775b() {
    }

    /* renamed from: c */
    public ByteBuffer mo7774a() {
        this.f24521a.position(0);
        return this.f24521a;
    }
}
