package p341ge.bog.mobilebank.cleanarch.banner.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.util.C1004d;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import g91.C32289b0;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.parceler.C42035e;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerDeepLinkData;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerParameterData;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.viewmodel.BannerDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import p754fq.C20544a;
import p90.C27370n;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.activity.BannerDetailsActivity */
public final class BannerDetailsActivity extends C30772sa {

    /* renamed from: H */
    public static final C20813a f56071H = new C20813a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C27370n f56072F;

    /* renamed from: G */
    private final C41217g f56073G = new C1617p0(C41520a0.m120436b(BannerDetailsViewModel.class), new C20817e(this), new C20816d(this), new C20818f((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.activity.BannerDetailsActivity$a */
    public static final class C20813a {
        private C20813a() {
        }

        public /* synthetic */ C20813a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo49481a(Context context, String str) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "bannerName");
            Intent intent = new Intent(context, BannerDetailsActivity.class);
            intent.putExtra("banner_name", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.activity.BannerDetailsActivity$b */
    static final class C20814b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BannerDetailsActivity f56074d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20814b(BannerDetailsActivity bannerDetailsActivity) {
            super(1);
            this.f56074d = bannerDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49482a(C20544a aVar) {
            boolean z;
            C41536l.m120489i(aVar, "data");
            C27370n E2 = this.f56074d.f56072F;
            C27370n nVar = null;
            if (E2 == null) {
                C41536l.m120506z("binding");
                E2 = null;
            }
            BogImageView bogImageView = E2.f69320n;
            String c = C32289b0.m95091c(aVar.mo49074h());
            int i = C10320i.f28688dc;
            C32289b0.m95107s(bogImageView, c, Integer.valueOf(i), Integer.valueOf(i), false, false);
            C27370n E22 = this.f56074d.f56072F;
            if (E22 == null) {
                C41536l.m120506z("binding");
                E22 = null;
            }
            E22.f69319m.setText(aVar.mo49073g());
            boolean z2 = true;
            if (aVar.mo49067b().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C27370n E23 = this.f56074d.f56072F;
                if (E23 == null) {
                    C41536l.m120506z("binding");
                    E23 = null;
                }
                E23.f69313g.setText(aVar.mo49067b());
            } else {
                C27370n E24 = this.f56074d.f56072F;
                if (E24 == null) {
                    C41536l.m120506z("binding");
                    E24 = null;
                }
                E24.f69318l.setVisibility(8);
            }
            C27370n E25 = this.f56074d.f56072F;
            if (E25 == null) {
                C41536l.m120506z("binding");
                E25 = null;
            }
            E25.f69311e.setText(aVar.mo49066a());
            if (aVar.mo49072f().length() <= 0) {
                z2 = false;
            }
            if (z2) {
                C27370n E26 = this.f56074d.f56072F;
                if (E26 == null) {
                    C41536l.m120506z("binding");
                    E26 = null;
                }
                E26.f69317k.setText(aVar.mo49072f());
            } else {
                C27370n E27 = this.f56074d.f56072F;
                if (E27 == null) {
                    C41536l.m120506z("binding");
                    E27 = null;
                }
                E27.f69312f.setVisibility(8);
            }
            C27370n E28 = this.f56074d.f56072F;
            if (E28 == null) {
                C41536l.m120506z("binding");
                E28 = null;
            }
            E28.f69316j.setText(aVar.mo49070e());
            C27370n E29 = this.f56074d.f56072F;
            if (E29 == null) {
                C41536l.m120506z("binding");
            } else {
                nVar = E29;
            }
            nVar.f69314h.setText(aVar.mo49068c());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49482a((C20544a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.activity.BannerDetailsActivity$c */
    static final class C20815c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BannerDetailsActivity f56075d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20815c(BannerDetailsActivity bannerDetailsActivity) {
            super(1);
            this.f56075d = bannerDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49483a(BannerDeepLinkData bannerDeepLinkData) {
            ArrayList arrayList;
            String str;
            String str2;
            C41536l.m120489i(bannerDeepLinkData, "deepLinkData");
            BannerDetailsActivity bannerDetailsActivity = this.f56075d;
            Intent intent = new Intent("PUSH_NOTIF_INTENT");
            intent.putExtra("PUSH_NOTIFS_OPEN", true);
            intent.putExtra("type", bannerDeepLinkData.getType());
            List<BannerParameterData> parameters = bannerDeepLinkData.getParameters();
            if (parameters != null) {
                arrayList = new ArrayList(C41343r.m119925u(parameters, 10));
                for (BannerParameterData bannerParameterData : parameters) {
                    if (bannerParameterData != null) {
                        str = bannerParameterData.getKey();
                    } else {
                        str = null;
                    }
                    if (bannerParameterData != null) {
                        str2 = bannerParameterData.getValue();
                    } else {
                        str2 = null;
                    }
                    arrayList.add(new KeyValue(str, str2));
                }
            } else {
                arrayList = null;
            }
            intent.putExtra("parameters", C42035e.m122121c(arrayList));
            C35388f2.m105048S1(bannerDetailsActivity, intent, false, 2, (Object) null);
            C10463g F = C36546y.m108282F();
            String stringExtra = this.f56075d.getIntent().getStringExtra("banner_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            F.mo27155v("NBO_BANNER_INTERSTITIAL_PROMO_PAGE", (String) null, "continue", (Long) null, new ArrayList(C41339p.m119900e(new C1004d("BANNER_NAME", stringExtra))));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49483a((BannerDeepLinkData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.activity.BannerDetailsActivity$d */
    public static final class C20816d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56076d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20816d(ComponentActivity componentActivity) {
            super(0);
            this.f56076d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f56076d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.activity.BannerDetailsActivity$e */
    public static final class C20817e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56077d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20817e(ComponentActivity componentActivity) {
            super(0);
            this.f56077d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f56077d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.activity.BannerDetailsActivity$f */
    public static final class C20818f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f56078d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f56079e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20818f(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f56078d = aVar;
            this.f56079e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f56078d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f56079e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: F2 */
    private final BannerDetailsViewModel m67351F2() {
        return (BannerDetailsViewModel) this.f56073G.getValue();
    }

    /* renamed from: G2 */
    private final void m67352G2() {
        BannerDetailsViewModel F2 = m67351F2();
        C21484c.m69412d(F2.mo49569ew(), this, new C20814b(this), (C43075l) null, (C43075l) null, 12, (Object) null);
        C21484c.m69412d(F2.mo49568dw(), this, new C20815c(this), (C43075l) null, (C43075l) null, 12, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_banner_details;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C27370n a = C27370n.m84788a(findViewById(C10322k.f28887r9));
        C41536l.m120488h(a, "bind(findViewById(R.id.content_layout))");
        this.f56072F = a;
        BannerDetailsViewModel F2 = m67351F2();
        String stringExtra = getIntent().getStringExtra("banner_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        F2.mo49570fw(stringExtra);
        m67352G2();
    }

    public void onBackPressed() {
        C10463g F = C36546y.m108282F();
        String stringExtra = getIntent().getStringExtra("banner_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        F.mo27155v("NBO_BANNER_INTERSTITIAL_PROMO_PAGE", (String) null, "close", (Long) null, new ArrayList(C41339p.m119900e(new C1004d("BANNER_NAME", stringExtra))));
        super.onBackPressed();
    }

    public final void onButtonClick(View view) {
        C41536l.m120489i(view, "v");
        m67351F2().mo49571gw();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.offer);
        C41536l.m120488h(string, "getString(R.string.offer)");
        return string;
    }
}
