package p076f4;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p089g4.C6224l;
import p166m3.C7083e;

/* renamed from: f4.a */
public final class C6153a implements C7083e {

    /* renamed from: b */
    private final int f19134b;

    /* renamed from: c */
    private final C7083e f19135c;

    private C6153a(int i, C7083e eVar) {
        this.f19134b = i;
        this.f19135c = eVar;
    }

    /* renamed from: c */
    public static C7083e m24565c(Context context) {
        return new C6153a(context.getResources().getConfiguration().uiMode & 48, C6154b.m24569c(context));
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        this.f19135c.mo7845b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f19134b).array());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6153a)) {
            return false;
        }
        C6153a aVar = (C6153a) obj;
        if (this.f19134b != aVar.f19134b || !this.f19135c.equals(aVar.f19135c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6224l.m24747p(this.f19135c, this.f19134b);
    }
}
