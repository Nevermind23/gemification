package g81;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32335t0;
import g91.C32355x0;
import j81.C36769k;
import java.util.ArrayList;
import java.util.List;
import p341ge.bog.mobilebank.model.CircularItemInterface;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.CarNumberView;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: g81.h */
public class C32175h extends RecyclerView.C1736h {

    /* renamed from: d */
    private int f79272d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List f79273e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f79274f;

    /* renamed from: g */
    private boolean f79275g;

    /* renamed from: h */
    private boolean f79276h;

    /* renamed from: i */
    private Context f79277i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C36769k f79278j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f79279k;

    /* renamed from: l */
    private int f79280l;

    /* renamed from: m */
    private int f79281m = C32355x0.m95514e(C10318g.f28616A, this.f79277i);

    /* renamed from: n */
    private int f79282n;

    /* renamed from: o */
    private int f79283o;

    /* renamed from: p */
    private TemplateBasketItemsWithPaymentConfig f79284p;

    /* renamed from: q */
    private Client f79285q;

    /* renamed from: g81.h$a */
    public class C32176a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private View f79286d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public View f79287e;

        /* renamed from: f */
        private ImageView f79288f;

        /* renamed from: g */
        private BogTextView f79289g;

        /* renamed from: g81.h$a$a */
        class C32177a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32175h f79291d;

            C32177a(C32175h hVar) {
                this.f79291d = hVar;
            }

            public void onClick(View view) {
                if (C32175h.this.f79278j != null) {
                    CircularItemInterface circularItemInterface = new CircularItemInterface();
                    circularItemInterface.setSumItem(false);
                    circularItemInterface.setAddItem(true);
                    C32175h.this.f79278j.mo86061c(C32175h.this.f79279k, circularItemInterface);
                }
            }
        }

        public C32176a(View view) {
            super(view);
            this.f79286d = view.findViewById(C10322k.content_to_click);
            this.f79287e = view.findViewById(C10322k.rounded_container);
            this.f79288f = (ImageView) view.findViewById(C10322k.inside_image_full);
            this.f79289g = (BogTextView) view.findViewById(C10322k.f28865lx);
            this.f79286d.setOnClickListener(new C32177a(C32175h.this));
        }
    }

    /* renamed from: g81.h$b */
    public class C32178b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private View f79293d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public View f79294e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public BogTextView f79295f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Button f79296g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public CarNumberView f79297h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public View f79298i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public ImageView f79299j;

        /* renamed from: g81.h$b$a */
        class C32179a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32175h f79301d;

            C32179a(C32175h hVar) {
                this.f79301d = hVar;
            }

            public void onClick(View view) {
                if (C32175h.this.f79278j != null) {
                    C32175h.this.f79278j.mo86061c(C32175h.this.f79279k, (CircularItemInterface) C32175h.this.f79273e.get(C32178b.this.getAdapterPosition() - (C32175h.this.f79274f ? 1 : 0)));
                }
            }
        }

        public C32178b(View view) {
            super(view);
            this.f79293d = view.findViewById(C10322k.content_to_click);
            this.f79294e = view.findViewById(C10322k.notification_dot);
            this.f79296g = (Button) view.findViewById(C10322k.notification_with_text);
            this.f79295f = (BogTextView) view.findViewById(C10322k.f28865lx);
            this.f79297h = (CarNumberView) view.findViewById(C10322k.card_number_view);
            this.f79298i = view.findViewById(C10322k.rounded_container);
            this.f79299j = (ImageView) view.findViewById(C10322k.inside_image_full);
            this.f79293d.setOnClickListener(new C32179a(C32175h.this));
        }
    }

    /* renamed from: g81.h$c */
    public class C32180c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private View f79303d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public View f79304e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public View f79305f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public BogImageView f79306g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public BogTextView f79307h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public Button f79308i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public View f79309j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public BogTextView f79310k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public BogTextView f79311l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public BogTextView f79312m;

        /* renamed from: g81.h$c$a */
        class C32181a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32175h f79314d;

            C32181a(C32175h hVar) {
                this.f79314d = hVar;
            }

            public void onClick(View view) {
                if (C32175h.this.f79278j != null) {
                    C32175h.this.f79278j.mo86061c(C32175h.this.f79279k, (CircularItemInterface) C32175h.this.f79273e.get(C32180c.this.getAdapterPosition() - (C32175h.this.f79274f ? 1 : 0)));
                }
            }
        }

        public C32180c(View view) {
            super(view);
            this.f79303d = view.findViewById(C10322k.content_to_click);
            this.f79304e = view.findViewById(C10322k.rounded_container);
            this.f79305f = view.findViewById(C10322k.notification_dot);
            this.f79308i = (Button) view.findViewById(C10322k.notification_with_text);
            this.f79306g = (BogImageView) view.findViewById(C10322k.inside_image_full);
            this.f79307h = (BogTextView) view.findViewById(C10322k.f28865lx);
            this.f79309j = view.findViewById(C10322k.inside_text_container);
            this.f79310k = (BogTextView) view.findViewById(C10322k.left_image_text);
            this.f79311l = (BogTextView) view.findViewById(C10322k.right_image_text);
            this.f79312m = (BogTextView) view.findViewById(C10322k.transfer_text);
            this.f79303d.setOnClickListener(new C32181a(C32175h.this));
        }
    }

    /* renamed from: g81.h$d */
    public class C32182d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private View f79316d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public View f79317e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public View f79318f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public BogTextView f79319g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public BogTextView f79320h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public Button f79321i;

        /* renamed from: g81.h$d$a */
        class C32183a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32175h f79323d;

            C32183a(C32175h hVar) {
                this.f79323d = hVar;
            }

            public void onClick(View view) {
                if (C32175h.this.f79278j != null) {
                    CircularItemInterface circularItemInterface = new CircularItemInterface();
                    circularItemInterface.setSumItem(true);
                    circularItemInterface.setAddItem(false);
                    C32175h.this.f79278j.mo86061c(C32175h.this.f79279k, circularItemInterface);
                }
            }
        }

        public C32182d(View view) {
            super(view);
            this.f79316d = view.findViewById(C10322k.content_to_click);
            this.f79317e = view.findViewById(C10322k.rounded_container);
            this.f79319g = (BogTextView) view.findViewById(C10322k.inside_text);
            this.f79320h = (BogTextView) view.findViewById(C10322k.f28865lx);
            this.f79321i = (Button) view.findViewById(C10322k.notification_with_text);
            this.f79318f = view.findViewById(C10322k.f28719Dq);
            this.f79316d.setOnClickListener(new C32183a(C32175h.this));
        }
    }

    public C32175h(List list, Context context, C36769k kVar, int i, Client client) {
        this.f79277i = context;
        this.f79273e = list;
        this.f79278j = kVar;
        this.f79279k = i;
        this.f79285q = client;
        this.f79280l = C32355x0.m95517h(C10319h.payments_circular_view_border_thickness, context);
        this.f79282n = C32335t0.m95366k(context);
        this.f79283o = C32355x0.m95514e(C10318g.template_house_background_color, this.f79277i);
    }

    public int getItemCount() {
        List list = this.f79273e;
        return list == null ? this.f79272d : list.size() + this.f79272d;
    }

    public int getItemViewType(int i) {
        int i2;
        if (i == 0 && this.f79274f) {
            return 3;
        }
        boolean z = this.f79274f;
        List list = this.f79273e;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (this.f79275g && i == i2 + (z ? 1 : 0)) {
            return 1;
        }
        if (this.f79274f) {
            i--;
        }
        CircularItemInterface circularItemInterface = (CircularItemInterface) this.f79273e.get(i);
        if (circularItemInterface.getTemplateGroup() != null && circularItemInterface.getTemplateGroup().getGroupType().equals("C")) {
            return 4;
        }
        if (circularItemInterface.getTemplateGroup() != null && circularItemInterface.getTemplateGroup().getGroupType().equals(PensionStatusResult.STATUS_INACTIVE)) {
            return 5;
        }
        if (circularItemInterface.getTemplateBasketItem() != null) {
            return 6;
        }
        if (circularItemInterface.isTransfer()) {
            return 7;
        }
        if (circularItemInterface.getPaymentItem() != null) {
            return 2;
        }
        return 8;
    }

    /* renamed from: j */
    public void mo72694j(boolean z) {
        if (z && !this.f79275g) {
            this.f79272d++;
        } else if (!z && this.f79275g) {
            this.f79272d--;
        }
        this.f79275g = z;
        notifyItemChanged(getItemCount() - 1);
    }

    /* renamed from: k */
    public void mo72695k(boolean z) {
        if (z && !this.f79274f) {
            this.f79272d++;
        } else if (!z && this.f79274f) {
            this.f79272d--;
        }
        this.f79274f = z;
        notifyItemChanged(0);
    }

    /* renamed from: l */
    public void mo72696l() {
        List list = this.f79273e;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: m */
    public void mo72697m(boolean z) {
        this.f79276h = z;
    }

    /* renamed from: n */
    public void mo72698n(Client client) {
        this.f79285q = client;
    }

    /* renamed from: o */
    public void mo72699o(ArrayList arrayList) {
        this.f79273e = arrayList;
        notifyDataSetChanged();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:48|49|50|51|52) */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r11 = java.lang.Integer.parseInt(r10.getComment().substring(0, r10.getComment().length() - 1)) + "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02aa, code lost:
        r18 = r11;
        r11 = r10.getComment().substring(r10.getComment().length() - 1, r10.getComment().length());
        r10 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02b0, code lost:
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02b2, code lost:
        r10 = "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x026d */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C1734f0 r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            int r2 = r20.getItemViewType()
            r3 = 20
            java.lang.String r4 = "9+"
            r5 = 10
            r6 = 1
            java.lang.String r7 = ""
            r8 = 0
            r9 = 8
            switch(r2) {
                case 1: goto L_0x05ef;
                case 2: goto L_0x0570;
                case 3: goto L_0x04df;
                case 4: goto L_0x03cf;
                case 5: goto L_0x020a;
                case 6: goto L_0x0113;
                case 7: goto L_0x00a7;
                case 8: goto L_0x0019;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x060f
        L_0x0019:
            java.util.List r2 = r0.f79273e
            java.lang.Object r1 = r2.get(r1)
            ge.bog.mobilebank.model.CircularItemInterface r1 = (p341ge.bog.mobilebank.model.CircularItemInterface) r1
            r2 = r20
            g81.h$c r2 = (g81.C32175h.C32180c) r2
            android.view.View r3 = r2.f79304e
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
            int r4 = r0.f79281m
            r3.setColor(r4)
            int r4 = r0.f79280l
            android.content.Context r5 = r0.f79277i
            int r7 = p366bk.C10318g.default_divider_color
            int r5 = androidx.core.content.C0767a.m2893c(r5, r7)
            r3.setStroke(r4, r5)
            android.view.View r3 = r2.f79305f
            r3.setVisibility(r9)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = r2.f79312m
            r3.setVisibility(r9)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = r2.f79307h
            java.lang.String r4 = r1.getTitle()
            r3.setText(r4)
            ge.bog.mobilebank.ui.views.widgets.BogImageView r3 = r2.f79306g
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r3.setScaleType(r4)
            ge.bog.mobilebank.ui.views.widgets.BogImageView r3 = r2.f79306g
            r3.setVisibility(r8)
            boolean r3 = r1.isPlus()
            if (r3 != 0) goto L_0x008c
            android.content.Context r3 = r0.f79277i
            int r1 = r1.getImageId()
            android.graphics.drawable.Drawable r1 = androidx.core.content.C0767a.m2895e(r3, r1)
            android.content.Context r4 = r0.f79277i
            int r4 = g91.C32335t0.m95367l(r4, r6)
            android.graphics.drawable.Drawable r1 = g91.C32290b1.m95122l(r3, r1, r4)
            ge.bog.mobilebank.ui.views.widgets.BogImageView r3 = r2.f79306g
            r3.setImageDrawable(r1)
            goto L_0x0097
        L_0x008c:
            ge.bog.mobilebank.ui.views.widgets.BogImageView r3 = r2.f79306g
            int r1 = r1.getImageId()
            r3.setImageResource(r1)
        L_0x0097:
            android.widget.Button r1 = r2.f79308i
            r1.setVisibility(r9)
            android.view.View r1 = r2.f79305f
            r1.setVisibility(r9)
            goto L_0x060f
        L_0x00a7:
            java.util.List r2 = r0.f79273e
            java.lang.Object r1 = r2.get(r1)
            ge.bog.mobilebank.model.CircularItemInterface r1 = (p341ge.bog.mobilebank.model.CircularItemInterface) r1
            r2 = r20
            g81.h$c r2 = (g81.C32175h.C32180c) r2
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = r2.f79312m
            r3.setVisibility(r9)
            android.view.View r3 = r2.f79305f
            r3.setVisibility(r9)
            android.widget.Button r3 = r2.f79308i
            r3.setVisibility(r9)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = r2.f79307h
            java.lang.String r4 = r1.getTitle()
            r3.setText(r4)
            android.view.View r3 = r2.f79304e
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
            int r4 = r0.f79281m
            r3.setColor(r4)
            int r4 = r0.f79280l
            android.content.Context r5 = r0.f79277i
            int r7 = p366bk.C10318g.default_divider_color
            int r5 = androidx.core.content.C0767a.m2893c(r5, r7)
            r3.setStroke(r4, r5)
            ge.bog.mobilebank.ui.views.widgets.BogImageView r3 = r2.f79306g
            r3.setVisibility(r8)
            android.content.Context r3 = r0.f79277i
            int r1 = r1.getImageId()
            android.graphics.drawable.Drawable r1 = androidx.core.content.C0767a.m2895e(r3, r1)
            android.content.Context r4 = r0.f79277i
            int r4 = g91.C32335t0.m95359d(r4, r6)
            android.graphics.drawable.Drawable r1 = g91.C32290b1.m95122l(r3, r1, r4)
            ge.bog.mobilebank.ui.views.widgets.BogImageView r2 = r2.f79306g
            r2.setImageDrawable(r1)
            goto L_0x060f
        L_0x0113:
            boolean r2 = r0.f79274f
            if (r2 == 0) goto L_0x0119
            int r1 = r1 + -1
        L_0x0119:
            java.util.List r2 = r0.f79273e
            java.lang.Object r1 = r2.get(r1)
            ge.bog.mobilebank.model.CircularItemInterface r1 = (p341ge.bog.mobilebank.model.CircularItemInterface) r1
            ge.bog.mobilebank.model.template.TemplateBasketItem r2 = r1.getTemplateBasketItem()
            r4 = r20
            g81.h$c r4 = (g81.C32175h.C32180c) r4
            ge.bog.mobilebank.ui.views.widgets.BogTextView r5 = r4.f79312m
            r5.setVisibility(r9)
            boolean r5 = r2.isTransferTemplate()
            if (r5 != 0) goto L_0x0171
            ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig r5 = r0.f79284p
            ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r5 = r5.getPaymentProviderConfiguration(r2)
            if (r5 == 0) goto L_0x0142
            boolean r6 = r5.isHasDebt()
        L_0x0142:
            android.view.View r5 = r4.f79305f
            if (r6 == 0) goto L_0x016c
            ge.bog.mobilebank.model.template.TemplateBasketItem r6 = r1.getTemplateBasketItem()
            boolean r6 = r6.canGetDebt()
            if (r6 == 0) goto L_0x016c
            ge.bog.mobilebank.model.template.TemplateBasketItem r6 = r1.getTemplateBasketItem()
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r6 = r6.getTemplateDebtEvent()
            int r6 = r6.getState()
            if (r6 != r3) goto L_0x016c
            ge.bog.mobilebank.model.template.TemplateBasketItem r1 = r1.getTemplateBasketItem()
            int r1 = r1.getDebtAmount()
            if (r1 <= 0) goto L_0x016c
            r1 = r8
            goto L_0x016d
        L_0x016c:
            r1 = r9
        L_0x016d:
            r5.setVisibility(r1)
            goto L_0x0178
        L_0x0171:
            android.view.View r1 = r4.f79305f
            r1.setVisibility(r9)
        L_0x0178:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r1 = r4.f79307h
            ge.bog.mobilebank.model.Client r3 = r0.f79285q
            java.lang.String r3 = r2.getTemplateNameOrServiceName(r3)
            r1.setText(r3)
            android.view.View r1 = r4.f79304e
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r3 = r0.f79281m
            r1.setColor(r3)
            int r3 = r0.f79280l
            android.content.Context r5 = r0.f79277i
            int r6 = p366bk.C10318g.default_divider_color
            int r5 = androidx.core.content.C0767a.m2893c(r5, r6)
            r1.setStroke(r3, r5)
            ge.bog.mobilebank.ui.views.widgets.BogImageView r1 = r4.f79306g
            r1.setVisibility(r8)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r1 = r4.f79312m
            r1.setVisibility(r9)
            boolean r1 = r2.isTransferTemplate()
            if (r1 == 0) goto L_0x01db
            ge.bog.mobilebank.ui.views.widgets.BogImageView r1 = r4.f79306g
            android.content.Context r3 = r0.f79277i
            boolean r1 = g91.C32289b0.m95110v(r2, r1, r3)
            if (r1 != 0) goto L_0x0201
            ge.bog.mobilebank.ui.views.widgets.BogTextView r1 = r4.f79312m
            r1.setVisibility(r8)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r1 = r4.f79312m
            java.lang.String r2 = r2.getTransferInitials()
            r1.setText(r2)
            ge.bog.mobilebank.ui.views.widgets.BogImageView r1 = r4.f79306g
            r1.setVisibility(r9)
            goto L_0x0201
        L_0x01db:
            ge.bog.mobilebank.ui.views.widgets.BogImageView r10 = r4.f79306g
            java.lang.String r1 = r2.getTemplateImage()
            if (r1 == 0) goto L_0x01ea
            java.lang.String r1 = r2.getTemplateImage()
            goto L_0x01ee
        L_0x01ea:
            java.lang.String r1 = r2.getLogo()
        L_0x01ee:
            java.lang.String r11 = g91.C32289b0.m95093e(r1)
            int r1 = p366bk.C10320i.f28688dc
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r14 = 1
            r15 = 0
            g91.C32289b0.m95107s(r10, r11, r12, r13, r14, r15)
        L_0x0201:
            android.widget.Button r1 = r4.f79308i
            r1.setVisibility(r9)
            goto L_0x060f
        L_0x020a:
            boolean r2 = r0.f79274f
            if (r2 == 0) goto L_0x0210
            int r1 = r1 + -1
        L_0x0210:
            java.util.List r2 = r0.f79273e
            java.lang.Object r1 = r2.get(r1)
            ge.bog.mobilebank.model.CircularItemInterface r1 = (p341ge.bog.mobilebank.model.CircularItemInterface) r1
            r2 = r20
            g81.h$c r2 = (g81.C32175h.C32180c) r2
            android.view.View r10 = r2.f79304e
            android.graphics.drawable.Drawable r10 = r10.getBackground()
            android.graphics.drawable.GradientDrawable r10 = (android.graphics.drawable.GradientDrawable) r10
            int r11 = r0.f79283o
            r10.setColor(r11)
            int r11 = r0.f79280l
            android.content.Context r12 = r0.f79277i
            int r13 = p366bk.C10318g.default_divider_color
            int r12 = androidx.core.content.C0767a.m2893c(r12, r13)
            r10.setStroke(r11, r12)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r10 = r2.f79312m
            r10.setVisibility(r9)
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r1.getTemplateGroup()
            java.util.List r10 = r10.getComments()
            if (r10 == 0) goto L_0x02c9
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r1.getTemplateGroup()
            java.lang.String r11 = "B"
            ge.bog.mobilebank.model.template.TemplateGroupComment r10 = r10.getCommentGroupByType(r11)
            if (r10 == 0) goto L_0x02c9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x026d }
            r11.<init>()     // Catch:{ Exception -> 0x026d }
            java.lang.String r12 = r10.getComment()     // Catch:{ Exception -> 0x026d }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ Exception -> 0x026d }
            r11.append(r12)     // Catch:{ Exception -> 0x026d }
            r11.append(r7)     // Catch:{ Exception -> 0x026d }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x026d }
            goto L_0x02b3
        L_0x026d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b2 }
            r11.<init>()     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r12 = r10.getComment()     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r13 = r10.getComment()     // Catch:{ Exception -> 0x02b2 }
            int r13 = r13.length()     // Catch:{ Exception -> 0x02b2 }
            int r13 = r13 - r6
            java.lang.String r12 = r12.substring(r8, r13)     // Catch:{ Exception -> 0x02b2 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ Exception -> 0x02b2 }
            r11.append(r12)     // Catch:{ Exception -> 0x02b2 }
            r11.append(r7)     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x02b2 }
            java.lang.String r12 = r10.getComment()     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r13 = r10.getComment()     // Catch:{ Exception -> 0x02b0 }
            int r13 = r13.length()     // Catch:{ Exception -> 0x02b0 }
            int r13 = r13 - r6
            java.lang.String r10 = r10.getComment()     // Catch:{ Exception -> 0x02b0 }
            int r10 = r10.length()     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r10 = r12.substring(r13, r10)     // Catch:{ Exception -> 0x02b0 }
            r18 = r11
            r11 = r10
            r10 = r18
            goto L_0x02b4
        L_0x02b0:
            r10 = r11
            goto L_0x02b3
        L_0x02b2:
            r10 = r7
        L_0x02b3:
            r11 = r7
        L_0x02b4:
            boolean r12 = r10.equals(r7)
            if (r12 != 0) goto L_0x02c9
            ge.bog.mobilebank.ui.views.widgets.BogTextView r12 = r2.f79310k
            r12.setText(r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r10 = r2.f79311l
            r10.setText(r11)
            goto L_0x02ca
        L_0x02c9:
            r6 = r8
        L_0x02ca:
            if (r6 == 0) goto L_0x02e5
            ge.bog.mobilebank.model.template.TemplateGroup r6 = r1.getTemplateGroup()
            java.lang.String r6 = r6.getGroupImage()
            if (r6 != 0) goto L_0x02e5
            ge.bog.mobilebank.ui.views.widgets.BogImageView r6 = r2.f79306g
            r6.setVisibility(r9)
            android.view.View r6 = r2.f79309j
            r6.setVisibility(r8)
            goto L_0x0312
        L_0x02e5:
            ge.bog.mobilebank.ui.views.widgets.BogImageView r6 = r2.f79306g
            r6.setVisibility(r8)
            android.view.View r6 = r2.f79309j
            r6.setVisibility(r9)
            ge.bog.mobilebank.ui.views.widgets.BogImageView r10 = r2.f79306g
            ge.bog.mobilebank.model.template.TemplateGroup r6 = r1.getTemplateGroup()
            java.lang.String r6 = r6.getGroupImage()
            java.lang.String r11 = g91.C32289b0.m95093e(r6)
            int r6 = p366bk.C10320i.ic_house_default
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r14 = 1
            r15 = 0
            g91.C32289b0.m95107s(r10, r11, r12, r13, r14, r15)
        L_0x0312:
            ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig r6 = r0.f79284p
            if (r6 == 0) goto L_0x038c
            java.util.ArrayList r6 = r6.getTemplates()
            if (r6 == 0) goto L_0x038c
            ge.bog.mobilebank.model.template.TemplateGroup r6 = r1.getTemplateGroup()
            java.util.List r6 = r6.getTemplates()
            if (r6 == 0) goto L_0x038c
            ge.bog.mobilebank.model.template.TemplateGroup r6 = r1.getTemplateGroup()
            java.util.List r6 = r6.getTemplates()
            java.util.Iterator r6 = r6.iterator()
            r10 = r8
        L_0x0333:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x038d
            java.lang.Object r11 = r6.next()
            ge.bog.mobilebank.model.template.TemplateBasketItem r11 = (p341ge.bog.mobilebank.model.template.TemplateBasketItem) r11
            ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig r12 = r0.f79284p
            java.util.ArrayList r12 = r12.getTemplates()
            java.util.Iterator r12 = r12.iterator()
        L_0x0349:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0333
            java.lang.Object r13 = r12.next()
            ge.bog.mobilebank.model.template.TemplateBasketItem r13 = (p341ge.bog.mobilebank.model.template.TemplateBasketItem) r13
            if (r13 == 0) goto L_0x0349
            long r14 = r13.getId()
            long r16 = r11.getId()
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x0349
            boolean r14 = r13.canGetDebt()
            if (r14 == 0) goto L_0x0349
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r14 = r13.getTemplateDebtEvent()
            if (r14 == 0) goto L_0x0349
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r14 = r13.getTemplateDebtEvent()
            int r14 = r14.getState()
            if (r14 == r5) goto L_0x0349
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r14 = r13.getTemplateDebtEvent()
            int r14 = r14.getState()
            if (r14 != r3) goto L_0x0349
            int r13 = r13.getDebtAmount()
            if (r13 <= 0) goto L_0x0349
            int r10 = r10 + 1
            goto L_0x0349
        L_0x038c:
            r10 = r8
        L_0x038d:
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = r2.f79307h
            ge.bog.mobilebank.model.template.TemplateGroup r1 = r1.getTemplateGroup()
            java.lang.String r1 = r1.getGroupName()
            r3.setText(r1)
            android.view.View r1 = r2.f79305f
            r1.setVisibility(r9)
            android.widget.Button r1 = r2.f79308i
            if (r10 <= 0) goto L_0x03aa
            goto L_0x03ab
        L_0x03aa:
            r8 = r9
        L_0x03ab:
            r1.setVisibility(r8)
            android.widget.Button r1 = r2.f79308i
            if (r10 >= r5) goto L_0x03c3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r7)
            java.lang.String r4 = r3.toString()
        L_0x03c3:
            r1.setText(r4)
            android.view.View r1 = r2.f79305f
            r1.setVisibility(r9)
            goto L_0x060f
        L_0x03cf:
            boolean r2 = r0.f79274f
            if (r2 == 0) goto L_0x03d5
            int r1 = r1 + -1
        L_0x03d5:
            java.util.List r2 = r0.f79273e
            java.lang.Object r1 = r2.get(r1)
            ge.bog.mobilebank.model.CircularItemInterface r1 = (p341ge.bog.mobilebank.model.CircularItemInterface) r1
            r2 = r20
            g81.h$b r2 = (g81.C32175h.C32178b) r2
            android.view.View r5 = r2.f79298i
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            android.graphics.drawable.GradientDrawable r5 = (android.graphics.drawable.GradientDrawable) r5
            int r6 = r0.f79281m
            r5.setColor(r6)
            int r6 = r0.f79280l
            android.content.Context r10 = r0.f79277i
            int r11 = p366bk.C10318g.default_divider_color
            int r10 = androidx.core.content.C0767a.m2893c(r10, r11)
            r5.setStroke(r6, r10)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r5 = r2.f79295f
            ge.bog.mobilebank.model.template.TemplateGroup r6 = r1.getTemplateGroup()
            java.lang.String r6 = r6.getGroupName()
            r5.setText(r6)
            android.view.View r5 = r2.f79294e
            r5.setVisibility(r9)
            ge.bog.mobilebank.ui.views.widgets.CarNumberView r5 = r2.f79297h
            r5.setVisibility(r8)
            ge.bog.mobilebank.model.template.TemplateGroup r5 = r1.getTemplateGroup()
            java.lang.String r6 = "A"
            ge.bog.mobilebank.model.template.TemplateGroupComment r5 = r5.getCommentGroupByType(r6)
            if (r5 == 0) goto L_0x043a
            ge.bog.mobilebank.ui.views.widgets.CarNumberView r5 = r2.f79297h
            ge.bog.mobilebank.model.template.TemplateGroup r10 = r1.getTemplateGroup()
            ge.bog.mobilebank.model.template.TemplateGroupComment r6 = r10.getCommentGroupByType(r6)
            java.lang.String r6 = r6.getComment()
            r5.setCardNumber(r6)
            goto L_0x0441
        L_0x043a:
            ge.bog.mobilebank.ui.views.widgets.CarNumberView r5 = r2.f79297h
            r5.setCardNumber(r7)
        L_0x0441:
            ge.bog.mobilebank.model.template.TemplateGroup r5 = r1.getTemplateGroup()
            ge.bog.mobilebank.eventbus.events.CTParkPenaltiesEvent r5 = r5.getCtParkPenaltiesEvent()
            int r5 = r5.getState()
            if (r5 != r3) goto L_0x0475
            ge.bog.mobilebank.model.template.TemplateGroup r3 = r1.getTemplateGroup()
            ge.bog.mobilebank.eventbus.events.CTParkPenaltiesEvent r3 = r3.getCtParkPenaltiesEvent()
            java.util.ArrayList r3 = r3.getCTParkPenalties()
            java.util.Iterator r3 = r3.iterator()
            r5 = r8
        L_0x0460:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0476
            java.lang.Object r6 = r3.next()
            ge.bog.mobilebank.model.template.TemplateBasketItem r6 = (p341ge.bog.mobilebank.model.template.TemplateBasketItem) r6
            boolean r6 = r6.isUserPaying()
            if (r6 == 0) goto L_0x0460
            int r5 = r5 + 1
            goto L_0x0460
        L_0x0475:
            r5 = r8
        L_0x0476:
            android.widget.Button r3 = r2.f79296g
            if (r5 <= 0) goto L_0x047e
            r6 = r8
            goto L_0x047f
        L_0x047e:
            r6 = r9
        L_0x047f:
            r3.setVisibility(r6)
            android.widget.Button r3 = r2.f79296g
            r6 = 9
            if (r5 <= r6) goto L_0x048b
            goto L_0x049a
        L_0x048b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
        L_0x049a:
            r3.setText(r4)
            android.widget.ImageView r10 = r2.f79299j
            ge.bog.mobilebank.model.template.TemplateGroup r3 = r1.getTemplateGroup()
            java.lang.String r3 = r3.getGroupImage()
            java.lang.String r11 = g91.C32289b0.m95093e(r3)
            int r3 = p366bk.C10320i.f28688dc
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r14 = 1
            r15 = 0
            g91.C32289b0.m95107s(r10, r11, r12, r13, r14, r15)
            ge.bog.mobilebank.ui.views.widgets.CarNumberView r2 = r2.f79297h
            ge.bog.mobilebank.model.template.TemplateGroup r3 = r1.getTemplateGroup()
            java.lang.String r3 = r3.getGroupImage()
            if (r3 == 0) goto L_0x04da
            ge.bog.mobilebank.model.template.TemplateGroup r1 = r1.getTemplateGroup()
            java.lang.String r1 = r1.getGroupImage()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x04d9
            goto L_0x04da
        L_0x04d9:
            r8 = r9
        L_0x04da:
            r2.setVisibility(r8)
            goto L_0x060f
        L_0x04df:
            r1 = r20
            g81.h$d r1 = (g81.C32175h.C32182d) r1
            android.view.View r2 = r1.f79317e
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            int r3 = r0.f79282n
            r2.setColor(r3)
            int r3 = r0.f79280l
            int r6 = r0.f79282n
            r2.setStroke(r3, r6)
            ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig r2 = r0.f79284p
            ge.bog.mobilebank.model.template.TemplateDebtInfo r2 = r2.getDownloadedDebtTemplatesCount()
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = r1.f79320h
            android.content.Context r6 = r0.f79277i
            int r10 = p366bk.C10328q.templates_bills_due
            java.lang.String r6 = r6.getString(r10)
            r3.setText(r6)
            android.widget.Button r3 = r1.f79321i
            int r6 = r2.getActualDebts()
            if (r6 <= 0) goto L_0x051a
            r6 = r8
            goto L_0x051b
        L_0x051a:
            r6 = r9
        L_0x051b:
            r3.setVisibility(r6)
            android.widget.Button r3 = r1.f79321i
            int r6 = r2.getActualDebts()
            if (r6 >= r5) goto L_0x053b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r2.getActualDebts()
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
        L_0x053b:
            r3.setText(r4)
            android.view.View r3 = r1.f79318f
            int r4 = r2.getDebtToDownload()
            int r5 = r2.getDownloadedDebts()
            if (r4 != r5) goto L_0x054d
            r8 = r9
        L_0x054d:
            r3.setVisibility(r8)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r1 = r1.f79319g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r2 = r2.getTotalDebt()
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = g91.C32359z0.m95544O(r2)
            r1.setText(r2)
            goto L_0x060f
        L_0x0570:
            java.util.List r2 = r0.f79273e
            java.lang.Object r1 = r2.get(r1)
            ge.bog.mobilebank.model.CircularItemInterface r1 = (p341ge.bog.mobilebank.model.CircularItemInterface) r1
            r2 = r20
            g81.h$c r2 = (g81.C32175h.C32180c) r2
            android.view.View r3 = r2.f79305f
            r3.setVisibility(r9)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = r2.f79312m
            r3.setVisibility(r9)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r3 = r2.f79307h
            ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r4 = r1.getPaymentItem()
            java.lang.String r4 = r4.getServiceName()
            java.lang.String r4 = r90.C27950a.m86286c(r4, r6)
            r3.setText(r4)
            android.view.View r3 = r2.f79304e
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
            int r4 = r0.f79281m
            r3.setColor(r4)
            int r4 = r0.f79280l
            android.content.Context r5 = r0.f79277i
            int r6 = p366bk.C10318g.default_divider_color
            int r5 = androidx.core.content.C0767a.m2893c(r5, r6)
            r3.setStroke(r4, r5)
            ge.bog.mobilebank.ui.views.widgets.BogImageView r3 = r2.f79306g
            r3.setVisibility(r8)
            ge.bog.mobilebank.ui.views.widgets.BogImageView r10 = r2.f79306g
            ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r1 = r1.getPaymentItem()
            java.lang.String r1 = r1.getLogo()
            java.lang.String r11 = g91.C32289b0.m95091c(r1)
            int r1 = p366bk.C10320i.f28688dc
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r14 = 1
            boolean r15 = r0.f79276h
            g91.C32289b0.m95107s(r10, r11, r12, r13, r14, r15)
            android.widget.Button r1 = r2.f79308i
            r1.setVisibility(r9)
            android.view.View r1 = r2.f79305f
            r1.setVisibility(r9)
            goto L_0x060f
        L_0x05ef:
            r1 = r20
            g81.h$a r1 = (g81.C32175h.C32176a) r1
            android.view.View r1 = r1.f79287e
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r2 = r0.f79281m
            r1.setColor(r2)
            int r2 = r0.f79280l
            android.content.Context r3 = r0.f79277i
            int r4 = p366bk.C10318g.default_divider_color
            int r3 = androidx.core.content.C0767a.m2893c(r3, r4)
            r1.setStroke(r2, r3)
        L_0x060f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g81.C32175h.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$f0, int):void");
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new C32176a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payments_recyclerview_circular_add_item, viewGroup, false));
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C32180c(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payments_recyclerview_circular_item, viewGroup, false));
            case 3:
                return new C32182d(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payments_recyclerview_circular_sum_item, viewGroup, false));
            case 4:
                return new C32178b(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payments_recyclerview_circular_car_item, viewGroup, false));
            default:
                return null;
        }
    }

    /* renamed from: p */
    public void mo72700p(TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig) {
        this.f79284p = templateBasketItemsWithPaymentConfig;
    }

    /* renamed from: q */
    public void mo72701q(TemplateGroup templateGroup) {
        int i;
        if (this.f79273e != null && templateGroup != null) {
            for (int i2 = 0; i2 < this.f79273e.size(); i2++) {
                CircularItemInterface circularItemInterface = (CircularItemInterface) this.f79273e.get(i2);
                if (circularItemInterface.getTemplateGroup() != null && circularItemInterface.getTemplateGroup().getId() == templateGroup.getId()) {
                    if (this.f79274f) {
                        i = i2 + 1;
                    } else {
                        i = i2;
                    }
                    notifyItemChanged(i);
                }
            }
        }
    }

    /* renamed from: r */
    public void mo72702r(TemplateBasketItem templateBasketItem) {
        int i;
        int i2;
        if (!(this.f79273e == null || templateBasketItem == null)) {
            for (int i3 = 0; i3 < this.f79273e.size(); i3++) {
                CircularItemInterface circularItemInterface = (CircularItemInterface) this.f79273e.get(i3);
                if (circularItemInterface.getTemplateBasketItem() != null && circularItemInterface.getTemplateBasketItem().getId() == templateBasketItem.getId()) {
                    if (this.f79274f) {
                        i2 = i3 + 1;
                    } else {
                        i2 = i3;
                    }
                    notifyItemChanged(i2);
                }
                if (!(circularItemInterface.getTemplateGroup() == null || circularItemInterface.getTemplateGroup().getTemplates() == null)) {
                    for (int i4 = 0; i4 < circularItemInterface.getTemplateGroup().getTemplates().size(); i4++) {
                        if (circularItemInterface.getTemplateGroup().getTemplates().get(i4).getId() == templateBasketItem.getId()) {
                            if (this.f79274f) {
                                i = i3 + 1;
                            } else {
                                i = i3;
                            }
                            notifyItemChanged(i);
                        }
                    }
                }
            }
        }
        if (this.f79274f) {
            notifyItemChanged(0);
        }
    }
}
