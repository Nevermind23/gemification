package g20;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import i20.C25104d;
import iu0.C36546y;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10320i;
import p366bk.C10322k;
import p380ck.C10464h;
import ue1.C43075l;

/* renamed from: g20.w */
public final class C20639w extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private C43075l f55735d;

    /* renamed from: e */
    private C43075l f55736e;

    /* renamed from: f */
    private final ImageView f55737f;

    /* renamed from: g */
    private final View f55738g;

    /* renamed from: h */
    private final ImageView f55739h;

    /* renamed from: i */
    private final BogTextView f55740i;

    /* renamed from: j */
    private final BogTextView f55741j;

    /* renamed from: k */
    private final BogTextView f55742k;

    /* renamed from: l */
    private final View f55743l;

    /* renamed from: m */
    private final BogButton f55744m;

    /* renamed from: n */
    private final View f55745n;

    /* renamed from: g20.w$a */
    public /* synthetic */ class C20640a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55746a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType[] r0 = p341ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType r1 = p341ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType.BKG_IMG     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType r1 = p341ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType.IMG_TXT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f55746a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g20.C20639w.C20640a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20639w(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        this.f55737f = (ImageView) view.findViewById(C10322k.bannerBackgroundImage);
        this.f55738g = view.findViewById(C10322k.bannerContent);
        this.f55739h = (ImageView) view.findViewById(C10322k.bannerIcon);
        this.f55740i = (BogTextView) view.findViewById(C10322k.bannerTitle);
        this.f55741j = (BogTextView) view.findViewById(C10322k.bannerTextContent);
        this.f55742k = (BogTextView) view.findViewById(C10322k.bannerBoldTextContent);
        this.f55743l = view.findViewById(C10322k.buttonsContainer);
        this.f55744m = (BogButton) view.findViewById(C10322k.moreBtn);
        this.f55745n = view.findViewById(C10322k.ovalContainer);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m66950k(C25104d dVar, C20639w wVar, View view) {
        C41536l.m120489i(dVar, "$bannerData");
        C41536l.m120489i(wVar, "this$0");
        if (!(dVar.mo63578q() == null || dVar.mo63579r() == null)) {
            C36546y.m108282F().mo27155v(dVar.mo63578q(), (String) null, (String) null, (Long) null, new ArrayList(dVar.mo63579r()));
        }
        String m = dVar.mo63574m();
        if (m != null) {
            C36546y.m108282F().mo27157x(m, C10464h.C10465a.FACEBOOK);
        }
        C43075l lVar = wVar.f55736e;
        if (lVar != null) {
            lVar.invoke(dVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m66951l(C25104d dVar, C20639w wVar, View view) {
        C41536l.m120489i(dVar, "$bannerData");
        C41536l.m120489i(wVar, "this$0");
        if (!(dVar.mo63576o() == null || dVar.mo63577p() == null)) {
            C36546y.m108282F().mo27155v(dVar.mo63576o(), (String) null, (String) null, (Long) null, new ArrayList(dVar.mo63577p()));
        }
        String l = dVar.mo63573l();
        if (l != null) {
            C36546y.m108282F().mo27157x(l, C10464h.C10465a.FACEBOOK);
        }
        C43075l lVar = wVar.f55735d;
        if (lVar != null) {
            lVar.invoke(dVar);
        }
    }

    /* renamed from: j */
    public final void mo49181j(C25104d dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C25104d dVar2 = dVar;
        C41536l.m120489i(dVar2, "bannerData");
        ImageView imageView = (ImageView) this.itemView.findViewById(C10322k.hideOfferBtn);
        if (C41536l.m120484d(dVar.mo63560a(), Boolean.TRUE)) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        imageView.setOnClickListener(new C20637u(dVar2, this));
        this.itemView.setOnClickListener(new C20638v(dVar2, this));
        this.f55740i.setText(dVar.mo63587y());
        this.f55741j.setText(dVar.mo63588z());
        this.f55742k.setText(dVar.mo63588z());
        this.f55744m.setText(dVar.mo63586x());
        View view = this.f55745n;
        ((BogTextView) view.findViewById(C10322k.roundedContainerTV)).setText(dVar.mo63566f());
        ((BogTextView) view.findViewById(C10322k.roundedContainerRate)).setText(dVar.mo63568h());
        ((BogTextView) view.findViewById(C10322k.roundedContainerSuffix)).setText(dVar.mo63567g());
        ImageView imageView2 = this.f55739h;
        String c = C32289b0.m95091c(dVar.mo63584v());
        int i12 = C10320i.f28688dc;
        C32289b0.m95107s(imageView2, c, Integer.valueOf(i12), Integer.valueOf(i12), false, false);
        C32289b0.m95107s(this.f55737f, C32289b0.m95091c(dVar.mo63564e()), Integer.valueOf(i12), Integer.valueOf(i12), false, false);
        ImageView imageView3 = this.f55737f;
        LayoutType u = dVar.mo63583u();
        LayoutType layoutType = LayoutType.BKG_IMG;
        if (u == layoutType) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView3.setVisibility(i2);
        View view2 = this.f55738g;
        if (dVar.mo63583u() != layoutType) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        BogTextView bogTextView = this.f55740i;
        LayoutType u2 = dVar.mo63583u();
        LayoutType layoutType2 = LayoutType.IMG_TXT_BTN_HDR;
        if (u2 == layoutType2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        bogTextView.setVisibility(i4);
        BogTextView bogTextView2 = this.f55741j;
        if (dVar.mo63583u() != layoutType) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        bogTextView2.setVisibility(i5);
        BogTextView bogTextView3 = this.f55742k;
        LayoutType u3 = dVar.mo63583u();
        LayoutType layoutType3 = LayoutType.IMG_TXT_VL_BTN;
        if (u3 == layoutType3 || dVar.mo63583u() == LayoutType.IMG_TXT_VL_BTN_VL) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        bogTextView3.setVisibility(i6);
        View view3 = this.f55743l;
        if (dVar.mo63583u() == LayoutType.IMG_TXT || dVar.mo63583u() == layoutType) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        view3.setVisibility(i7);
        BogButton bogButton = this.f55744m;
        if (dVar.mo63583u() == LayoutType.IMG_TXT_BTN || dVar.mo63583u() == layoutType2 || dVar.mo63583u() == layoutType3) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        bogButton.setVisibility(i8);
        View view4 = this.f55745n;
        if (dVar.mo63583u() == LayoutType.IMG_TXT_VL_BTN_VL) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        view4.setVisibility(i9);
        LayoutType u4 = dVar.mo63583u();
        if (u4 != null) {
            int i13 = C20640a.f55746a[u4.ordinal()];
            if (i13 == 1) {
                this.f55737f.setVisibility(0);
                this.f55738g.setVisibility(8);
            } else if (i13 == 2) {
                this.f55741j.setVisibility(0);
                this.f55740i.setVisibility(8);
            }
        }
    }

    /* renamed from: m */
    public final void mo49182m(C43075l lVar) {
        this.f55735d = lVar;
    }

    /* renamed from: n */
    public final void mo49183n(C43075l lVar) {
        this.f55736e = lVar;
    }
}
