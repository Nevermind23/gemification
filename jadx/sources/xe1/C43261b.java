package xe1;

import java.util.Random;
import kotlin.jvm.internal.C41536l;

/* renamed from: xe1.b */
public final class C43261b extends C43260a {

    /* renamed from: f */
    private final C43262a f101018f = new C43262a();

    /* renamed from: xe1.b$a */
    public static final class C43262a extends ThreadLocal {
        C43262a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: e */
    public Random mo101949e() {
        Object obj = this.f101018f.get();
        C41536l.m120488h(obj, "implStorage.get()");
        return (Random) obj;
    }
}
