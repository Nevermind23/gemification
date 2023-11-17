package p341ge.bog.mobilebank.ddsto.presentation.ddform;

import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import ba0.C19359b;
import he1.C41217g;
import he1.C41223l;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.mobilebank.ddsto.presentation.ddform.C22738b;
import p341ge.bog.mobilebank.payments.presentation.form.C33692a;
import ue1.C43064a;
import ux0.C39165p;

/* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.DDFormActivity */
public final class DDFormActivity extends C22756e {

    /* renamed from: Y */
    public static final C22732a f59994Y = new C22732a((DefaultConstructorMarker) null);

    /* renamed from: V */
    public C22738b.C22739a f59995V;

    /* renamed from: W */
    private final C41217g f59996W = new C1617p0(C41520a0.m120436b(C22738b.class), new C22733b(this), new C22735d(this), new C22734c((C43064a) null, this));

    /* renamed from: X */
    private final C39165p f59997X = new C19359b();

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.DDFormActivity$a */
    public static final class C22732a {
        private C22732a() {
        }

        public /* synthetic */ C22732a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56477a(String str, String str2, Context context) {
            C41536l.m120489i(str, "paymentServiceId");
            C41536l.m120489i(str2, "pageName");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, DDFormActivity.class);
            intent.putExtra("ARGS_SERVICE_ID", str);
            intent.putExtra("ARGS_PAGE_NAME", str2);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.DDFormActivity$b */
    public static final class C22733b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59998d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22733b(ComponentActivity componentActivity) {
            super(0);
            this.f59998d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59998d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.DDFormActivity$c */
    public static final class C22734c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59999d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f60000e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22734c(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59999d = aVar;
            this.f60000e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59999d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60000e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.DDFormActivity$d */
    static final class C22735d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DDFormActivity f60001d;

        /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.DDFormActivity$d$a */
        static final class C22736a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ DDFormActivity f60002d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22736a(DDFormActivity dDFormActivity) {
                super(0);
                this.f60002d = dDFormActivity;
            }

            /* renamed from: b */
            public final C22738b invoke() {
                String str;
                String stringExtra;
                C22738b.C22739a X3 = this.f60002d.mo56473X3();
                Intent intent = this.f60002d.getIntent();
                String str2 = "";
                if (intent == null || (str = intent.getStringExtra("ARGS_SERVICE_ID")) == null) {
                    str = str2;
                }
                Intent intent2 = this.f60002d.getIntent();
                if (!(intent2 == null || (stringExtra = intent2.getStringExtra("ARGS_PAGE_NAME")) == null)) {
                    str2 = stringExtra;
                }
                return X3.mo32546a(str, str2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22735d(DDFormActivity dDFormActivity) {
            super(0);
            this.f60001d = dDFormActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C22736a(this.f60001d));
        }
    }

    /* renamed from: W3 */
    private final C22738b m73724W3() {
        return (C22738b) this.f59996W.getValue();
    }

    /* renamed from: X3 */
    public final C22738b.C22739a mo56473X3() {
        C22738b.C22739a aVar = this.f59995V;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("viewModelFactory");
        return null;
    }

    /* renamed from: f3 */
    public C39165p mo56474f3() {
        return this.f59997X;
    }

    /* renamed from: g3 */
    public List mo56475g3() {
        throw new C41223l("An operation is not implemented: " + "Not yet implemented");
    }

    /* renamed from: p3 */
    public C33692a mo56476p3() {
        return m73724W3();
    }
}
