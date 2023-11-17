package g81;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import g91.C32289b0;
import g91.C32303f;
import iu0.C36546y;
import j81.C36772n;
import java.util.ArrayList;
import l81.C37107d;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: g81.l0 */
public class C32245l0 extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C36772n f79524d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f79525e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList f79526f;

    /* renamed from: g */
    private RecyclerView f79527g;

    /* renamed from: g81.l0$a */
    private class C32246a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private View f79528d;

        /* renamed from: e */
        private BogTextView f79529e;

        /* renamed from: g81.l0$a$a */
        class C32247a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32245l0 f79531d;

            C32247a(C32245l0 l0Var) {
                this.f79531d = l0Var;
            }

            public void onClick(View view) {
                if (C32245l0.this.f79524d != null) {
                    C32245l0.this.f79524d.mo86323T((TemplateBasketItem) null);
                }
            }
        }

        public C32246a(View view) {
            super(view);
            this.f79528d = view.findViewById(C10322k.add_template_create_button);
            BogTextView bogTextView = (BogTextView) view.findViewById(C10322k.f28915yx);
            this.f79529e = bogTextView;
            bogTextView.setText(C32245l0.this.f79525e.getString(C10328q.templates_add_template));
            this.f79528d.setOnClickListener(new C32247a(C32245l0.this));
        }
    }

    /* renamed from: g81.l0$b */
    public class C32248b extends C37107d {
        public C32248b(View view) {
            super(view);
        }
    }

    /* renamed from: g81.l0$c */
    private class C32249c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        BogTextView f79534d;

        /* renamed from: e */
        View f79535e;

        /* renamed from: f */
        View f79536f;

        /* renamed from: g */
        View f79537g;

        public C32249c(View view) {
            super(view);
            this.f79534d = (BogTextView) view.findViewById(C10322k.f28741Hf);
            this.f79535e = view.findViewById(C10322k.settings_btn);
            this.f79536f = view.findViewById(C10322k.f28875o9);
            this.f79537g = view.findViewById(C10322k.header_arrow_container);
            this.f79534d.setText(C32245l0.this.f79525e.getString(C10328q.templates_list_header_my_templates));
            this.f79535e.setVisibility(8);
            this.f79537g.setVisibility(8);
        }
    }

    /* renamed from: g81.l0$d */
    private class C32250d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        SwipeLayout f79539d;

        /* renamed from: e */
        View f79540e;

        /* renamed from: f */
        ImageView f79541f;

        /* renamed from: g */
        BogTextView f79542g;

        /* renamed from: h */
        BogTextView f79543h;

        /* renamed from: i */
        BogTextView f79544i;

        /* renamed from: j */
        BogTextView f79545j;

        /* renamed from: k */
        View f79546k;

        /* renamed from: l */
        View.OnClickListener f79547l = new C32251a();

        /* renamed from: g81.l0$d$a */
        class C32251a implements View.OnClickListener {
            C32251a() {
            }

            public void onClick(View view) {
                C32250d dVar = C32250d.this;
                int i = C32245l0.this.m94964l(dVar.getAdapterPosition());
                if (C32245l0.this.f79524d != null) {
                    C32245l0.this.f79524d.mo86323T((TemplateBasketItem) C32245l0.this.f79526f.get(i));
                }
                C32250d.this.f79539d.mo7586B(2, true);
            }
        }

        /* renamed from: g81.l0$d$b */
        class C32252b implements SwipeLayout.C2362f {

            /* renamed from: a */
            final /* synthetic */ C32245l0 f79550a;

            C32252b(C32245l0 l0Var) {
                this.f79550a = l0Var;
            }

            /* renamed from: a */
            public void mo7627a(SwipeLayout swipeLayout, boolean z) {
                C36546y.m108282F().mo27153t("transfers_templates", z ? "right" : "left", "swipe_template", Long.valueOf(z ? 1 : -1));
            }
        }

        /* renamed from: g81.l0$d$c */
        class C32253c implements SwipeLayout.C2361e {

            /* renamed from: a */
            final /* synthetic */ C32245l0 f79552a;

            C32253c(C32245l0 l0Var) {
                this.f79552a = l0Var;
            }

            /* renamed from: a */
            public void mo7626a(boolean z, String str) {
                C32250d.this.f79539d.mo7586B(2, true);
                if (z) {
                    str.hashCode();
                    if (str.equals("AUTOMATIC_SERVICES_ID") && C32245l0.this.f79524d != null) {
                        C36772n g = C32245l0.this.f79524d;
                        ArrayList h = C32245l0.this.f79526f;
                        C32250d dVar = C32250d.this;
                        g.mo86324a((TemplateBasketItem) h.get(C32245l0.this.m94964l(dVar.getAdapterPosition())), 4);
                        return;
                    }
                    return;
                }
                str.hashCode();
                if (!str.equals("DELETE_ID")) {
                    if (str.equals("EDIT_ID") && C32245l0.this.f79524d != null) {
                        C36772n g2 = C32245l0.this.f79524d;
                        ArrayList h2 = C32245l0.this.f79526f;
                        C32250d dVar2 = C32250d.this;
                        g2.mo86324a((TemplateBasketItem) h2.get(C32245l0.this.m94964l(dVar2.getAdapterPosition())), 2);
                    }
                } else if (C32245l0.this.f79524d != null) {
                    C36772n g3 = C32245l0.this.f79524d;
                    ArrayList h3 = C32245l0.this.f79526f;
                    C32250d dVar3 = C32250d.this;
                    g3.mo86324a((TemplateBasketItem) h3.get(C32245l0.this.m94964l(dVar3.getAdapterPosition())), 3);
                }
            }
        }

        public C32250d(View view) {
            super(view);
            View findViewById = view.findViewById(C10322k.rounded_container);
            this.f79540e = findViewById;
            findViewById.setBackground(C0767a.m2895e(C32245l0.this.f79525e, C10320i.circle_image_background));
            this.f79541f = (ImageView) view.findViewById(C10322k.rounded_image);
            this.f79542g = (BogTextView) view.findViewById(C10322k.non_editable_tv);
            this.f79543h = (BogTextView) view.findViewById(C10322k.template_item_title);
            this.f79544i = (BogTextView) view.findViewById(C10322k.template_item_mid_desc);
            this.f79545j = (BogTextView) view.findViewById(C10322k.transfer_text);
            View findViewById2 = view.findViewById(C10322k.below_amount);
            this.f79546k = findViewById2;
            findViewById2.setVisibility(8);
            SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(C10322k.swipe_layout);
            this.f79539d = swipeLayout;
            swipeLayout.setOnClickListener(this.f79547l);
            this.f79539d.setOnSwipedListener(new C32252b(C32245l0.this));
            this.f79539d.setOnSwipeItemClickListener(new C32253c(C32245l0.this));
        }
    }

    public C32245l0(Context context, C36772n nVar) {
        this.f79525e = context;
        this.f79524d = nVar;
    }

    /* renamed from: k */
    private void m94963k(Context context, SwipeLayout swipeLayout) {
        Context context2 = context;
        SwipeLayout swipeLayout2 = swipeLayout;
        String string = context2.getString(C10328q.template_swipe_menu_automatic_services);
        Integer valueOf = Integer.valueOf(C10320i.ic_swipe_automatic);
        int i = C10318g.swipe_menu_item_1;
        Integer valueOf2 = Integer.valueOf(C0767a.m2893c(context2, i));
        int i2 = C10318g.swipe_menu_item_text_color;
        Integer valueOf3 = Integer.valueOf(C0767a.m2893c(context2, i2));
        int i3 = C10318g.swipe_menu_item_icon_tint_color;
        SwipeLayout.C2363g gVar = new SwipeLayout.C2363g("AUTOMATIC_SERVICES_ID", string, valueOf, valueOf2, valueOf3, Integer.valueOf(C0767a.m2893c(context2, i3)), (Float) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SwipeLayout.C2363g("EDIT_ID", context2.getString(C10328q.template_swipe_menu_edit), Integer.valueOf(C10320i.ic_swipe_edit), Integer.valueOf(C0767a.m2893c(context2, i)), Integer.valueOf(C0767a.m2893c(context2, i2)), Integer.valueOf(C0767a.m2893c(context2, i3)), (Float) null));
        arrayList.add(new SwipeLayout.C2363g("DELETE_ID", context2.getString(C10328q.template_swipe_menu_delete), Integer.valueOf(C10320i.ic_swipe_delete), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_delete_item_color)), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_item_text_white_color)), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_item_icon_white_tint_color)), (Float) null));
        swipeLayout2.setLeftSwipeItem(gVar);
        swipeLayout2.setRightSwipeItems(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public int m94964l(int i) {
        return (i - 1) / 2;
    }

    public int getItemCount() {
        ArrayList arrayList = this.f79526f;
        if (arrayList != null) {
            return 2 + (arrayList.size() * 2);
        }
        return 2;
    }

    public int getItemViewType(int i) {
        int i2;
        if (i == 0) {
            return 10;
        }
        ArrayList arrayList = this.f79526f;
        if (arrayList != null) {
            i2 = arrayList.size() * 2;
        } else {
            i2 = 0;
        }
        if (i == i2 + 1) {
            return 30;
        }
        if (i % 2 == 0) {
            return 25;
        }
        return 7777;
    }

    /* renamed from: j */
    public void mo72763j() {
        this.f79526f = null;
        notifyDataSetChanged();
    }

    /* renamed from: m */
    public void mo72764m(ArrayList arrayList) {
        this.f79526f = arrayList;
        notifyDataSetChanged();
        RecyclerView recyclerView = this.f79527g;
        if (recyclerView != null) {
            recyclerView.mo5253C1(-1, -1);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f79527g = recyclerView;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        String str;
        String str2;
        if (f0Var.getItemViewType() == 7777) {
            TemplateBasketItem templateBasketItem = (TemplateBasketItem) this.f79526f.get(m94964l(i));
            C32250d dVar = (C32250d) f0Var;
            if (templateBasketItem.getTemplateName() == null || templateBasketItem.getTemplateName().isEmpty()) {
                str = templateBasketItem.getParameterValue("recipientName");
            } else {
                str = templateBasketItem.getTemplateName();
            }
            dVar.f79543h.setText(str);
            dVar.f79544i.setText(C32303f.m95211v(templateBasketItem.getTemplateType()));
            try {
                BogTextView bogTextView = dVar.f79542g;
                StringBuilder sb = new StringBuilder();
                sb.append(C32303f.m95204o(Double.valueOf(templateBasketItem.getParameterValue("amount")).doubleValue()));
                if (templateBasketItem.getParameterValue("currency") != null) {
                    str2 = C32303f.m95198i(templateBasketItem.getParameterValue("currency"), true);
                } else {
                    str2 = "";
                }
                sb.append(str2);
                bogTextView.setText(sb.toString());
            } catch (Exception unused) {
                dVar.f79542g.setText("");
            }
            dVar.f79541f.setVisibility(0);
            dVar.f79545j.setVisibility(8);
            if (!C32289b0.m95110v(templateBasketItem, dVar.f79541f, this.f79525e)) {
                dVar.f79541f.setVisibility(8);
                dVar.f79545j.setVisibility(0);
                dVar.f79545j.setText(templateBasketItem.getTransferInitials());
            }
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 10) {
            return new C32249c(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_header_item, viewGroup, false));
        }
        if (i == 25) {
            return new C32248b(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.template_basket_item_divider, viewGroup, false));
        }
        if (i == 30) {
            return new C32246a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.templates_add_layout, viewGroup, false));
        }
        if (i != 7777) {
            return null;
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.transfer_template_swipable, viewGroup, false);
        m94963k(viewGroup.getContext(), (SwipeLayout) inflate);
        return new C32250d(inflate);
    }
}
