package p255t1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p048d2.C5808j;

/* renamed from: t1.b */
public class C8310b {

    /* renamed from: a */
    private final List f23571a = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo23474a(C8331u uVar) {
        this.f23571a.add(uVar);
    }

    /* renamed from: b */
    public void mo23475b(Path path) {
        for (int size = this.f23571a.size() - 1; size >= 0; size--) {
            C5808j.m23374b(path, (C8331u) this.f23571a.get(size));
        }
    }
}
