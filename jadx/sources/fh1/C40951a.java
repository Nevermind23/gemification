package fh1;

import java.util.HashSet;
import java.util.List;
import kh1.C41516a;
import kh1.C41518c;
import kotlin.jvm.internal.C41536l;
import oh1.C41952c;
import oh1.C41953d;

/* renamed from: fh1.a */
public final class C40951a {

    /* renamed from: a */
    private final C41953d f96723a = new C41953d(this);

    /* renamed from: b */
    private final C41952c f96724b = new C41952c(this);

    /* renamed from: c */
    private C41518c f96725c = new C41516a();

    /* renamed from: d */
    private final HashSet f96726d = new HashSet();

    /* renamed from: e */
    public static /* synthetic */ void m118737e(C40951a aVar, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        aVar.mo95346d(list, z);
    }

    /* renamed from: a */
    public final void mo95343a() {
        this.f96723a.mo97161i().mo97673e();
    }

    /* renamed from: b */
    public final C41518c mo95344b() {
        return this.f96725c;
    }

    /* renamed from: c */
    public final C41953d mo95345c() {
        return this.f96723a;
    }

    /* renamed from: d */
    public final void mo95346d(List list, boolean z) {
        C41536l.m120489i(list, "modules");
        this.f96726d.addAll(list);
        this.f96723a.mo97162k(list);
        if (z) {
            mo95343a();
        }
    }
}
