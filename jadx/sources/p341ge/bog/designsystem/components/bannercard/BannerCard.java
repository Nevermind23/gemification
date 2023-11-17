package p341ge.bog.designsystem.components.bannercard;

import af1.C40303i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C2394j;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10043x;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17785j;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18351c0;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18378q;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.bannercard.BannerCard */
public final class BannerCard extends LayerView {

    /* renamed from: s */
    static final /* synthetic */ C40303i[] f38798s;

    /* renamed from: d */
    private final C10043x f38799d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C13162a f38800e;

    /* renamed from: f */
    private final C18365j0 f38801f;

    /* renamed from: g */
    private final C18365j0 f38802g;

    /* renamed from: h */
    private final C18351c0 f38803h;

    /* renamed from: i */
    private final C18351c0 f38804i;

    /* renamed from: j */
    private final C18365j0 f38805j;

    /* renamed from: k */
    private final C18378q f38806k;

    /* renamed from: l */
    private View.OnClickListener f38807l;

    /* renamed from: m */
    private View.OnClickListener f38808m;

    /* renamed from: n */
    private View.OnClickListener f38809n;

    /* renamed from: o */
    private String f38810o;

    /* renamed from: p */
    private String f38811p;

    /* renamed from: q */
    private Image f38812q;

    /* renamed from: r */
    private ImageView.ScaleType f38813r;

    /* renamed from: ge.bog.designsystem.components.bannercard.BannerCard$a */
    private enum C13162a {
        SQUARE_IMAGE(r3, r4, r30, r31, r32, r33, r9, true, true, r34, r35),
        ROUND_IMAGE(Integer.valueOf(C17779d.banner_card_image_round_width), Integer.valueOf(r15), C17779d.banner_card_image_radius_round, r31, r32, r33, C17780e.f49668q1, true, true, r34, r35),
        FULL_IMAGE((String) null, (int) null, r21, C17779d.banner_card_full_height, r34, r34, C17780e.f49663l1, false, false, r33, r34),
        BANNER_ADD_TO_GOOGLE_PAY(Integer.valueOf(C17779d.banner_card_add_to_google_pay_width), (int) null, r21, r31, r32, r33, 0, true, true, r34, r35);
        

        /* renamed from: o */
        public static final C13163a f38814o = null;

        /* renamed from: d */
        private Integer f38820d;

        /* renamed from: e */
        private Integer f38821e;

        /* renamed from: f */
        private int f38822f;

        /* renamed from: g */
        private int f38823g;

        /* renamed from: h */
        private int f38824h;

        /* renamed from: i */
        private int f38825i;

        /* renamed from: j */
        private int f38826j;

        /* renamed from: k */
        private boolean f38827k;

        /* renamed from: l */
        private boolean f38828l;

        /* renamed from: m */
        private int f38829m;

        /* renamed from: n */
        private int f38830n;

        /* renamed from: ge.bog.designsystem.components.bannercard.BannerCard$a$a */
        public static final class C13163a {
            private C13163a() {
            }

            public /* synthetic */ C13163a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13162a mo34866a(int i) {
                for (C13162a aVar : C13162a.values()) {
                    if (aVar.ordinal() == i) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        static {
            f38814o = new C13163a((DefaultConstructorMarker) null);
        }

        private C13162a(Integer num, Integer num2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, int i7) {
            this.f38820d = num;
            this.f38821e = num2;
            this.f38822f = i;
            this.f38823g = i2;
            this.f38824h = i3;
            this.f38825i = i4;
            this.f38826j = i5;
            this.f38827k = z;
            this.f38828l = z2;
            this.f38829m = i6;
            this.f38830n = i7;
        }

        /* renamed from: b */
        public final boolean mo34855b() {
            return this.f38827k;
        }

        /* renamed from: c */
        public final int mo34856c() {
            return this.f38823g;
        }

        /* renamed from: e */
        public final int mo34857e() {
            return this.f38825i;
        }

        /* renamed from: f */
        public final int mo34858f() {
            return this.f38824h;
        }

        /* renamed from: g */
        public final int mo34859g() {
            return this.f38829m;
        }

        /* renamed from: h */
        public final Integer mo34860h() {
            return this.f38821e;
        }

        /* renamed from: l */
        public final int mo34861l() {
            return this.f38822f;
        }

        /* renamed from: n */
        public final int mo34862n() {
            return this.f38830n;
        }

        /* renamed from: o */
        public final int mo34863o() {
            return this.f38826j;
        }

        /* renamed from: q */
        public final Integer mo34864q() {
            return this.f38820d;
        }

        /* renamed from: r */
        public final boolean mo34865r() {
            return this.f38828l;
        }
    }

    /* renamed from: ge.bog.designsystem.components.bannercard.BannerCard$b */
    public /* synthetic */ class C13164b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38831a;

        static {
            int[] iArr = new int[C13162a.values().length];
            try {
                iArr[C13162a.BANNER_ADD_TO_GOOGLE_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f38831a = iArr;
        }
    }

    /* renamed from: ge.bog.designsystem.components.bannercard.BannerCard$c */
    static final class C13165c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BannerCard f38832d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13165c(BannerCard bannerCard) {
            super(1);
            this.f38832d = bannerCard;
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2247a c0 = jVar.mo7220c0(this.f38832d.f38800e.mo34863o());
            C41536l.m120488h(c0, "placeholder(imageType.thumbnailRes)");
            return (C2394j) c0;
        }
    }

    static {
        Class<BannerCard> cls = BannerCard.class;
        f38798s = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "showButton", "getShowButton()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isInfoTextVisible", "isInfoTextVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "infoTextColor", "getInfoTextColor()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "showMoreTextColor", "getShowMoreTextColor()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "showCloseButton", "getShowCloseButton()Z", 0)), C41520a0.m120439e(new C41539o(cls, "tintColor", "getTintColor()Ljava/lang/Integer;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BannerCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final void m49574b() {
        int i;
        int i2;
        setBannerImage((Image) null);
        ViewGroup.LayoutParams layoutParams = this.f38799d.f27718l.getLayoutParams();
        Integer q = this.f38800e.mo34864q();
        int i3 = -1;
        if (q != null) {
            i = getResources().getDimensionPixelSize(q.intValue());
        } else {
            i = -1;
        }
        layoutParams.width = i;
        Integer h = this.f38800e.mo34860h();
        if (h != null) {
            i3 = getResources().getDimensionPixelSize(h.intValue());
        }
        layoutParams.height = i3;
        this.f38799d.f27718l.setRadius((float) getResources().getDimensionPixelSize(this.f38800e.mo34861l()));
        this.f38799d.mo3946b().getLayoutParams().height = getResources().getDimensionPixelSize(this.f38800e.mo34856c());
        this.f38799d.mo3946b().setPadding(getResources().getDimensionPixelSize(this.f38800e.mo34858f()), 0, getResources().getDimensionPixelSize(this.f38800e.mo34857e()), 0);
        ViewGroup.LayoutParams layoutParams2 = this.f38799d.f27714h.getLayoutParams();
        C41536l.m120487g(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) layoutParams2;
        bVar.setMarginEnd(getResources().getDimensionPixelSize(this.f38800e.mo34859g()));
        this.f38799d.f27714h.setLayoutParams(bVar);
        ViewGroup.LayoutParams layoutParams3 = this.f38799d.f27718l.getLayoutParams();
        C41536l.m120487g(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0620b bVar2 = (ConstraintLayout.C0620b) layoutParams3;
        Resources resources = getResources();
        if (getShowCloseButton()) {
            i2 = this.f38800e.mo34862n();
        } else {
            i2 = C17779d.f49641I1;
        }
        bVar2.setMarginEnd(resources.getDimensionPixelSize(i2));
        this.f38799d.f27718l.setLayoutParams(bVar2);
        setInfoTextVisible(this.f38800e.mo34865r());
        if (C13164b.f38831a[this.f38800e.ordinal()] == 1) {
            CardView cardView = this.f38799d.f27718l;
            C41536l.m120488h(cardView, "binding.thumbnailImageLayout");
            cardView.setVisibility(8);
            FrameLayout frameLayout = this.f38799d.f27711e;
            C41536l.m120488h(frameLayout, "binding.addToGooglePayLayout");
            frameLayout.setVisibility(0);
            return;
        }
        CardView cardView2 = this.f38799d.f27718l;
        C41536l.m120488h(cardView2, "binding.thumbnailImageLayout");
        cardView2.setVisibility(0);
        FrameLayout frameLayout2 = this.f38799d.f27711e;
        C41536l.m120488h(frameLayout2, "binding.addToGooglePayLayout");
        frameLayout2.setVisibility(8);
    }

    private final boolean getShowButton() {
        return this.f38801f.getValue(this, f38798s[0]).booleanValue();
    }

    private final boolean getShowCloseButton() {
        return this.f38805j.getValue(this, f38798s[4]).booleanValue();
    }

    private final void setInfoTextVisible(boolean z) {
        this.f38802g.mo46151c(this, f38798s[1], z);
    }

    private final void setShowButton(boolean z) {
        this.f38801f.mo46151c(this, f38798s[0], z);
    }

    private final void setShowCloseButton(boolean z) {
        this.f38805j.mo46151c(this, f38798s[4], z);
    }

    public final Image getBannerImage() {
        return this.f38812q;
    }

    public final View.OnClickListener getCloseButtonClickListener() {
        return this.f38807l;
    }

    public final View.OnClickListener getImageClickListener() {
        return this.f38809n;
    }

    public final String getInfoText() {
        return this.f38810o;
    }

    public final Color getInfoTextColor() {
        return this.f38803h.getValue(this, f38798s[2]);
    }

    public final View.OnClickListener getShowMoreClickListener() {
        return this.f38808m;
    }

    public final String getShowMoreText() {
        return this.f38811p;
    }

    public final Color getShowMoreTextColor() {
        return this.f38804i.getValue(this, f38798s[3]);
    }

    public final ImageView.ScaleType getThumbnailScaleType() {
        return this.f38813r;
    }

    public final Integer getTintColor() {
        return this.f38806k.getValue(this, f38798s[5]);
    }

    public final void setBannerImage(Image image) {
        C41238w wVar;
        if (image != null) {
            AppCompatImageView appCompatImageView = this.f38799d.f27717k;
            C41536l.m120488h(appCompatImageView, "binding.thumbnailImage");
            C18368l.m62777z(appCompatImageView, image, new C13165c(this));
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            this.f38799d.f27717k.setImageResource(this.f38800e.mo34863o());
        }
    }

    public final void setButtonVisible(boolean z) {
        int i;
        setShowButton(z);
        if (!z || this.f38800e.mo34855b()) {
            AppCompatTextView appCompatTextView = this.f38799d.f27716j;
            if (z) {
                i = 3;
            } else {
                i = 5;
            }
            appCompatTextView.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Unsupported operation");
    }

    public final void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        this.f38799d.f27714h.setOnClickListener(onClickListener);
    }

    public final void setCloseButtonVisible(boolean z) {
        setShowCloseButton(z);
    }

    public final void setImageClickListener(View.OnClickListener onClickListener) {
        this.f38799d.f27712f.mo3946b().setOnClickListener(onClickListener);
        this.f38799d.f27717k.setOnClickListener(onClickListener);
    }

    public final void setInfoText(String str) {
        this.f38810o = str;
        this.f38799d.f27716j.setText(str);
    }

    public final void setInfoTextColor(Color color) {
        C41536l.m120489i(color, "<set-?>");
        this.f38803h.setValue(this, f38798s[2], color);
    }

    public final void setShowMoreClickListener(View.OnClickListener onClickListener) {
        this.f38799d.f27715i.setOnClickListener(onClickListener);
    }

    public final void setShowMoreText(String str) {
        this.f38811p = str;
        this.f38799d.f27715i.setText(str);
    }

    public final void setShowMoreTextColor(Color color) {
        C41536l.m120489i(color, "<set-?>");
        this.f38804i.setValue(this, f38798s[3], color);
    }

    public final void setThumbnailScaleType(ImageView.ScaleType scaleType) {
        C41536l.m120489i(scaleType, C11755a.C11756a.f34100b);
        this.f38813r = scaleType;
        this.f38799d.f27717k.setScaleType(scaleType);
    }

    public final void setTintColor(Integer num) {
        this.f38806k.setValue(this, f38798s[5], num);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BannerCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C10043x d = C10043x.m36837d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.f38799d = d;
        C13162a aVar = C13162a.SQUARE_IMAGE;
        this.f38800e = aVar;
        TextView textView = d.f27715i;
        C41536l.m120488h(textView, "binding.continueButton");
        this.f38801f = new C18365j0(textView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView = d.f27716j;
        C41536l.m120488h(appCompatTextView, "binding.infoText");
        this.f38802g = new C18365j0(appCompatTextView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = d.f27716j;
        C41536l.m120488h(appCompatTextView2, "binding.infoText");
        this.f38803h = new C18351c0(appCompatTextView2);
        TextView textView2 = d.f27715i;
        C41536l.m120488h(textView2, "binding.continueButton");
        this.f38804i = new C18351c0(textView2);
        ImageView imageView = d.f27714h;
        C41536l.m120488h(imageView, "binding.closeButton");
        this.f38805j = new C18365j0(imageView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView = d.f27717k;
        C41536l.m120488h(appCompatImageView, "binding.thumbnailImage");
        this.f38806k = new C18378q(appCompatImageView);
        this.f38813r = ImageView.ScaleType.CENTER_CROP;
        setLayerStyle(C17786k.f49834t);
        setBackgroundColor(C18368l.m62755d(context2, C17777b.f49596k));
        int[] iArr = C17787l.f50066P0;
        C41536l.m120488h(iArr, "BannerCard");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        C13162a a = C13162a.f38814o.mo34866a(obtainStyledAttributes.getInt(C17787l.f50156V0, 0));
        this.f38800e = a != null ? a : aVar;
        setButtonVisible(obtainStyledAttributes.getBoolean(C17787l.f50126T0, false));
        setCloseButtonVisible(obtainStyledAttributes.getBoolean(C17787l.f50141U0, false));
        setInfoText(obtainStyledAttributes.getString(C17787l.f50096R0));
        String string = obtainStyledAttributes.getString(C17787l.f50111S0);
        setShowMoreText(string == null ? context2.getString(C17785j.learn_more) : string);
        ImageView.ScaleType scaleType = (ImageView.ScaleType) C41333m.m119774A(ImageView.ScaleType.values(), obtainStyledAttributes.getInt(C17787l.f50081Q0, -1));
        setThumbnailScaleType(scaleType == null ? ImageView.ScaleType.CENTER_CROP : scaleType);
        setTintColor(Integer.valueOf(obtainStyledAttributes.getResourceId(C17787l.f50171W0, 0)));
        m49574b();
        obtainStyledAttributes.recycle();
    }
}
