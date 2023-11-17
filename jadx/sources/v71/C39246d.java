package v71;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C1819o;
import c71.C31283c;
import c71.C31287g;
import g71.C32119l;
import g71.C32120m;
import g91.C32289b0;
import g91.C32343x;
import j71.C36756i;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import o31.C37626z;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.mediatext.MediaTextView;
import ue1.C43075l;

/* renamed from: v71.d */
public final class C39246d extends C1819o {

    /* renamed from: f */
    private final C43075l f93448f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39246d(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onSubstituteClicked");
        this.f93448f = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m114378n(C39246d dVar, int i, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.f93448f.invoke(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m114379o(C39246d dVar, int i, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.f93448f.invoke(Integer.valueOf(i));
    }

    /* renamed from: m */
    public void onBindViewHolder(C37626z zVar, int i) {
        String str;
        String str2;
        int i2;
        MediaTextView.C13383a aVar;
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i;
        C41536l.m120489i(zVar, "holder");
        C39243a aVar2 = (C39243a) mo6027g(i3);
        C6201a h = zVar.mo90806h();
        if (h instanceof C32119l) {
            C32119l lVar = (C32119l) h;
            TwoLineTextItem twoLineTextItem = lVar.f79048i;
            if (aVar2.mo92877k().size() == 1) {
                str = C32343x.m95388F(((C39247e) aVar2.mo92877k().get(0)).mo92887b(), new Object[0]);
            } else {
                str = lVar.f79048i.getContext().getString(C31287g.tc_travel_card);
            }
            twoLineTextItem.setTitle(str);
            Context context = lVar.mo3946b().getContext();
            TwoLineTextItem twoLineTextItem2 = lVar.f79048i;
            C41524c0 c0Var = C41524c0.f97701a;
            String string = context.getString(C31287g.tc_active_pass_header_end_date_formatted, new Object[]{((C39247e) aVar2.mo92877k().get(0)).mo92886a()});
            C41536l.m120488h(string, "context.getString(\n     …ate\n                    )");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            C41536l.m120488h(format, "format(format, *args)");
            twoLineTextItem2.setText(format);
            lVar.f79054o.removeAllViews();
            MediaTextView mediaTextView = lVar.f79056q;
            if (aVar2.mo92880n()) {
                str2 = context.getString(C31287g.tc_plastic_card);
            } else {
                str2 = aVar2.mo92869e();
            }
            mediaTextView.setText(str2);
            if (aVar2.mo92880n()) {
                i2 = C31283c.icons_16_card_debit_outline;
            } else {
                i2 = C31283c.ic_usage_method;
            }
            mediaTextView.setImage(new Image.Resource(i2, (Boolean) null, 2, (DefaultConstructorMarker) null));
            if (aVar2.mo92880n()) {
                aVar = MediaTextView.C13383a.OVAL_ICON;
            } else {
                aVar = MediaTextView.C13383a.THUMBNAIL;
            }
            mediaTextView.setType(aVar);
            MediaTextView mediaTextView2 = lVar.f79045f;
            mediaTextView2.setTitle(new SimpleDateFormat("MM/yy").format(new Date(aVar2.mo92875i())));
            mediaTextView2.setText("****" + aVar2.mo92876j());
            String c = C32289b0.m95091c(aVar2.mo92867c());
            C41536l.m120488h(c, "generateImageUrl(item.cardImage)");
            mediaTextView2.setImage(new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null));
            if (aVar2.mo92877k().size() > 1) {
                for (C39247e eVar : aVar2.mo92877k()) {
                    C32120m d = C32120m.m94614d(LayoutInflater.from(lVar.f79054o.getContext()));
                    C41536l.m120488h(d, "inflate(LayoutInflater.f…ssPeriodsLayout.context))");
                    d.f79059f.setText(C32343x.m95388F(eVar.mo92887b(), new Object[0]));
                    TextView textView = d.f79058e;
                    C41524c0 c0Var2 = C41524c0.f97701a;
                    String string2 = context.getString(C31287g.tc_active_pass_start_date_formatted);
                    C41536l.m120488h(string2, "context.getString(R.stri…ass_start_date_formatted)");
                    String format2 = String.format(string2, Arrays.copyOf(new Object[]{eVar.mo92888c()}, 1));
                    C41536l.m120488h(format2, "format(format, *args)");
                    String string3 = context.getString(C31287g.tc_active_pass_end_date_formatted);
                    C41536l.m120488h(string3, "context.getString(R.stri…_pass_end_date_formatted)");
                    String format3 = String.format(string3, Arrays.copyOf(new Object[]{eVar.mo92886a()}, 1));
                    C41536l.m120488h(format3, "format(format, *args)");
                    textView.setText(format2 + " - " + format3);
                    lVar.f79054o.addView(d.mo3946b());
                }
            }
            lVar.f79051l.setText(C32343x.m95388F(aVar2.mo92872g(), new Object[0]));
            LinearLayout linearLayout = lVar.f79054o;
            C41536l.m120488h(linearLayout, "binding.passPeriodsLayout");
            if (aVar2.mo92877k().size() > 1) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(linearLayout, z, false, 2, (Object) null);
            LayerView layerView = lVar.f79053n;
            C41536l.m120488h(layerView, "binding.passDeviceInfoLayer");
            C32343x.m95483r1(layerView, aVar2.mo92879m(), false, 2, (Object) null);
            LayerView layerView2 = lVar.f79052m;
            C41536l.m120488h(layerView2, "binding.noPassDeviceLayer");
            C32343x.m95483r1(layerView2, !aVar2.mo92879m(), false, 2, (Object) null);
            InlineFeedback inlineFeedback = lVar.f79050k;
            C41536l.m120488h(inlineFeedback, "binding.inlineFeedback");
            if (!aVar2.mo92865a() || !aVar2.mo92878l()) {
                z2 = false;
            } else {
                z2 = true;
            }
            C32343x.m95483r1(inlineFeedback, z2, false, 2, (Object) null);
            Button button = lVar.f79046g;
            C41536l.m120488h(button, "binding.changePassDeviceButton");
            if (!aVar2.mo92865a() || !aVar2.mo92878l()) {
                z3 = false;
            } else {
                z3 = true;
            }
            C32343x.m95483r1(button, z3, false, 2, (Object) null);
            InfoBadgeView infoBadgeView = lVar.f79049j;
            C41536l.m120488h(infoBadgeView, "onBindViewHolder$lambda$4");
            C32343x.m95483r1(infoBadgeView, true ^ aVar2.mo92878l(), false, 2, (Object) null);
            if (aVar2.mo92871f() == C36756i.P) {
                InfoBadgeView.m50233e(infoBadgeView, context.getString(C31287g.tc_processing), (String) null, (String) null, 6, (Object) null);
                infoBadgeView.setType(InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_PENDING);
            } else {
                InfoBadgeView.m50233e(infoBadgeView, context.getString(C31287g.tc_inactive), (String) null, (String) null, 6, (Object) null);
                infoBadgeView.setType(InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_NEGATIVE);
            }
            lVar.f79044e.setOnClickListener(new C39244b(this, i3));
            lVar.f79046g.setOnClickListener(new C39245c(this, i3));
        }
    }

    /* renamed from: p */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C32119l d = C32119l.m94610d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        d.f79050k.setTitleText(C32343x.m95388F("tcc.management.page.warning.message", new Object[0]));
        return new C37626z(d);
    }
}
