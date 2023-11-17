package p319y1;

import android.graphics.Path;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import p255t1.C8311c;
import p255t1.C8315g;
import p307x1.C8935a;
import p307x1.C8938d;
import p331z1.C9169b;

/* renamed from: y1.o */
public class C9026o implements C9011c {

    /* renamed from: a */
    private final boolean f25123a;

    /* renamed from: b */
    private final Path.FillType f25124b;

    /* renamed from: c */
    private final String f25125c;

    /* renamed from: d */
    private final C8935a f25126d;

    /* renamed from: e */
    private final C8938d f25127e;

    /* renamed from: f */
    private final boolean f25128f;

    public C9026o(String str, boolean z, Path.FillType fillType, C8935a aVar, C8938d dVar, boolean z2) {
        this.f25125c = str;
        this.f25123a = z;
        this.f25124b = fillType;
        this.f25126d = aVar;
        this.f25127e = dVar;
        this.f25128f = z2;
    }

    /* renamed from: a */
    public C8311c mo24359a(C2315d0 d0Var, C2325h hVar, C9169b bVar) {
        return new C8315g(d0Var, bVar, this);
    }

    /* renamed from: b */
    public C8935a mo24486b() {
        return this.f25126d;
    }

    /* renamed from: c */
    public Path.FillType mo24487c() {
        return this.f25124b;
    }

    /* renamed from: d */
    public String mo24488d() {
        return this.f25125c;
    }

    /* renamed from: e */
    public C8938d mo24489e() {
        return this.f25127e;
    }

    /* renamed from: f */
    public boolean mo24490f() {
        return this.f25128f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f25123a + '}';
    }
}
