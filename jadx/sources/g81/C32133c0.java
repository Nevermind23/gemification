package g81;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import g91.C32355x0;
import j81.C36769k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p341ge.bog.mobilebank.model.CircularItemInterface;
import p341ge.bog.mobilebank.model.ProviderListUIConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import r90.C27950a;

/* renamed from: g81.c0 */
public class C32133c0 extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List f79109d;

    /* renamed from: e */
    private Context f79110e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C36769k f79111f;

    /* renamed from: g */
    private int f79112g;

    /* renamed from: h */
    private int f79113h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ProviderListUIConfiguration f79114i;

    /* renamed from: g81.c0$a */
    private class C32134a extends RecyclerView.C1734f0 {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public ImageView f79115d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public View f79116e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public BogTextView f79117f;

        /* renamed from: g */
        private View f79118g;

        /* renamed from: g81.c0$a$a */
        class C32135a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32133c0 f79120d;

            C32135a(C32133c0 c0Var) {
                this.f79120d = c0Var;
            }

            public void onClick(View view) {
                if (C32133c0.this.f79111f != null && C32133c0.this.f79109d != null && C32133c0.this.f79109d.size() > C32134a.this.getAdapterPosition() && C32134a.this.getAdapterPosition() >= 0) {
                    CircularItemInterface circularItemInterface = (CircularItemInterface) C32133c0.this.f79109d.get(C32134a.this.getAdapterPosition());
                    CircularItemInterface i = C32133c0.m94660k(circularItemInterface, C32133c0.this.f79114i);
                    if (i != null) {
                        C32133c0.this.f79111f.mo86061c(4, i);
                    } else {
                        C32133c0.this.f79111f.mo86061c(4, circularItemInterface);
                    }
                }
            }
        }

        public C32134a(View view) {
            super(view);
            this.f79115d = (ImageView) view.findViewById(C10322k.rounded_image);
            this.f79117f = (BogTextView) view.findViewById(C10322k.provider_title);
            this.f79118g = view.findViewById(C10322k.provider_wrapper);
            this.f79116e = view.findViewById(C10322k.rounded_container);
            this.f79118g.setOnClickListener(new C32135a(C32133c0.this));
        }
    }

    public C32133c0(ArrayList arrayList, ArrayList arrayList2, Context context, C36769k kVar, ProviderListUIConfiguration providerListUIConfiguration) {
        this.f79109d = m94659j(arrayList, providerListUIConfiguration);
        this.f79110e = context;
        this.f79111f = kVar;
        this.f79114i = providerListUIConfiguration;
        this.f79112g = C32355x0.m95514e(C10318g.bog_circular_image_container_grey_color, context);
        this.f79113h = C32355x0.m95517h(C10319h.payments_circular_view_border_thickness, context);
    }

    /* renamed from: j */
    private static List m94659j(List list, ProviderListUIConfiguration providerListUIConfiguration) {
        if (list == null || providerListUIConfiguration == null || providerListUIConfiguration.getIgnoredProviderServiceIds() == null || providerListUIConfiguration.getIgnoredProviderServiceIds().size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (providerListUIConfiguration.getIgnoredProviderServiceIds().contains(((CircularItemInterface) it.next()).getPaymentItem().getServiceId())) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static CircularItemInterface m94660k(CircularItemInterface circularItemInterface, ProviderListUIConfiguration providerListUIConfiguration) {
        if (circularItemInterface == null || providerListUIConfiguration == null || providerListUIConfiguration.getRedirectProviderServiceIds() == null || providerListUIConfiguration.getRedirectProviderServiceIds().size() == 0) {
            return circularItemInterface;
        }
        PaymentProviderConfiguration paymentItem = circularItemInterface.getPaymentItem();
        String str = providerListUIConfiguration.getRedirectProviderServiceIds().get(paymentItem.getServiceId());
        if (str != null) {
            for (PaymentProviderConfiguration next : paymentItem.getChildren()) {
                if (str.equals(next.getServiceId())) {
                    CircularItemInterface circularItemInterface2 = new CircularItemInterface();
                    circularItemInterface2.setPaymentItem(next);
                    return circularItemInterface2;
                }
            }
        }
        return null;
    }

    public int getItemCount() {
        List list = this.f79109d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getItemViewType(int i) {
        return 40;
    }

    /* renamed from: l */
    public void mo72622l(ArrayList arrayList) {
        this.f79109d = m94659j(arrayList, this.f79114i);
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (f0Var.getItemViewType() == 40) {
            CircularItemInterface circularItemInterface = (CircularItemInterface) this.f79109d.get(i);
            if (circularItemInterface.isDD()) {
                C32134a aVar = (C32134a) f0Var;
                ImageView i2 = aVar.f79115d;
                String c = C32289b0.m95091c(circularItemInterface.getPaymentItem().getOldLogo());
                int i3 = C10320i.f28688dc;
                Integer valueOf = Integer.valueOf(i3);
                Integer valueOf2 = Integer.valueOf(i3);
                if (circularItemInterface.getPaymentItem() == null || !circularItemInterface.getPaymentItem().shouldApplyTint()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                C32289b0.m95107s(i2, c, valueOf, valueOf2, true, z3);
                aVar.f79117f.setText(circularItemInterface.getTitle());
            } else if (circularItemInterface.getPaymentItem() != null) {
                C32134a aVar2 = (C32134a) f0Var;
                ImageView i4 = aVar2.f79115d;
                String c2 = C32289b0.m95091c(circularItemInterface.getPaymentItem().getOldLogo());
                int i5 = C10320i.f28688dc;
                Integer valueOf3 = Integer.valueOf(i5);
                Integer valueOf4 = Integer.valueOf(i5);
                if (circularItemInterface.getPaymentItem() == null || !circularItemInterface.getPaymentItem().shouldApplyTint()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C32289b0.m95107s(i4, c2, valueOf3, valueOf4, true, z2);
                aVar2.f79117f.setText(C27950a.m86286c(circularItemInterface.getPaymentItem().getServiceName(), true));
            } else if (circularItemInterface.isPlus() || circularItemInterface.isTransport()) {
                C32134a aVar3 = (C32134a) f0Var;
                ImageView i6 = aVar3.f79115d;
                Integer valueOf5 = Integer.valueOf(circularItemInterface.getImageId());
                int i7 = C10320i.f28688dc;
                Integer valueOf6 = Integer.valueOf(i7);
                Integer valueOf7 = Integer.valueOf(i7);
                if (circularItemInterface.getPaymentItem() == null || !circularItemInterface.getPaymentItem().shouldApplyTint()) {
                    z = false;
                } else {
                    z = true;
                }
                C32289b0.m95109u(i6, valueOf5, valueOf6, valueOf7, true, z);
                aVar3.f79117f.setText(circularItemInterface.getTitle());
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setStroke(this.f79113h, this.f79112g);
            gradientDrawable.setColor(0);
            ((C32134a) f0Var).f79116e.setBackground(gradientDrawable);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 40) {
            return null;
        }
        return new C32134a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payment_provider_list_item, viewGroup, false));
    }
}
