package n00;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import g91.C32343x;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37106c;
import l81.C37107d;
import m81.C37246a;
import p341ge.bog.mobilebank.model.offers.ScheduleInfo;
import p341ge.bog.mobilebank.model.offers.Summary;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: n00.a */
public final class C26336a extends C37106c {

    /* renamed from: f */
    public static final C26337a f66702f = new C26337a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private ArrayList f66703d = new ArrayList();

    /* renamed from: e */
    private Summary f66704e;

    /* renamed from: n00.a$a */
    public static final class C26337a {
        private C26337a() {
        }

        public /* synthetic */ C26337a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: n00.a$b */
    public static final class C26338b extends C37107d {

        /* renamed from: f */
        private final TextView f66705f;

        /* renamed from: g */
        private final TextView f66706g;

        /* renamed from: h */
        private final LinearLayout f66707h;

        /* renamed from: i */
        private final ConstraintLayout f66708i;

        /* renamed from: j */
        private int f66709j;

        /* renamed from: k */
        private final Context f66710k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26338b(View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            View findViewById = view.findViewById(C10322k.precontract_header_item_title);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.…ntract_header_item_title)");
            this.f66705f = (TextView) findViewById;
            View findViewById2 = view.findViewById(C10322k.precontract_header_amount);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.…recontract_header_amount)");
            this.f66706g = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C10322k.precontract_expanded_content_container);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.…panded_content_container)");
            this.f66707h = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(C10322k.f28714C8);
            C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.constraintLayout)");
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById4;
            this.f66708i = constraintLayout;
            this.f66710k = view.getContext();
            constraintLayout.setOnClickListener(new C26339b(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m82330j(C26338b bVar, View view) {
            String str;
            C41536l.m120489i(bVar, "this$0");
            Object tag = bVar.f66707h.getTag();
            if (tag instanceof String) {
                str = (String) tag;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (C40439w.m117115s(str, "EXPANDED", true)) {
                bVar.f66707h.setVisibility(4);
                bVar.f66707h.startAnimation(new C37246a(bVar.f66707h, 1));
                bVar.f66707h.setTag((Object) null);
                return;
            }
            bVar.f66707h.setVisibility(0);
            bVar.f66707h.startAnimation(new C37246a(bVar.f66707h, bVar.f66709j));
            bVar.f66707h.setTag("EXPANDED");
        }

        /* renamed from: k */
        private final void m82331k(View view) {
            this.f66707h.addView(view);
            this.f66709j += 75;
        }

        /* renamed from: m */
        private final View m82332m(String str, String str2) {
            View inflate = LayoutInflater.from(this.f89287d.getContext()).inflate(C10324m.precontract_expanded_details_item, (ViewGroup) null);
            ((TextView) inflate.findViewById(C10322k.expanded_details_title)).setText(str + ":");
            ((TextView) inflate.findViewById(C10322k.expanded_details_amount)).setText(str2);
            C41536l.m120488h(inflate, "view");
            return inflate;
        }

        /* renamed from: n */
        private final String m82333n(String str, String str2) {
            return C32343x.m95408P(new BigDecimal(str), str2);
        }

        /* renamed from: l */
        public final void mo65515l(ScheduleInfo scheduleInfo) {
            boolean z;
            boolean z2;
            boolean z3;
            C41536l.m120489i(scheduleInfo, "scheduleInfo");
            String h = C32303f.m95197h(scheduleInfo.getCcy());
            String sumAmount = scheduleInfo.getSumAmount();
            C41536l.m120488h(sumAmount, "scheduleInfo.sumAmount");
            BigDecimal bigDecimal = new BigDecimal(sumAmount);
            C41536l.m120488h(h, "ccy");
            this.f66706g.setText(C32343x.m95408P(bigDecimal, h));
            this.f66705f.setText(scheduleInfo.getPayDate());
            this.f66707h.removeAllViews();
            boolean z4 = false;
            this.f66709j = 0;
            String priAmount = scheduleInfo.getPriAmount();
            C41536l.m120488h(priAmount, "scheduleInfo.priAmount");
            if (Double.parseDouble(priAmount) == Utils.DOUBLE_EPSILON) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String string = this.f66710k.getString(C10328q.precontract_principal_amount);
                C41536l.m120488h(string, "context.getString(R.stri…ontract_principal_amount)");
                String priAmount2 = scheduleInfo.getPriAmount();
                C41536l.m120488h(priAmount2, "scheduleInfo.priAmount");
                m82331k(m82332m(string, m82333n(priAmount2, h)));
            }
            String intAmount = scheduleInfo.getIntAmount();
            C41536l.m120488h(intAmount, "scheduleInfo.intAmount");
            if (Double.parseDouble(intAmount) == Utils.DOUBLE_EPSILON) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                String string2 = this.f66710k.getString(C10328q.precontract_interest);
                C41536l.m120488h(string2, "context.getString(R.string.precontract_interest)");
                String intAmount2 = scheduleInfo.getIntAmount();
                C41536l.m120488h(intAmount2, "scheduleInfo.intAmount");
                m82331k(m82332m(string2, m82333n(intAmount2, h)));
            }
            String insAmount = scheduleInfo.getInsAmount();
            C41536l.m120488h(insAmount, "scheduleInfo.insAmount");
            if (Double.parseDouble(insAmount) == Utils.DOUBLE_EPSILON) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                String string3 = this.f66710k.getString(C10328q.precontract_life_insurance);
                C41536l.m120488h(string3, "context.getString(R.stri…econtract_life_insurance)");
                String insAmount2 = scheduleInfo.getInsAmount();
                C41536l.m120488h(insAmount2, "scheduleInfo.insAmount");
                m82331k(m82332m(string3, m82333n(insAmount2, h)));
            }
            String comAmount = scheduleInfo.getComAmount();
            C41536l.m120488h(comAmount, "scheduleInfo.comAmount");
            if (Double.parseDouble(comAmount) == Utils.DOUBLE_EPSILON) {
                z4 = true;
            }
            if (!z4) {
                String string4 = this.f66710k.getString(C10328q.precontract_comission);
                C41536l.m120488h(string4, "context.getString(R.string.precontract_comission)");
                String comAmount2 = scheduleInfo.getComAmount();
                C41536l.m120488h(comAmount2, "scheduleInfo.comAmount");
                m82331k(m82332m(string4, m82333n(comAmount2, h)));
            }
            this.f66709j += 20;
        }
    }

    public int getItemCount() {
        return this.f66703d.size();
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    /* renamed from: i */
    public void onBindViewHolder(C37107d dVar, int i) {
        C41536l.m120489i(dVar, "holder");
        if (dVar instanceof C26338b) {
            Object obj = this.f66703d.get(i - 1);
            C41536l.m120488h(obj, "scheduleInfo[position - 1]");
            ((C26338b) dVar).mo65515l((ScheduleInfo) obj);
        }
    }

    /* renamed from: j */
    public C37107d onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 0) {
            return new C37107d(C32343x.m95470n0(C10324m.precontract_header_item, viewGroup, false, 2, (Object) null));
        }
        return new C26338b(C32343x.m95470n0(C10324m.precontract_expandable_item, viewGroup, false, 2, (Object) null));
    }

    /* renamed from: k */
    public final void mo65514k(ArrayList arrayList, Summary summary) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f66703d = arrayList;
        this.f66704e = summary;
        notifyDataSetChanged();
    }
}
