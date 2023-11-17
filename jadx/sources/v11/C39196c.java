package v11;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C1305j;
import androidx.recyclerview.widget.RecyclerView;
import g11.C32041b;
import g91.C32343x;
import j11.C36696d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p642vh.C18368l;
import u11.C39005b;
import ue1.C43075l;

/* renamed from: v11.c */
public final class C39196c extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C36696d f93381d;

    /* renamed from: e */
    private final C39005b.C39006a f93382e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39196c(C36696d dVar, C39005b.C39006a aVar) {
        super(dVar.mo3946b());
        C41536l.m120489i(dVar, "binding");
        this.f93381d = dVar;
        this.f93382e = aVar;
    }

    /* renamed from: j */
    private final void m114302j(Context context, C32041b.C32042a aVar) {
        if (aVar.mo72536f()) {
            m114312u();
        } else {
            m114313v(context, aVar);
        }
    }

    /* renamed from: k */
    private final void m114303k(Context context, C32041b.C32050b bVar) {
        C36696d dVar = this.f93381d;
        m114308q(dVar, bVar);
        LoadingView loadingView = dVar.f88569g;
        C41536l.m120488h(loadingView, "loadingView");
        C32343x.m95455i0(loadingView);
        AppCompatImageView appCompatImageView = dVar.f88572j;
        C41536l.m120488h(appCompatImageView, "settingsItemImage");
        C18368l.m62746A(appCompatImageView, new Image.Resource(bVar.mo66931b(), (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        AppCompatImageView appCompatImageView2 = dVar.f88572j;
        C41536l.m120488h(appCompatImageView2, "settingsItemImage");
        m114316y(appCompatImageView2, bVar.mo66930a(), context);
        Color e = bVar.mo72535e();
        LayerView layerView = dVar.f88573k;
        C41536l.m120488h(layerView, "settingsItemImageLayer");
        m114315x(e, layerView, context);
        dVar.f88575m.setText(C34646b.m101752f(bVar.mo66932d(), (Context) null, 1, (Object) null));
        dVar.mo3946b().setOnClickListener(new C39195b(this, bVar));
    }

    /* renamed from: m */
    private final void m114304m(C36696d dVar, C32041b bVar) {
        if (bVar instanceof C32041b.C32042a) {
            Context context = dVar.mo3946b().getContext();
            C41536l.m120488h(context, "root.context");
            m114302j(context, (C32041b.C32042a) bVar);
        } else if (bVar instanceof C32041b.C32050b) {
            Context context2 = dVar.mo3946b().getContext();
            C41536l.m120488h(context2, "root.context");
            m114303k(context2, (C32041b.C32050b) bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m114305n(C39196c cVar, C32041b.C32050b bVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(bVar, "$data");
        C39005b.C39006a aVar = cVar.f93382e;
        if (aVar != null) {
            aVar.mo84106h(bVar);
        }
    }

    /* renamed from: o */
    private final boolean m114306o(AppCompatTextView appCompatTextView, C32041b.C32042a.C32045c cVar) {
        StringSource g = cVar.mo72541g();
        if (g == null) {
            return false;
        }
        appCompatTextView.setText(C34646b.m101752f(g, (Context) null, 1, (Object) null));
        return true;
    }

    /* renamed from: p */
    private final void m114307p(AppCompatTextView appCompatTextView, C32041b.C32042a aVar) {
        if (aVar instanceof C32041b.C32042a.C32045c) {
            C32343x.m95483r1(appCompatTextView, m114306o(appCompatTextView, (C32041b.C32042a.C32045c) aVar), false, 2, (Object) null);
        }
    }

    /* renamed from: q */
    private final void m114308q(C36696d dVar, C32041b.C32050b bVar) {
        m114311t(dVar);
    }

    /* renamed from: r */
    private final void m114309r(AppCompatTextView appCompatTextView, C32041b.C32042a aVar) {
        C32343x.m95455i0(appCompatTextView);
        m114307p(appCompatTextView, aVar);
    }

    /* renamed from: s */
    private final void m114310s() {
        C36696d dVar = this.f93381d;
        AppCompatImageView appCompatImageView = dVar.f88567e;
        C41536l.m120488h(appCompatImageView, "chevron");
        C32343x.m95455i0(appCompatImageView);
        LayerView layerView = dVar.f88571i;
        C41536l.m120488h(layerView, "settingsItemEditImageLayer");
        C32343x.m95455i0(layerView);
        AppCompatTextView appCompatTextView = dVar.f88574l;
        C41536l.m120488h(appCompatTextView, "subTitleText");
        C32343x.m95455i0(appCompatTextView);
    }

    /* renamed from: t */
    private final void m114311t(C36696d dVar) {
        m114310s();
        AppCompatImageView appCompatImageView = dVar.f88567e;
        C41536l.m120488h(appCompatImageView, "chevron");
        C32343x.m95447f1(appCompatImageView);
    }

    /* renamed from: u */
    private final void m114312u() {
        C36696d dVar = this.f93381d;
        AppCompatImageView appCompatImageView = dVar.f88567e;
        C41536l.m120488h(appCompatImageView, "chevron");
        C32343x.m95455i0(appCompatImageView);
        LayerView layerView = dVar.f88573k;
        C41536l.m120488h(layerView, "settingsItemImageLayer");
        C32343x.m95455i0(layerView);
        LinearLayout linearLayout = dVar.f88568f;
        C41536l.m120488h(linearLayout, "containerTitles");
        C32343x.m95455i0(linearLayout);
        LayerView layerView2 = dVar.f88571i;
        C41536l.m120488h(layerView2, "settingsItemEditImageLayer");
        C32343x.m95455i0(layerView2);
        LoadingView loadingView = dVar.f88569g;
        C41536l.m120488h(loadingView, "loadingView");
        C32343x.m95447f1(loadingView);
    }

    /* renamed from: v */
    private final void m114313v(Context context, C32041b.C32042a aVar) {
        C36696d dVar = this.f93381d;
        LoadingView loadingView = dVar.f88569g;
        C41536l.m120488h(loadingView, "loadingView");
        C32343x.m95455i0(loadingView);
        AppCompatImageView appCompatImageView = dVar.f88567e;
        C41536l.m120488h(appCompatImageView, "chevron");
        C32343x.m95447f1(appCompatImageView);
        AppCompatImageView appCompatImageView2 = dVar.f88572j;
        C41536l.m120488h(appCompatImageView2, "settingsItemImage");
        C18368l.m62746A(appCompatImageView2, new Image.Resource(aVar.mo66931b(), (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        AppCompatImageView appCompatImageView3 = dVar.f88572j;
        C41536l.m120488h(appCompatImageView3, "settingsItemImage");
        m114316y(appCompatImageView3, aVar.mo66930a(), context);
        Color e = aVar.mo72535e();
        LayerView layerView = dVar.f88573k;
        C41536l.m120488h(layerView, "settingsItemImageLayer");
        m114315x(e, layerView, context);
        dVar.f88575m.setText(C34646b.m101752f(aVar.mo66932d(), (Context) null, 1, (Object) null));
        AppCompatTextView appCompatTextView = dVar.f88574l;
        C41536l.m120488h(appCompatTextView, "subTitleText");
        m114309r(appCompatTextView, aVar);
        dVar.mo3946b().setOnClickListener(new C39194a(this, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m114314w(C39196c cVar, C32041b.C32042a aVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(aVar, "$data");
        C39005b.C39006a aVar2 = cVar.f93382e;
        if (aVar2 != null) {
            aVar2.mo84106h(aVar);
        }
    }

    /* renamed from: x */
    private final void m114315x(Color color, LayerView layerView, Context context) {
        if (color != null) {
            layerView.setBackgroundColor(color.mo35260a(context));
        }
    }

    /* renamed from: y */
    private final void m114316y(AppCompatImageView appCompatImageView, Color color, Context context) {
        if (color != null) {
            C1305j.m4529c(appCompatImageView, color.mo35261b(context));
        }
    }

    /* renamed from: l */
    public final void mo92833l(C32041b bVar) {
        C41536l.m120489i(bVar, "data");
        m114310s();
        m114304m(this.f93381d, bVar);
    }
}
