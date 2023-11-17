package androidx.fragment.app;

import af1.C40296c;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1638u0;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p163m0.C7047a;
import ue1.C43064a;

/* renamed from: androidx.fragment.app.j0 */
public abstract class C1514j0 {

    /* renamed from: androidx.fragment.app.j0$a */
    static final class C1515a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f4427d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1515a(Fragment fragment) {
            super(0);
            this.f4427d = fragment;
        }

        public final C7047a invoke() {
            C7047a defaultViewModelCreationExtras = this.f4427d.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: androidx.fragment.app.j0$b */
    static final class C1516b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f4428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1516b(Fragment fragment) {
            super(0);
            this.f4428d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f4428d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ C41217g m5373b(Fragment fragment, C40296c cVar, C43064a aVar, C43064a aVar2) {
        C41536l.m120489i(fragment, "<this>");
        C41536l.m120489i(cVar, "viewModelClass");
        C41536l.m120489i(aVar, "storeProducer");
        return m5374c(fragment, cVar, aVar, new C1515a(fragment), aVar2);
    }

    /* renamed from: c */
    public static final C41217g m5374c(Fragment fragment, C40296c cVar, C43064a aVar, C43064a aVar2, C43064a aVar3) {
        C41536l.m120489i(fragment, "<this>");
        C41536l.m120489i(cVar, "viewModelClass");
        C41536l.m120489i(aVar, "storeProducer");
        C41536l.m120489i(aVar2, "extrasProducer");
        if (aVar3 == null) {
            aVar3 = new C1516b(fragment);
        }
        return new C1617p0(cVar, aVar, aVar3, aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C1638u0 m5375d(C41217g gVar) {
        return (C1638u0) gVar.getValue();
    }
}
