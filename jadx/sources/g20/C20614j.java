package g20;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import g91.C32314k;
import g91.C32343x;
import g91.C32359z0;
import i10.C25100c;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import k20.C25575b;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p642vh.C18368l;
import ue1.C43064a;

/* renamed from: g20.j */
public final class C20614j extends RecyclerView.C1734f0 {

    /* renamed from: i */
    public static final C20615a f55689i = new C20615a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final Context f55690d;

    /* renamed from: e */
    private final C43064a f55691e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public FrameLayout f55692f;

    /* renamed from: g */
    private TextView f55693g;

    /* renamed from: h */
    private boolean f55694h;

    /* renamed from: g20.j$a */
    public static final class C20615a {
        private C20615a() {
        }

        public /* synthetic */ C20615a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g20.j$b */
    public final class C20616b {
        public C20616b() {
            C20614j.this.f55692f.removeAllViews();
            C20614j.this.f55692f.addView(LayoutInflater.from(C20614j.this.mo49163m()).inflate(C10324m.home_deposits_and_liabilities_double_view, (ViewGroup) null));
        }

        /* renamed from: a */
        public final void mo49165a(List list) {
            List list2 = list;
            C41536l.m120489i(list2, "depositsAndLiabilitiesLs");
            C20614j jVar = C20614j.this;
            int i = C10322k.deposit_badge_layout;
            View findViewById = jVar.itemView.findViewById(C10322k.deposit_icon);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.deposit_icon)");
            View findViewById2 = C20614j.this.itemView.findViewById(C10322k.f28761Ka);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.deposit_amount)");
            View findViewById3 = C20614j.this.itemView.findViewById(C10322k.deposit_title);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.deposit_title)");
            View findViewById4 = C20614j.this.itemView.findViewById(C10322k.deposit_clickable_view);
            C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.deposit_clickable_view)");
            View findViewById5 = C20614j.this.itemView.findViewById(C10322k.deposit_mask_amount_layout);
            C41536l.m120488h(findViewById5, "itemView.findViewById(R.…posit_mask_amount_layout)");
            jVar.mo49164n(i, (ImageView) findViewById, (TextView) findViewById2, (TextView) findViewById3, findViewById4, findViewById5, (C25575b.C25577b) list2.get(0));
            C20614j jVar2 = C20614j.this;
            int i2 = C10322k.liabilities_badge_layout;
            View findViewById6 = jVar2.itemView.findViewById(C10322k.liabilities_icon);
            C41536l.m120488h(findViewById6, "itemView.findViewById(R.id.liabilities_icon)");
            View findViewById7 = C20614j.this.itemView.findViewById(C10322k.liabilities_amount);
            C41536l.m120488h(findViewById7, "itemView.findViewById(R.id.liabilities_amount)");
            View findViewById8 = C20614j.this.itemView.findViewById(C10322k.liabilities_title);
            C41536l.m120488h(findViewById8, "itemView.findViewById(R.id.liabilities_title)");
            View findViewById9 = C20614j.this.itemView.findViewById(C10322k.liabilities_clickable_view);
            C41536l.m120488h(findViewById9, "itemView.findViewById(R.…abilities_clickable_view)");
            View findViewById10 = C20614j.this.itemView.findViewById(C10322k.liabilities_mask_amount_layout);
            C41536l.m120488h(findViewById10, "itemView.findViewById(R.…ities_mask_amount_layout)");
            jVar2.mo49164n(i2, (ImageView) findViewById6, (TextView) findViewById7, (TextView) findViewById8, findViewById9, findViewById10, (C25575b.C25577b) list2.get(1));
        }
    }

    /* renamed from: g20.j$c */
    public final class C20617c {
        public C20617c() {
            C20614j.this.f55692f.removeAllViews();
            C20614j.this.f55692f.addView(LayoutInflater.from(C20614j.this.mo49163m()).inflate(C10324m.home_deposits_and_liabilities_single_view, (ViewGroup) null));
        }

        /* renamed from: a */
        public final void mo49166a(C25575b.C25577b bVar) {
            C41536l.m120489i(bVar, "item");
            C20614j jVar = C20614j.this;
            int i = C10322k.image_badge_layout;
            View findViewById = jVar.itemView.findViewById(C10322k.item_image);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.item_image)");
            View findViewById2 = C20614j.this.itemView.findViewById(C10322k.item_amount);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.item_amount)");
            View findViewById3 = C20614j.this.itemView.findViewById(C10322k.f28846ii);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.item_title)");
            View findViewById4 = C20614j.this.itemView.findViewById(C10322k.deposit_liability_constraint);
            C41536l.m120488h(findViewById4, "itemView.findViewById(R.…sit_liability_constraint)");
            View findViewById5 = C20614j.this.itemView.findViewById(C10322k.mask_amount_layout);
            C41536l.m120488h(findViewById5, "itemView.findViewById(R.id.mask_amount_layout)");
            jVar.mo49164n(i, (ImageView) findViewById, (TextView) findViewById2, (TextView) findViewById3, findViewById4, findViewById5, bVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20614j(View view, Context context, C43064a aVar) {
        super(view);
        C41536l.m120489i(view, "itemView");
        C41536l.m120489i(context, "context");
        C41536l.m120489i(aVar, "onLoanOverdueWarningClick");
        this.f55690d = context;
        this.f55691e = aVar;
        View findViewById = view.findViewById(C10322k.deposit_liability_view);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.deposit_liability_view)");
        this.f55692f = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C10322k.deposits_and_liabilities_header);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.…s_and_liabilities_header)");
        TextView textView = (TextView) findViewById2;
        this.f55693g = textView;
        textView.setText(C32359z0.m95557a0(C10328q.main_activity_deposits_and_liabilities_header));
    }

    /* renamed from: l */
    private final String m66902l(BigDecimal bigDecimal, String str) {
        String str2;
        if (this.f55694h) {
            str2 = "";
        } else {
            C41524c0 c0Var = C41524c0.f97701a;
            str2 = String.format("%s", Arrays.copyOf(new Object[]{C32303f.m95205p(bigDecimal)}, 1));
            C41536l.m120488h(str2, "format(format, *args)");
        }
        String a = C32314k.m95245a(str);
        return str2 + " " + a;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m66903o(C25575b.C25577b bVar, C20614j jVar, View view) {
        C41536l.m120489i(bVar, "$item");
        C41536l.m120489i(jVar, "this$0");
        C36546y.m108282F().mo27152s("home", bVar.mo64157g(), "click_deposits_and_liabilities_widget");
        View view2 = jVar.itemView;
        C41536l.m120488h(view2, "itemView");
        Activity a = C25100c.m80062a(view2);
        C41536l.m120487g(a, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.MainActivity");
        ((MainActivity) a).mo86136C7("GENERAL");
    }

    /* renamed from: p */
    private final void m66904p(int i, ImageView imageView, boolean z, boolean z2) {
        boolean z3;
        Drawable drawable;
        int i2;
        BadgeRelativeLayout badgeRelativeLayout = (BadgeRelativeLayout) this.itemView.findViewById(i);
        if (badgeRelativeLayout != null) {
            if (z || z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            badgeRelativeLayout.setBadgeVisible(z3);
            if (z) {
                drawable = C32343x.m95424X(C10320i.loan_overdue_image_background, imageView.getContext());
            } else {
                drawable = C32343x.m95424X(C10320i.home_icon_border, imageView.getContext());
            }
            imageView.setBackground(drawable);
            if (z) {
                i2 = C0767a.m2893c(imageView.getContext(), C10318g.f28633U0);
            } else {
                Context context = imageView.getContext();
                C41536l.m120488h(context, "context");
                i2 = C18368l.m62755d(context, C10316e.f28605g);
            }
            imageView.setImageTintList(ColorStateList.valueOf(i2));
        }
    }

    /* renamed from: q */
    private final void m66905q(boolean z) {
        InlineFeedback inlineFeedback = (InlineFeedback) this.itemView.findViewById(C10322k.loan_overdue_feedback);
        C41536l.m120488h(inlineFeedback, "setupOverdueFeedback$lambda$4");
        C32343x.m95483r1(inlineFeedback, z, false, 2, (Object) null);
        inlineFeedback.setCloseButtonVisibility(false);
        inlineFeedback.setTitleText(C32343x.m95388F("loans.home.overdue.block.main.text", new Object[0]));
        inlineFeedback.setInteractiveButtonText(C32343x.m95388F("loans.home.overdue.block.button.label", new Object[0]));
        inlineFeedback.setOnInteractiveButtonClickListener(new C20611i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m66906r(C20614j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        jVar.f55691e.invoke();
    }

    /* renamed from: k */
    public final void mo49162k(List list, boolean z) {
        C41536l.m120489i(list, "depositsAndLiabilitiesLs");
        this.f55694h = z;
        if (list.isEmpty()) {
            this.itemView.setVisibility(8);
        } else if (list.size() == 1) {
            new C20617c().mo49166a((C25575b.C25577b) list.get(0));
        } else if (list.size() == 2) {
            new C20616b().mo49165a(list);
        }
    }

    /* renamed from: m */
    public final Context mo49163m() {
        return this.f55690d;
    }

    /* renamed from: n */
    public final void mo49164n(int i, ImageView imageView, TextView textView, TextView textView2, View view, View view2, C25575b.C25577b bVar) {
        C41536l.m120489i(imageView, "itemImage");
        C41536l.m120489i(textView, "itemAmount");
        C41536l.m120489i(textView2, "itemTitle");
        C41536l.m120489i(view, "viewFrame");
        C41536l.m120489i(view2, "amountMask");
        C41536l.m120489i(bVar, "item");
        imageView.setImageDrawable(bVar.mo64155e());
        textView2.setText(bVar.mo64156f());
        textView.setText(m66902l(bVar.mo64151a(), bVar.mo64152b()));
        C32343x.m95483r1(view2, this.f55694h, false, 2, (Object) null);
        view.setOnClickListener(new C20609h(bVar, this));
        m66904p(i, imageView, bVar.mo64153c(), bVar.mo64154d());
        m66905q(bVar.mo64153c());
    }
}
