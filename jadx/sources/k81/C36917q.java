package k81;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: k81.q */
public abstract class C36917q {

    /* renamed from: a */
    private C36918a f89032a;

    /* renamed from: k81.q$a */
    public interface C36918a {
        /* renamed from: a */
        void mo48126a();
    }

    /* renamed from: a */
    public abstract View mo89824a(Context context, ViewGroup viewGroup);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo89859b() {
        C36918a aVar = this.f89032a;
        if (aVar != null) {
            aVar.mo48126a();
        }
    }

    /* renamed from: c */
    public void mo89860c(C36918a aVar) {
        this.f89032a = aVar;
    }
}
