package g81;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import g91.C32289b0;
import g91.C32303f;
import g91.C32319m;
import j81.C36761c;
import java.util.ArrayList;
import l81.C37106c;
import l81.C37107d;
import p341ge.bog.mobilebank.model.ddsto.CardDebitDetails;
import p341ge.bog.mobilebank.model.ddsto.DDPaymentDetails;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.model.ddsto.DDSTODetailsWrapper;
import p341ge.bog.mobilebank.model.ddsto.STODetails;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import r90.C27950a;
import r90.C27954d;

/* renamed from: g81.i */
public class C32187i extends C37106c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f79333d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList f79334e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f79335f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C36761c f79336g;

    /* renamed from: g81.i$a */
    private class C32188a extends C37107d {

        /* renamed from: f */
        private BogTextView f79337f = ((BogTextView) mo90036h(C10322k.f28915yx));

        /* renamed from: g */
        private View f79338g;

        /* renamed from: g81.i$a$a */
        class C32189a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32187i f79340d;

            C32189a(C32187i iVar) {
                this.f79340d = iVar;
            }

            public void onClick(View view) {
                if (C32187i.this.f79336g != null) {
                    C32187i.this.f79336g.mo86636p0((DDSTO) null);
                }
            }
        }

        public C32188a(View view) {
            super(view);
            int i;
            if (C32187i.this.f79335f == 10) {
                i = C10328q.dd_sto_add_dd;
            } else {
                i = C10328q.dd_sto_add_sto;
            }
            this.f79337f.setText(C32187i.this.f79333d.getString(i));
            View h = mo90036h(C10322k.add_template_create_button);
            this.f79338g = h;
            h.setOnClickListener(new C32189a(C32187i.this));
        }
    }

    /* renamed from: g81.i$b */
    private class C32190b extends C37107d {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public SwipeLayout f79342f;

        /* renamed from: g */
        private View f79343g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public ImageView f79344h = ((ImageView) mo90036h(C10322k.rounded_image));
        /* access modifiers changed from: private */

        /* renamed from: i */
        public BogTextView f79345i = ((BogTextView) mo90036h(C10322k.non_editable_tv));
        /* access modifiers changed from: private */

        /* renamed from: j */
        public BogTextView f79346j = ((BogTextView) mo90036h(C10322k.template_item_title));
        /* access modifiers changed from: private */

        /* renamed from: k */
        public BogTextView f79347k = ((BogTextView) mo90036h(C10322k.template_item_mid_desc));

        /* renamed from: l */
        private BogTextView f79348l = ((BogTextView) mo90036h(C10322k.transfer_text));
        /* access modifiers changed from: private */

        /* renamed from: m */
        public BogTextView f79349m = ((BogTextView) mo90036h(C10322k.below_amount));

        /* renamed from: g81.i$b$a */
        class C32191a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32187i f79351d;

            C32191a(C32187i iVar) {
                this.f79351d = iVar;
            }

            public void onClick(View view) {
                C32190b.this.f79342f.mo7586B(2, true);
                if (C32187i.this.f79336g != null) {
                    C32187i.this.f79336g.mo86636p0((DDSTO) C32187i.this.f79334e.get(C32190b.this.getAdapterPosition() / 2));
                }
            }
        }

        /* renamed from: g81.i$b$b */
        class C32192b implements SwipeLayout.C2361e {

            /* renamed from: a */
            final /* synthetic */ C32187i f79353a;

            C32192b(C32187i iVar) {
                this.f79353a = iVar;
            }

            /* renamed from: a */
            public void mo7626a(boolean z, String str) {
                C32190b.this.f79342f.mo7586B(2, true);
                if (z) {
                    str.hashCode();
                    if (str.equals("EDIT_ID") && C32187i.this.f79336g != null) {
                        C32187i.this.f79336g.mo86633l((DDSTO) C32187i.this.f79334e.get(C32190b.this.getAdapterPosition() / 2), 20);
                        return;
                    }
                    return;
                }
                str.hashCode();
                if (str.equals("DELETE_ID") && C32187i.this.f79336g != null) {
                    C32187i.this.f79336g.mo86633l((DDSTO) C32187i.this.f79334e.get(C32190b.this.getAdapterPosition() / 2), 10);
                }
            }
        }

        public C32190b(View view) {
            super(view);
            View h = mo90036h(C10322k.rounded_container);
            this.f79343g = h;
            h.setBackground(C0767a.m2895e(C32187i.this.f79333d, C10320i.circle_image_background));
            this.f79344h.setVisibility(0);
            this.f79349m.setVisibility(0);
            this.f79348l.setVisibility(8);
            SwipeLayout swipeLayout = (SwipeLayout) mo90036h(C10322k.swipe_layout);
            this.f79342f = swipeLayout;
            swipeLayout.setOnClickListener(new C32191a(C32187i.this));
            this.f79342f.setOnSwipeItemClickListener(new C32192b(C32187i.this));
        }
    }

    /* renamed from: g81.i$c */
    private class C32193c extends C37107d {
        public C32193c(View view) {
            super(view);
        }
    }

    public C32187i(Context context, C36761c cVar, int i) {
        this.f79333d = context;
        this.f79335f = i;
        this.f79336g = cVar;
    }

    /* renamed from: n */
    private void m94848n(Context context, SwipeLayout swipeLayout) {
        Context context2 = context;
        SwipeLayout swipeLayout2 = swipeLayout;
        SwipeLayout.C2363g gVar = new SwipeLayout.C2363g("EDIT_ID", context2.getString(C10328q.dd_sto_swipe_edit), Integer.valueOf(C10320i.ic_swipe_edit), Integer.valueOf(C0767a.m2893c(context2, C10318g.templates_item_swipe_dark_grey_background)), Integer.valueOf(C0767a.m2893c(context2, C10318g.templates_item_swipe_grey_text_color)), (Integer) null, (Float) null);
        SwipeLayout.C2363g gVar2 = new SwipeLayout.C2363g("DELETE_ID", context2.getString(C10328q.dd_sto_swipe_delete), Integer.valueOf(C10320i.ic_swipe_delete), Integer.valueOf(C0767a.m2893c(context2, C10318g.templates_item_swipe_red_background)), Integer.valueOf(C0767a.m2893c(context2, C10318g.templates_item_swipe_white_text_color)), (Integer) null, (Float) null);
        swipeLayout2.setLeftSwipeItem(gVar);
        swipeLayout2.setRightSwipeItem(gVar2);
    }

    public int getItemCount() {
        ArrayList arrayList = this.f79334e;
        return (arrayList == null ? 0 : arrayList.size() * 2) + 2;
    }

    public int getItemViewType(int i) {
        if (i == getItemCount() - 1) {
            return 10;
        }
        if (i % 2 == 0) {
            return 40;
        }
        if (this.f79335f == 10) {
            return 20;
        }
        return 30;
    }

    /* renamed from: o */
    public void mo72714o(ArrayList arrayList) {
        this.f79334e = arrayList;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        DDPaymentDetails dDPaymentDetails;
        PaymentProviderConfiguration h;
        String str;
        String str2;
        String str3;
        String str4;
        int itemViewType = f0Var.getItemViewType();
        String str5 = "";
        if (itemViewType == 20) {
            DDSTO ddsto = (DDSTO) this.f79334e.get(i / 2);
            C32190b bVar = (C32190b) f0Var;
            String a = C27950a.m86284a(ddsto.dictionaryKey);
            String str6 = ddsto.details.paymentDetails.orderName;
            if (str6 != null) {
                a = str6;
            }
            bVar.f79346j.setText(a);
            bVar.f79349m.setText(str5);
            bVar.f79345i.setText(str5);
            bVar.f79347k.setText(str5);
            ImageView l = bVar.f79344h;
            int i2 = C10320i.f28688dc;
            C32289b0.m95109u(l, (Integer) null, Integer.valueOf(i2), Integer.valueOf(i2), true, false);
            DDSTODetailsWrapper dDSTODetailsWrapper = ddsto.details;
            if (!(dDSTODetailsWrapper == null || (dDPaymentDetails = dDSTODetailsWrapper.paymentDetails) == null)) {
                String str7 = dDPaymentDetails.providerServiceId;
                if (!(str7 == null || (h = C27954d.m86302h(str7)) == null)) {
                    bVar.f79346j.setText(C27950a.m86286c(h.getServiceName(), true));
                    C32289b0.m95107s(bVar.f79344h, C32289b0.m95091c(h.getLogo()), Integer.valueOf(i2), Integer.valueOf(i2), true, false);
                }
                String str8 = ddsto.details.paymentDetails.customerIdentification;
                try {
                    BogTextView j = bVar.f79345i;
                    j.setText(C32303f.m95204o(Double.valueOf(ddsto.amount).doubleValue()) + C32303f.m95198i(ddsto.ccy, true));
                } catch (Exception unused) {
                    bVar.f79345i.setText(str5);
                }
                if (ddsto.nextSentDate != null) {
                    bVar.f79349m.setText(C32319m.m95298e(ddsto.nextSentDate.longValue(), true, this.f79333d));
                } else {
                    bVar.f79349m.setText(str5);
                }
                if (!TextUtils.isEmpty(ddsto.details.paymentDetails.orderName)) {
                    bVar.f79346j.setText(ddsto.details.paymentDetails.orderName);
                }
                str5 = str8;
            }
            bVar.f79347k.setText(str5);
        } else if (itemViewType == 30) {
            DDSTO ddsto2 = (DDSTO) this.f79334e.get(i / 2);
            C32190b bVar2 = (C32190b) f0Var;
            bVar2.f79346j.setText(str5);
            bVar2.f79349m.setText(str5);
            bVar2.f79345i.setText(str5);
            bVar2.f79347k.setText(str5);
            String a2 = C27950a.m86284a(ddsto2.dictionaryKey);
            DDSTODetailsWrapper dDSTODetailsWrapper2 = ddsto2.details;
            STODetails sTODetails = dDSTODetailsWrapper2.stoDetails;
            if (sTODetails == null || (str4 = sTODetails.documentName) == null) {
                CardDebitDetails cardDebitDetails = dDSTODetailsWrapper2.cardDebitDetails;
                if (!(cardDebitDetails == null || (str3 = cardDebitDetails.billPayName) == null)) {
                    a2 = str3;
                }
            } else {
                a2 = str4;
            }
            String str9 = ddsto2.productCode;
            if (sTODetails != null) {
                str = sTODetails.subProductCode;
            } else {
                str = str5;
            }
            if (sTODetails != null) {
                str2 = sTODetails.benefAcctNo;
            } else {
                str2 = str5;
            }
            String transferFormBySTOProductCode = TransferForm.getTransferFormBySTOProductCode(str9, str, str2);
            int i3 = C10320i.ic_transfer_between_accs;
            if (TransferForm.TRANSFER_FORM_OTHER.equals(transferFormBySTOProductCode)) {
                i3 = C10320i.ic_transfer_domestic;
            } else if (TransferForm.TRANSFER_FORM_BUDGET.equals(transferFormBySTOProductCode)) {
                i3 = C10320i.ic_transfer_rs;
            }
            ImageView l2 = bVar2.f79344h;
            Integer valueOf = Integer.valueOf(i3);
            int i4 = C10320i.f28688dc;
            C32289b0.m95109u(l2, valueOf, Integer.valueOf(i4), Integer.valueOf(i4), true, true);
            DDSTODetailsWrapper dDSTODetailsWrapper3 = ddsto2.details;
            STODetails sTODetails2 = dDSTODetailsWrapper3.stoDetails;
            if (sTODetails2 != null) {
                String str10 = sTODetails2.benefAcctNo;
                if (str10 == null && (str10 = sTODetails2.benefAcctDesc) == null) {
                    str10 = str5;
                }
                try {
                    BogTextView j2 = bVar2.f79345i;
                    j2.setText(C32303f.m95204o(Double.valueOf(ddsto2.amount).doubleValue()) + C32303f.m95198i(ddsto2.ccy, true));
                } catch (Exception unused2) {
                    bVar2.f79345i.setText(str5);
                }
                bVar2.f79349m.setText(C32319m.m95298e(ddsto2.nextSentDate.longValue(), true, this.f79333d));
                str5 = str10;
            } else {
                CardDebitDetails cardDebitDetails2 = dDSTODetailsWrapper3.cardDebitDetails;
                if (cardDebitDetails2 != null) {
                    String str11 = cardDebitDetails2.creditCardAcctNo;
                    bVar2.f79345i.setText(str5);
                    bVar2.f79349m.setText(str5);
                    str5 = str11;
                }
            }
            bVar2.f79346j.setText(a2);
            bVar2.f79347k.setText(str5);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 10) {
            return new C32188a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.templates_add_layout, viewGroup, false));
        }
        if (i == 20) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.dd_sto_list_item_swipable, viewGroup, false);
            m94848n(viewGroup.getContext(), (SwipeLayout) inflate);
            return new C32190b(inflate);
        } else if (i == 30) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.dd_sto_list_item_swipable, viewGroup, false);
            m94848n(viewGroup.getContext(), (SwipeLayout) inflate2);
            return new C32190b(inflate2);
        } else if (i != 40) {
            return null;
        } else {
            return new C32193c(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payments_last_operations_list_divider, viewGroup, false));
        }
    }
}
