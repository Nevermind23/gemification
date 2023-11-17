package p319y1;

import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import java.util.Arrays;
import java.util.List;
import p255t1.C8311c;
import p255t1.C8312d;
import p331z1.C9169b;

/* renamed from: y1.p */
public class C9027p implements C9011c {

    /* renamed from: a */
    private final String f25129a;

    /* renamed from: b */
    private final List f25130b;

    /* renamed from: c */
    private final boolean f25131c;

    public C9027p(String str, List list, boolean z) {
        this.f25129a = str;
        this.f25130b = list;
        this.f25131c = z;
    }

    /* renamed from: a */
    public C8311c mo24359a(C2315d0 d0Var, C2325h hVar, C9169b bVar) {
        return new C8312d(d0Var, bVar, this, hVar);
    }

    /* renamed from: b */
    public List mo24492b() {
        return this.f25130b;
    }

    /* renamed from: c */
    public String mo24493c() {
        return this.f25129a;
    }

    /* renamed from: d */
    public boolean mo24494d() {
        return this.f25131c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f25129a + "' Shapes: " + Arrays.toString(this.f25130b.toArray()) + '}';
    }
}
