package k81;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import g91.C32343x;
import i10.C25100c;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import p380ck.C10464h;
import q31.C38122f;
import q31.C38125h;

/* renamed from: k81.b0 */
public final class C36892b0 extends C36917q {

    /* renamed from: b */
    private Context f88997b;

    /* renamed from: c */
    private View f88998c;

    /* renamed from: h */
    private final void m109265h(OfferInfo offerInfo) {
        View view = this.f88998c;
        View view2 = null;
        if (view == null) {
            C41536l.m120506z("itemView");
            view = null;
        }
        View findViewById = view.findViewById(C10322k.text_from);
        C41536l.m120488h(findViewById, "itemView.findViewById<TextView>(R.id.text_from)");
        C32343x.m95483r1(findViewById, false, false, 2, (Object) null);
        View view3 = this.f88998c;
        if (view3 == null) {
            C41536l.m120506z("itemView");
            view3 = null;
        }
        View findViewById2 = view3.findViewById(C10322k.offer_icon_bg);
        C41536l.m120488h(findViewById2, "itemView.findViewById<Im…View>(R.id.offer_icon_bg)");
        C32343x.m95483r1(findViewById2, false, false, 2, (Object) null);
        View view4 = this.f88998c;
        if (view4 == null) {
            C41536l.m120506z("itemView");
            view4 = null;
        }
        ImageView imageView = (ImageView) view4.findViewById(C10322k.offer_icon_full_square);
        imageView.setImageResource(C10320i.f28695m5);
        C41536l.m120488h(imageView, "bindBnpl$lambda$2");
        C32343x.m95483r1(imageView, true, false, 2, (Object) null);
        View view5 = this.f88998c;
        if (view5 == null) {
            C41536l.m120506z("itemView");
            view5 = null;
        }
        TextView textView = (TextView) view5.findViewById(C10322k.percent_pre_text);
        Context context = this.f88997b;
        if (context == null) {
            C41536l.m120506z("context");
            context = null;
        }
        textView.setText(context.getString(C10328q.offer_banner_effective_rate_bnpl));
        View view6 = this.f88998c;
        if (view6 == null) {
            C41536l.m120506z("itemView");
            view6 = null;
        }
        view6.setOnClickListener(new C36927z(this));
        View view7 = this.f88998c;
        if (view7 == null) {
            C41536l.m120506z("itemView");
        } else {
            view2 = view7;
        }
        view2.findViewById(C10322k.hide_offer_btn).setOnClickListener(new C36890a0(offerInfo, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m109266i(C36892b0 b0Var, View view) {
        C41536l.m120489i(b0Var, "this$0");
        C36546y.m108282F().mo27152s("home_banners", "BNPL", "banner_click");
        C36546y.m108282F().mo27137H("BNPL_home_banners_click", "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
        Context context = b0Var.f88997b;
        Context context2 = null;
        if (context == null) {
            C41536l.m120506z("context");
            context = null;
        }
        C38122f c = C38125h.m112238c(context);
        Context context3 = b0Var.f88997b;
        if (context3 == null) {
            C41536l.m120506z("context");
        } else {
            context2 = context3;
        }
        c.mo91558K(context2);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m109267j(OfferInfo offerInfo, C36892b0 b0Var, View view) {
        C41536l.m120489i(offerInfo, "$offer");
        C41536l.m120489i(b0Var, "this$0");
        C36546y.m108282F().mo27152s("home_banners", "BNPL", "banner_close");
        C36546y.m108282F().mo27137H("BNPL_home_banners_close", "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
        PreferencesApiManager.getInstance().hideOffer(offerInfo, C36546y.m108285N().mo89315M());
        b0Var.mo89859b();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m109268l(OfferInfo offerInfo, C36892b0 b0Var, View view) {
        C41536l.m120489i(offerInfo, "$offer");
        C41536l.m120489i(b0Var, "this$0");
        C10463g F = C36546y.m108282F();
        OfferProductCode productCode = offerInfo.getProductCode();
        String operType = offerInfo.getOperType();
        F.mo27152s("offers", productCode + "_" + operType, "open_offer_banner_from_home");
        OfferNavigatorActivity.C21963a aVar = OfferNavigatorActivity.f58469H;
        View view2 = b0Var.f88998c;
        if (view2 == null) {
            C41536l.m120506z("itemView");
            view2 = null;
        }
        Activity a = C25100c.m80062a(view2);
        if (a != null) {
            aVar.mo54606a(a, offerInfo);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m109269m(OfferInfo offerInfo, C36892b0 b0Var, View view) {
        C41536l.m120489i(offerInfo, "$offer");
        C41536l.m120489i(b0Var, "this$0");
        C10463g F = C36546y.m108282F();
        OfferProductCode productCode = offerInfo.getProductCode();
        String operType = offerInfo.getOperType();
        F.mo27152s("offers", productCode + "_" + operType, "close_student_card_banner_on_home");
        PreferencesApiManager.getInstance().hideOffer(offerInfo, C36546y.m108285N().mo89315M());
        b0Var.mo89859b();
    }

    /* renamed from: a */
    public View mo89824a(Context context, ViewGroup viewGroup) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(viewGroup, "parent");
        View inflate = LayoutInflater.from(context).inflate(C10324m.offer_banner_list_item, viewGroup, false);
        this.f88997b = context;
        C41536l.m120488h(inflate, "v");
        this.f88998c = inflate;
        return inflate;
    }

    /* renamed from: k */
    public final void mo89825k(OfferInfo offerInfo) {
        int i;
        C41536l.m120489i(offerInfo, "offer");
        View view = this.f88998c;
        View view2 = null;
        if (view == null) {
            C41536l.m120506z("itemView");
            view = null;
        }
        TextView textView = (TextView) view.findViewById(C10322k.product_name);
        View view3 = this.f88998c;
        if (view3 == null) {
            C41536l.m120506z("itemView");
            view3 = null;
        }
        TextView textView2 = (TextView) view3.findViewById(C10322k.offer_description);
        View view4 = this.f88998c;
        if (view4 == null) {
            C41536l.m120506z("itemView");
            view4 = null;
        }
        TextView textView3 = (TextView) view4.findViewById(C10322k.effective_rate);
        View view5 = this.f88998c;
        if (view5 == null) {
            C41536l.m120506z("itemView");
            view5 = null;
        }
        ImageView imageView = (ImageView) view5.findViewById(C10322k.offer_icon);
        View view6 = this.f88998c;
        if (view6 == null) {
            C41536l.m120506z("itemView");
            view6 = null;
        }
        View findViewById = view6.findViewById(C10322k.hide_offer_btn);
        textView.setText(offerInfo.getProductName());
        textView2.setText(offerInfo.getOfferText());
        textView3.setText(offerInfo.getEffectiveInterestRate() + "%");
        if (offerInfo.getOfferScheme() == OfferInfo.C20999b.BNPL) {
            m109265h(offerInfo);
            return;
        }
        Integer a = C10137b.m37077a(offerInfo.getProductCode(), offerInfo.getHasPromotion());
        if (a != null) {
            i = a.intValue();
        } else {
            i = 0;
        }
        imageView.setImageResource(i);
        View view7 = this.f88998c;
        if (view7 == null) {
            C41536l.m120506z("itemView");
        } else {
            view2 = view7;
        }
        view2.setOnClickListener(new C36925x(offerInfo, this));
        findViewById.setOnClickListener(new C36926y(offerInfo, this));
    }
}
