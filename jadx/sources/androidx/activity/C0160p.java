package androidx.activity;

import androidx.lifecycle.C1619q;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: androidx.activity.p */
public abstract class C0160p {

    /* renamed from: androidx.activity.p$a */
    public static final class C0161a extends C0152h {

        /* renamed from: d */
        final /* synthetic */ C43075l f1043d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0161a(boolean z, C43075l lVar) {
            super(z);
            this.f1043d = lVar;
        }

        /* renamed from: b */
        public void mo361b() {
            this.f1043d.invoke(this);
        }
    }

    /* renamed from: a */
    public static final C0152h m419a(OnBackPressedDispatcher onBackPressedDispatcher, C1619q qVar, boolean z, C43075l lVar) {
        C41536l.m120489i(onBackPressedDispatcher, "<this>");
        C41536l.m120489i(lVar, "onBackPressed");
        C0161a aVar = new C0161a(z, lVar);
        if (qVar != null) {
            onBackPressedDispatcher.mo342c(qVar, aVar);
        } else {
            onBackPressedDispatcher.mo341b(aVar);
        }
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C0152h m420b(OnBackPressedDispatcher onBackPressedDispatcher, C1619q qVar, boolean z, C43075l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            qVar = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return m419a(onBackPressedDispatcher, qVar, z, lVar);
    }
}
