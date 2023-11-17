package n10;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10325n;
import t10.C28297b;
import t10.C28298c;
import ue1.C43064a;

/* renamed from: n10.l */
public final class C26352l extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final ImageView f66738d;

    /* renamed from: e */
    private final ImageView f66739e;

    /* renamed from: f */
    private final BogTextView f66740f;

    /* renamed from: g */
    private final BogTextView f66741g;

    /* renamed from: h */
    private final FrameLayout f66742h;

    /* renamed from: i */
    private final ImageView f66743i;

    /* renamed from: j */
    private final View f66744j;

    /* renamed from: k */
    private final LinearLayout f66745k;

    /* renamed from: l */
    private final ImageView f66746l;

    /* renamed from: m */
    private final ImageView f66747m;

    /* renamed from: n */
    private final ImageView f66748n;

    /* renamed from: o */
    private final ImageView f66749o;

    /* renamed from: p */
    private final ConstraintLayout f66750p;

    /* renamed from: q */
    private C43064a f66751q;

    /* renamed from: r */
    private C43064a f66752r;

    /* renamed from: s */
    private C43064a f66753s;

    /* renamed from: t */
    private C43064a f66754t;

    /* renamed from: u */
    private C43064a f66755u;

    /* renamed from: v */
    private C43064a f66756v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26352l(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.menu_icon);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.menu_icon)");
        ImageView imageView = (ImageView) findViewById;
        this.f66738d = imageView;
        View findViewById2 = view.findViewById(C10322k.contact_avatar_image);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.contact_avatar_image)");
        this.f66739e = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(C10322k.contact_name_text_view);
        C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.contact_name_text_view)");
        this.f66740f = (BogTextView) findViewById3;
        View findViewById4 = view.findViewById(C10322k.contact_nickname_text_view);
        C41536l.m120488h(findViewById4, "itemView.findViewById(R.…ntact_nickname_text_view)");
        this.f66741g = (BogTextView) findViewById4;
        View findViewById5 = view.findViewById(C10322k.default_avatar_frame);
        C41536l.m120488h(findViewById5, "itemView.findViewById(R.id.default_avatar_frame)");
        this.f66742h = (FrameLayout) findViewById5;
        View findViewById6 = view.findViewById(C10322k.default_avatar_image);
        C41536l.m120488h(findViewById6, "itemView.findViewById(R.id.default_avatar_image)");
        this.f66743i = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(C10322k.f28882py);
        C41536l.m120488h(findViewById7, "itemView.findViewById(R.id.transfer_button)");
        this.f66744j = findViewById7;
        View findViewById8 = view.findViewById(C10322k.buttons_group);
        C41536l.m120488h(findViewById8, "itemView.findViewById(R.id.buttons_group)");
        this.f66745k = (LinearLayout) findViewById8;
        View findViewById9 = view.findViewById(C10322k.mini_transfer_button);
        C41536l.m120488h(findViewById9, "itemView.findViewById(R.id.mini_transfer_button)");
        this.f66746l = (ImageView) findViewById9;
        View findViewById10 = view.findViewById(C10322k.money_request_button);
        C41536l.m120488h(findViewById10, "itemView.findViewById(R.id.money_request_button)");
        this.f66747m = (ImageView) findViewById10;
        View findViewById11 = view.findViewById(C10322k.bill_split_button);
        C41536l.m120488h(findViewById11, "itemView.findViewById(R.id.bill_split_button)");
        this.f66748n = (ImageView) findViewById11;
        View findViewById12 = view.findViewById(C10322k.verifiedBadge);
        C41536l.m120488h(findViewById12, "itemView.findViewById(R.id.verifiedBadge)");
        this.f66749o = (ImageView) findViewById12;
        View findViewById13 = view.findViewById(C10322k.f28714C8);
        C41536l.m120488h(findViewById13, "itemView.findViewById(R.id.constraintLayout)");
        this.f66750p = (ConstraintLayout) findViewById13;
        PopupMenu popupMenu = new PopupMenu(view.getContext(), imageView);
        popupMenu.inflate(C10325n.contact_popup_menu);
        popupMenu.setOnMenuItemClickListener(new C26350j(this));
        MenuItem item = popupMenu.getMenu().getItem(1);
        SpannableString spannableString = new SpannableString(item.getTitle());
        spannableString.setSpan(new ForegroundColorSpan(C0767a.m2893c(view.getContext(), C10318g.contact_menu_delete_item_color)), 0, spannableString.length(), 0);
        item.setTitle(spannableString);
        imageView.setOnClickListener(new C26351k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final boolean m82358n(C26352l lVar, MenuItem menuItem) {
        C41536l.m120489i(lVar, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == C10322k.edit_contact_item) {
            C43064a aVar = lVar.f66751q;
            if (aVar == null) {
                return true;
            }
            aVar.invoke();
            return true;
        } else if (itemId != C10322k.delete_contact_item) {
            return false;
        } else {
            C43064a aVar2 = lVar.f66752r;
            if (aVar2 == null) {
                return true;
            }
            aVar2.invoke();
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m82359o(C26352l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        C43064a aVar = lVar.f66753s;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m82360q(C26352l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        C43064a aVar = lVar.f66754t;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m82361r(C26352l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        C43064a aVar = lVar.f66754t;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m82362s(C26352l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        C43064a aVar = lVar.f66755u;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m82363t(C26352l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        C43064a aVar = lVar.f66756v;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: p */
    public final void mo65533p(C28297b bVar, C28298c cVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C41536l.m120489i(bVar, "contactNameItem");
        C41536l.m120489i(cVar, "profilePictureItem");
        this.f66740f.setText(bVar.mo67933a());
        if (!z3) {
            C32343x.m95401L0(this.f66749o);
        } else if (z2) {
            this.f66749o.setImageResource(C10320i.ic_verified_big);
        } else {
            this.f66749o.setImageResource(C10320i.ic_non_verified);
        }
        ViewGroup.LayoutParams layoutParams = this.f66749o.getLayoutParams();
        C41536l.m120487g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0620b bVar2 = (ConstraintLayout.C0620b) layoutParams;
        String b = bVar.mo67934b();
        if (b == null || b.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.f66741g.setVisibility(8);
        } else {
            this.f66741g.setVisibility(0);
            this.f66741g.setText(bVar.mo67934b());
        }
        if (cVar.mo67942c() != null) {
            this.f66739e.setVisibility(0);
            this.f66742h.setVisibility(8);
            C32289b0.m95097i(this.f66739e, cVar.mo67942c());
            bVar2.f2534j = this.f66739e.getId();
            bVar2.f2538l = this.f66739e.getId();
        } else {
            this.f66739e.setVisibility(8);
            this.f66742h.setVisibility(0);
            this.f66743i.setImageResource(cVar.mo67940a());
            bVar2.f2534j = this.f66742h.getId();
            bVar2.f2538l = this.f66742h.getId();
        }
        this.f66749o.setLayoutParams(bVar2);
        this.f66750p.requestLayout();
        if (z) {
            this.f66745k.setVisibility(0);
            this.f66744j.setVisibility(8);
        } else {
            this.f66745k.setVisibility(8);
            this.f66744j.setVisibility(0);
        }
        this.f66746l.setOnClickListener(new C26346f(this));
        this.f66744j.setOnClickListener(new C26347g(this));
        this.f66747m.setOnClickListener(new C26348h(this));
        this.f66748n.setOnClickListener(new C26349i(this));
    }

    /* renamed from: u */
    public final void mo65534u(C43064a aVar) {
        this.f66752r = aVar;
    }

    /* renamed from: v */
    public final void mo65535v(C43064a aVar) {
        this.f66751q = aVar;
    }

    /* renamed from: w */
    public final void mo65536w(C43064a aVar) {
        this.f66756v = aVar;
    }

    /* renamed from: x */
    public final void mo65537x(C43064a aVar) {
        this.f66755u = aVar;
    }

    /* renamed from: y */
    public final void mo65538y(C43064a aVar) {
        this.f66754t = aVar;
    }

    /* renamed from: z */
    public final void mo65539z(C43064a aVar) {
        this.f66753s = aVar;
    }
}
