package g60;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import f60.C20441c;
import g91.C32343x;
import g91.C32359z0;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.model.template.TemplateGroupComment;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import ue1.C43075l;

/* renamed from: g60.j */
public final class C20753j extends C20742c {

    /* renamed from: r */
    public static final C20754a f55947r = new C20754a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C43075l f55948d;

    /* renamed from: e */
    private C43075l f55949e;

    /* renamed from: f */
    private C43075l f55950f;

    /* renamed from: g */
    private C20441c f55951g;

    /* renamed from: h */
    private final FrameLayout f55952h;

    /* renamed from: i */
    private final BogTextView f55953i;

    /* renamed from: j */
    private final BogTextView f55954j;

    /* renamed from: k */
    private final BogTextView f55955k;

    /* renamed from: l */
    private final BogTextView f55956l;

    /* renamed from: m */
    private final View f55957m;

    /* renamed from: n */
    private final View f55958n;

    /* renamed from: o */
    private final LinearLayout f55959o;

    /* renamed from: p */
    private final BogTextView f55960p;

    /* renamed from: q */
    private final SwipeLayout f55961q;

    /* renamed from: g60.j$a */
    public static final class C20754a {
        private C20754a() {
        }

        public /* synthetic */ C20754a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final void m67188b(Context context, SwipeLayout swipeLayout) {
            Context context2 = context;
            ArrayList arrayList = new ArrayList();
            String string = context2.getString(C10328q.template_swipe_menu_edit);
            Integer valueOf = Integer.valueOf(C10320i.edit_new);
            Integer valueOf2 = Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_contact_edit_background));
            int i = C10318g.swipe_menu_contact_edit_text_color;
            arrayList.add(new SwipeLayout.C2363g("EDIT_ID", string, valueOf, valueOf2, Integer.valueOf(C0767a.m2893c(context2, i)), Integer.valueOf(C0767a.m2893c(context2, i)), (Float) null));
            String string2 = context2.getString(C10328q.template_swipe_menu_delete);
            Integer valueOf3 = Integer.valueOf(C10320i.delete_new);
            Integer valueOf4 = Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_contact_delete_background));
            int i2 = C10318g.f28650u2;
            arrayList.add(new SwipeLayout.C2363g("DELETE_ID", string2, valueOf3, valueOf4, Integer.valueOf(C0767a.m2893c(context2, i2)), Integer.valueOf(C0767a.m2893c(context2, i2)), (Float) null));
            swipeLayout.setRightSwipeItems(arrayList);
        }

        /* renamed from: a */
        public final C20753j mo49298a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_car_item_swipable, viewGroup, false);
            Context context = viewGroup.getContext();
            C41536l.m120488h(context, "parent.context");
            C41536l.m120487g(inflate, "null cannot be cast to non-null type com.alexandrius.accordionswipelayout.library.SwipeLayout");
            m67188b(context, (SwipeLayout) inflate);
            return new C20753j(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20753j(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.template_basket_container);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.…emplate_basket_container)");
        this.f55952h = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C10322k.template_item_title);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.template_item_title)");
        this.f55953i = (BogTextView) findViewById2;
        View findViewById3 = view.findViewById(C10322k.template_item_mid_desc);
        C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.template_item_mid_desc)");
        this.f55954j = (BogTextView) findViewById3;
        View findViewById4 = view.findViewById(C10322k.template_item_bottom_desc);
        C41536l.m120488h(findViewById4, "itemView.findViewById(R.…emplate_item_bottom_desc)");
        this.f55955k = (BogTextView) findViewById4;
        View findViewById5 = view.findViewById(C10322k.error_tv);
        C41536l.m120488h(findViewById5, "itemView.findViewById(R.id.error_tv)");
        this.f55956l = (BogTextView) findViewById5;
        View findViewById6 = view.findViewById(C10322k.retry_get_debt);
        C41536l.m120488h(findViewById6, "itemView.findViewById(R.id.retry_get_debt)");
        this.f55957m = findViewById6;
        View findViewById7 = view.findViewById(C10322k.blur_view);
        C41536l.m120488h(findViewById7, "itemView.findViewById(R.id.blur_view)");
        this.f55958n = findViewById7;
        View findViewById8 = view.findViewById(C10322k.amount_wrapper);
        C41536l.m120488h(findViewById8, "itemView.findViewById(R.id.amount_wrapper)");
        this.f55959o = (LinearLayout) findViewById8;
        View findViewById9 = view.findViewById(C10322k.non_editable_tv);
        C41536l.m120488h(findViewById9, "itemView.findViewById(R.id.non_editable_tv)");
        this.f55960p = (BogTextView) findViewById9;
        View findViewById10 = view.findViewById(C10322k.swipe_layout);
        C41536l.m120488h(findViewById10, "itemView.findViewById(R.id.swipe_layout)");
        this.f55961q = (SwipeLayout) findViewById10;
    }

    /* renamed from: j */
    private final TemplateGroup m67179j() {
        C20441c cVar = this.f55951g;
        if (cVar != null) {
            return cVar.mo48951b();
        }
        return null;
    }

    /* renamed from: k */
    private final void m67180k() {
        String str;
        String str2;
        boolean z;
        int i;
        TemplateGroup b;
        TemplateGroup b2;
        TemplateGroupComment commentGroupByType;
        this.f55952h.setBackgroundColor(C0767a.m2893c(this.itemView.getContext(), C10318g.f28625J0));
        BogTextView bogTextView = this.f55953i;
        TemplateGroup j = m67179j();
        Integer num = null;
        if (j != null) {
            str = j.getGroupName();
        } else {
            str = null;
        }
        bogTextView.setText(str);
        TemplateGroup j2 = m67179j();
        if (j2 == null || (commentGroupByType = j2.getCommentGroupByType(PensionStatusResult.STATUS_ACTIVE)) == null) {
            str2 = null;
        } else {
            str2 = commentGroupByType.getComment();
        }
        int i2 = 0;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C32343x.m95401L0(this.f55954j);
        } else {
            C32343x.m95407O0(this.f55954j);
        }
        this.f55954j.setText(str2);
        C32343x.m95401L0(this.f55955k);
        C32343x.m95401L0(this.f55956l);
        C32343x.m95401L0(this.f55957m);
        C32343x.m95401L0(this.f55958n);
        C32343x.m95401L0(this.f55959o);
        C32343x.m95407O0(this.f55960p);
        C20441c cVar = this.f55951g;
        if (!(cVar == null || (b2 = cVar.mo48951b()) == null)) {
            i2 = b2.getPenaltiesAmount();
        }
        BogTextView bogTextView2 = this.f55960p;
        C20441c cVar2 = this.f55951g;
        if (!(cVar2 == null || (b = cVar2.mo48951b()) == null)) {
            num = Integer.valueOf(b.getPenaltiesAmount());
        }
        String str3 = " ₾";
        if (num != null) {
            str3 = C32359z0.m95541L(String.valueOf(i2)) + str3;
        }
        bogTextView2.setText(str3);
        BogTextView bogTextView3 = this.f55960p;
        Context context = this.itemView.getContext();
        if (i2 > 0) {
            i = C10318g.bog_error_red;
        } else if (i2 < 0) {
            i = C10318g.success_green;
        } else {
            i = C10318g.color_invert_component_tr_300;
        }
        bogTextView3.setTextColor(C0767a.m2893c(context, i));
    }

    /* renamed from: p */
    private final void m67181p() {
        this.itemView.setOnClickListener(new C20751h(this));
        this.f55961q.setOnSwipeItemClickListener(new C20752i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m67182q(C20753j jVar, View view) {
        C43075l lVar;
        C41536l.m120489i(jVar, "this$0");
        C20441c cVar = jVar.f55951g;
        if (cVar != null && (lVar = jVar.f55948d) != null) {
            lVar.invoke(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m67183r(C20753j jVar, boolean z, String str) {
        C20441c cVar;
        C43075l lVar;
        C43075l lVar2;
        C41536l.m120489i(jVar, "this$0");
        if (z) {
            return;
        }
        if (C41536l.m120484d(str, "EDIT_ID")) {
            C20441c cVar2 = jVar.f55951g;
            if (cVar2 != null && (lVar2 = jVar.f55950f) != null) {
                lVar2.invoke(cVar2);
            }
        } else if (C41536l.m120484d(str, "DELETE_ID") && (cVar = jVar.f55951g) != null && (lVar = jVar.f55949e) != null) {
            lVar.invoke(cVar);
        }
    }

    /* renamed from: l */
    public void onBind(C20441c cVar) {
        C41536l.m120489i(cVar, "data");
        this.f55951g = cVar;
        m67180k();
        m67181p();
    }

    /* renamed from: m */
    public final void mo49295m(C43075l lVar) {
        this.f55949e = lVar;
    }

    /* renamed from: n */
    public final void mo49296n(C43075l lVar) {
        this.f55950f = lVar;
    }

    /* renamed from: o */
    public final void mo49297o(C43075l lVar) {
        this.f55948d = lVar;
    }
}
