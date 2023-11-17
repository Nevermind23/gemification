package p600sf;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import java.util.Set;
import p306x0.C8933d;
import p516mf.C16681a;
import p586rf.C17610f;
import p627uf.C18156d;

/* renamed from: sf.a */
public abstract class C17766a {

    /* renamed from: sf.a$a */
    public interface C17767a {
        /* renamed from: a */
        C17769c mo32451a();
    }

    /* renamed from: sf.a$b */
    public interface C17768b {
        /* renamed from: a */
        C17769c mo32671a();
    }

    /* renamed from: sf.a$c */
    public static final class C17769c {

        /* renamed from: a */
        private final Set f49580a;

        /* renamed from: b */
        private final C17610f f49581b;

        C17769c(Set set, C17610f fVar) {
            this.f49580a = set;
            this.f49581b = fVar;
        }

        /* renamed from: c */
        private C1620q0.C1624b m61455c(C8933d dVar, Bundle bundle, C1620q0.C1624b bVar) {
            return new C17772d(dVar, bundle, this.f49580a, (C1620q0.C1624b) C18156d.m62247b(bVar), this.f49581b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1620q0.C1624b mo45356a(ComponentActivity componentActivity, C1620q0.C1624b bVar) {
            Bundle bundle;
            if (componentActivity.getIntent() != null) {
                bundle = componentActivity.getIntent().getExtras();
            } else {
                bundle = null;
            }
            return m61455c(componentActivity, bundle, bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1620q0.C1624b mo45357b(Fragment fragment, C1620q0.C1624b bVar) {
            return m61455c(fragment, fragment.getArguments(), bVar);
        }
    }

    /* renamed from: a */
    public static C1620q0.C1624b m61451a(ComponentActivity componentActivity, C1620q0.C1624b bVar) {
        return ((C17767a) C16681a.m59022a(componentActivity, C17767a.class)).mo32451a().mo45356a(componentActivity, bVar);
    }

    /* renamed from: b */
    public static C1620q0.C1624b m61452b(Fragment fragment, C1620q0.C1624b bVar) {
        return ((C17768b) C16681a.m59022a(fragment, C17768b.class)).mo32671a().mo45357b(fragment, bVar);
    }
}
